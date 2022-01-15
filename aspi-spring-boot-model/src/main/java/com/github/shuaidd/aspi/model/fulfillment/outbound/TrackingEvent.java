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
 * Information for tracking package deliveries.
 */

public class TrackingEvent {
    @SerializedName("eventDate")
    private String eventDate = null;

    @SerializedName("eventAddress")
    private TrackingAddress eventAddress = null;

    @SerializedName("eventCode")
    private EventCode eventCode = null;

    @SerializedName("eventDescription")
    private String eventDescription = null;

    public TrackingEvent eventDate(String eventDate) {
        this.eventDate = eventDate;
        return this;
    }

    /**
     * The date and time that the delivery event took place, in ISO 8601 date time format.
     *
     * @return eventDate
     **/

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public TrackingEvent eventAddress(TrackingAddress eventAddress) {
        this.eventAddress = eventAddress;
        return this;
    }

    /**
     * The city where the delivery event took place.
     *
     * @return eventAddress
     **/

    public TrackingAddress getEventAddress() {
        return eventAddress;
    }

    public void setEventAddress(TrackingAddress eventAddress) {
        this.eventAddress = eventAddress;
    }

    public TrackingEvent eventCode(EventCode eventCode) {
        this.eventCode = eventCode;
        return this;
    }

    /**
     * The event code for the delivery event.
     *
     * @return eventCode
     **/

    public EventCode getEventCode() {
        return eventCode;
    }

    public void setEventCode(EventCode eventCode) {
        this.eventCode = eventCode;
    }

    public TrackingEvent eventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
        return this;
    }

    /**
     * A description for the corresponding event code.
     *
     * @return eventDescription
     **/

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TrackingEvent trackingEvent = (TrackingEvent) o;
        return Objects.equals(this.eventDate, trackingEvent.eventDate) &&
                Objects.equals(this.eventAddress, trackingEvent.eventAddress) &&
                Objects.equals(this.eventCode, trackingEvent.eventCode) &&
                Objects.equals(this.eventDescription, trackingEvent.eventDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventDate, eventAddress, eventCode, eventDescription);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrackingEvent {\n");

        sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
        sb.append("    eventAddress: ").append(toIndentedString(eventAddress)).append("\n");
        sb.append("    eventCode: ").append(toIndentedString(eventCode)).append("\n");
        sb.append("    eventDescription: ").append(toIndentedString(eventDescription)).append("\n");
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

