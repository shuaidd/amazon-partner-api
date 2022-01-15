/*
 * Selling Partner API for Shipment Invoicing
 * The Selling Partner API for Shipment Invoicing helps you programmatically retrieve shipment invoice information in the Brazil marketplace for a selling partner’s Fulfillment by Amazon (FBA) orders.
 *
 * OpenAPI spec version: v0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.shuaidd.aspi.model.shipment;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * The shipment invoice status response.
 */

public class ShipmentInvoiceStatusResponse {
  @SerializedName("Shipments")
  private ShipmentInvoiceStatusInfo shipments = null;

  public ShipmentInvoiceStatusResponse shipments(ShipmentInvoiceStatusInfo shipments) {
    this.shipments = shipments;
    return this;
  }

   /**
   * Get shipments
   * @return shipments
  **/

  public ShipmentInvoiceStatusInfo getShipments() {
    return shipments;
  }

  public void setShipments(ShipmentInvoiceStatusInfo shipments) {
    this.shipments = shipments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentInvoiceStatusResponse shipmentInvoiceStatusResponse = (ShipmentInvoiceStatusResponse) o;
    return Objects.equals(this.shipments, shipmentInvoiceStatusResponse.shipments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentInvoiceStatusResponse {\n");

    sb.append("    shipments: ").append(toIndentedString(shipments)).append("\n");
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

