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
 * Information returned by Amazon about a Small Parcel shipment by a carrier that has not partnered with Amazon.
 */

public class NonPartneredSmallParcelDataOutput {
  @SerializedName("PackageList")
  private NonPartneredSmallParcelPackageOutputList packageList = null;

  public NonPartneredSmallParcelDataOutput packageList(NonPartneredSmallParcelPackageOutputList packageList) {
    this.packageList = packageList;
    return this;
  }

   /**
   * Get packageList
   * @return packageList
  **/

  public NonPartneredSmallParcelPackageOutputList getPackageList() {
    return packageList;
  }

  public void setPackageList(NonPartneredSmallParcelPackageOutputList packageList) {
    this.packageList = packageList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NonPartneredSmallParcelDataOutput nonPartneredSmallParcelDataOutput = (NonPartneredSmallParcelDataOutput) o;
    return Objects.equals(this.packageList, nonPartneredSmallParcelDataOutput.packageList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NonPartneredSmallParcelDataOutput {\n");

    sb.append("    packageList: ").append(toIndentedString(packageList)).append("\n");
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
