package com.github.shuaidd.aspi.autoconfigurator;

import com.amazonaws.util.StringUtils;
import com.github.shuaidd.aspi.api.support.AmazonPartnerApiManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Objects;

/**
 * 描述 亚马逊api自动装配
 *
 * @author ddshuai
 * date 2022-01-14 17:06
 **/
@Configuration
@EnableConfigurationProperties(AmazonPartnerProperties.class)
public class AmazonPartnerApiAutoConfiguration {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Bean
    public AmazonPartnerApiManager amazonPartnerApiManager(AmazonPartnerProperties properties) {
        if (logger.isInfoEnabled()) {
            logger.info("实例化对象-AmazonPartnerApiManager");
        }

        if (Objects.isNull(properties.getAmazonClient())) {
            logger.error("amazon-client 未配置");
        } else {
            if (StringUtils.isNullOrEmpty(properties.getAmazonClient().getClientId())) {
                logger.error("amazon-api.amazon-client.client-id 未配置");
            }

            if (StringUtils.isNullOrEmpty(properties.getAmazonClient().getClientSecret())) {
                logger.error("amazon-api.amazon-client.client-secret 未配置");
            }
        }

        if (Objects.isNull(properties.getAws())) {
            logger.error("aws 账号信息未配置");
        } else {
            if (StringUtils.isNullOrEmpty(properties.getAws().getAccessKeyId())) {
                logger.error("amazon-api.aws.access-key-id 未配置");
            }

            if (StringUtils.isNullOrEmpty(properties.getAws().getSecretKey())) {
                logger.error("amazon-api.aws.secret-key 未配置");
            }

            if (StringUtils.isNullOrEmpty(properties.getAws().getRoleArn())) {
                logger.error("amazon-api.aws.role-arn 未配置");
            }
        }
        return new AmazonPartnerApiManager(properties.getSandbox(), properties.getAws(), properties.getAmazonClient());
    }
}
