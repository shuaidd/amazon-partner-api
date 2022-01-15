package com.github.shuaidd.aspi.api.support;

/**
 * 描述 客户端抽象类
 *
 * @author ddshuai
 * date 2020-11-22 15:01
 **/
public abstract class AbstractAmazonApi<T> {
    protected AWSAuthenticationCredentials awsAuthenticationCredentials;
    protected LWAAuthorizationCredentials lwaAuthorizationCredentials;
    protected String endpoint;
    protected LWAAccessTokenCache lwaAccessTokenCache;
    protected Boolean disableAccessTokenCache = false;
    protected AWSAuthenticationCredentialsProvider awsAuthenticationCredentialsProvider;

    protected ApiClient apiClient;

    protected ApiClient getApiClient() {
        return apiClient;
    }

    protected void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public AbstractAmazonApi<T> awsAuthenticationCredentials(AWSAuthenticationCredentials awsAuthenticationCredentials) {
        this.awsAuthenticationCredentials = awsAuthenticationCredentials;
        return this;
    }

    public AbstractAmazonApi<T> lwaAuthorizationCredentials(LWAAuthorizationCredentials lwaAuthorizationCredentials) {
        this.lwaAuthorizationCredentials = lwaAuthorizationCredentials;
        return this;
    }

    public AbstractAmazonApi<T> endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    public AbstractAmazonApi<T> lwaAccessTokenCache(LWAAccessTokenCache lwaAccessTokenCache) {
        this.lwaAccessTokenCache = lwaAccessTokenCache;
        return this;
    }

    public AbstractAmazonApi<T> disableAccessTokenCache() {
        this.disableAccessTokenCache = true;
        return this;
    }

    @SuppressWarnings("unchecked")
    public T instance() {
        if (awsAuthenticationCredentials == null) {
            throw new RuntimeException("AWSAuthenticationCredentials not set");
        }

        if (lwaAuthorizationCredentials == null) {
            throw new RuntimeException("LWAAuthorizationCredentials not set");
        }

        if (StringUtil.isEmpty(endpoint)) {
            throw new RuntimeException("Endpoint not set");
        }

        AWSSigV4Signer awsSigV4Signer;
        if (awsAuthenticationCredentialsProvider == null) {
            awsSigV4Signer = new AWSSigV4Signer(awsAuthenticationCredentials);
        } else {
            awsSigV4Signer = new AWSSigV4Signer(awsAuthenticationCredentials, awsAuthenticationCredentialsProvider);
        }

        LWAAuthorizationSigner lwaAuthorizationSigner = null;
        if (disableAccessTokenCache) {
            lwaAuthorizationSigner = new LWAAuthorizationSigner(lwaAuthorizationCredentials);
        } else {
            if (lwaAccessTokenCache == null) {
                lwaAccessTokenCache = new LWAAccessTokenCacheImpl();
            }
            lwaAuthorizationSigner = new LWAAuthorizationSigner(lwaAuthorizationCredentials, lwaAccessTokenCache);
        }

        this.apiClient = new ApiClient()
                .setAWSSigV4Signer(awsSigV4Signer)
                .setLWAAuthorizationSigner(lwaAuthorizationSigner)
                .setDebugging(true)
                .setBasePath(endpoint);

        return (T) this;
    }

    public AbstractAmazonApi<T> awsAuthenticationCredentialsProvider(AWSAuthenticationCredentialsProvider awsAuthenticationCredentialsProvider) {
        this.awsAuthenticationCredentialsProvider = awsAuthenticationCredentialsProvider;
        return this;
    }
}
