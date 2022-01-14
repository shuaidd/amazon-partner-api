/*
 * Selling Partner API for Product Type Definitions
 * The Selling Partner API for Product Type Definitions provides programmatic access to attribute and data requirements for product types in the Amazon catalog. Use this API to return the JSON Schema for a product type that you can then use with other Selling Partner APIs, such as the Selling Partner API for Listings Items, the Selling Partner API for Catalog Items, and the Selling Partner API for Feeds (for JSON-based listing feeds).  For more information, see the [Product Type Definitions API Use Case Guide](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/use-case-guides/product-type-definitions-api-use-case-guide/definitions-product-types-api-use-case-guide_2020-09-01.md).
 *
 * OpenAPI spec version: 2020-09-01
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.shuaidd.aspi.model.product.type;

import com.google.gson.annotations.SerializedName;


import java.util.Objects;

/**
 * The version details for an Amazon product type.
 */

public class ProductTypeVersion {
  @SerializedName("version")
  private String version = null;

  @SerializedName("latest")
  private Boolean latest = null;

  @SerializedName("releaseCandidate")
  private Boolean releaseCandidate = null;

  public ProductTypeVersion version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Version identifier.
   * @return version
  **/

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ProductTypeVersion latest(Boolean latest) {
    this.latest = latest;
    return this;
  }

   /**
   * When true, the version indicated by the version identifier is the latest available for the Amazon product type.
   * @return latest
  **/

  public Boolean isLatest() {
    return latest;
  }

  public void setLatest(Boolean latest) {
    this.latest = latest;
  }

  public ProductTypeVersion releaseCandidate(Boolean releaseCandidate) {
    this.releaseCandidate = releaseCandidate;
    return this;
  }

   /**
   * When true, the version indicated by the version identifier is the prerelease (release candidate) for the Amazon product type.
   * @return releaseCandidate
  **/

  public Boolean isReleaseCandidate() {
    return releaseCandidate;
  }

  public void setReleaseCandidate(Boolean releaseCandidate) {
    this.releaseCandidate = releaseCandidate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductTypeVersion productTypeVersion = (ProductTypeVersion) o;
    return Objects.equals(this.version, productTypeVersion.version) &&
        Objects.equals(this.latest, productTypeVersion.latest) &&
        Objects.equals(this.releaseCandidate, productTypeVersion.releaseCandidate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, latest, releaseCandidate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductTypeVersion {\n");

    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
    sb.append("    releaseCandidate: ").append(toIndentedString(releaseCandidate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

