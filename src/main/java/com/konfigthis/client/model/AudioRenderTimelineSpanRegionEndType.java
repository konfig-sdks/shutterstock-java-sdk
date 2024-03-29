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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * A high-level description of how a region ends
 */
@ApiModel(description = "A high-level description of how a region ends")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AudioRenderTimelineSpanRegionEndType {
  public static final String SERIALIZED_NAME_BEAT = "beat";
  @SerializedName(SERIALIZED_NAME_BEAT)
  private Double beat;

  /**
   * The type of event
   */
  @JsonAdapter(EventEnum.Adapter.class)
 public enum EventEnum {
    ENDING("ending"),
    
    TRANSITION("transition");

    private String value;

    EventEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventEnum fromValue(String value) {
      for (EventEnum b : EventEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EventEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EventEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private EventEnum event;

  /**
   * The specific action to perform; if the event type is \&quot;ending\&quot; then this must be \&quot;ringout\&quot; and if event type is \&quot;transition\&quot; this must be \&quot;cut\&quot;
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    RINGOUT("ringout"),
    
    CUT("cut");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public AudioRenderTimelineSpanRegionEndType() {
  }

  public AudioRenderTimelineSpanRegionEndType beat(Double beat) {
    
    
    
    
    this.beat = beat;
    return this;
  }

  public AudioRenderTimelineSpanRegionEndType beat(Integer beat) {
    
    
    
    
    this.beat = beat.doubleValue();
    return this;
  }

   /**
   * The beat, relative to the start of the active region, at which the end_type begins; in other words, the ending starts on this beat of the region
   * @return beat
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "24", required = true, value = "The beat, relative to the start of the active region, at which the end_type begins; in other words, the ending starts on this beat of the region")

  public Double getBeat() {
    return beat;
  }


  public void setBeat(Double beat) {
    
    
    
    this.beat = beat;
  }


  public AudioRenderTimelineSpanRegionEndType event(EventEnum event) {
    
    
    
    
    this.event = event;
    return this;
  }

   /**
   * The type of event
   * @return event
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ENDING", required = true, value = "The type of event")

  public EventEnum getEvent() {
    return event;
  }


  public void setEvent(EventEnum event) {
    
    
    
    this.event = event;
  }


  public AudioRenderTimelineSpanRegionEndType type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * The specific action to perform; if the event type is \&quot;ending\&quot; then this must be \&quot;ringout\&quot; and if event type is \&quot;transition\&quot; this must be \&quot;cut\&quot;
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "RINGOUT", required = true, value = "The specific action to perform; if the event type is \"ending\" then this must be \"ringout\" and if event type is \"transition\" this must be \"cut\"")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
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
   * @return the AudioRenderTimelineSpanRegionEndType instance itself
   */
  public AudioRenderTimelineSpanRegionEndType putAdditionalProperty(String key, Object value) {
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
    AudioRenderTimelineSpanRegionEndType audioRenderTimelineSpanRegionEndType = (AudioRenderTimelineSpanRegionEndType) o;
    return Objects.equals(this.beat, audioRenderTimelineSpanRegionEndType.beat) &&
        Objects.equals(this.event, audioRenderTimelineSpanRegionEndType.event) &&
        Objects.equals(this.type, audioRenderTimelineSpanRegionEndType.type)&&
        Objects.equals(this.additionalProperties, audioRenderTimelineSpanRegionEndType.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beat, event, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudioRenderTimelineSpanRegionEndType {\n");
    sb.append("    beat: ").append(toIndentedString(beat)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("beat");
    openapiFields.add("event");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("beat");
    openapiRequiredFields.add("event");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AudioRenderTimelineSpanRegionEndType
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AudioRenderTimelineSpanRegionEndType.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AudioRenderTimelineSpanRegionEndType is not found in the empty JSON string", AudioRenderTimelineSpanRegionEndType.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AudioRenderTimelineSpanRegionEndType.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("event").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AudioRenderTimelineSpanRegionEndType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AudioRenderTimelineSpanRegionEndType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AudioRenderTimelineSpanRegionEndType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AudioRenderTimelineSpanRegionEndType.class));

       return (TypeAdapter<T>) new TypeAdapter<AudioRenderTimelineSpanRegionEndType>() {
           @Override
           public void write(JsonWriter out, AudioRenderTimelineSpanRegionEndType value) throws IOException {
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
           public AudioRenderTimelineSpanRegionEndType read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AudioRenderTimelineSpanRegionEndType instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AudioRenderTimelineSpanRegionEndType given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AudioRenderTimelineSpanRegionEndType
  * @throws IOException if the JSON string is invalid with respect to AudioRenderTimelineSpanRegionEndType
  */
  public static AudioRenderTimelineSpanRegionEndType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AudioRenderTimelineSpanRegionEndType.class);
  }

 /**
  * Convert an instance of AudioRenderTimelineSpanRegionEndType to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

