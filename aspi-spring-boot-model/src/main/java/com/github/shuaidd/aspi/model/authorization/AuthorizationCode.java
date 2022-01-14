/*
 * Selling Partner API for Authorization
 * The Selling Partner API for Authorization helps developers manage authorizations and check the specific permissions associated with a given authorization.
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.shuaidd.aspi.model.authorization;

import com.google.gson.annotations.SerializedName;


import java.util.Objects;

/**
 * A Login with Amazon (LWA) authorization code.
 */
public class AuthorizationCode {
  @SerializedName("authorizationCode")
  private String authorizationCode = null;

  public AuthorizationCode authorizationCode(String authorizationCode) {
    this.authorizationCode = authorizationCode;
    return this;
  }

   /**
   * A Login with Amazon (LWA) authorization code that can be exchanged for a refresh token and access token that authorize you to make calls to a Selling Partner API.
   * @return authorizationCode
  **/
  public String getAuthorizationCode() {
    return authorizationCode;
  }

  public void setAuthorizationCode(String authorizationCode) {
    this.authorizationCode = authorizationCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizationCode authorizationCode = (AuthorizationCode) o;
    return Objects.equals(this.authorizationCode, authorizationCode.authorizationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationCode {\n");

    sb.append("    authorizationCode: ").append(toIndentedString(authorizationCode)).append("\n");
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

