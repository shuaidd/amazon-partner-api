package com.unittest.notification;

import com.github.shuaidd.aspi.api.client.NotificationsApi;
import com.github.shuaidd.aspi.api.support.LWAClientScopes;
import com.github.shuaidd.aspi.api.support.ScopeConstants;
import com.github.shuaidd.aspi.model.common.EndPoint;
import com.github.shuaidd.aspi.model.notification.CreateDestinationRequest;
import com.github.shuaidd.aspi.model.notification.DestinationResourceSpecification;
import com.github.shuaidd.aspi.model.notification.EventBridgeResourceSpecification;
import com.unittest.AbstractTest;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;

/**
 * notification api test
 *
 * @author ddshuai
 * date 2022-01-15 15:41
 **/
public class NotificationApiTest extends AbstractTest {

    private NotificationsApi notificationsApi;

    @Before
    public void init() {
        /*不需要卖家授权的接口的调用方式 grantless*/
        LWAClientScopes scopes = new LWAClientScopes(new HashSet<String>(Collections.singleton(ScopeConstants.SCOPE_NOTIFICATIONS_API)));
        notificationsApi = amazonPartnerApiManager.getApiClient(NotificationsApi.class, EndPoint.EU_WEST, scopes);
    }

    @Test
    public void createDestination() {
        CreateDestinationRequest request = new CreateDestinationRequest();
        request.setName("test");
        DestinationResourceSpecification resourceSpecification = new DestinationResourceSpecification();
        EventBridgeResourceSpecification eventBridgeResourceSpecification = new EventBridgeResourceSpecification();
        eventBridgeResourceSpecification.setAccountId(partnerProperties.getAws().getAccountId());
        eventBridgeResourceSpecification.setRegion(EndPoint.EU_WEST.getArea());
        resourceSpecification.setEventBridge(eventBridgeResourceSpecification);
        request.setResourceSpecification(resourceSpecification);

        notificationsApi.createDestination(request);
    }
}
