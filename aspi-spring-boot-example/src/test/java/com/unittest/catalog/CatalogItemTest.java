package com.unittest.catalog;

import com.github.shuaidd.aspi.api.client.catalog.v20201201.CatalogV20201201Api;
import com.github.shuaidd.aspi.api.client.catalog.vo.CatalogApi;
import com.github.shuaidd.aspi.model.catalog.GetCatalogItemResponse;
import com.github.shuaidd.aspi.model.catalog.v20201201.ItemSearchResults;
import com.github.shuaidd.aspi.model.common.EndPoint;
import com.github.shuaidd.aspi.model.common.Marketplace;
import com.unittest.AbstractTest;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

/**
 * catalog api test
 *
 * @author ddshuai
 * date 2022-01-18 15:00
 **/
public class CatalogItemTest extends AbstractTest {

    private CatalogApi catalogApi;
    private CatalogV20201201Api catalogV20201201Api;

    @Before
    public void init() {
        catalogApi = amazonPartnerApiManager.getApiClient(CatalogApi.class, EndPoint.US_EAST, partnerProperties.getAmazonClient().getRefreshToken());
        catalogV20201201Api = amazonPartnerApiManager.getApiClient(CatalogV20201201Api.class, EndPoint.US_EAST, partnerProperties.getAmazonClient().getRefreshToken());
    }

    @Test
    public void getByAsin(){
        catalogApi.getCatalogItem(Marketplace.US.getMarketplaceId(),"B09DW4Z2MS");
    }

    /**
     * example response src/test/resources/json-example/searchItems.json
     */
    @Test
    public void searchItems() {
        ItemSearchResults results = catalogV20201201Api.searchCatalogItems(Collections.singletonList("red"), Collections.singletonList(Marketplace.US.getMarketplaceId()), Collections.singletonList("productTypes"),
                null, Collections.singletonList("15718311"), null, null, null, LOCATE_ZH);
        logger.info("查询成功--{}", results.getItems().size());
    }
}
