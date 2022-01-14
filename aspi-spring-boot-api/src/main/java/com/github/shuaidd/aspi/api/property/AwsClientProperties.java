package com.github.shuaidd.aspi.api.property;

import lombok.Data;

/**
 * 描述 AWS配置信息
 *
 * @author ddshuai
 * @date 2020-11-28 18:11
 **/
@Data
public class AwsClientProperties {
    private String accessKeyId;
    private String secretKey;
    private String roleArn;
    private String accountId;
}
