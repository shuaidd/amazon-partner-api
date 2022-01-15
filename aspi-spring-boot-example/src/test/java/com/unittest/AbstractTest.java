package com.unittest;

import com.github.shuaidd.aspi.api.support.AmazonPartnerApiManager;
import com.github.shuaidd.aspi.autoconfigurator.AmazonPartnerProperties;
import com.github.shuaidd.aspi.example.ExampleApplication;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 描述
 *
 * @author ddshuai
 * date 2020-11-22 15:54
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ExampleApplication.class)
public class AbstractTest {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    protected AmazonPartnerProperties partnerProperties;

    @Autowired
    protected AmazonPartnerApiManager amazonPartnerApiManager;
}
