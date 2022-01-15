/*
 * Selling Partner API for Direct Fulfillment Payments
 * The Selling Partner API for Direct Fulfillment Payments provides programmatic access to a direct fulfillment vendor's invoice data.
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.shuaidd.aspi.model.vendor.fulfillment.payment;

import com.google.gson.annotations.SerializedName;





import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * InvoiceItem
 */
public class InvoiceItem {
  @SerializedName("itemSequenceNumber")
  private String itemSequenceNumber = null;

  @SerializedName("buyerProductIdentifier")
  private String buyerProductIdentifier = null;

  @SerializedName("vendorProductIdentifier")
  private String vendorProductIdentifier = null;

  @SerializedName("invoicedQuantity")
  private ItemQuantity invoicedQuantity = null;

  @SerializedName("netCost")
  private Money netCost = null;

  @SerializedName("purchaseOrderNumber")
  private String purchaseOrderNumber = null;

  @SerializedName("vendorOrderNumber")
  private String vendorOrderNumber = null;

  @SerializedName("hsnCode")
  private String hsnCode = null;

  @SerializedName("taxDetails")
  private List<TaxDetail> taxDetails = null;

  @SerializedName("chargeDetails")
  private List<ChargeDetails> chargeDetails = null;

  public InvoiceItem itemSequenceNumber(String itemSequenceNumber) {
    this.itemSequenceNumber = itemSequenceNumber;
    return this;
  }

   /**
   * Numbering of the item on the purchase order. The first item will be 1, the second 2, and so on.
   * @return itemSequenceNumber
  **/

  public String getItemSequenceNumber() {
    return itemSequenceNumber;
  }

  public void setItemSequenceNumber(String itemSequenceNumber) {
    this.itemSequenceNumber = itemSequenceNumber;
  }

  public InvoiceItem buyerProductIdentifier(String buyerProductIdentifier) {
    this.buyerProductIdentifier = buyerProductIdentifier;
    return this;
  }

   /**
   * Buyer&#39;s standard identification number (ASIN) of an item.
   * @return buyerProductIdentifier
  **/

  public String getBuyerProductIdentifier() {
    return buyerProductIdentifier;
  }

  public void setBuyerProductIdentifier(String buyerProductIdentifier) {
    this.buyerProductIdentifier = buyerProductIdentifier;
  }

  public InvoiceItem vendorProductIdentifier(String vendorProductIdentifier) {
    this.vendorProductIdentifier = vendorProductIdentifier;
    return this;
  }

   /**
   * The vendor selected product identification of the item.
   * @return vendorProductIdentifier
  **/

  public String getVendorProductIdentifier() {
    return vendorProductIdentifier;
  }

  public void setVendorProductIdentifier(String vendorProductIdentifier) {
    this.vendorProductIdentifier = vendorProductIdentifier;
  }

  public InvoiceItem invoicedQuantity(ItemQuantity invoicedQuantity) {
    this.invoicedQuantity = invoicedQuantity;
    return this;
  }

   /**
   * Item quantity invoiced.
   * @return invoicedQuantity
  **/

  public ItemQuantity getInvoicedQuantity() {
    return invoicedQuantity;
  }

  public void setInvoicedQuantity(ItemQuantity invoicedQuantity) {
    this.invoicedQuantity = invoicedQuantity;
  }

  public InvoiceItem netCost(Money netCost) {
    this.netCost = netCost;
    return this;
  }

   /**
   * Net price (before tax) to vendor with currency details.
   * @return netCost
  **/

  public Money getNetCost() {
    return netCost;
  }

  public void setNetCost(Money netCost) {
    this.netCost = netCost;
  }

