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

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * The payload schema for the createShipment operation.
 */

public class CreateShipmentResult {
  @SerializedName("shipmentId")
  private String shipmentId = null;

  @SerializedName("eligibleRates")
  private RateList eligibleRates = null;

  public CreateShipmentResult shipmentId(String shipmentId) {
    this.shipmentId = shipmentId;
    return this;
  }

   /**
   * Get shipmentId
   * @return shipmentId
  **/

  public String getShipmentId() {
    return shipmentId;
  }

  public void setShipmentId(String shipmentId) {
    this.shipmentId = shipmentId;
  }

  public CreateShipmentResult eligibleRates(RateList eligibleRates) {
    this.eligibleRates = eligibleRates;
    return this;
  }

   /**
   * Get eligibleRates
   * @return eligibleRates
  **/

  public RateList getEligibleRates() {
    return eligibleRates;
  }

  public void setEligibleRates(RateList eligibleRates) {
    this.eligibleRates = eligibleRates;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateShipmentResult createShipmentResult = (CreateShipmentResult) o;
    return Objects.equals(this.shipmentId, createShipmentResult.shipmentId) &&
        Objects.equals(this.eligibleRates, createShipmentResult.eligibleRates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipmentId, eligibleRates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateShipmentResult {\n");

    sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
    sb.append("    eligibleRates: ").append(toIndentedString(eligibleRates)).append("\n");
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

