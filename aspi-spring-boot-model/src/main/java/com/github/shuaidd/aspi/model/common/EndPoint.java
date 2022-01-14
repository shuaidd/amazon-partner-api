package com.github.shuaidd.aspi.model.common;

import java.util.Objects;

/**
 * 亚马逊销售端点
 */
public enum EndPoint {
    /**
     * 北美（加拿大、美国、墨西哥和巴西商城）
     */
    US_EAST("us-east-1", "https://sellingpartnerapi-na.amazon.com", "https://sandbox.sellingpartnerapi-na.amazon.com"),

    /**
     * 欧洲（西班牙、英国、法国、荷兰、德国、意大利、土耳其、阿联酋和印度商城）
     */
    EU_WEST("eu-west-1", "https://sellingpartnerapi-eu.amazon.com", "https://sandbox.sellingpartnerapi-eu.amazon.com"),

    /**
     * 远东（新加坡、澳大利亚和日本商城）
     */
    US_WEST("us-west-2", "https://sellingpartnerapi-fe.amazon.com", "https://sandbox.sellingpartnerapi-fe.amazon.com");
    private final String area;
    private final String url;
    private final String sandboxUrl;

    EndPoint(String area, String url, String sandboxUrl) {
        this.area = area;
        this.url = url;
        this.sandboxUrl = sandboxUrl;
    }

    /**
     * 获取区域对应的请求端点
     *
     * @param area 区域
     * @return 请求地址
     */
    public static EndPoint getEndPoint(String area) {
        for (EndPoint value : values()) {
            if (value.area.equals(area)) {
                return value;
            }
        }

        return null;
    }

    public static EndPoint getEndpointByCountryCode(String countryCode) {
        Marketplace marketplace = Marketplace.getMarketplaceIdByCode(countryCode);
        if (Objects.nonNull(marketplace)) {
            if ("NORTH_AMERICA".equals(marketplace.getArea())) {
                return EndPoint.US_EAST;
            }

            if ("EUROPE".equals(marketplace.getArea())) {
                return EndPoint.EU_WEST;
            }

            if ("FAR_EAST".equals(marketplace.getArea())) {
                return EndPoint.US_WEST;
            }

            if ("FAR_EAST_AU".equals(marketplace.getArea())) {
                return EndPoint.US_WEST;
            }

            if ("FAR_EAST_JP".equals(marketplace.getArea())) {
                return EndPoint.US_WEST;
            }
        }

        return null;
    }

    public String getArea() {
        return area;
    }

    public String getUrl() {
        return url;
    }

    public String getSandboxUrl() {
        return sandboxUrl;
    }
}
