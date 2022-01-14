package com.github.shuaidd.aspi.api.support;

import lombok.Builder;
import lombok.Data;

/**
 * LWAAuthorizationCredentials
 */
@Data
@Builder
public class LWAAuthorizationCredentials {
    /**
     * LWA Client Id
     */
    private String clientId;

    /**
     * LWA Client Secret
     */
    private String clientSecret;

    /**
     * LWA Refresh Token
     */
    private String refreshToken;

    /**
     * LWA Authorization Server Endpoint
     */
    private String endpoint;

    /**
     * LWA Client Scopes
     */
    private LWAClientScopes scopes;
}
