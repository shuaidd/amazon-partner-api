/*
 * Selling Partner API for Merchant Fulfillment
 * The Selling Partner API for Merchant Fulfillment helps you build applications that let sellers purchase shipping for non-Prime and Prime orders using Amazon’s Buy Shipping Services.
 *
 * OpenAPI spec version: v0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.shuaidd.aspi.model.merchant;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * The unit of length.
 */
@JsonAdapter(UnitOfLength.Adapter.class)
public enum UnitOfLength {

  INCHES("inches"),

  CENTIMETERS("centimeters");

  private String value;

  UnitOfLength(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UnitOfLength fromValue(String text) {
    for (UnitOfLength b : UnitOfLength.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<UnitOfLength> {
    @Override
    public void write(final JsonWriter jsonWriter, final UnitOfLength enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public UnitOfLength read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return UnitOfLength.fromValue(String.valueOf(value));
    }
  }
}

