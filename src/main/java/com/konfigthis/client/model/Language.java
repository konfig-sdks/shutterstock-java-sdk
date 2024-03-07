/*
 * Shutterstock API Explorer
 * The Shutterstock API provides access to Shutterstock's library of media, as well as information about customers' accounts and the contributors that provide the media.
 *
 * The version of the OpenAPI document: 1.1.32
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Language code
 */
@JsonAdapter(Language.Adapter.class)public enum Language {
  
  AR("ar"),
  
  BG("bg"),
  
  BN("bn"),
  
  CS("cs"),
  
  DA("da"),
  
  DE("de"),
  
  EL("el"),
  
  EN("en"),
  
  ES("es"),
  
  FI("fi"),
  
  FR("fr"),
  
  GU("gu"),
  
  HE("he"),
  
  HI("hi"),
  
  HR("hr"),
  
  HU("hu"),
  
  ID("id"),
  
  IT("it"),
  
  JA("ja"),
  
  KN("kn"),
  
  KO("ko"),
  
  ML("ml"),
  
  MR("mr"),
  
  NB("nb"),
  
  NL("nl"),
  
  OR("or"),
  
  PL("pl"),
  
  PT("pt"),
  
  RO("ro"),
  
  RU("ru"),
  
  SK("sk"),
  
  SL("sl"),
  
  SV("sv"),
  
  TA("ta"),
  
  TE("te"),
  
  TH("th"),
  
  TR("tr"),
  
  UK("uk"),
  
  UR("ur"),
  
  VI("vi"),
  
  ZH("zh"),
  
  ZH_HANT("zh-Hant");

  private String value;

  Language(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Language fromValue(String value) {
    for (Language b : Language.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Language> {
    @Override
    public void write(final JsonWriter jsonWriter, final Language enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Language read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Language.fromValue(value);
    }
  }
}

