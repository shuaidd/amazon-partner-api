/*
 * Selling Partner API for Notifications
 * The Selling Partner API for Notifications lets you subscribe to notifications that are relevant to a selling partner's business. Using this API you can create a destination to receive notifications, subscribe to notifications, delete notification subscriptions, and more.  For more information, see the [Notifications Use Case Guide](https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/use-case-guides/notifications-api-use-case-guide/notifications-use-case-guide-v1.md)
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.shuaidd.aspi.model.notification;

import com.google.gson.annotations.SerializedName;


import java.util.Objects;

/**
 * The request schema for the createSubscription operation.
 */


public class CreateSubscriptionRequest {
  @SerializedName("payloadVersion")
  private String payloadVersion = null;

  @SerializedName("destinationId")
  private String destinationId = null;

  public CreateSubscriptionRequest payloadVersion(String payloadVersion) {
    this.payloadVersion = payloadVersion;
    return this;
  }

   /**
   * The version of the payload object to be used in the notification.
   * @return payloadVersion
  **/

  public String getPayloadVersion() {
    return payloadVersion;
  }

  public void setPayloadVersion(String payloadVersion) {
    this.payloadVersion = payloadVersion;
  }

  public CreateSubscriptionRequest destinationId(String destinationId) {
    this.destinationId = destinationId;
    return this;
  }

   /**
   * The identifier for the destination where notifications will be delivered.
   * @return destinationId
  **/

  public String getDestinationId() {
    return destinationId;
  }

  public void setDestinationId(String destinationId) {
    this.destinationId = destinationId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSubscriptionRequest createSubscriptionRequest = (CreateSubscriptionRequest) o;
    return Objects.equals(this.payloadVersion, createSubscriptionRequest.payloadVersion) &&
        Objects.equals(this.destinationId, createSubscriptionRequest.destinationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payloadVersion, destinationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSubscriptionRequest {\n");

    sb.append("    payloadVersion: ").append(toIndentedString(payloadVersion)).append("\n");
    sb.append("    destinationId: ").append(toIndentedString(destinationId)).append("\n");
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

