/*
 * Selling Partner API for Catalog Items
 * The Selling Partner API for Catalog Items helps you programmatically retrieve item details for items in the catalog.
 *
 * OpenAPI spec version: v0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.shuaidd.aspi.model.catalog;

import com.github.shuaidd.aspi.model.common.ErrorList;
import com.google.gson.annotations.SerializedName;



import java.util.Objects;

/**
 * ListCatalogCategoriesResponse
 */

public class ListCatalogCategoriesResponse {
  @SerializedName("payload")
  private ListOfCategories payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public ListCatalogCategoriesResponse payload(ListOfCategories payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The payload for the listCatalogCategories operation.
   * @return payload
  **/

  public ListOfCategories getPayload() {
    return payload;
  }

  public void setPayload(ListOfCategories payload) {
    this.payload = payload;
  }

  public ListCatalogCategoriesResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * One or more unexpected errors occurred during the listCatalogCategories operation.
   * @return errors
  **/

  public ErrorList getErrors() {
    return errors;
  }

  public void setErrors(ErrorList errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListCatalogCategoriesResponse listCatalogCategoriesResponse = (ListCatalogCategoriesResponse) o;
    return Objects.equals(this.payload, listCatalogCategoriesResponse.payload) &&
        Objects.equals(this.errors, listCatalogCategoriesResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCatalogCategoriesResponse {\n");

    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

