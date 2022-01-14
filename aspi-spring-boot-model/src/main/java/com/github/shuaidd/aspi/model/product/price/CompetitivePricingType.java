/*
 * Selling Partner API for Pricing
 * The Selling Partner API for Pricing helps you programmatically retrieve product pricing and offer information for Amazon Marketplace products.
 *
 * OpenAPI spec version: v0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.shuaidd.aspi.model.product.price;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Competitive pricing information for the item.
 */

public class CompetitivePricingType {
  @SerializedName("CompetitivePrices")
  private CompetitivePriceList competitivePrices = null;

  @SerializedName("NumberOfOfferListings")
  private NumberOfOfferListingsList numberOfOfferListings = null;

  @SerializedName("TradeInValue")
  private MoneyType tradeInValue = null;

  public CompetitivePricingType competitivePrices(CompetitivePriceList competitivePrices) {
    this.competitivePrices = competitivePrices;
    return this;
  }

   /**
   * Get competitivePrices
   * @return competitivePrices
  **/

  public CompetitivePriceList getCompetitivePrices() {
    return competitivePrices;
  }

  public void setCompetitivePrices(CompetitivePriceList competitivePrices) {
    this.competitivePrices = competitivePrices;
  }

  public CompetitivePricingType numberOfOfferListings(NumberOfOfferListingsList numberOfOfferListings) {
    this.numberOfOfferListings = numberOfOfferListings;
    return this;
  }

   /**
   * Get numberOfOfferListings
   * @return numberOfOfferListings
  **/

  public NumberOfOfferListingsList getNumberOfOfferListings() {
    return numberOfOfferListings;
  }

  public void setNumberOfOfferListings(NumberOfOfferListingsList numberOfOfferListings) {
    this.numberOfOfferListings = numberOfOfferListings;
  }

  public CompetitivePricingType tradeInValue(MoneyType tradeInValue) {
    this.tradeInValue = tradeInValue;
    return this;
  }

   /**
   * The trade-in value of the item in the trade-in program.
   * @return tradeInValue
  **/

  public MoneyType getTradeInValue() {
    return tradeInValue;
  }

  public void setTradeInValue(MoneyType tradeInValue) {
    this.tradeInValue = tradeInValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompetitivePricingType competitivePricingType = (CompetitivePricingType) o;
    return Objects.equals(this.competitivePrices, competitivePricingType.competitivePrices) &&
        Objects.equals(this.numberOfOfferListings, competitivePricingType.numberOfOfferListings) &&
        Objects.equals(this.tradeInValue, competitivePricingType.tradeInValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(competitivePrices, numberOfOfferListings, tradeInValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompetitivePricingType {\n");

    sb.append("    competitivePrices: ").append(toIndentedString(competitivePrices)).append("\n");
    sb.append("    numberOfOfferListings: ").append(toIndentedString(numberOfOfferListings)).append("\n");
    sb.append("    tradeInValue: ").append(toIndentedString(tradeInValue)).append("\n");
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
