/*
 * Selling Partner API for Retail Procurement Payments
 * The Selling Partner API for Retail Procurement Payments provides programmatic access to vendors payments data.
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.shuaidd.aspi.model.vendor.invoice;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Monetary and tax details of the allowance.
 */

public class AllowanceDetails {
  /**
   * Type of the allowance applied.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    DISCOUNT("Discount"),

    DISCOUNTINCENTIVE("DiscountIncentive"),

    DEFECTIVE("Defective"),

    PROMOTIONAL("Promotional"),

    UNSALEABLEMERCHANDISE("UnsaleableMerchandise"),

    SPECIAL("Special");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("allowanceAmount")
  private Money allowanceAmount = null;

  @SerializedName("taxDetails")
  private List<TaxDetails> taxDetails = null;

  public AllowanceDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the allowance applied.
   * @return type
  **/

  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public AllowanceDetails description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the allowance.
   * @return description
  **/

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AllowanceDetails allowanceAmount(Money allowanceAmount) {
    this.allowanceAmount = allowanceAmount;
    return this;
  }

   /**
   * Total monetary amount related to this allowance.
   * @return allowanceAmount
  **/

  public Money getAllowanceAmount() {
    return allowanceAmount;
  }

  public void setAllowanceAmount(Money allowanceAmount) {
    this.allowanceAmount = allowanceAmount;
  }

  public AllowanceDetails taxDetails(List<TaxDetails> taxDetails) {
    this.taxDetails = taxDetails;
    return this;
  }

  public AllowanceDetails addTaxDetailsItem(TaxDetails taxDetailsItem) {
    if (this.taxDetails == null) {
      this.taxDetails = new ArrayList<TaxDetails>();
    }
    this.taxDetails.add(taxDetailsItem);
    return this;
  }

   /**
   * Tax amount details applied on this allowance.
   * @return taxDetails
  **/

  public List<TaxDetails> getTaxDetails() {
    return taxDetails;
  }

  public void setTaxDetails(List<TaxDetails> taxDetails) {
    this.taxDetails = taxDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllowanceDetails allowanceDetails = (AllowanceDetails) o;
    return Objects.equals(this.type, allowanceDetails.type) &&
        Objects.equals(this.description, allowanceDetails.description) &&
        Objects.equals(this.allowanceAmount, allowanceDetails.allowanceAmount) &&
        Objects.equals(this.taxDetails, allowanceDetails.taxDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, description, allowanceAmount, taxDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllowanceDetails {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    allowanceAmount: ").append(toIndentedString(allowanceAmount)).append("\n");
    sb.append("    taxDetails: ").append(toIndentedString(taxDetails)).append("\n");
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

