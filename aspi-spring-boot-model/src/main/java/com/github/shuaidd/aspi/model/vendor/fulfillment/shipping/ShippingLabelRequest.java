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
 * ShippingLabelRequest
 */
public class ShippingLabelRequest {
  @SerializedName("purchaseOrderNumber")
  private String purchaseOrderNumber = null;

  @SerializedName("sellingParty")
  private PartyIdentification sellingParty = null;

  @SerializedName("shipFromParty")
  private PartyIdentification shipFromParty = null;

  @SerializedName("containers")
  private List<Container> containers = null;

  public ShippingLabelRequest purchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
    return this;
  }

   /**
   * Purchase order number of the order for which to create a shipping label.
   * @return purchaseOrderNumber
  **/

  public String getPurchaseOrderNumber() {
    return purchaseOrderNumber;
  }

  public void setPurchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
  }

  public ShippingLabelRequest sellingParty(PartyIdentification sellingParty) {
    this.sellingParty = sellingParty;
    return this;
  }

   /**
   * ID of the selling party or vendor.
   * @return sellingParty
  **/

  public PartyIdentification getSellingParty() {
    return sellingParty;
  }

  public void setSellingParty(PartyIdentification sellingParty) {
    this.sellingParty = sellingParty;
  }

  public ShippingLabelRequest shipFromParty(PartyIdentification shipFromParty) {
    this.shipFromParty = shipFromParty;
    return this;
  }

   /**
   * Warehouse code of vendor.
   * @return shipFromParty
  **/

  public PartyIdentification getShipFromParty() {
    return shipFromParty;
  }

  public void setShipFromParty(PartyIdentification shipFromParty) {
    this.shipFromParty = shipFromParty;
  }

  public ShippingLabelRequest containers(List<Container> containers) {
    this.containers = containers;
    return this;
  }

  public ShippingLabelRequest addContainersItem(Container containersItem) {
    if (this.containers == null) {
      this.containers = new ArrayList<Container>();
    }
    this.containers.add(containersItem);
    return this;
  }

   /**
   * A list of the packages in this shipment.
   * @return containers
  **/

  public List<Container> getContainers() {
    return containers;
  }

  public void setContainers(List<Container> containers) {
    this.containers = containers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingLabelRequest shippingLabelRequest = (ShippingLabelRequest) o;
    return Objects.equals(this.purchaseOrderNumber, shippingLabelRequest.purchaseOrderNumber) &&
        Objects.equals(this.sellingParty, shippingLabelRequest.sellingParty) &&
        Objects.equals(this.shipFromParty, shippingLabelRequest.shipFromParty) &&
        Objects.equals(this.containers, shippingLabelRequest.containers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purchaseOrderNumber, sellingParty, shipFromParty, containers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingLabelRequest {\n");

    sb.append("    purchaseOrderNumber: ").append(toIndentedString(purchaseOrderNumber)).append("\n");
    sb.append("    sellingParty: ").append(toIndentedString(sellingParty)).append("\n");
    sb.append("    shipFromParty: ").append(toIndentedString(shipFromParty)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
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

