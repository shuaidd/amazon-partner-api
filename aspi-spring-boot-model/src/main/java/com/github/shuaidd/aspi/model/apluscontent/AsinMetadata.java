/*
 * Selling Partner API for A+ Content Management
 * With the A+ Content API, you can build applications that help selling partners add rich marketing content to their Amazon product detail pages. A+ content helps selling partners share their brand and product story, which helps buyers make informed purchasing decisions. Selling partners assemble content by choosing from content modules and adding images and text.
 *
 * OpenAPI spec version: 2020-11-01
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.shuaidd.aspi.model.apluscontent;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * The A+ Content ASIN with additional metadata for content management. If you don&#39;t include the &#x60;includedDataSet&#x60; parameter in a call to the listContentDocumentAsinRelations operation, the related ASINs are returned without metadata.
 */

public class AsinMetadata {
  @SerializedName("asin")
  private String asin = null;

  @SerializedName("badgeSet")
  private AsinBadgeSet badgeSet = null;

  @SerializedName("parent")
  private String parent = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("imageUrl")
  private String imageUrl = null;

  @SerializedName("contentReferenceKeySet")
  private ContentReferenceKeySet contentReferenceKeySet = null;

  public AsinMetadata asin(String asin) {
    this.asin = asin;
    return this;
  }

   /**
   * Get asin
   * @return asin
  **/

  public String getAsin() {
    return asin;
  }

  public void setAsin(String asin) {
    this.asin = asin;
  }

  public AsinMetadata badgeSet(AsinBadgeSet badgeSet) {
    this.badgeSet = badgeSet;
    return this;
  }

   /**
   * Get badgeSet
   * @return badgeSet
  **/

  public AsinBadgeSet getBadgeSet() {
    return badgeSet;
  }

  public void setBadgeSet(AsinBadgeSet badgeSet) {
    this.badgeSet = badgeSet;
  }

  public AsinMetadata parent(String parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/

  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }

  public AsinMetadata title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title for the ASIN in the Amazon catalog.
   * @return title
  **/

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AsinMetadata imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * The default image for the ASIN in the Amazon catalog.
   * @return imageUrl
  **/

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public AsinMetadata contentReferenceKeySet(ContentReferenceKeySet contentReferenceKeySet) {
    this.contentReferenceKeySet = contentReferenceKeySet;
    return this;
  }

   /**
   * Get contentReferenceKeySet
   * @return contentReferenceKeySet
  **/

  public ContentReferenceKeySet getContentReferenceKeySet() {
    return contentReferenceKeySet;
  }

  public void setContentReferenceKeySet(ContentReferenceKeySet contentReferenceKeySet) {
    this.contentReferenceKeySet = contentReferenceKeySet;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsinMetadata asinMetadata = (AsinMetadata) o;
    return Objects.equals(this.asin, asinMetadata.asin) &&
        Objects.equals(this.badgeSet, asinMetadata.badgeSet) &&
        Objects.equals(this.parent, asinMetadata.parent) &&
        Objects.equals(this.title, asinMetadata.title) &&
        Objects.equals(this.imageUrl, asinMetadata.imageUrl) &&
        Objects.equals(this.contentReferenceKeySet, asinMetadata.contentReferenceKeySet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asin, badgeSet, parent, title, imageUrl, contentReferenceKeySet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsinMetadata {\n");

    sb.append("    asin: ").append(toIndentedString(asin)).append("\n");
    sb.append("    badgeSet: ").append(toIndentedString(badgeSet)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    contentReferenceKeySet: ").append(toIndentedString(contentReferenceKeySet)).append("\n");
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

