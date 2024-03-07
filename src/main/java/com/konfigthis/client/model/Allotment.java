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
import java.time.OffsetDateTime;

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
 * An allotment of credits as part of a subscription
 */
@ApiModel(description = "An allotment of credits as part of a subscription")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Allotment {
  public static final String SERIALIZED_NAME_DOWNLOADS_LEFT = "downloads_left";
  @SerializedName(SERIALIZED_NAME_DOWNLOADS_LEFT)
  private Integer downloadsLeft;

  public static final String SERIALIZED_NAME_DOWNLOADS_LIMIT = "downloads_limit";
  @SerializedName(SERIALIZED_NAME_DOWNLOADS_LIMIT)
  private Integer downloadsLimit;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public Allotment() {
  }

  public Allotment downloadsLeft(Integer downloadsLeft) {
    
    
    
    
    this.downloadsLeft = downloadsLeft;
    return this;
  }

   /**
   * Number of credits remaining in the subscription
   * @return downloadsLeft
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "Number of credits remaining in the subscription")

  public Integer getDownloadsLeft() {
    return downloadsLeft;
  }


  public void setDownloadsLeft(Integer downloadsLeft) {
    
    
    
    this.downloadsLeft = downloadsLeft;
  }


  public Allotment downloadsLimit(Integer downloadsLimit) {
    
    
    
    
    this.downloadsLimit = downloadsLimit;
    return this;
  }

   /**
   * Total number of credits available to this subscription
   * @return downloadsLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "Total number of credits available to this subscription")

  public Integer getDownloadsLimit() {
    return downloadsLimit;
  }


  public void setDownloadsLimit(Integer downloadsLimit) {
    
    
    
    this.downloadsLimit = downloadsLimit;
  }


  public Allotment endTime(OffsetDateTime endTime) {
    
    
    
    
    this.endTime = endTime;
    return this;
  }

   /**
   * Date the subscription ends
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-05-29T17:10:22Z", value = "Date the subscription ends")

  public OffsetDateTime getEndTime() {
    return endTime;
  }


  public void setEndTime(OffsetDateTime endTime) {
    
    
    
    this.endTime = endTime;
  }


  public Allotment startTime(OffsetDateTime startTime) {
    
    
    
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Date the subscription started
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-05-29T17:10:22Z", value = "Date the subscription started")

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  public void setStartTime(OffsetDateTime startTime) {
    
    
    
    this.startTime = startTime;
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
   * @return the Allotment instance itself
   */
  public Allotment putAdditionalProperty(String key, Object value) {
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
    Allotment allotment = (Allotment) o;
    return Objects.equals(this.downloadsLeft, allotment.downloadsLeft) &&
        Objects.equals(this.downloadsLimit, allotment.downloadsLimit) &&
        Objects.equals(this.endTime, allotment.endTime) &&
        Objects.equals(this.startTime, allotment.startTime)&&
        Objects.equals(this.additionalProperties, allotment.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloadsLeft, downloadsLimit, endTime, startTime, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Allotment {\n");
    sb.append("    downloadsLeft: ").append(toIndentedString(downloadsLeft)).append("\n");
    sb.append("    downloadsLimit: ").append(toIndentedString(downloadsLimit)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
    openapiFields.add("downloads_left");
    openapiFields.add("downloads_limit");
    openapiFields.add("end_time");
    openapiFields.add("start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Allotment
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Allotment.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Allotment is not found in the empty JSON string", Allotment.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Allotment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Allotment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Allotment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Allotment.class));

       return (TypeAdapter<T>) new TypeAdapter<Allotment>() {
           @Override
           public void write(JsonWriter out, Allotment value) throws IOException {
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
           public Allotment read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Allotment instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Allotment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Allotment
  * @throws IOException if the JSON string is invalid with respect to Allotment
  */
  public static Allotment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Allotment.class);
  }

 /**
  * Convert an instance of Allotment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

