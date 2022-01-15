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

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SubmitShipmentStatusUpdatesRequest
 */
public class SubmitShipmentStatusUpdatesRequest {
  @SerializedName("shipmentStatusUpdates")
  private List<ShipmentStatusUpdate> shipmentStatusUpdates = null;

  public SubmitShipmentStatusUpdatesRequest shipmentStatusUpdates(List<ShipmentStatusUpdate> shipmentStatusUpdates) {
    this.shipmentStatusUpdates = shipmentStatusUpdates;
    return this;
  }

  public SubmitShipmentStatusUpdatesRequest addShipmentStatusUpdatesItem(ShipmentStatusUpdate shipmentStatusUpdatesItem) {
    if (this.shipmentStatusUpdates == null) {
      this.shipmentStatusUpdates = new ArrayList<ShipmentStatusUpdate>();
    }
    this.shipmentStatusUpdates.add(shipmentStatusUpdatesItem);
    return this;
  }

   /**
   * Get shipmentStatusUpdates
   * @return shipmentStatusUpdates
  **/

  public List<ShipmentStatusUpdate> getShipmentStatusUpdates() {
    return shipmentStatusUpdates;
  }

  public void setShipmentStatusUpdates(List<ShipmentStatusUpdate> shipmentStatusUpdates) {
    this.shipmentStatusUpdates = shipmentStatusUpdates;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitShipmentStatusUpdatesRequest submitShipmentStatusUpdatesRequest = (SubmitShipmentStatusUpdatesRequest) o;
    return Objects.equals(this.shipmentStatusUpdates, submitShipmentStatusUpdatesRequest.shipmentStatusUpdates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipmentStatusUpdates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitShipmentStatusUpdatesRequest {\n");

    sb.append("    shipmentStatusUpdates: ").append(toIndentedString(shipmentStatusUpdates)).append("\n");
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
