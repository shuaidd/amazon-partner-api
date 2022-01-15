package com.github.shuaidd.aspi.api.support;


import java.util.concurrent.ConcurrentHashMap;

public class LWAAccessTokenCacheImpl implements LWAAccessTokenCache {

    private static final long SECOND_TO_MILLIS = 1000;
    private final ConcurrentHashMap<Object, Object> accessTokenHashMap = new ConcurrentHashMap<Object, Object>();

    @Override
    public void put(Object oLWAAccessTokenRequestMeta, String accessToken, long tokenTTLInSeconds) {
        LWAAccessTokenCacheItem accessTokenCacheItem = new LWAAccessTokenCacheItem();
        long insertTime = System.currentTimeMillis();
        long accessTokenExpiresValueMillis = (tokenTTLInSeconds * SECOND_TO_MILLIS) + insertTime;
        accessTokenCacheItem.setAccessToken(accessToken);
        accessTokenCacheItem.setAccessTokenExpiredTime(accessTokenExpiresValueMillis);
        accessTokenHashMap.put(oLWAAccessTokenRequestMeta, accessTokenCacheItem);
    }

    @Override
    public String get(Object oLWAAccessTokenRequestMeta) {
        Object accessTokenValue = accessTokenHashMap.get(oLWAAccessTokenRequestMeta);
        if (accessTokenValue != null) {
            LWAAccessTokenCacheItem accessTokenData =
                    (LWAAccessTokenCacheItem) accessTokenValue;
            long currentTime = System.currentTimeMillis();
            long expiryAdjustment = 60 * 1000;
            long accessTokenExpiredTime = accessTokenData.getAccessTokenExpiredTime() - expiryAdjustment;
            if (currentTime < accessTokenExpiredTime) {
                return accessTokenData.getAccessToken();
            }
        }
        return null;
    }
}
