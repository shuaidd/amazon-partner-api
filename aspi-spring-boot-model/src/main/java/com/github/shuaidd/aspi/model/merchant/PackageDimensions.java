/*
 * Selling Partner API for Merchant Fulfillment
 * The Selling Partner API for Merchant Fulfillment helps you build applications that let sellers purchase shipping for non-Prime and Prime orders using Amazon’s Buy Shipping Services.
 *
 * OpenAPI spec version: v0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.shuaidd.aspi.model.merchant;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * The dimensions of a package contained in a shipment.
 */

public class PackageDimensions {
  @SerializedName("Length")
  private BigDecimal length = null;

  @SerializedName("Width")
  private BigDecimal width = null;

  @SerializedName("Height")
  private BigDecimal height = null;

  @SerializedName("Unit")
  private UnitOfLength unit = null;

  @SerializedName("PredefinedPackageDimensions")
  private PredefinedPackageDimensions predefinedPackageDimensions = null;

  public PackageDimensions length(BigDecimal length) {
    this.length = length;
    return this;
  }

   /**
   * The length dimension. If you don&#39;t specify PredefinedPackageDimensions, you must specify the Length.
   * @return length
  **/

  public BigDecimal getLength() {
    return length;
  }

  public void setLength(BigDecimal length) {
    this.length = length;
  }

  public PackageDimensions width(BigDecimal width) {
    this.width = width;
    return this;
  }

   /**
   * The width dimension. If you don&#39;t specify PredefinedPackageDimensions, you must specify the Width.
   * @return width
  **/

  public BigDecimal getWidth() {
    return width;
  }

  public void setWidth(BigDecimal width) {
    this.width = width;
  }

  public PackageDimensions height(BigDecimal height) {
    this.height = height;
    return this;
  }

   /**
   * The height dimension. If you don&#39;t specify PredefinedPackageDimensions, you must specify the Height.
   * @return height
  **/

  public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  public PackageDimensions unit(UnitOfLength unit) {
    this.unit = unit;
    return this;
  }

   /**
   * The unit of measurement. If you don&#39;t specify PredefinedPackageDimensions, you must specify the Unit.
   * @return unit
  **/

  public UnitOfLength getUnit() {
    return unit;
  }

  public void setUnit(UnitOfLength unit) {
    this.unit = unit;
  }

  public PackageDimensions predefinedPackageDimensions(PredefinedPackageDimensions predefinedPackageDimensions) {
    this.predefinedPackageDimensions = predefinedPackageDimensions;
    return this;
  }

   /**
   * Get predefinedPackageDimensions
   * @return predefinedPackageDimensions
  **/

  public PredefinedPackageDimensions getPredefinedPackageDimensions() {
    return predefinedPackageDimensions;
  }

  public void setPredefinedPackageDimensions(PredefinedPackageDimensions predefinedPackageDimensions) {
    this.predefinedPackageDimensions = predefinedPackageDimensions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageDimensions packageDimensions = (PackageDimensions) o;
    return Objects.equals(this.length, packageDimensions.length) &&
        Objects.equals(this.width, packageDimensions.width) &&
        Objects.equals(this.height, packageDimensions.height) &&
        Objects.equals(this.unit, packageDimensions.unit) &&
        Objects.equals(this.predefinedPackageDimensions, packageDimensions.predefinedPackageDimensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(length, width, height, unit, predefinedPackageDimensions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageDimensions {\n");

    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    predefinedPackageDimensions: ").append(toIndentedString(predefinedPackageDimensions)).append("\n");
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

