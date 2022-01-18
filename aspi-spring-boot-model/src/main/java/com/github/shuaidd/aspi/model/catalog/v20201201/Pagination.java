/*
 * Selling Partner API for Catalog Items
 * The Selling Partner API for Catalog Items provides programmatic access to information about items in the Amazon catalog.  For more information, see the [Catalog Items API Use Case Guide](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/use-case-guides/catalog-items-api-use-case-guide/catalog-items-api-use-case-guide_2020-12-01.md).
 *
 * OpenAPI spec version: 2020-12-01
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.shuaidd.aspi.model.catalog.v20201201;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * When a request produces a response that exceeds the pageSize, pagination occurs. This means the response is divided into individual pages. To retrieve the next page or the previous page, you must pass the nextToken value or the previousToken value as the pageToken parameter in the next request. When you receive the last page, there will be no nextToken key in the pagination object.
 */

public class Pagination {
  @SerializedName("nextToken")
  private String nextToken = null;

  @SerializedName("previousToken")
  private String previousToken = null;

  public Pagination nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * A token that can be used to fetch the next page.
   * @return nextToken
  **/

  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  public Pagination previousToken(String previousToken) {
    this.previousToken = previousToken;
    return this;
  }

   /**
   * A token that can be used to fetch the previous page.
   * @return previousToken
  **/

  public String getPreviousToken() {
    return previousToken;
  }

  public void setPreviousToken(String previousToken) {
    this.previousToken = previousToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pagination pagination = (Pagination) o;
    return Objects.equals(this.nextToken, pagination.nextToken) &&
        Objects.equals(this.previousToken, pagination.previousToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextToken, previousToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pagination {\n");

    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    previousToken: ").append(toIndentedString(previousToken)).append("\n");
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

