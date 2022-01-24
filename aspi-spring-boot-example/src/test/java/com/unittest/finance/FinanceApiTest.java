package com.unittest.finance;

import com.github.shuaidd.aspi.api.client.FinanceApi;
import com.github.shuaidd.aspi.model.common.EndPoint;
import com.unittest.AbstractTest;
import org.junit.Before;
import org.junit.Test;

/**
 * finance api test
 *
 * @author ddshuai
 * date 2022-01-24 11:36
 **/
public class FinanceApiTest extends AbstractTest {

    private FinanceApi financeApi;

    @Before
    public void init() {
        financeApi = amazonPartnerApiManager.getApiClient(FinanceApi.class, EndPoint.US_EAST, partnerProperties.getAmazonClient().getRefreshToken());
    }

    @Test
    public void listFinancialEventsByOrderId() {
        financeApi.listFinancialEventsByOrderId("113-7425102-4930642", 100, null);
    }
}
