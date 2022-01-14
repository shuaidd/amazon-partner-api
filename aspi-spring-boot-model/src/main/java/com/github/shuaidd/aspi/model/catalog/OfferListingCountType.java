/*
 * Selling Partner API for Catalog Items
 * The Selling Partner API for Catalog Items helps you programmatically retrieve item details for items in the catalog.
 *
 * OpenAPI spec version: v0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.shuaidd.aspi.model.catalog;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * The number of offer listings with the specified condition.
 */

public class OfferListingCountType {
  @SerializedName("Count")
  private Integer count = null;

  @SerializedName("condition")
  private String condition = null;

  public OfferListingCountType count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * The number of offer listings.
   * @return count
  **/

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public OfferListingCountType condition(String condition) {
    this.condition = condition;
    return this;
  }

   /**
   * The condition of the item.
   * @return condition
  **/

  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferListingCountType offerListingCountType = (OfferListingCountType) o;
    return Objects.equals(this.count, offerListingCountType.count) &&
        Objects.equals(this.condition, offerListingCountType.condition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, condition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferListingCountType {\n");

    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
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

