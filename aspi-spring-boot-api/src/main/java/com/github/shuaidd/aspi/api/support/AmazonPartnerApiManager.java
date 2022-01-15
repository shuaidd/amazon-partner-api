package com.github.shuaidd.aspi.api.support;

import com.github.shuaidd.aspi.api.property.AmazonClientProperties;
import com.github.shuaidd.aspi.api.property.AwsClientProperties;
import com.github.shuaidd.aspi.model.common.EndPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Objects;
import java.util.UUID;

/**
 * 描述 api 客户端 统一管理
 *
 * @author ddshuai
 * @date 2022-01-14 17:10
 **/
public class AmazonPartnerApiManager {

    private final Boolean sandbox;
    private final  AwsClientProperties awsClientProperties;
    private final AmazonClientProperties amazonClientProperties;
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    public static final String TOKEN_API_URL = "https://api.amazon.com/auth/o2/token";

    public AmazonPartnerApiManager(boolean sandbox, AwsClientProperties awsClientProperties, AmazonClientProperties amazonClientProperties) {
        this.sandbox = sandbox;
        Objects.requireNonNull(awsClientProperties);
        Objects.requireNonNull(amazonClientProperties);
        this.awsClientProperties =awsClientProperties;
        this.amazonClientProperties = amazonClientProperties;
    }

    /**
     * 获取各种api操作客户端
     *
     * @param apiCls   实际API类型
     * @param endPoint 亚马逊端点
     * @param <T>      实际客户端操作类
     * @return AbstractAmazonApi 实例
     */
    public <T extends AbstractAmazonApi<?>> T getApiClient(Class<T> apiCls, EndPoint endPoint, String refreshToken) {
        return getApiClient(apiCls,endPoint,refreshToken,null);
    }

    public <T extends AbstractAmazonApi<?>> T getApiClient(Class<T> apiCls, EndPoint endPoint, String refreshToken, LWAClientScopes scopes) {
        try {
            String url = endPoint.getUrl();
            if (sandbox) {
                url = endPoint.getSandboxUrl();
            }
            T ins = apiCls.newInstance();
            ins.awsAuthenticationCredentials(awsAuthenticationCredentials(endPoint.getArea()))
                    .lwaAuthorizationCredentials(lwaAuthorizationCredentials(refreshToken,scopes))
                    .awsAuthenticationCredentialsProvider(awsAuthenticationCredentialsProvider())
                    .endpoint(url)
                    .instance();

            return ins;
        } catch (InstantiationException | IllegalAccessException e) {
            log.error("getApiClient", e);
        }

        return null;
    }

    private AWSAuthenticationCredentials awsAuthenticationCredentials(String region) {
        Objects.requireNonNull(awsClientProperties.getAccessKeyId());
        Objects.requireNonNull(awsClientProperties.getSecretKey());
        return AWSAuthenticationCredentials.builder()
                .accessKeyId(awsClientProperties.getAccessKeyId())
                .secretKey(awsClientProperties.getSecretKey())
                .region(region)
                .build();
    }

    private AWSAuthenticationCredentialsProvider awsAuthenticationCredentialsProvider() {
        Objects.requireNonNull(awsClientProperties.getRoleArn());
        return AWSAuthenticationCredentialsProvider.builder()
                .roleArn(awsClientProperties.getRoleArn())
                .roleSessionName(UUID.randomUUID().toString())
                .build();
    }

    private LWAAuthorizationCredentials lwaAuthorizationCredentials(String refreshToken,LWAClientScopes scopes) {
        Objects.requireNonNull(amazonClientProperties.getClientId());
        Objects.requireNonNull(amazonClientProperties.getClientSecret());
        return LWAAuthorizationCredentials.builder()
                .clientId(amazonClientProperties.getClientId())
                .clientSecret(amazonClientProperties.getClientSecret())
                .refreshToken(refreshToken)
                .scopes(Objects.isNull(scopes) ? new LWAClientScopes(new HashSet<>()) : scopes)
                .endpoint(TOKEN_API_URL)
                .build();
    }
}
