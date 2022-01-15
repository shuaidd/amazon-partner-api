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
import java.util.Objects;

/**
 * Specifies characteristics that apply to a seller input.
 */

public class SellerInputDefinition {
  @SerializedName("IsRequired")
  private Boolean isRequired = null;

  @SerializedName("DataType")
  private String dataType = null;

  @SerializedName("Constraints")
  private Constraints constraints = null;

  @SerializedName("InputDisplayText")
  private String inputDisplayText = null;

  @SerializedName("InputTarget")
  private InputTargetType inputTarget = null;

  @SerializedName("StoredValue")
  private AdditionalSellerInput storedValue = null;

  @SerializedName("RestrictedSetValues")
  private RestrictedSetValues restrictedSetValues = null;

  public SellerInputDefinition isRequired(Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
  }

   /**
   * When true, the additional input field is required.
   * @return isRequired
  **/

  public Boolean isIsRequired() {
    return isRequired;
  }

  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }

  public SellerInputDefinition dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * The data type of the additional input field.
   * @return dataType
  **/

  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  public SellerInputDefinition constraints(Constraints constraints) {
    this.constraints = constraints;
    return this;
  }

   /**
   * Get constraints
   * @return constraints
  **/

  public Constraints getConstraints() {
    return constraints;
  }

  public void setConstraints(Constraints constraints) {
    this.constraints = constraints;
  }

  public SellerInputDefinition inputDisplayText(String inputDisplayText) {
    this.inputDisplayText = inputDisplayText;
    return this;
  }

   /**
   * The display text for the additional input field.
   * @return inputDisplayText
  **/

  public String getInputDisplayText() {
    return inputDisplayText;
  }

  public void setInputDisplayText(String inputDisplayText) {
    this.inputDisplayText = inputDisplayText;
  }

  public SellerInputDefinition inputTarget(InputTargetType inputTarget) {
    this.inputTarget = inputTarget;
    return this;
  }

   /**
   * Whether the seller input applies to the item or the shipment.
   * @return inputTarget
  **/

  public InputTargetType getInputTarget() {
    return inputTarget;
  }

  public void setInputTarget(InputTargetType inputTarget) {
    this.inputTarget = inputTarget;
  }

  public SellerInputDefinition storedValue(AdditionalSellerInput storedValue) {
    this.storedValue = storedValue;
    return this;
  }

   /**
   * Get storedValue
   * @return storedValue
  **/

  public AdditionalSellerInput getStoredValue() {
    return storedValue;
  }

  public void setStoredValue(AdditionalSellerInput storedValue) {
    this.storedValue = storedValue;
  }

  public SellerInputDefinition restrictedSetValues(RestrictedSetValues restrictedSetValues) {
    this.restrictedSetValues = restrictedSetValues;
    return this;
  }

   /**
   * Get restrictedSetValues
   * @return restrictedSetValues
  **/

  public RestrictedSetValues getRestrictedSetValues() {
    return restrictedSetValues;
  }

  public void setRestrictedSetValues(RestrictedSetValues restrictedSetValues) {
    this.restrictedSetValues = restrictedSetValues;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SellerInputDefinition sellerInputDefinition = (SellerInputDefinition) o;
    return Objects.equals(this.isRequired, sellerInputDefinition.isRequired) &&
        Objects.equals(this.dataType, sellerInputDefinition.dataType) &&
        Objects.equals(this.constraints, sellerInputDefinition.constraints) &&
        Objects.equals(this.inputDisplayText, sellerInputDefinition.inputDisplayText) &&
        Objects.equals(this.inputTarget, sellerInputDefinition.inputTarget) &&
        Objects.equals(this.storedValue, sellerInputDefinition.storedValue) &&
        Objects.equals(this.restrictedSetValues, sellerInputDefinition.restrictedSetValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isRequired, dataType, constraints, inputDisplayText, inputTarget, storedValue, restrictedSetValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SellerInputDefinition {\n");

    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    inputDisplayText: ").append(toIndentedString(inputDisplayText)).append("\n");
    sb.append("    inputTarget: ").append(toIndentedString(inputTarget)).append("\n");
    sb.append("    storedValue: ").append(toIndentedString(storedValue)).append("\n");
    sb.append("    restrictedSetValues: ").append(toIndentedString(restrictedSetValues)).append("\n");
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

