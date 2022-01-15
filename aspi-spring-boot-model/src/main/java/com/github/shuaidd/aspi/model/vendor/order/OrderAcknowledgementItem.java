/*
 * Selling Partner API for Retail Procurement Orders
 * The Selling Partner API for Retail Procurement Orders provides programmatic access to vendor orders data.
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.shuaidd.aspi.model.vendor.order;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Details of the item being acknowledged.
 */

public class OrderAcknowledgementItem {
  @SerializedName("itemSequenceNumber")
  private String itemSequenceNumber = null;

  @SerializedName("amazonProductIdentifier")
  private String amazonProductIdentifier = null;

  @SerializedName("vendorProductIdentifier")
  private String vendorProductIdentifier = null;

  @SerializedName("orderedQuantity")
  private ItemQuantity orderedQuantity = null;

  @SerializedName("netCost")
  private Money netCost = null;

  @SerializedName("listPrice")
  private Money listPrice = null;

  @SerializedName("discountMultiplier")
  private String discountMultiplier = null;

  @SerializedName("itemAcknowledgements")
  private List<OrderItemAcknowledgement> itemAcknowledgements = new ArrayList<OrderItemAcknowledgement>();

  public OrderAcknowledgementItem itemSequenceNumber(String itemSequenceNumber) {
    this.itemSequenceNumber = itemSequenceNumber;
    return this;
  }

   /**
   * Line item sequence number for the item.
   * @return itemSequenceNumber
  **/

  public String getItemSequenceNumber() {
    return itemSequenceNumber;
  }

  public void setItemSequenceNumber(String itemSequenceNumber) {
    this.itemSequenceNumber = itemSequenceNumber;
  }

  public OrderAcknowledgementItem amazonProductIdentifier(String amazonProductIdentifier) {
    this.amazonProductIdentifier = amazonProductIdentifier;
    return this;
  }

   /**
   * Amazon Standard Identification Number (ASIN) of an item.
   * @return amazonProductIdentifier
  **/

  public String getAmazonProductIdentifier() {
    return amazonProductIdentifier;
  }

  public void setAmazonProductIdentifier(String amazonProductIdentifier) {
    this.amazonProductIdentifier = amazonProductIdentifier;
  }

  public OrderAcknowledgementItem vendorProductIdentifier(String vendorProductIdentifier) {
    this.vendorProductIdentifier = vendorProductIdentifier;
    return this;
  }

   /**
   * The vendor selected product identification of the item. Should be the same as was sent in the purchase order.
   * @return vendorProductIdentifier
  **/

  public String getVendorProductIdentifier() {
    return vendorProductIdentifier;
  }

  public void setVendorProductIdentifier(String vendorProductIdentifier) {
    this.vendorProductIdentifier = vendorProductIdentifier;
  }

  public OrderAcknowledgementItem orderedQuantity(ItemQuantity orderedQuantity) {
    this.orderedQuantity = orderedQuantity;
    return this;
  }

   /**
   * The quantity of this item ordered.
   * @return orderedQuantity
  **/

  public ItemQuantity getOrderedQuantity() {
    return orderedQuantity;
  }

  public void setOrderedQuantity(ItemQuantity orderedQuantity) {
    this.orderedQuantity = orderedQuantity;
  }

  public OrderAcknowledgementItem netCost(Money netCost) {
    this.netCost = netCost;
    return this;
  }

   /**
   * The cost to Amazon, which should match the cost on the invoice. This is a required field. If this is left blank the file will reject in Amazon systems. Price information should not be zero or negative. Indicates a net unit price.
   * @return netCost
  **/

  public Money getNetCost() {
    return netCost;
  }

  public void setNetCost(Money netCost) {
    this.netCost = netCost;
  }

  public OrderAcknowledgementItem listPrice(Money listPrice) {
    this.listPrice = listPrice;
    return this;
  }

   /**
   * The list price. This is required only if a vendor sells books with a list price.
   * @return listPrice
  **/

  public Money getListPrice() {
    return listPrice;
  }

  public void setListPrice(Money listPrice) {
    this.listPrice = listPrice;
  }

  public OrderAcknowledgementItem discountMultiplier(String discountMultiplier) {
    this.discountMultiplier = discountMultiplier;
    return this;
  }

   /**
   * The discount multiplier that should be applied to the price if a vendor sells books with a list price. This is a multiplier factor to arrive at a final discounted price. A multiplier of .90 would be the factor if a 10% discount is given.
   * @return discountMultiplier
  **/

  public String getDiscountMultiplier() {
    return discountMultiplier;
  }

  public void setDiscountMultiplier(String discountMultiplier) {
    this.discountMultiplier = discountMultiplier;
  }

  public OrderAcknowledgementItem itemAcknowledgements(List<OrderItemAcknowledgement> itemAcknowledgements) {
    this.itemAcknowledgements = itemAcknowledgements;
    return this;
  }

  public OrderAcknowledgementItem addItemAcknowledgementsItem(OrderItemAcknowledgement itemAcknowledgementsItem) {
    this.itemAcknowledgements.add(itemAcknowledgementsItem);
    return this;
  }

   /**
   * This is used to indicate acknowledged quantity.
   * @return itemAcknowledgements
  **/

  public List<OrderItemAcknowledgement> getItemAcknowledgements() {
    return itemAcknowledgements;
  }

  public void setItemAcknowledgements(List<OrderItemAcknowledgement> itemAcknowledgements) {
    this.itemAcknowledgements = itemAcknowledgements;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderAcknowledgementItem orderAcknowledgementItem = (OrderAcknowledgementItem) o;
    return Objects.equals(this.itemSequenceNumber, orderAcknowledgementItem.itemSequenceNumber) &&
        Objects.equals(this.amazonProductIdentifier, orderAcknowledgementItem.amazonProductIdentifier) &&
        Objects.equals(this.vendorProductIdentifier, orderAcknowledgementItem.vendorProductIdentifier) &&
        Objects.equals(this.orderedQuantity, orderAcknowledgementItem.orderedQuantity) &&
        Objects.equals(this.netCost, orderAcknowledgementItem.netCost) &&
        Objects.equals(this.listPrice, orderAcknowledgementItem.listPrice) &&
        Objects.equals(this.discountMultiplier, orderAcknowledgementItem.discountMultiplier) &&
        Objects.equals(this.itemAcknowledgements, orderAcknowledgementItem.itemAcknowledgements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemSequenceNumber, amazonProductIdentifier, vendorProductIdentifier, orderedQuantity, netCost, listPrice, discountMultiplier, itemAcknowledgements);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderAcknowledgementItem {\n");

    sb.append("    itemSequenceNumber: ").append(toIndentedString(itemSequenceNumber)).append("\n");
    sb.append("    amazonProductIdentifier: ").append(toIndentedString(amazonProductIdentifier)).append("\n");
    sb.append("    vendorProductIdentifier: ").append(toIndentedString(vendorProductIdentifier)).append("\n");
    sb.append("    orderedQuantity: ").append(toIndentedString(orderedQuantity)).append("\n");
    sb.append("    netCost: ").append(toIndentedString(netCost)).append("\n");
    sb.append("    listPrice: ").append(toIndentedString(listPrice)).append("\n");
    sb.append("    discountMultiplier: ").append(toIndentedString(discountMultiplier)).append("\n");
    sb.append("    itemAcknowledgements: ").append(toIndentedString(itemAcknowledgements)).append("\n");
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

