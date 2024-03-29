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
 * Audio License URL object
 */
@ApiModel(description = "Audio License URL object")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AudioUrl {
  public static final String SERIALIZED_NAME_SHORTS_LOOPS_STEMS = "shorts_loops_stems";
  @SerializedName(SERIALIZED_NAME_SHORTS_LOOPS_STEMS)
  private String shortsLoopsStems;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public AudioUrl() {
  }

  public AudioUrl shortsLoopsStems(String shortsLoopsStems) {
    
    
    
    
    this.shortsLoopsStems = shortsLoopsStems;
    return this;
  }

   /**
   * URL that can be used to download the .zip file containing shorts, loops, and stems
   * @return shortsLoopsStems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL that can be used to download the .zip file containing shorts, loops, and stems")

  public String getShortsLoopsStems() {
    return shortsLoopsStems;
  }


  public void setShortsLoopsStems(String shortsLoopsStems) {
    
    
    
    this.shortsLoopsStems = shortsLoopsStems;
  }


  public AudioUrl url(String url) {
    
    
    
    
    this.url = url;
    return this;
  }

   /**
   * URL that can be used to download the unwatermarked, licensed asset
   * @return url
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "http://download2.dev.shutterstock.com/gatekeeper/abc/original.wav", required = true, value = "URL that can be used to download the unwatermarked, licensed asset")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    
    
    
    this.url = url;
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
   * @return the AudioUrl instance itself
   */
  public AudioUrl putAdditionalProperty(String key, Object value) {
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
    AudioUrl audioUrl = (AudioUrl) o;
    return Objects.equals(this.shortsLoopsStems, audioUrl.shortsLoopsStems) &&
        Objects.equals(this.url, audioUrl.url)&&
        Objects.equals(this.additionalProperties, audioUrl.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shortsLoopsStems, url, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudioUrl {\n");
    sb.append("    shortsLoopsStems: ").append(toIndentedString(shortsLoopsStems)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("shorts_loops_stems");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AudioUrl
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AudioUrl.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AudioUrl is not found in the empty JSON string", AudioUrl.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AudioUrl.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("shorts_loops_stems") != null && !jsonObj.get("shorts_loops_stems").isJsonNull()) && !jsonObj.get("shorts_loops_stems").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shorts_loops_stems` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shorts_loops_stems").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AudioUrl.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AudioUrl' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AudioUrl> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AudioUrl.class));

       return (TypeAdapter<T>) new TypeAdapter<AudioUrl>() {
           @Override
           public void write(JsonWriter out, AudioUrl value) throws IOException {
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
           public AudioUrl read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AudioUrl instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AudioUrl given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AudioUrl
  * @throws IOException if the JSON string is invalid with respect to AudioUrl
  */
  public static AudioUrl fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AudioUrl.class);
  }

 /**
  * Convert an instance of AudioUrl to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

