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
import com.konfigthis.client.model.Url;
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
 * The response to a licensing request for an sound effects
 */
@ApiModel(description = "The response to a licensing request for an sound effects")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LicenseSFXResult {
  public static final String SERIALIZED_NAME_ALLOTMENT_CHARGE = "allotment_charge";
  @SerializedName(SERIALIZED_NAME_ALLOTMENT_CHARGE)
  private Integer allotmentCharge;

  public static final String SERIALIZED_NAME_DOWNLOAD = "download";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD)
  private Url download;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_LICENSE_ID = "license_id";
  @SerializedName(SERIALIZED_NAME_LICENSE_ID)
  private String licenseId;

  public static final String SERIALIZED_NAME_SFX_ID = "sfx_id";
  @SerializedName(SERIALIZED_NAME_SFX_ID)
  private String sfxId;

  public LicenseSFXResult() {
  }

  public LicenseSFXResult allotmentCharge(Integer allotmentCharge) {
    
    
    
    
    this.allotmentCharge = allotmentCharge;
    return this;
  }

   /**
   * Number of credits that this licensing event used
   * @return allotmentCharge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Number of credits that this licensing event used")

  public Integer getAllotmentCharge() {
    return allotmentCharge;
  }


  public void setAllotmentCharge(Integer allotmentCharge) {
    
    
    
    this.allotmentCharge = allotmentCharge;
  }


  public LicenseSFXResult download(Url download) {
    
    
    
    
    this.download = download;
    return this;
  }

   /**
   * Get download
   * @return download
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Url getDownload() {
    return download;
  }


  public void setDownload(Url download) {
    
    
    
    this.download = download;
  }


  public LicenseSFXResult error(String error) {
    
    
    
    
    this.error = error;
    return this;
  }

   /**
   * Error message, appears only if there was an error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Error message, appears only if there was an error")

  public String getError() {
    return error;
  }


  public void setError(String error) {
    
    
    
    this.error = error;
  }


  public LicenseSFXResult licenseId(String licenseId) {
    
    
    
    
    this.licenseId = licenseId;
    return this;
  }

   /**
   * ID of the license event
   * @return licenseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the license event")

  public String getLicenseId() {
    return licenseId;
  }


  public void setLicenseId(String licenseId) {
    
    
    
    this.licenseId = licenseId;
  }


  public LicenseSFXResult sfxId(String sfxId) {
    
    
    
    
    this.sfxId = sfxId;
    return this;
  }

   /**
   * Sound effects ID that was licensed
   * @return sfxId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "59656357", required = true, value = "Sound effects ID that was licensed")

  public String getSfxId() {
    return sfxId;
  }


  public void setSfxId(String sfxId) {
    
    
    
    this.sfxId = sfxId;
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
   * @return the LicenseSFXResult instance itself
   */
  public LicenseSFXResult putAdditionalProperty(String key, Object value) {
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
    LicenseSFXResult licenseSFXResult = (LicenseSFXResult) o;
    return Objects.equals(this.allotmentCharge, licenseSFXResult.allotmentCharge) &&
        Objects.equals(this.download, licenseSFXResult.download) &&
        Objects.equals(this.error, licenseSFXResult.error) &&
        Objects.equals(this.licenseId, licenseSFXResult.licenseId) &&
        Objects.equals(this.sfxId, licenseSFXResult.sfxId)&&
        Objects.equals(this.additionalProperties, licenseSFXResult.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allotmentCharge, download, error, licenseId, sfxId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicenseSFXResult {\n");
    sb.append("    allotmentCharge: ").append(toIndentedString(allotmentCharge)).append("\n");
    sb.append("    download: ").append(toIndentedString(download)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    licenseId: ").append(toIndentedString(licenseId)).append("\n");
    sb.append("    sfxId: ").append(toIndentedString(sfxId)).append("\n");
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
    openapiFields.add("allotment_charge");
    openapiFields.add("download");
    openapiFields.add("error");
    openapiFields.add("license_id");
    openapiFields.add("sfx_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("sfx_id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LicenseSFXResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LicenseSFXResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LicenseSFXResult is not found in the empty JSON string", LicenseSFXResult.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LicenseSFXResult.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `download`
      if (jsonObj.get("download") != null && !jsonObj.get("download").isJsonNull()) {
        Url.validateJsonObject(jsonObj.getAsJsonObject("download"));
      }
      if ((jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) && !jsonObj.get("error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error").toString()));
      }
      if ((jsonObj.get("license_id") != null && !jsonObj.get("license_id").isJsonNull()) && !jsonObj.get("license_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `license_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("license_id").toString()));
      }
      if (!jsonObj.get("sfx_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sfx_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sfx_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LicenseSFXResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LicenseSFXResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LicenseSFXResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LicenseSFXResult.class));

       return (TypeAdapter<T>) new TypeAdapter<LicenseSFXResult>() {
           @Override
           public void write(JsonWriter out, LicenseSFXResult value) throws IOException {
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
           public LicenseSFXResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LicenseSFXResult instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LicenseSFXResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LicenseSFXResult
  * @throws IOException if the JSON string is invalid with respect to LicenseSFXResult
  */
  public static LicenseSFXResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LicenseSFXResult.class);
  }

 /**
  * Convert an instance of LicenseSFXResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
