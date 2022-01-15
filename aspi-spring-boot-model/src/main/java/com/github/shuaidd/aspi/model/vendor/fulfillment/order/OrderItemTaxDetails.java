/*
 * Selling Partner API for Direct Fulfillment Orders
 * The Selling Partner API for Direct Fulfillment Orders provides programmatic access to a direct fulfillment vendor's order data.
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.shuaidd.aspi.model.vendor.fulfillment.order;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Total tax details for the line item.
 */

public class OrderItemTaxDetails {
  @SerializedName("taxLineItem")
  private TaxLineItem taxLineItem = null;

  public OrderItemTaxDetails taxLineItem(TaxLineItem taxLineItem) {
    this.taxLineItem = taxLineItem;
    return this;
  }

   /**
   * Tax details.
   * @return taxLineItem
  **/

  public TaxLineItem getTaxLineItem() {
    return taxLineItem;
  }

  public void setTaxLineItem(TaxLineItem taxLineItem) {
    this.taxLineItem = taxLineItem;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemTaxDetails orderItemTaxDetails = (OrderItemTaxDetails) o;
    return Objects.equals(this.taxLineItem, orderItemTaxDetails.taxLineItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxLineItem);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemTaxDetails {\n");

    sb.append("    taxLineItem: ").append(toIndentedString(taxLineItem)).append("\n");
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

