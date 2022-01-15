/*
 * Selling Partner API for Services
 * With the Services API, you can build applications that help service providers get and modify their service orders.
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.shuaidd.aspi.model.service;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * A technician who is assigned to perform the service job in part or in full.
 */

public class Technician {
  @SerializedName("technicianId")
  private String technicianId = null;

  @SerializedName("name")
  private String name = null;

  public Technician technicianId(String technicianId) {
    this.technicianId = technicianId;
    return this;
  }

   /**
   * The technician identifier.
   * @return technicianId
  **/

  public String getTechnicianId() {
    return technicianId;
  }

  public void setTechnicianId(String technicianId) {
    this.technicianId = technicianId;
  }

  public Technician name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the technician.
   * @return name
  **/

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Technician technician = (Technician) o;
    return Objects.equals(this.technicianId, technician.technicianId) &&
        Objects.equals(this.name, technician.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(technicianId, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Technician {\n");

    sb.append("    technicianId: ").append(toIndentedString(technicianId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
