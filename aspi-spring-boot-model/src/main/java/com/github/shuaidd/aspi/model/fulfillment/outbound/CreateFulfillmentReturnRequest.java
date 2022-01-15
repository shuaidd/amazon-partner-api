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


import java.util.Objects;

/**
 * The createFulfillmentReturn operation creates a fulfillment return for items that were fulfilled using the createFulfillmentOrder operation. For calls to createFulfillmentReturn, you must include ReturnReasonCode values returned by a previous call to the listReturnReasonCodes operation.
 */

public class CreateFulfillmentReturnRequest {
    @SerializedName("items")
    private CreateReturnItemList items = null;

    public CreateFulfillmentReturnRequest items(CreateReturnItemList items) {
        this.items = items;
        return this;
    }

    /**
     * Get items
     *
     * @return items
     **/

    public CreateReturnItemList getItems() {
        return items;
    }

    public void setItems(CreateReturnItemList items) {
        this.items = items;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateFulfillmentReturnRequest createFulfillmentReturnRequest = (CreateFulfillmentReturnRequest) o;
        return Objects.equals(this.items, createFulfillmentReturnRequest.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFulfillmentReturnRequest {\n");

        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

