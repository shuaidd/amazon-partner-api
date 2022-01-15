/*
 * Selling Partner API for FBA Small And Light
 * The Selling Partner API for FBA Small and Light lets you help sellers manage their listings in the Small and Light program. The program reduces the cost of fulfilling orders for small and lightweight FBA inventory. You can enroll or remove items from the program and check item eligibility and enrollment status. You can also preview the estimated program fees charged to a seller for items sold while enrolled in the program.
 *
 * OpenAPI spec version: v1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.shuaidd.aspi.model.fba.smallandlight;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * The Small and Light enrollment status of the item.
 */
@JsonAdapter(SmallAndLightEnrollmentStatus.Adapter.class)
public enum SmallAndLightEnrollmentStatus {

  ENROLLED("ENROLLED"),

  NOT_ENROLLED("NOT_ENROLLED");

  private String value;

  SmallAndLightEnrollmentStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SmallAndLightEnrollmentStatus fromValue(String text) {
    for (SmallAndLightEnrollmentStatus b : SmallAndLightEnrollmentStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SmallAndLightEnrollmentStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final SmallAndLightEnrollmentStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SmallAndLightEnrollmentStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SmallAndLightEnrollmentStatus.fromValue(String.valueOf(value));
    }
  }
}

