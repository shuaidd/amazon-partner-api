package com.github.shuaidd.aspi.api.property;

import lombok.Data;

/**
 * 描述 开发者客户端配置信息
 *
 * @author ddshuai
 * date 2020-11-28 18:04
 **/

@Data
public class AmazonClientProperties {
    private String clientId;
    private String clientSecret;
    private String refreshToken;
}
