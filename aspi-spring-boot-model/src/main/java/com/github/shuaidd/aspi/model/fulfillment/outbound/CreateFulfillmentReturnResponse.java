/*
 * Selling Partner APIs for Fulfillment Outbound
 * The Selling Partner API for Fulfillment Outbound lets you create applications that help a seller fulfill Multi-Channel Fulfillment orders using their inventory in Amazon's fulfillment network. You can get information on both potential and existing fulfillment orders.
 *
 * OpenAPI spec version: 2020-07-01
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.shuaidd.aspi.model.fulfillment.outbound;

import com.google.gson.annotations.SerializedName;
import com.github.shuaidd.aspi.model.common.ErrorList;

import java.util.Objects;

/**
 * The response schema for the createFulfillmentReturn operation.
 */

public class CreateFulfillmentReturnResponse {
    @SerializedName("payload")
    private CreateFulfillmentReturnResult payload = null;

    @SerializedName("errors")
    private ErrorList errors = null;

    public CreateFulfillmentReturnResponse payload(CreateFulfillmentReturnResult payload) {
        this.payload = payload;
        return this;
    }

    /**
     * The payload for the createFulfillmentReturn operation.
     *
     * @return payload
     **/

    public CreateFulfillmentReturnResult getPayload() {
        return payload;
    }

    public void setPayload(CreateFulfillmentReturnResult payload) {
        this.payload = payload;
    }

    public CreateFulfillmentReturnResponse errors(ErrorList errors) {
        this.errors = errors;
        return this;
    }

    /**
     * One or more unexpected errors occurred during the createFulfillmentReturn operation.
     *
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
        CreateFulfillmentReturnResponse createFulfillmentReturnResponse = (CreateFulfillmentReturnResponse) o;
        return Objects.equals(this.payload, createFulfillmentReturnResponse.payload) &&
                Objects.equals(this.errors, createFulfillmentReturnResponse.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payload, errors);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFulfillmentReturnResponse {\n");

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

