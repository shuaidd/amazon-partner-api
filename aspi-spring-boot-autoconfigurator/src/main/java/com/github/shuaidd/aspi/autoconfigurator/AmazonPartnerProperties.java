package com.github.shuaidd.aspi.autoconfigurator;

import com.github.shuaidd.aspi.api.property.AmazonClientProperties;
import com.github.shuaidd.aspi.api.property.AwsClientProperties;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.context.annotation.Configuration;

/**
 * 描述 配置信息
 *
 * @author ddshuai
 * date 2022-01-14 17:35
 **/
@Data
@Configuration
@ConfigurationProperties(prefix = "amazon-api")
public class AmazonPartnerProperties {
    private Boolean sandbox = false;

    @NestedConfigurationProperty
    private AwsClientProperties aws;

    @NestedConfigurationProperty
    private AmazonClientProperties amazonClient;
}
