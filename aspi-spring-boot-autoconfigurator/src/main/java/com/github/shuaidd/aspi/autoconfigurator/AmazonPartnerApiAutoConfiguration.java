package com.github.shuaidd.aspi.autoconfigurator;

import com.github.shuaidd.aspi.api.support.AmazonPartnerApiManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 描述 亚马逊api自动装配
 *
 * @author ddshuai
 * @date 2022-01-14 17:06
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
        return new AmazonPartnerApiManager(properties.getSandbox(), properties.getAws(), properties.getAmazonClient());
    }
}
