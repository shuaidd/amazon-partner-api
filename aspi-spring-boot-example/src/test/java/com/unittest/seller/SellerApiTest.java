package com.unittest.seller;

import com.github.shuaidd.aspi.api.client.SellersApi;
import com.github.shuaidd.aspi.model.common.EndPoint;
import com.github.shuaidd.aspi.model.seller.GetMarketplaceParticipationsResponse;
import com.unittest.AbstractTest;
import org.junit.Before;
import org.junit.Test;

/**
 * seller api test
 *
 * @author ddshuai
 * date 2022-01-15 14:57
 **/
public class SellerApiTest extends AbstractTest {

    private SellersApi sellersApi;

    @Before
    public void init() {
        sellersApi = amazonPartnerApiManager.getApiClient(SellersApi.class, EndPoint.EU_WEST, partnerProperties.getAmazonClient().getRefreshToken());
    }

    /**
     * 成功响应
     * {
     *   "payload" : [
     *               {
     *       "marketplace" : {
     *         "id" : "A13V1IB3VIYZZH",
     *         "countryCode" : "FR",
     *         "name" : "Amazon.fr",
     *         "defaultCurrencyCode" :"EUR",
     *         "defaultLanguageCode" : "fr_FR",
     *         "domainName" : "www.amazon.fr"
     *       },
     *       "participation" : {
     *         "isParticipating" : true
     *                 ,"hasSuspendedListings" : false              }
     *     },              {
     *       "marketplace" : {
     *         "id" : "A1805IZSGTT6HS",
     *         "countryCode" : "NL",
     *         "name" : "Amazon.nl",
     *         "defaultCurrencyCode" :"EUR",
     *         "defaultLanguageCode" : "nl_NL",
     *         "domainName" : "www.amazon.nl"
     *       },
     *       "participation" : {
     *         "isParticipating" : true
     *                 ,"hasSuspendedListings" : false              }
     *     },              {
     *       "marketplace" : {
     *         "id" : "A1C3SOZRARQ6R3",
     *         "countryCode" : "PL",
     *         "name" : "Amazon.pl",
     *         "defaultCurrencyCode" :"PLN",
     *         "defaultLanguageCode" : "pl_PL",
     *         "domainName" : "www.amazon.pl"
     *       },
     *       "participation" : {
     *         "isParticipating" : true
     *                 ,"hasSuspendedListings" : false              }
     *     },              {
     *       "marketplace" : {
     *         "id" : "A1F83G8C2ARO7P",
     *         "countryCode" : "GB",
     *         "name" : "Amazon.co.uk",
     *         "defaultCurrencyCode" :"GBP",
     *         "defaultLanguageCode" : "en_GB",
     *         "domainName" : "www.amazon.co.uk"
     *       },
     *       "participation" : {
     *         "isParticipating" : true
     *                 ,"hasSuspendedListings" : false              }
     *     },              {
     *       "marketplace" : {
     *         "id" : "A1PA6795UKMFR9",
     *         "countryCode" : "DE",
     *         "name" : "Amazon.de",
     *         "defaultCurrencyCode" :"EUR",
     *         "defaultLanguageCode" : "de_DE",
     *         "domainName" : "www.amazon.de"
     *       },
     *       "participation" : {
     *         "isParticipating" : true
     *                 ,"hasSuspendedListings" : false              }
     *     },              {
     *       "marketplace" : {
     *         "id" : "A1RKKUPIHCS9HS",
     *         "countryCode" : "ES",
     *         "name" : "Amazon.es",
     *         "defaultCurrencyCode" :"EUR",
     *         "defaultLanguageCode" : "es_ES",
     *         "domainName" : "www.amazon.es"
     *       },
     *       "participation" : {
     *         "isParticipating" : true
     *                 ,"hasSuspendedListings" : false              }
     *     },              {
     *       "marketplace" : {
     *         "id" : "A2NODRKZP88ZB9",
     *         "countryCode" : "SE",
     *         "name" : "Amazon.se",
     *         "defaultCurrencyCode" :"SEK",
     *         "defaultLanguageCode" : "sv_SE",
     *         "domainName" : "www.amazon.se"
     *       },
     *       "participation" : {
     *         "isParticipating" : true
     *                 ,"hasSuspendedListings" : false              }
     *     },              {
     *       "marketplace" : {
     *         "id" : "APJ6JRA9NG5V4",
     *         "countryCode" : "IT",
     *         "name" : "Amazon.it",
     *         "defaultCurrencyCode" :"EUR",
     *         "defaultLanguageCode" : "it_IT",
     *         "domainName" : "www.amazon.it"
     *       },
     *       "participation" : {
     *         "isParticipating" : true
     *                 ,"hasSuspendedListings" : false              }
     *     }    ]
     * }
     */
    @Test
    public void getMarketplaceParticipations() {
        GetMarketplaceParticipationsResponse response = sellersApi.getMarketplaceParticipations();
        logger.info("{}",response);
    }
}
