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
 * The response schema for the submitShipmentConfirmations operation.
 */

public class SubmitShipmentConfirmationsResponse {
  @SerializedName("payload")
  private TransactionReference payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public SubmitShipmentConfirmationsResponse payload(TransactionReference payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The response payload for the submitShipmentConfirmations operation.
   * @return payload
  **/

  public TransactionReference getPayload() {
    return payload;
  }

  public void setPayload(TransactionReference payload) {
    this.payload = payload;
  }

  public SubmitShipmentConfirmationsResponse errors(ErrorList errors) {
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
    SubmitShipmentConfirmationsResponse submitShipmentConfirmationsResponse = (SubmitShipmentConfirmationsResponse) o;
    return Objects.equals(this.payload, submitShipmentConfirmationsResponse.payload) &&
        Objects.equals(this.errors, submitShipmentConfirmationsResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitShipmentConfirmationsResponse {\n");

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

