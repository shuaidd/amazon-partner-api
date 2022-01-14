package com.github.shuaidd.aspi.example;

import com.github.shuaidd.aspi.autoconfigurator.EnableAmazonPartner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * api 测试模块
 *
 * @author ddshuai
 * @date 2022-01-14 17:18
 **/
@EnableAmazonPartner
@SpringBootApplication
public class ExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
    }
}
