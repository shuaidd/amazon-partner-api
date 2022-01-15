/*
 * Selling Partner API for Retail Procurement Orders
 * The Selling Partner API for Retail Procurement Orders provides programmatic access to vendor orders data.
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.shuaidd.aspi.model.vendor.order;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Objects;

/**
 * Import details for an import order.
 */

public class ImportDetails {
  /**
   * If the recipient requests, contains the shipment method of payment. This is for import PO&#39;s only.
   */
  @JsonAdapter(MethodOfPaymentEnum.Adapter.class)
  public enum MethodOfPaymentEnum {
    PAIDBYBUYER("PaidByBuyer"),

    COLLECTONDELIVERY("CollectOnDelivery"),

    DEFINEDBYBUYERANDSELLER("DefinedByBuyerAndSeller"),

    FOBPORTOFCALL("FOBPortOfCall"),

    PREPAIDBYSELLER("PrepaidBySeller"),

    PAIDBYSELLER("PaidBySeller");

    private String value;

    MethodOfPaymentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MethodOfPaymentEnum fromValue(String text) {
      for (MethodOfPaymentEnum b : MethodOfPaymentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MethodOfPaymentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MethodOfPaymentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MethodOfPaymentEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MethodOfPaymentEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("methodOfPayment")
  private MethodOfPaymentEnum methodOfPayment = null;

  /**
   * Incoterms (International Commercial Terms) are used to divide transaction costs and responsibilities between buyer and seller and reflect state-of-the-art transportation practices. This is for import purchase orders only.
   */
  @JsonAdapter(InternationalCommercialTermsEnum.Adapter.class)
  public enum InternationalCommercialTermsEnum {
    EXWORKS("ExWorks"),

    FREECARRIER("FreeCarrier"),

    FREEONBOARD("FreeOnBoard"),

    FREEALONGSIDESHIP("FreeAlongSideShip"),

    CARRIAGEPAIDTO("CarriagePaidTo"),

    COSTANDFREIGHT("CostAndFreight"),

    CARRIAGEANDINSURANCEPAIDTO("CarriageAndInsurancePaidTo"),

    COSTINSURANCEANDFREIGHT("CostInsuranceAndFreight"),

    DELIVEREDATTERMINAL("DeliveredAtTerminal"),

    DELIVEREDATPLACE("DeliveredAtPlace"),

    DELIVERDUTYPAID("DeliverDutyPaid");

    private String value;

    InternationalCommercialTermsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InternationalCommercialTermsEnum fromValue(String text) {
      for (InternationalCommercialTermsEnum b : InternationalCommercialTermsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<InternationalCommercialTermsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InternationalCommercialTermsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InternationalCommercialTermsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return InternationalCommercialTermsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("internationalCommercialTerms")
  private InternationalCommercialTermsEnum internationalCommercialTerms = null;

  @SerializedName("portOfDelivery")
  private String portOfDelivery = null;

  @SerializedName("importContainers")
  private String importContainers = null;

  @SerializedName("shippingInstructions")
  private String shippingInstructions = null;

  public ImportDetails methodOfPayment(MethodOfPaymentEnum methodOfPayment) {
    this.methodOfPayment = methodOfPayment;
    return this;
  }

   /**
   * If the recipient requests, contains the shipment method of payment. This is for import PO&#39;s only.
   * @return methodOfPayment
  **/

  public MethodOfPaymentEnum getMethodOfPayment() {
    return methodOfPayment;
  }

  public void setMethodOfPayment(MethodOfPaymentEnum methodOfPayment) {
    this.methodOfPayment = methodOfPayment;
  }

  public ImportDetails internationalCommercialTerms(InternationalCommercialTermsEnum internationalCommercialTerms) {
    this.internationalCommercialTerms = internationalCommercialTerms;
    return this;
  }

   /**
   * Incoterms (International Commercial Terms) are used to divide transaction costs and responsibilities between buyer and seller and reflect state-of-the-art transportation practices. This is for import purchase orders only.
   * @return internationalCommercialTerms
  **/

  public InternationalCommercialTermsEnum getInternationalCommercialTerms() {
    return internationalCommercialTerms;
  }

  public void setInternationalCommercialTerms(InternationalCommercialTermsEnum internationalCommercialTerms) {
    this.internationalCommercialTerms = internationalCommercialTerms;
  }

  public ImportDetails portOfDelivery(String portOfDelivery) {
    this.portOfDelivery = portOfDelivery;
    return this;
  }

   /**
   * The port where goods on an import purchase order must be delivered by the vendor. This should only be specified when the internationalCommercialTerms is FOB.
   * @return portOfDelivery
  **/

  public String getPortOfDelivery() {
    return portOfDelivery;
  }

  public void setPortOfDelivery(String portOfDelivery) {
    this.portOfDelivery = portOfDelivery;
  }

  public ImportDetails importContainers(String importContainers) {
    this.importContainers = importContainers;
    return this;
  }

   /**
   * Types and numbers of container(s) for import purchase orders. Can be a comma-separated list if the shipment has multiple containers. HC signifies a high-capacity container. Free-text field, limited to 64 characters. The format will be a comma-delimited list containing values of the type: $NUMBER_OF_CONTAINERS_OF_THIS_TYPE-$CONTAINER_TYPE. The list of values for the container type is: 40&#39;(40-foot container), 40&#39;HC (40-foot high-capacity container), 45&#39;, 45&#39;HC, 30&#39;, 30&#39;HC, 20&#39;, 20&#39;HC.
   * @return importContainers
  **/

  public String getImportContainers() {
    return importContainers;
  }

  public void setImportContainers(String importContainers) {
    this.importContainers = importContainers;
  }

  public ImportDetails shippingInstructions(String shippingInstructions) {
    this.shippingInstructions = shippingInstructions;
    return this;
  }

   /**
   * Special instructions regarding the shipment. This field is for import purchase orders.
   * @return shippingInstructions
  **/

  public String getShippingInstructions() {
    return shippingInstructions;
  }

  public void setShippingInstructions(String shippingInstructions) {
    this.shippingInstructions = shippingInstructions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportDetails importDetails = (ImportDetails) o;
    return Objects.equals(this.methodOfPayment, importDetails.methodOfPayment) &&
        Objects.equals(this.internationalCommercialTerms, importDetails.internationalCommercialTerms) &&
        Objects.equals(this.portOfDelivery, importDetails.portOfDelivery) &&
        Objects.equals(this.importContainers, importDetails.importContainers) &&
        Objects.equals(this.shippingInstructions, importDetails.shippingInstructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(methodOfPayment, internationalCommercialTerms, portOfDelivery, importContainers, shippingInstructions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportDetails {\n");

    sb.append("    methodOfPayment: ").append(toIndentedString(methodOfPayment)).append("\n");
    sb.append("    internationalCommercialTerms: ").append(toIndentedString(internationalCommercialTerms)).append("\n");
    sb.append("    portOfDelivery: ").append(toIndentedString(portOfDelivery)).append("\n");
    sb.append("    importContainers: ").append(toIndentedString(importContainers)).append("\n");
    sb.append("    shippingInstructions: ").append(toIndentedString(shippingInstructions)).append("\n");
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

