package com.github.shuaidd.aspi.api.support;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.squareup.okhttp.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class LWAClient {
    private static final String ACCESS_TOKEN_KEY = "access_token";
    private static final String REFRESH_TOKEN_KEY = "refresh_token";
    private static final String ACCESS_TOKEN_EXPIRES_IN = "expires_in";
    private static final MediaType JSON_MEDIA_TYPE = MediaType.parse("application/json; charset=utf-8");
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final String endpoint;
    private OkHttpClient okHttpClient;
    private LWAAccessTokenCache lwaAccessTokenCache;

    /**
     * Sets cache to store access token until token is expired
     */
    public void setLWAAccessTokenCache(LWAAccessTokenCache tokenCache) {
        this.lwaAccessTokenCache = tokenCache;
    }

    public LWAClient(String endpoint) {
        okHttpClient = new OkHttpClient();
        this.endpoint = endpoint;
    }

    String getAccessToken(LWAAccessTokenRequestMeta lwaAccessTokenRequestMeta) {
        if (lwaAccessTokenCache != null) {
            return getAccessTokenFromCache(lwaAccessTokenRequestMeta);
        } else {
            return getAccessTokenFromEndpoint(lwaAccessTokenRequestMeta);
        }
    }

    String getAccessTokenFromCache(LWAAccessTokenRequestMeta lwaAccessTokenRequestMeta) {
        String accessTokenCacheData = lwaAccessTokenCache.get(lwaAccessTokenRequestMeta);
        if (accessTokenCacheData != null) {
            return accessTokenCacheData;
        } else {
            return getAccessTokenFromEndpoint(lwaAccessTokenRequestMeta);
        }
    }

    String getAccessTokenFromEndpoint(LWAAccessTokenRequestMeta lwaAccessTokenRequestMeta) {
        RequestBody requestBody = RequestBody.create(JSON_MEDIA_TYPE, new Gson().toJson(lwaAccessTokenRequestMeta));
        Request accessTokenRequest = new Request.Builder().url(endpoint).post(requestBody).build();

        String accessToken;
        try {
            Response response = okHttpClient.newCall(accessTokenRequest).execute();
            if (!response.isSuccessful()) {
                throw new IOException("Unsuccessful LWA token exchange");
            }

            JsonObject responseJson = new JsonParser().parse(response.body().string()).getAsJsonObject();

            accessToken = responseJson.get(ACCESS_TOKEN_KEY).getAsString();
            if (lwaAccessTokenCache != null) {
                long timeToTokenexpiry = responseJson.get(ACCESS_TOKEN_EXPIRES_IN).getAsLong();
                lwaAccessTokenCache.put(lwaAccessTokenRequestMeta, accessToken, timeToTokenexpiry);
            }
        } catch (Exception e) {
            throw new RuntimeException("Error getting LWA Access Token", e);
        }
        return accessToken;
    }

    /**
     * 获取亚马逊卖家授权信息
     * @param authorizationCode
     * @param clientId
     * @param clientSecret
     * @return
     * @throws IOException
     */
    public String getRefreshToken(String authorizationCode, String clientId, String clientSecret) throws IOException {
        FormEncodingBuilder formBuilder = new FormEncodingBuilder();
        RequestBody requestBody = formBuilder.add("grant_type", "authorization_code")
                .add("code", authorizationCode)
                .add("client_id", clientId)
                .add("client_secret", clientSecret)
                .build();

        Request accessTokenRequest = new Request.Builder().header("Content-Type", "application/x-www-form-urlencoded; charset=utf-8")
                .url(endpoint).post(requestBody).build();
        Response response = okHttpClient.newCall(accessTokenRequest).execute();
        JsonObject responseJson = new JsonParser().parse(response.body().string()).getAsJsonObject();
        logger.info("获取到的亚马逊数据为{}", responseJson);
        return responseJson.get(REFRESH_TOKEN_KEY).getAsString();
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setOkHttpClient(OkHttpClient okHttpClient) {
        this.okHttpClient = okHttpClient;
    }
}
