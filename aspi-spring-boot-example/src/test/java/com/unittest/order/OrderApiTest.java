package com.unittest.order;

import com.github.shuaidd.aspi.api.client.OrderApi;
import com.github.shuaidd.aspi.api.support.AmazonPartnerApiManager;
import com.github.shuaidd.aspi.model.common.EndPoint;
import com.github.shuaidd.aspi.model.order.GetOrderResponse;
import com.unittest.AbstractTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 描述 订单单元测试类
 *
 * @author ddshuai
 * date 2022-01-14 18:59
 **/
public class OrderApiTest extends AbstractTest {

    @Test
    public void getOrder() {
        OrderApi orderApi = amazonPartnerApiManager.getApiClient(OrderApi.class, EndPoint.EU_WEST,partnerProperties.getAmazonClient().getRefreshToken());
        GetOrderResponse response = orderApi.getOrder("113-8318517-8753850");
        logger.info("{}",response);
    }
}
