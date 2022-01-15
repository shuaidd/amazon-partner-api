/*
 * Selling Partner API for Direct Fulfillment Inventory Updates
 * The Selling Partner API for Direct Fulfillment Inventory Updates provides programmatic access to a direct fulfillment vendor's inventory updates.
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.shuaidd.aspi.model.vendor.fulfillment.inventory;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Details of item quantity.
 */

public class ItemQuantity {
  @SerializedName("amount")
  private Integer amount = null;

  @SerializedName("unitOfMeasure")
  private String unitOfMeasure = null;

  public ItemQuantity amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Quantity of units available for a specific item.
   * @return amount
  **/

  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public ItemQuantity unitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

   /**
   * Unit of measure for the available quantity.
   * @return unitOfMeasure
  **/

  public String getUnitOfMeasure() {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemQuantity itemQuantity = (ItemQuantity) o;
    return Objects.equals(this.amount, itemQuantity.amount) &&
        Objects.equals(this.unitOfMeasure, itemQuantity.unitOfMeasure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, unitOfMeasure);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemQuantity {\n");

    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
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

