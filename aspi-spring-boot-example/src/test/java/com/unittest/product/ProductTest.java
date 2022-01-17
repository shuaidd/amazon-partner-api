package com.unittest.product;

import com.github.shuaidd.aspi.api.client.ProductDefinitionsApi;
import com.github.shuaidd.aspi.api.client.ProductFeesApi;
import com.github.shuaidd.aspi.model.common.EndPoint;
import com.github.shuaidd.aspi.model.product.type.ProductType;
import com.github.shuaidd.aspi.model.product.type.ProductTypeDefinition;
import com.github.shuaidd.aspi.model.product.type.ProductTypeList;
import com.unittest.AbstractTest;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

/**
 * product api test
 *
 * @author ddshuai
 * @date 2022-01-17 11:14
 **/
public class ProductTest extends AbstractTest {

    private ProductDefinitionsApi productDefinitionsApi;
    private ProductFeesApi feesApi;

    @Before
    public void init() {
        productDefinitionsApi = amazonPartnerApiManager.getApiClient(ProductDefinitionsApi.class, EndPoint.US_EAST, partnerProperties.getAmazonClient().getRefreshToken());
        feesApi = amazonPartnerApiManager.getApiClient(ProductFeesApi.class, EndPoint.EU_WEST, partnerProperties.getAmazonClient().getRefreshToken());
    }

    /**
     * response example  src/test/resources/json-example/getDefinitions.json
     */
    @Test
    public void getDefinitions() {
        ProductTypeList typeList = productDefinitionsApi.searchDefinitionsProductTypes(Collections.singletonList("A1AM78C64UM0Y8"), null);
        logger.info("{}--{}", typeList.getProductTypes().size(), typeList);
        for (ProductType productType : typeList.getProductTypes()) {
            logger.info("{}", productType.getName());
        }
    }

    /**
     * response example src/test/resources/json-example/getDefinitionsProductType.json
     * locale ar, ar_AE, ar_SA, de, de_DE, en, en_AE, en_AU, en_CA, en_GB, en_IN, en_NG, en_SG, en_US, en_ZA, es, es_CL, es_CO, es_ES, es_MX, es_US, fr, fr_BE, fr_CA, fr_FR, it, it_IT, ja, ja_JP, nl, nl_BE, nl_NL, pl, pl_PL, pt, pt_BR, pt_PT, sv, sv_SE, tr, tr_TR, zh, zh_CN, zh_TW
     */
    @Test
    public void getDefinitionsProductType() {
        productDefinitionsApi.getDefinitionsProductType("PRODUCT", Collections.singletonList("A1VC38T7YXB528"), null, null, null, null, "zh_CN");
    }
}
