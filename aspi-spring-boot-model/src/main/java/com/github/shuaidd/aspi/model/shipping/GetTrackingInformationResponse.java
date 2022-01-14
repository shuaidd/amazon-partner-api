/*
 * Selling Partner API for Shipping
 * Provides programmatic access to Amazon Shipping APIs.
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.shuaidd.aspi.model.shipping;

import com.github.shuaidd.aspi.model.common.ErrorList;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * The response schema for the getTrackingInformation operation.
 */

public class GetTrackingInformationResponse {
  @SerializedName("payload")
  private TrackingInformation payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public GetTrackingInformationResponse payload(TrackingInformation payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The payload for getTrackingInformation operation
   * @return payload
  **/

  public TrackingInformation getPayload() {
    return payload;
  }

  public void setPayload(TrackingInformation payload) {
    this.payload = payload;
  }

  public GetTrackingInformationResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Encountered errors for the operation.
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
    GetTrackingInformationResponse getTrackingInformationResponse = (GetTrackingInformationResponse) o;
    return Objects.equals(this.payload, getTrackingInformationResponse.payload) &&
        Objects.equals(this.errors, getTrackingInformationResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTrackingInformationResponse {\n");

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

