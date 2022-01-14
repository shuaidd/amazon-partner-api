/*
 * Selling Partner API for Feeds
 * The Selling Partner API for Feeds lets you upload data to Amazon on behalf of a selling partner.
 *
 * OpenAPI spec version: 2020-09-04
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.shuaidd.aspi.model.feed;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * CreateFeedResult
 */
public class CreateFeedResult {
  @SerializedName("feedId")
  private String feedId = null;

  public CreateFeedResult feedId(String feedId) {
    this.feedId = feedId;
    return this;
  }

   /**
   * The identifier for the feed. This identifier is unique only in combination with a seller ID.
   * @return feedId
  **/

  public String getFeedId() {
    return feedId;
  }

  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFeedResult createFeedResult = (CreateFeedResult) o;
    return Objects.equals(this.feedId, createFeedResult.feedId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFeedResult {\n");

    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
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

