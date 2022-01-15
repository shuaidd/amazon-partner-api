package com.github.shuaidd.aspi.model.common;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述 亚马逊商城
 * marketplaceId 标识了请求的商城。
 * PL,A1C3SOZRARQ6R3,www.amazon.pl
 * SE,A2NODRKZP88ZB9,www.amazon.se
 * @author ddshuai
 * date 2020-11-28 16:57
 **/
@Getter
public enum Marketplace {

    /**
     * 北美
     */
    CA("CA", "加拿大", "A2EUQ1WTGCTBG2", "en", "NORTH_AMERICA", "https://www.amazon.ca/dp/"),
    US("US", "美国", "ATVPDKIKX0DER", "en", "NORTH_AMERICA", "https://www.amazon.com/dp/"),
    MX("MX", "墨西哥", "A1AM78C64UM0Y8", "es", "NORTH_AMERICA", "https://www.amazon.com.mx/dp/"),

    /**
     * 欧洲
     */
    ES("ES", "西班牙", "A1RKKUPIHCS9HS", "es", "EUROPE", "https://www.amazon.es/dp/"),
    GB("GB", "英国", "A1F83G8C2ARO7P", "en", "EUROPE", "https://www.amazon.co.uk/dp/"),
    FR("FR", "法国", "A13V1IB3VIYZZH", "fr", "EUROPE", "https://www.amazon.fr/dp/"),
    NL("NL", "荷兰", "A1805IZSGTT6HS", "nl", "EUROPE", null),
    DE("DE", "德国", "A1PA6795UKMFR9", "de", "EUROPE", "https://www.amazon.de/dp/"),
    IT("IT", "意大利", "APJ6JRA9NG5V4", "it", "EUROPE", "https://www.amazon.it/dp/"),

    /**
     * 远东
     */
    AU("AU", "澳大利亚", "A39IBJ37TRP1C6", "en", "FAR_EAST_AU", null),
    JP("JP", "日本", "A1VC38T7YXB528", "ja", "FAR_EAST_JP", "https://www.amazon.co.jp/dp/"),
    ;
    private final String countryCode;
    private final String countryName;
    private final String marketplaceId;
    private final String language;
    private final String area;
    private final String url;

    Marketplace(String countryCode, String countryName, String marketplaceId, String language, String area, String url) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.marketplaceId = marketplaceId;
        this.language = language;
        this.area = area;
        this.url = url;
    }

    /**
     * 根据国家代码过去商城编号
     *
     * @param countryCode 国家代码
     * @return 商城编号
     */
    public static Marketplace getMarketplaceIdByCode(String countryCode) {
        for (Marketplace value : values()) {
            if (value.countryCode.equals(countryCode)) {
                return value;
            }
        }

        return null;
    }

    public static Marketplace getMarketplaceIdById(String marketplaceId) {
        for (Marketplace value : values()) {
            if (value.marketplaceId.equals(marketplaceId)) {
                return value;
            }
        }

        return null;
    }

    public static List<Marketplace> getMarketplaceIdByArea(String area) {
        List<Marketplace> marketplaces = new ArrayList<>();
        for (Marketplace value : values()) {
            if (value.area.equals(area)) {
                marketplaces.add(value);
            }
        }

        return marketplaces;
    }
}
