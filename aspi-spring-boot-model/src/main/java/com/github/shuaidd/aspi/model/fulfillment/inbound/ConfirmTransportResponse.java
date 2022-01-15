/*
 * Selling Partner API for Fulfillment Inbound
 * The Selling Partner API for Fulfillment Inbound lets you create applications that create and update inbound shipments of inventory to Amazon's fulfillment network.
 *
 * OpenAPI spec version: v0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.shuaidd.aspi.model.fulfillment.inbound;

import com.github.shuaidd.aspi.model.common.ErrorList;
import com.google.gson.annotations.SerializedName;


import java.util.Objects;

/**
 * The response schema for the confirmTransport operation.
 */

public class ConfirmTransportResponse {
  @SerializedName("payload")
  private CommonTransportResult payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public ConfirmTransportResponse payload(CommonTransportResult payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The payload for the confirmTransport operation.
   * @return payload
  **/

  public CommonTransportResult getPayload() {
    return payload;
  }

  public void setPayload(CommonTransportResult payload) {
    this.payload = payload;
  }

  public ConfirmTransportResponse errors(ErrorList errors) {
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
    ConfirmTransportResponse confirmTransportResponse = (ConfirmTransportResponse) o;
    return Objects.equals(this.payload, confirmTransportResponse.payload) &&
        Objects.equals(this.errors, confirmTransportResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfirmTransportResponse {\n");

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

