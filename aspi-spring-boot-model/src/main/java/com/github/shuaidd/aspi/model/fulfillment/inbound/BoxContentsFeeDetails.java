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
 * The manual processing fee per unit and total fee for a shipment.
 */

public class BoxContentsFeeDetails {
  @SerializedName("TotalUnits")
  private Integer totalUnits = null;

  @SerializedName("FeePerUnit")
  private Amount feePerUnit = null;

  @SerializedName("TotalFee")
  private Amount totalFee = null;

  public BoxContentsFeeDetails totalUnits(Integer totalUnits) {
    this.totalUnits = totalUnits;
    return this;
  }

   /**
   * The number of units to ship.
   * @return totalUnits
  **/

  public Integer getTotalUnits() {
    return totalUnits;
  }

  public void setTotalUnits(Integer totalUnits) {
    this.totalUnits = totalUnits;
  }

  public BoxContentsFeeDetails feePerUnit(Amount feePerUnit) {
    this.feePerUnit = feePerUnit;
    return this;
  }

   /**
   * The manual processing fee per unit.
   * @return feePerUnit
  **/

  public Amount getFeePerUnit() {
    return feePerUnit;
  }

  public void setFeePerUnit(Amount feePerUnit) {
    this.feePerUnit = feePerUnit;
  }

  public BoxContentsFeeDetails totalFee(Amount totalFee) {
    this.totalFee = totalFee;
    return this;
  }

   /**
   * The total manual processing fee for the shipment.
   * @return totalFee
  **/

  public Amount getTotalFee() {
    return totalFee;
  }

  public void setTotalFee(Amount totalFee) {
    this.totalFee = totalFee;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoxContentsFeeDetails boxContentsFeeDetails = (BoxContentsFeeDetails) o;
    return Objects.equals(this.totalUnits, boxContentsFeeDetails.totalUnits) &&
        Objects.equals(this.feePerUnit, boxContentsFeeDetails.feePerUnit) &&
        Objects.equals(this.totalFee, boxContentsFeeDetails.totalFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalUnits, feePerUnit, totalFee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoxContentsFeeDetails {\n");

    sb.append("    totalUnits: ").append(toIndentedString(totalUnits)).append("\n");
    sb.append("    feePerUnit: ").append(toIndentedString(feePerUnit)).append("\n");
    sb.append("    totalFee: ").append(toIndentedString(totalFee)).append("\n");
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
