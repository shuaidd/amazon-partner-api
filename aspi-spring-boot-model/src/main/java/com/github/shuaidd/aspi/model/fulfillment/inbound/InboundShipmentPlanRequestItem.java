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

import com.google.gson.annotations.SerializedName;


import java.util.Objects;

/**
 * Item information for creating an inbound shipment plan. Submitted with a call to the createInboundShipmentPlan operation.
 */

public class InboundShipmentPlanRequestItem {
  @SerializedName("SellerSKU")
  private String sellerSKU = null;

  @SerializedName("ASIN")
  private String ASIN = null;

  @SerializedName("Condition")
  private Condition condition = null;

  @SerializedName("Quantity")
  private Integer quantity = null;

  @SerializedName("QuantityInCase")
  private Integer quantityInCase = null;

  @SerializedName("PrepDetailsList")
  private PrepDetailsList prepDetailsList = null;

  public InboundShipmentPlanRequestItem sellerSKU(String sellerSKU) {
    this.sellerSKU = sellerSKU;
    return this;
  }

   /**
   * The seller SKU of the item.
   * @return sellerSKU
  **/

  public String getSellerSKU() {
    return sellerSKU;
  }

  public void setSellerSKU(String sellerSKU) {
    this.sellerSKU = sellerSKU;
  }

  public InboundShipmentPlanRequestItem ASIN(String ASIN) {
    this.ASIN = ASIN;
    return this;
  }

   /**
   * The Amazon Standard Identification Number (ASIN) of the item.
   * @return ASIN
  **/

  public String getASIN() {
    return ASIN;
  }

  public void setASIN(String ASIN) {
    this.ASIN = ASIN;
  }

  public InboundShipmentPlanRequestItem condition(Condition condition) {
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/

  public Condition getCondition() {
    return condition;
  }

  public void setCondition(Condition condition) {
    this.condition = condition;
  }

  public InboundShipmentPlanRequestItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public InboundShipmentPlanRequestItem quantityInCase(Integer quantityInCase) {
    this.quantityInCase = quantityInCase;
    return this;
  }

   /**
   * The item quantity in each case, for case-packed items. Note that QuantityInCase multiplied by the number of cases in the inbound shipment equals Quantity. Also note that all of the boxes of an inbound shipment must either be case packed or individually packed. For that reason, when you submit the createInboundShipmentPlan operation, the value of QuantityInCase must be provided for every item in the shipment or for none of the items in the shipment.
   * @return quantityInCase
  **/

  public Integer getQuantityInCase() {
    return quantityInCase;
  }

  public void setQuantityInCase(Integer quantityInCase) {
    this.quantityInCase = quantityInCase;
  }

  public InboundShipmentPlanRequestItem prepDetailsList(PrepDetailsList prepDetailsList) {
    this.prepDetailsList = prepDetailsList;
    return this;
  }

   /**
   * Get prepDetailsList
   * @return prepDetailsList
  **/

  public PrepDetailsList getPrepDetailsList() {
    return prepDetailsList;
  }

  public void setPrepDetailsList(PrepDetailsList prepDetailsList) {
    this.prepDetailsList = prepDetailsList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundShipmentPlanRequestItem inboundShipmentPlanRequestItem = (InboundShipmentPlanRequestItem) o;
    return Objects.equals(this.sellerSKU, inboundShipmentPlanRequestItem.sellerSKU) &&
        Objects.equals(this.ASIN, inboundShipmentPlanRequestItem.ASIN) &&
        Objects.equals(this.condition, inboundShipmentPlanRequestItem.condition) &&
        Objects.equals(this.quantity, inboundShipmentPlanRequestItem.quantity) &&
        Objects.equals(this.quantityInCase, inboundShipmentPlanRequestItem.quantityInCase) &&
        Objects.equals(this.prepDetailsList, inboundShipmentPlanRequestItem.prepDetailsList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerSKU, ASIN, condition, quantity, quantityInCase, prepDetailsList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundShipmentPlanRequestItem {\n");

    sb.append("    sellerSKU: ").append(toIndentedString(sellerSKU)).append("\n");
    sb.append("    ASIN: ").append(toIndentedString(ASIN)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    quantityInCase: ").append(toIndentedString(quantityInCase)).append("\n");
    sb.append("    prepDetailsList: ").append(toIndentedString(prepDetailsList)).append("\n");
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

