/*
 * Selling Partner API for Orders
 * The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools.
 *
 * OpenAPI spec version: v0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.shuaidd.aspi.model.order;

import com.google.gson.annotations.SerializedName;



import java.util.Objects;

/**
 * A single order item&#39;s buyer information list with the order ID.
 */

public class OrderItemsBuyerInfoList {
  @SerializedName("OrderItems")
  private OrderItemBuyerInfoList orderItems = null;

  @SerializedName("NextToken")
  private String nextToken = null;

  @SerializedName("AmazonOrderId")
  private String amazonOrderId = null;

  public OrderItemsBuyerInfoList orderItems(OrderItemBuyerInfoList orderItems) {
    this.orderItems = orderItems;
    return this;
  }

   /**
   * Get orderItems
   * @return orderItems
  **/

  public OrderItemBuyerInfoList getOrderItems() {
    return orderItems;
  }

  public void setOrderItems(OrderItemBuyerInfoList orderItems) {
    this.orderItems = orderItems;
  }

  public OrderItemsBuyerInfoList nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * When present and not empty, pass this string token in the next request to return the next response page.
   * @return nextToken
  **/

  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  public OrderItemsBuyerInfoList amazonOrderId(String amazonOrderId) {
    this.amazonOrderId = amazonOrderId;
    return this;
  }

   /**
   * An Amazon-defined order identifier, in 3-7-7 format.
   * @return amazonOrderId
  **/

  public String getAmazonOrderId() {
    return amazonOrderId;
  }

  public void setAmazonOrderId(String amazonOrderId) {
    this.amazonOrderId = amazonOrderId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemsBuyerInfoList orderItemsBuyerInfoList = (OrderItemsBuyerInfoList) o;
    return Objects.equals(this.orderItems, orderItemsBuyerInfoList.orderItems) &&
        Objects.equals(this.nextToken, orderItemsBuyerInfoList.nextToken) &&
        Objects.equals(this.amazonOrderId, orderItemsBuyerInfoList.amazonOrderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderItems, nextToken, amazonOrderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemsBuyerInfoList {\n");

    sb.append("    orderItems: ").append(toIndentedString(orderItems)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    amazonOrderId: ").append(toIndentedString(amazonOrderId)).append("\n");
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

