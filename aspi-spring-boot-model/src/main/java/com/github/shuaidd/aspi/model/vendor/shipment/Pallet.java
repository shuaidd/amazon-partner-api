/*
 * Selling Partner API for Retail Procurement Shipments
 * The Selling Partner API for Retail Procurement Shipments provides programmatic access to retail shipping data for vendors.
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.shuaidd.aspi.model.vendor.shipment;

import com.google.gson.annotations.SerializedName;



import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Details of the Pallet/Tare being shipped.
 */

public class Pallet {
  @SerializedName("palletIdentifiers")
  private List<ContainerIdentification> palletIdentifiers = new ArrayList<ContainerIdentification>();

  @SerializedName("tier")
  private Integer tier = null;

  @SerializedName("block")
  private Integer block = null;

  @SerializedName("dimensions")
  private Dimensions dimensions = null;

  @SerializedName("weight")
  private Weight weight = null;

  @SerializedName("cartonReferenceDetails")
  private CartonReferenceDetails cartonReferenceDetails = null;

  @SerializedName("items")
  private List<ContainerItem> items = null;

  public Pallet palletIdentifiers(List<ContainerIdentification> palletIdentifiers) {
    this.palletIdentifiers = palletIdentifiers;
    return this;
  }

  public Pallet addPalletIdentifiersItem(ContainerIdentification palletIdentifiersItem) {
    this.palletIdentifiers.add(palletIdentifiersItem);
    return this;
  }

   /**
   * A list of pallet identifiers.
   * @return palletIdentifiers
  **/

  public List<ContainerIdentification> getPalletIdentifiers() {
    return palletIdentifiers;
  }

  public void setPalletIdentifiers(List<ContainerIdentification> palletIdentifiers) {
    this.palletIdentifiers = palletIdentifiers;
  }

  public Pallet tier(Integer tier) {
    this.tier = tier;
    return this;
  }

   /**
   * Number of layers per pallet.
   * @return tier
  **/

  public Integer getTier() {
    return tier;
  }

  public void setTier(Integer tier) {
    this.tier = tier;
  }

  public Pallet block(Integer block) {
    this.block = block;
    return this;
  }

   /**
   * Number of cartons per layer on the pallet.
   * @return block
  **/

  public Integer getBlock() {
    return block;
  }

  public void setBlock(Integer block) {
    this.block = block;
  }

  public Pallet dimensions(Dimensions dimensions) {
    this.dimensions = dimensions;
    return this;
  }

   /**
   * Get dimensions
   * @return dimensions
  **/

  public Dimensions getDimensions() {
    return dimensions;
  }

  public void setDimensions(Dimensions dimensions) {
    this.dimensions = dimensions;
  }

  public Pallet weight(Weight weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/

  public Weight getWeight() {
    return weight;
  }

  public void setWeight(Weight weight) {
    this.weight = weight;
  }

  public Pallet cartonReferenceDetails(CartonReferenceDetails cartonReferenceDetails) {
    this.cartonReferenceDetails = cartonReferenceDetails;
    return this;
  }

   /**
   * Carton reference details.
   * @return cartonReferenceDetails
  **/

  public CartonReferenceDetails getCartonReferenceDetails() {
    return cartonReferenceDetails;
  }

  public void setCartonReferenceDetails(CartonReferenceDetails cartonReferenceDetails) {
    this.cartonReferenceDetails = cartonReferenceDetails;
  }

  public Pallet items(List<ContainerItem> items) {
    this.items = items;
    return this;
  }

  public Pallet addItemsItem(ContainerItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ContainerItem>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * A list of container item details.
   * @return items
  **/

  public List<ContainerItem> getItems() {
    return items;
  }

  public void setItems(List<ContainerItem> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pallet pallet = (Pallet) o;
    return Objects.equals(this.palletIdentifiers, pallet.palletIdentifiers) &&
        Objects.equals(this.tier, pallet.tier) &&
        Objects.equals(this.block, pallet.block) &&
        Objects.equals(this.dimensions, pallet.dimensions) &&
        Objects.equals(this.weight, pallet.weight) &&
        Objects.equals(this.cartonReferenceDetails, pallet.cartonReferenceDetails) &&
        Objects.equals(this.items, pallet.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(palletIdentifiers, tier, block, dimensions, weight, cartonReferenceDetails, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pallet {\n");

    sb.append("    palletIdentifiers: ").append(toIndentedString(palletIdentifiers)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    block: ").append(toIndentedString(block)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    cartonReferenceDetails: ").append(toIndentedString(cartonReferenceDetails)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

