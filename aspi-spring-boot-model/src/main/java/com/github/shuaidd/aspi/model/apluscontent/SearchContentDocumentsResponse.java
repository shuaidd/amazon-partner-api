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
 * SearchContentDocumentsResponse
 */
public class SearchContentDocumentsResponse {
  @SerializedName("warnings")
  private MessageSet warnings = null;

  @SerializedName("nextPageToken")
  private String nextPageToken = null;

  @SerializedName("contentMetadataRecords")
  private ContentMetadataRecordList contentMetadataRecords = null;

  public SearchContentDocumentsResponse warnings(MessageSet warnings) {
    this.warnings = warnings;
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/

  public MessageSet getWarnings() {
    return warnings;
  }

  public void setWarnings(MessageSet warnings) {
    this.warnings = warnings;
  }

  public SearchContentDocumentsResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

   /**
   * Get nextPageToken
   * @return nextPageToken
  **/

  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  public SearchContentDocumentsResponse contentMetadataRecords(ContentMetadataRecordList contentMetadataRecords) {
    this.contentMetadataRecords = contentMetadataRecords;
    return this;
  }

   /**
   * The content metadata records.
   * @return contentMetadataRecords
  **/

  public ContentMetadataRecordList getContentMetadataRecords() {
    return contentMetadataRecords;
  }

  public void setContentMetadataRecords(ContentMetadataRecordList contentMetadataRecords) {
    this.contentMetadataRecords = contentMetadataRecords;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchContentDocumentsResponse searchContentDocumentsResponse = (SearchContentDocumentsResponse) o;
    return Objects.equals(this.warnings, searchContentDocumentsResponse.warnings) &&
        Objects.equals(this.nextPageToken, searchContentDocumentsResponse.nextPageToken) &&
        Objects.equals(this.contentMetadataRecords, searchContentDocumentsResponse.contentMetadataRecords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warnings, nextPageToken, contentMetadataRecords);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchContentDocumentsResponse {\n");

    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    contentMetadataRecords: ").append(toIndentedString(contentMetadataRecords)).append("\n");
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
