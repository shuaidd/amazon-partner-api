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



import java.math.BigDecimal;
import java.util.Objects;

/**
 * The shipment item information required by a seller to issue a shipment invoice.
 */

public class ShipmentItem {
  @SerializedName("ASIN")
  private String ASIN = null;

  @SerializedName("SellerSKU")
  private String sellerSKU = null;

  @SerializedName("OrderItemId")
  private String orderItemId = null;

  @SerializedName("Title")
  private String title = null;

  @SerializedName("QuantityOrdered")
  private BigDecimal quantityOrdered = null;

  @SerializedName("ItemPrice")
  private Money itemPrice = null;

  @SerializedName("ShippingPrice")
  private Money shippingPrice = null;

  @SerializedName("GiftWrapPrice")
  private Money giftWrapPrice = null;

  @SerializedName("ShippingDiscount")
  private Money shippingDiscount = null;

  @SerializedName("PromotionDiscount")
  private Money promotionDiscount = null;

  @SerializedName("SerialNumbers")
  private SerialNumbersList serialNumbers = null;

  public ShipmentItem ASIN(String ASIN) {
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

  public ShipmentItem sellerSKU(String sellerSKU) {
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

  public ShipmentItem orderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
    return this;
  }

   /**
   * The Amazon-defined identifier for the order item.
   * @return orderItemId
  **/

  public String getOrderItemId() {
    return orderItemId;
  }

  public void setOrderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
  }

  public ShipmentItem title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The name of the item.
   * @return title
  **/

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ShipmentItem quantityOrdered(BigDecimal quantityOrdered) {
    this.quantityOrdered = quantityOrdered;
    return this;
  }

   /**
   * The number of items ordered.
   * @return quantityOrdered
  **/

  public BigDecimal getQuantityOrdered() {
    return quantityOrdered;
  }

  public void setQuantityOrdered(BigDecimal quantityOrdered) {
    this.quantityOrdered = quantityOrdered;
  }

  public ShipmentItem itemPrice(Money itemPrice) {
    this.itemPrice = itemPrice;
    return this;
  }

   /**
   * The selling price of the item multiplied by the quantity ordered. Note that ItemPrice excludes ShippingPrice and GiftWrapPrice.
   * @return itemPrice
  **/

  public Money getItemPrice() {
    return itemPrice;
  }

  public void setItemPrice(Money itemPrice) {
    this.itemPrice = itemPrice;
  }

  public ShipmentItem shippingPrice(Money shippingPrice) {
    this.shippingPrice = shippingPrice;
    return this;
  }

   /**
   * The shipping price of the item.
   * @return shippingPrice
  **/

  public Money getShippingPrice() {
    return shippingPrice;
  }

  public void setShippingPrice(Money shippingPrice) {
    this.shippingPrice = shippingPrice;
  }

  public ShipmentItem giftWrapPrice(Money giftWrapPrice) {
    this.giftWrapPrice = giftWrapPrice;
    return this;
  }

   /**
   * The gift wrap price of the item.
   * @return giftWrapPrice
  **/

  public Money getGiftWrapPrice() {
    return giftWrapPrice;
  }

  public void setGiftWrapPrice(Money giftWrapPrice) {
    this.giftWrapPrice = giftWrapPrice;
  }

  public ShipmentItem shippingDiscount(Money shippingDiscount) {
    this.shippingDiscount = shippingDiscount;
    return this;
  }

   /**
   * The discount on the shipping price.
   * @return shippingDiscount
  **/

  public Money getShippingDiscount() {
    return shippingDiscount;
  }

  public void setShippingDiscount(Money shippingDiscount) {
    this.shippingDiscount = shippingDiscount;
  }

  public ShipmentItem promotionDiscount(Money promotionDiscount) {
    this.promotionDiscount = promotionDiscount;
    return this;
  }

   /**
   * The total of all promotional discounts in the offer.
   * @return promotionDiscount
  **/

  public Money getPromotionDiscount() {
    return promotionDiscount;
  }

  public void setPromotionDiscount(Money promotionDiscount) {
    this.promotionDiscount = promotionDiscount;
  }

  public ShipmentItem serialNumbers(SerialNumbersList serialNumbers) {
    this.serialNumbers = serialNumbers;
    return this;
  }

   /**
   * The list of serial numbers.
   * @return serialNumbers
  **/

  public SerialNumbersList getSerialNumbers() {
    return serialNumbers;
  }

  public void setSerialNumbers(SerialNumbersList serialNumbers) {
    this.serialNumbers = serialNumbers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentItem shipmentItem = (ShipmentItem) o;
    return Objects.equals(this.ASIN, shipmentItem.ASIN) &&
        Objects.equals(this.sellerSKU, shipmentItem.sellerSKU) &&
        Objects.equals(this.orderItemId, shipmentItem.orderItemId) &&
        Objects.equals(this.title, shipmentItem.title) &&
        Objects.equals(this.quantityOrdered, shipmentItem.quantityOrdered) &&
        Objects.equals(this.itemPrice, shipmentItem.itemPrice) &&
        Objects.equals(this.shippingPrice, shipmentItem.shippingPrice) &&
        Objects.equals(this.giftWrapPrice, shipmentItem.giftWrapPrice) &&
        Objects.equals(this.shippingDiscount, shipmentItem.shippingDiscount) &&
        Objects.equals(this.promotionDiscount, shipmentItem.promotionDiscount) &&
        Objects.equals(this.serialNumbers, shipmentItem.serialNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ASIN, sellerSKU, orderItemId, title, quantityOrdered, itemPrice, shippingPrice, giftWrapPrice, shippingDiscount, promotionDiscount, serialNumbers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentItem {\n");

    sb.append("    ASIN: ").append(toIndentedString(ASIN)).append("\n");
    sb.append("    sellerSKU: ").append(toIndentedString(sellerSKU)).append("\n");
    sb.append("    orderItemId: ").append(toIndentedString(orderItemId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    quantityOrdered: ").append(toIndentedString(quantityOrdered)).append("\n");
    sb.append("    itemPrice: ").append(toIndentedString(itemPrice)).append("\n");
    sb.append("    shippingPrice: ").append(toIndentedString(shippingPrice)).append("\n");
    sb.append("    giftWrapPrice: ").append(toIndentedString(giftWrapPrice)).append("\n");
    sb.append("    shippingDiscount: ").append(toIndentedString(shippingDiscount)).append("\n");
    sb.append("    promotionDiscount: ").append(toIndentedString(promotionDiscount)).append("\n");
    sb.append("    serialNumbers: ").append(toIndentedString(serialNumbers)).append("\n");
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

