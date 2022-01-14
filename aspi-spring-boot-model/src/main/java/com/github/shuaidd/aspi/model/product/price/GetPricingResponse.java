/*
 * Selling Partner API for Pricing
 * The Selling Partner API for Pricing helps you programmatically retrieve product pricing and offer information for Amazon Marketplace products.
 *
 * OpenAPI spec version: v0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.shuaidd.aspi.model.product.price;

import com.github.shuaidd.aspi.model.common.ErrorList;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * The response schema for the getPricing and getCompetitivePricing operations.
 */

public class GetPricingResponse {
  @SerializedName("payload")
  private PriceList payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public GetPricingResponse payload(PriceList payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The payload for the getPricing and getCompetitivePricing operations.
   * @return payload
  **/

  public PriceList getPayload() {
    return payload;
  }

  public void setPayload(PriceList payload) {
    this.payload = payload;
  }

  public GetPricingResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * One or more unexpected errors occurred during the operation.
   * @return errors
  **/

  public ErrorList getErrors() {
    return errors;
  }

  public void setErrors(ErrorList errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPricingResponse getPricingResponse = (GetPricingResponse) o;
    return Objects.equals(this.payload, getPricingResponse.payload) &&
        Objects.equals(this.errors, getPricingResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPricingResponse {\n");

    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
