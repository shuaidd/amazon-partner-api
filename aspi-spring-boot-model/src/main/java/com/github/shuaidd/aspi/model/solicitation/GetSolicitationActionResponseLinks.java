/*
 * Selling Partner API for Solicitations
 * With the Solicitations API you can build applications that send non-critical solicitations to buyers. You can get a list of solicitation types that are available for an order that you specify, then call an operation that sends a solicitation to the buyer for that order. Buyers cannot respond to solicitations sent by this API, and these solicitations do not appear in the Messaging section of Seller Central or in the recipient's Message Center. The Solicitations API returns responses that are formed according to the <a href=https://tools.ietf.org/html/draft-kelly-json-hal-08>JSON Hypertext Application Language</a> (HAL) standard.
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.shuaidd.aspi.model.solicitation;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * GetSolicitationActionResponseLinks
 */
public class GetSolicitationActionResponseLinks {
  @SerializedName("self")
  private LinkObject self = null;

  @SerializedName("schema")
  private LinkObject schema = null;

  public GetSolicitationActionResponseLinks self(LinkObject self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/

  public LinkObject getSelf() {
    return self;
  }

  public void setSelf(LinkObject self) {
    this.self = self;
  }

  public GetSolicitationActionResponseLinks schema(LinkObject schema) {
    this.schema = schema;
    return this;
  }

   /**
   * Get schema
   * @return schema
  **/

  public LinkObject getSchema() {
    return schema;
  }

  public void setSchema(LinkObject schema) {
    this.schema = schema;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSolicitationActionResponseLinks getSolicitationActionResponseLinks = (GetSolicitationActionResponseLinks) o;
    return Objects.equals(this.self, getSolicitationActionResponseLinks.self) &&
        Objects.equals(this.schema, getSolicitationActionResponseLinks.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, schema);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSolicitationActionResponseLinks {\n");

    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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

