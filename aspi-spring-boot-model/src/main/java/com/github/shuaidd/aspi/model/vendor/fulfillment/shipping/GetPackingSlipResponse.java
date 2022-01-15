/*
 * Selling Partner API for Direct Fulfillment Shipping
 * The Selling Partner API for Direct Fulfillment Shipping provides programmatic access to a direct fulfillment vendor's shipping data.
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.shuaidd.aspi.model.vendor.fulfillment.shipping;

import com.github.shuaidd.aspi.model.common.ErrorList;
import com.google.gson.annotations.SerializedName;


import java.util.Objects;

/**
 * GetPackingSlipResponse
 */
public class GetPackingSlipResponse {
  @SerializedName("payload")
  private PackingSlip payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public GetPackingSlipResponse payload(PackingSlip payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/

  public PackingSlip getPayload() {
    return payload;
  }

  public void setPayload(PackingSlip payload) {
    this.payload = payload;
  }

  public GetPackingSlipResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
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
    GetPackingSlipResponse getPackingSlipResponse = (GetPackingSlipResponse) o;
    return Objects.equals(this.payload, getPackingSlipResponse.payload) &&
        Objects.equals(this.errors, getPackingSlipResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPackingSlipResponse {\n");

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