  public InvoiceItem purchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
    return this;
  }

   /**
   * The purchase order number for this order. Formatting Notes: 8-character alpha-numeric code.
   * @return purchaseOrderNumber
  **/

  public String getPurchaseOrderNumber() {
    return purchaseOrderNumber;
  }

  public void setPurchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
  }

  public InvoiceItem vendorOrderNumber(String vendorOrderNumber) {
    this.vendorOrderNumber = vendorOrderNumber;
    return this;
  }

   /**
   * The vendor&#39;s order number for this order.
   * @return vendorOrderNumber
  **/

  public String getVendorOrderNumber() {
    return vendorOrderNumber;
  }

  public void setVendorOrderNumber(String vendorOrderNumber) {
    this.vendorOrderNumber = vendorOrderNumber;
  }

  public InvoiceItem hsnCode(String hsnCode) {
    this.hsnCode = hsnCode;
    return this;
  }

   /**
   * HSN tax code. The HSN number cannot contain alphabets.
   * @return hsnCode
  **/

  public String getHsnCode() {
    return hsnCode;
  }

  public void setHsnCode(String hsnCode) {
    this.hsnCode = hsnCode;
  }

  public InvoiceItem taxDetails(List<TaxDetail> taxDetails) {
    this.taxDetails = taxDetails;
    return this;
  }

  public InvoiceItem addTaxDetailsItem(TaxDetail taxDetailsItem) {
    if (this.taxDetails == null) {
      this.taxDetails = new ArrayList<TaxDetail>();
    }
    this.taxDetails.add(taxDetailsItem);
    return this;
  }

   /**
   * Individual tax details per line item.
   * @return taxDetails
  **/

  public List<TaxDetail> getTaxDetails() {
    return taxDetails;
  }

  public void setTaxDetails(List<TaxDetail> taxDetails) {
    this.taxDetails = taxDetails;
  }

  public InvoiceItem chargeDetails(List<ChargeDetails> chargeDetails) {
    this.chargeDetails = chargeDetails;
    return this;
  }

  public InvoiceItem addChargeDetailsItem(ChargeDetails chargeDetailsItem) {
    if (this.chargeDetails == null) {
      this.chargeDetails = new ArrayList<ChargeDetails>();
    }
    this.chargeDetails.add(chargeDetailsItem);
    return this;
  }

   /**
   * Individual charge details per line item.
   * @return chargeDetails
  **/

  public List<ChargeDetails> getChargeDetails() {
    return chargeDetails;
  }

  public void setChargeDetails(List<ChargeDetails> chargeDetails) {
    this.chargeDetails = chargeDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceItem invoiceItem = (InvoiceItem) o;
    return Objects.equals(this.itemSequenceNumber, invoiceItem.itemSequenceNumber) &&
        Objects.equals(this.buyerProductIdentifier, invoiceItem.buyerProductIdentifier) &&
        Objects.equals(this.vendorProductIdentifier, invoiceItem.vendorProductIdentifier) &&
        Objects.equals(this.invoicedQuantity, invoiceItem.invoicedQuantity) &&
        Objects.equals(this.netCost, invoiceItem.netCost) &&
        Objects.equals(this.purchaseOrderNumber, invoiceItem.purchaseOrderNumber) &&
        Objects.equals(this.vendorOrderNumber, invoiceItem.vendorOrderNumber) &&
        Objects.equals(this.hsnCode, invoiceItem.hsnCode) &&
        Objects.equals(this.taxDetails, invoiceItem.taxDetails) &&
        Objects.equals(this.chargeDetails, invoiceItem.chargeDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemSequenceNumber, buyerProductIdentifier, vendorProductIdentifier, invoicedQuantity, netCost, purchaseOrderNumber, vendorOrderNumber, hsnCode, taxDetails, chargeDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceItem {\n");

    sb.append("    itemSequenceNumber: ").append(toIndentedString(itemSequenceNumber)).append("\n");
    sb.append("    buyerProductIdentifier: ").append(toIndentedString(buyerProductIdentifier)).append("\n");
    sb.append("    vendorProductIdentifier: ").append(toIndentedString(vendorProductIdentifier)).append("\n");
    sb.append("    invoicedQuantity: ").append(toIndentedString(invoicedQuantity)).append("\n");
    sb.append("    netCost: ").append(toIndentedString(netCost)).append("\n");
    sb.append("    purchaseOrderNumber: ").append(toIndentedString(purchaseOrderNumber)).append("\n");
    sb.append("    vendorOrderNumber: ").append(toIndentedString(vendorOrderNumber)).append("\n");
    sb.append("    hsnCode: ").append(toIndentedString(hsnCode)).append("\n");
    sb.append("    taxDetails: ").append(toIndentedString(taxDetails)).append("\n");
    sb.append("    chargeDetails: ").append(toIndentedString(chargeDetails)).append("\n");
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

