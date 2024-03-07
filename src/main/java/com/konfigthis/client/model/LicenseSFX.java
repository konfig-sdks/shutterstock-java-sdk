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
 * 
 */
@ApiModel(description = "")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LicenseSFX {
  /**
   * Gets or Sets audioLayout
   */
  @JsonAdapter(AudioLayoutEnum.Adapter.class)
 public enum AudioLayoutEnum {
    AMBISONIC("ambisonic"),
    
    _5_1("5.1"),
    
    STEREO("stereo");

    private String value;

    AudioLayoutEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AudioLayoutEnum fromValue(String value) {
      for (AudioLayoutEnum b : AudioLayoutEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AudioLayoutEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AudioLayoutEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AudioLayoutEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AudioLayoutEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AUDIO_LAYOUT = "audio_layout";
  @SerializedName(SERIALIZED_NAME_AUDIO_LAYOUT)
  private AudioLayoutEnum audioLayout;

  /**
   * Gets or Sets format
   */
  @JsonAdapter(FormatEnum.Adapter.class)
 public enum FormatEnum {
    WAV("wav"),
    
    MP3("mp3");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FormatEnum fromValue(String value) {
      for (FormatEnum b : FormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FormatEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private FormatEnum format;

  public static final String SERIALIZED_NAME_SEARCH_ID = "search_id";
  @SerializedName(SERIALIZED_NAME_SEARCH_ID)
  private String searchId;

  public static final String SERIALIZED_NAME_SFX_ID = "sfx_id";
  @SerializedName(SERIALIZED_NAME_SFX_ID)
  private String sfxId;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_ID = "subscription_id";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_ID)
  private String subscriptionId;

  public LicenseSFX() {
  }

  public LicenseSFX audioLayout(AudioLayoutEnum audioLayout) {
    
    
    
    
    this.audioLayout = audioLayout;
    return this;
  }

   /**
   * Get audioLayout
   * @return audioLayout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AudioLayoutEnum getAudioLayout() {
    return audioLayout;
  }


  public void setAudioLayout(AudioLayoutEnum audioLayout) {
    
    
    
    this.audioLayout = audioLayout;
  }


  public LicenseSFX format(FormatEnum format) {
    
    
    
    
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WAV", value = "")

  public FormatEnum getFormat() {
    return format;
  }


  public void setFormat(FormatEnum format) {
    
    
    
    this.format = format;
  }


  public LicenseSFX searchId(String searchId) {
    
    
    
    
    this.searchId = searchId;
    return this;
  }

   /**
   * ID of the search that led to this licensing event
   * @return searchId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the search that led to this licensing event")

  public String getSearchId() {
    return searchId;
  }


  public void setSearchId(String searchId) {
    
    
    
    this.searchId = searchId;
  }


  public LicenseSFX sfxId(String sfxId) {
    
    
    
    
    this.sfxId = sfxId;
    return this;
  }

   /**
   * ID of the sounds effect being licensed
   * @return sfxId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "123456789", required = true, value = "ID of the sounds effect being licensed")

  public String getSfxId() {
    return sfxId;
  }


  public void setSfxId(String sfxId) {
    
    
    
    this.sfxId = sfxId;
  }


  public LicenseSFX subscriptionId(String subscriptionId) {
    
    
    
    
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * ID of the subscription to use for the download.
   * @return subscriptionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "s12345678", required = true, value = "ID of the subscription to use for the download.")

  public String getSubscriptionId() {
    return subscriptionId;
  }


  public void setSubscriptionId(String subscriptionId) {
    
    
    
    this.subscriptionId = subscriptionId;
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
   * @return the LicenseSFX instance itself
   */
  public LicenseSFX putAdditionalProperty(String key, Object value) {
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
    LicenseSFX licenseSFX = (LicenseSFX) o;
    return Objects.equals(this.audioLayout, licenseSFX.audioLayout) &&
        Objects.equals(this.format, licenseSFX.format) &&
        Objects.equals(this.searchId, licenseSFX.searchId) &&
        Objects.equals(this.sfxId, licenseSFX.sfxId) &&
        Objects.equals(this.subscriptionId, licenseSFX.subscriptionId)&&
        Objects.equals(this.additionalProperties, licenseSFX.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audioLayout, format, searchId, sfxId, subscriptionId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicenseSFX {\n");
    sb.append("    audioLayout: ").append(toIndentedString(audioLayout)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    searchId: ").append(toIndentedString(searchId)).append("\n");
    sb.append("    sfxId: ").append(toIndentedString(sfxId)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
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
    openapiFields.add("audio_layout");
    openapiFields.add("format");
    openapiFields.add("search_id");
    openapiFields.add("sfx_id");
    openapiFields.add("subscription_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("sfx_id");
    openapiRequiredFields.add("subscription_id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LicenseSFX
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LicenseSFX.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LicenseSFX is not found in the empty JSON string", LicenseSFX.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LicenseSFX.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("audio_layout") != null && !jsonObj.get("audio_layout").isJsonNull()) && !jsonObj.get("audio_layout").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audio_layout` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audio_layout").toString()));
      }
      if ((jsonObj.get("format") != null && !jsonObj.get("format").isJsonNull()) && !jsonObj.get("format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("format").toString()));
      }
      if ((jsonObj.get("search_id") != null && !jsonObj.get("search_id").isJsonNull()) && !jsonObj.get("search_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `search_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("search_id").toString()));
      }
      if (!jsonObj.get("sfx_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sfx_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sfx_id").toString()));
      }
      if (!jsonObj.get("subscription_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LicenseSFX.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LicenseSFX' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LicenseSFX> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LicenseSFX.class));

       return (TypeAdapter<T>) new TypeAdapter<LicenseSFX>() {
           @Override
           public void write(JsonWriter out, LicenseSFX value) throws IOException {
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
           public LicenseSFX read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LicenseSFX instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LicenseSFX given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LicenseSFX
  * @throws IOException if the JSON string is invalid with respect to LicenseSFX
  */
  public static LicenseSFX fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LicenseSFX.class);
  }

 /**
  * Convert an instance of LicenseSFX to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

