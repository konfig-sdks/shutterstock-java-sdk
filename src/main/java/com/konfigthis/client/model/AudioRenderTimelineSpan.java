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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.AudioRenderTimelineSpanInstrumentGroup;
import com.konfigthis.client.model.AudioRenderTimelineSpanRegion;
import com.konfigthis.client.model.AudioRenderTimelineSpanTempoChanges;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * The beginning of a non-overlapping period of absolute time
 */
@ApiModel(description = "The beginning of a non-overlapping period of absolute time")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AudioRenderTimelineSpan {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Double id;

  public static final String SERIALIZED_NAME_INSTRUMENT_GROUPS = "instrument_groups";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_GROUPS)
  private List<AudioRenderTimelineSpanInstrumentGroup> instrumentGroups = null;

  public static final String SERIALIZED_NAME_REGIONS = "regions";
  @SerializedName(SERIALIZED_NAME_REGIONS)
  private List<AudioRenderTimelineSpanRegion> regions = null;

  /**
   * Type of span; metered spans represent a pariod of time with music, and unmetered spans denote the end of the prior metered span
   */
  @JsonAdapter(SpanTypeEnum.Adapter.class)
 public enum SpanTypeEnum {
    METERED("metered"),
    
    UNMETERED("unmetered");

    private String value;

    SpanTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SpanTypeEnum fromValue(String value) {
      for (SpanTypeEnum b : SpanTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SpanTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SpanTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SpanTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SpanTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SPAN_TYPE = "span_type";
  @SerializedName(SERIALIZED_NAME_SPAN_TYPE)
  private SpanTypeEnum spanType;

  public static final String SERIALIZED_NAME_TEMPO = "tempo";
  @SerializedName(SERIALIZED_NAME_TEMPO)
  private Integer tempo;

  public static final String SERIALIZED_NAME_TEMPO_CHANGES = "tempo_changes";
  @SerializedName(SERIALIZED_NAME_TEMPO_CHANGES)
  private List<AudioRenderTimelineSpanTempoChanges> tempoChanges = null;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private Integer time;

  public AudioRenderTimelineSpan() {
  }

  public AudioRenderTimelineSpan id(Double id) {
    
    
    
    
    this.id = id;
    return this;
  }

  public AudioRenderTimelineSpan id(Integer id) {
    
    
    
    
    this.id = id.doubleValue();
    return this;
  }

   /**
   * An identifier which must be unique within the parent span
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "111", value = "An identifier which must be unique within the parent span")

  public Double getId() {
    return id;
  }


  public void setId(Double id) {
    
    
    
    this.id = id;
  }


  public AudioRenderTimelineSpan instrumentGroups(List<AudioRenderTimelineSpanInstrumentGroup> instrumentGroups) {
    
    
    
    
    this.instrumentGroups = instrumentGroups;
    return this;
  }

  public AudioRenderTimelineSpan addInstrumentGroupsItem(AudioRenderTimelineSpanInstrumentGroup instrumentGroupsItem) {
    if (this.instrumentGroups == null) {
      this.instrumentGroups = new ArrayList<>();
    }
    this.instrumentGroups.add(instrumentGroupsItem);
    return this;
  }

   /**
   * An array of instrument_group objects that are used in this span
   * @return instrumentGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of instrument_group objects that are used in this span")

  public List<AudioRenderTimelineSpanInstrumentGroup> getInstrumentGroups() {
    return instrumentGroups;
  }


  public void setInstrumentGroups(List<AudioRenderTimelineSpanInstrumentGroup> instrumentGroups) {
    
    
    
    this.instrumentGroups = instrumentGroups;
  }


  public AudioRenderTimelineSpan regions(List<AudioRenderTimelineSpanRegion> regions) {
    
    
    
    
    this.regions = regions;
    return this;
  }

  public AudioRenderTimelineSpan addRegionsItem(AudioRenderTimelineSpanRegion regionsItem) {
    if (this.regions == null) {
      this.regions = new ArrayList<>();
    }
    this.regions.add(regionsItem);
    return this;
  }

   /**
   * An array of region objects within the span
   * @return regions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of region objects within the span")

  public List<AudioRenderTimelineSpanRegion> getRegions() {
    return regions;
  }


  public void setRegions(List<AudioRenderTimelineSpanRegion> regions) {
    
    
    
    this.regions = regions;
  }


  public AudioRenderTimelineSpan spanType(SpanTypeEnum spanType) {
    
    
    
    
    this.spanType = spanType;
    return this;
  }

   /**
   * Type of span; metered spans represent a pariod of time with music, and unmetered spans denote the end of the prior metered span
   * @return spanType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "METERED", required = true, value = "Type of span; metered spans represent a pariod of time with music, and unmetered spans denote the end of the prior metered span")

  public SpanTypeEnum getSpanType() {
    return spanType;
  }


  public void setSpanType(SpanTypeEnum spanType) {
    
    
    
    this.spanType = spanType;
  }


  public AudioRenderTimelineSpan tempo(Integer tempo) {
    
    
    
    
    this.tempo = tempo;
    return this;
  }

   /**
   * The tempo, in beats per minute, at the start of the span; if not provided, the API selects a random tempo
   * @return tempo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "76", value = "The tempo, in beats per minute, at the start of the span; if not provided, the API selects a random tempo")

  public Integer getTempo() {
    return tempo;
  }


  public void setTempo(Integer tempo) {
    
    
    
    this.tempo = tempo;
  }


  public AudioRenderTimelineSpan tempoChanges(List<AudioRenderTimelineSpanTempoChanges> tempoChanges) {
    
    
    
    
    this.tempoChanges = tempoChanges;
    return this;
  }

  public AudioRenderTimelineSpan addTempoChangesItem(AudioRenderTimelineSpanTempoChanges tempoChangesItem) {
    if (this.tempoChanges == null) {
      this.tempoChanges = new ArrayList<>();
    }
    this.tempoChanges.add(tempoChangesItem);
    return this;
  }

   /**
   * Two or more inflection points in a tempo curve; the API creates a smoothly changing tempo by using a linear interpolation of the time between each tempo change
   * @return tempoChanges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Two or more inflection points in a tempo curve; the API creates a smoothly changing tempo by using a linear interpolation of the time between each tempo change")

  public List<AudioRenderTimelineSpanTempoChanges> getTempoChanges() {
    return tempoChanges;
  }


  public void setTempoChanges(List<AudioRenderTimelineSpanTempoChanges> tempoChanges) {
    
    
    
    this.tempoChanges = tempoChanges;
  }


  public AudioRenderTimelineSpan time(Integer time) {
    
    
    
    
    this.time = time;
    return this;
  }

   /**
   * The absolute time, in seconds, at which the span starts
   * @return time
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "The absolute time, in seconds, at which the span starts")

  public Integer getTime() {
    return time;
  }


  public void setTime(Integer time) {
    
    
    
    this.time = time;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the AudioRenderTimelineSpan instance itself
   */
  public AudioRenderTimelineSpan putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudioRenderTimelineSpan audioRenderTimelineSpan = (AudioRenderTimelineSpan) o;
    return Objects.equals(this.id, audioRenderTimelineSpan.id) &&
        Objects.equals(this.instrumentGroups, audioRenderTimelineSpan.instrumentGroups) &&
        Objects.equals(this.regions, audioRenderTimelineSpan.regions) &&
        Objects.equals(this.spanType, audioRenderTimelineSpan.spanType) &&
        Objects.equals(this.tempo, audioRenderTimelineSpan.tempo) &&
        Objects.equals(this.tempoChanges, audioRenderTimelineSpan.tempoChanges) &&
        Objects.equals(this.time, audioRenderTimelineSpan.time)&&
        Objects.equals(this.additionalProperties, audioRenderTimelineSpan.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, instrumentGroups, regions, spanType, tempo, tempoChanges, time, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudioRenderTimelineSpan {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instrumentGroups: ").append(toIndentedString(instrumentGroups)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    spanType: ").append(toIndentedString(spanType)).append("\n");
    sb.append("    tempo: ").append(toIndentedString(tempo)).append("\n");
    sb.append("    tempoChanges: ").append(toIndentedString(tempoChanges)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("instrument_groups");
    openapiFields.add("regions");
    openapiFields.add("span_type");
    openapiFields.add("tempo");
    openapiFields.add("tempo_changes");
    openapiFields.add("time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("span_type");
    openapiRequiredFields.add("time");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AudioRenderTimelineSpan
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AudioRenderTimelineSpan.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AudioRenderTimelineSpan is not found in the empty JSON string", AudioRenderTimelineSpan.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AudioRenderTimelineSpan.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("instrument_groups") != null && !jsonObj.get("instrument_groups").isJsonNull()) {
        JsonArray jsonArrayinstrumentGroups = jsonObj.getAsJsonArray("instrument_groups");
        if (jsonArrayinstrumentGroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("instrument_groups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `instrument_groups` to be an array in the JSON string but got `%s`", jsonObj.get("instrument_groups").toString()));
          }

          // validate the optional field `instrument_groups` (array)
          for (int i = 0; i < jsonArrayinstrumentGroups.size(); i++) {
            AudioRenderTimelineSpanInstrumentGroup.validateJsonObject(jsonArrayinstrumentGroups.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("regions") != null && !jsonObj.get("regions").isJsonNull()) {
        JsonArray jsonArrayregions = jsonObj.getAsJsonArray("regions");
        if (jsonArrayregions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("regions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `regions` to be an array in the JSON string but got `%s`", jsonObj.get("regions").toString()));
          }

          // validate the optional field `regions` (array)
          for (int i = 0; i < jsonArrayregions.size(); i++) {
            AudioRenderTimelineSpanRegion.validateJsonObject(jsonArrayregions.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("span_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `span_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("span_type").toString()));
      }
      if (jsonObj.get("tempo_changes") != null && !jsonObj.get("tempo_changes").isJsonNull()) {
        JsonArray jsonArraytempoChanges = jsonObj.getAsJsonArray("tempo_changes");
        if (jsonArraytempoChanges != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tempo_changes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tempo_changes` to be an array in the JSON string but got `%s`", jsonObj.get("tempo_changes").toString()));
          }

          // validate the optional field `tempo_changes` (array)
          for (int i = 0; i < jsonArraytempoChanges.size(); i++) {
            AudioRenderTimelineSpanTempoChanges.validateJsonObject(jsonArraytempoChanges.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AudioRenderTimelineSpan.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AudioRenderTimelineSpan' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AudioRenderTimelineSpan> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AudioRenderTimelineSpan.class));

       return (TypeAdapter<T>) new TypeAdapter<AudioRenderTimelineSpan>() {
           @Override
           public void write(JsonWriter out, AudioRenderTimelineSpan value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public AudioRenderTimelineSpan read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AudioRenderTimelineSpan instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AudioRenderTimelineSpan given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AudioRenderTimelineSpan
  * @throws IOException if the JSON string is invalid with respect to AudioRenderTimelineSpan
  */
  public static AudioRenderTimelineSpan fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AudioRenderTimelineSpan.class);
  }

 /**
  * Convert an instance of AudioRenderTimelineSpan to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

