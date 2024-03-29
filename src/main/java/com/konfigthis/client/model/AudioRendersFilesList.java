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
 * Files associated with the render
 */
@ApiModel(description = "Files associated with the render")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AudioRendersFilesList {
  public static final String SERIALIZED_NAME_BITS_SAMPLE = "bits_sample";
  @SerializedName(SERIALIZED_NAME_BITS_SAMPLE)
  private Double bitsSample;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "content_type";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_DOWNLOAD_URL = "download_url";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_URL)
  private String downloadUrl;

  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename;

  public static final String SERIALIZED_NAME_FREQUENCY_HZ = "frequency_hz";
  @SerializedName(SERIALIZED_NAME_FREQUENCY_HZ)
  private Double frequencyHz;

  public static final String SERIALIZED_NAME_KBITS_SECOND = "kbits_second";
  @SerializedName(SERIALIZED_NAME_KBITS_SECOND)
  private Double kbitsSecond;

  public static final String SERIALIZED_NAME_SIZE_BYTES = "size_bytes";
  @SerializedName(SERIALIZED_NAME_SIZE_BYTES)
  private Double sizeBytes;

  public static final String SERIALIZED_NAME_TRACKS = "tracks";
  @SerializedName(SERIALIZED_NAME_TRACKS)
  private List<String> tracks = new ArrayList<>();

  public AudioRendersFilesList() {
  }

  public AudioRendersFilesList bitsSample(Double bitsSample) {
    
    
    
    
    this.bitsSample = bitsSample;
    return this;
  }

  public AudioRendersFilesList bitsSample(Integer bitsSample) {
    
    
    
    
    this.bitsSample = bitsSample.doubleValue();
    return this;
  }

   /**
   * The bit depth of the audio files in bits/sample
   * @return bitsSample
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "16", required = true, value = "The bit depth of the audio files in bits/sample")

  public Double getBitsSample() {
    return bitsSample;
  }


  public void setBitsSample(Double bitsSample) {
    
    
    
    this.bitsSample = bitsSample;
  }


  public AudioRendersFilesList contentType(String contentType) {
    
    
    
    
    this.contentType = contentType;
    return this;
  }

   /**
   * The content-type of the file
   * @return contentType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "audio/mp3", required = true, value = "The content-type of the file")

  public String getContentType() {
    return contentType;
  }


  public void setContentType(String contentType) {
    
    
    
    this.contentType = contentType;
  }


  public AudioRendersFilesList downloadUrl(String downloadUrl) {
    
    
    
    
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * The internet-accessible URL from which the file can be downloaded. Any redirects encountered when using this URL must be followed
   * @return downloadUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://s3.amazonaws.com/prod-amper-inferno-ephemeral/renders/2021/07/13/amper-api-QwAgKqXQAzr622KuXYZ25C9WRH3a/0.mp3", required = true, value = "The internet-accessible URL from which the file can be downloaded. Any redirects encountered when using this URL must be followed")

  public String getDownloadUrl() {
    return downloadUrl;
  }


  public void setDownloadUrl(String downloadUrl) {
    
    
    
    this.downloadUrl = downloadUrl;
  }


  public AudioRendersFilesList filename(String filename) {
    
    
    
    
    this.filename = filename;
    return this;
  }

   /**
   * The user-specified file name suggestion from the render request; this file name becomes the filename property of the Content-Disposition header when the user downloads the rendered audio file
   * @return filename
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "My_audio_ai.mp3", required = true, value = "The user-specified file name suggestion from the render request; this file name becomes the filename property of the Content-Disposition header when the user downloads the rendered audio file")

  public String getFilename() {
    return filename;
  }


  public void setFilename(String filename) {
    
    
    
    this.filename = filename;
  }


  public AudioRendersFilesList frequencyHz(Double frequencyHz) {
    
    
    
    
    this.frequencyHz = frequencyHz;
    return this;
  }

  public AudioRendersFilesList frequencyHz(Integer frequencyHz) {
    
    
    
    
    this.frequencyHz = frequencyHz.doubleValue();
    return this;
  }

   /**
   * The Sample rate of the audio files in Hertz (Hz)
   * @return frequencyHz
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "44100", required = true, value = "The Sample rate of the audio files in Hertz (Hz)")

  public Double getFrequencyHz() {
    return frequencyHz;
  }


  public void setFrequencyHz(Double frequencyHz) {
    
    
    
    this.frequencyHz = frequencyHz;
  }


  public AudioRendersFilesList kbitsSecond(Double kbitsSecond) {
    
    
    
    
    this.kbitsSecond = kbitsSecond;
    return this;
  }

  public AudioRendersFilesList kbitsSecond(Integer kbitsSecond) {
    
    
    
    
    this.kbitsSecond = kbitsSecond.doubleValue();
    return this;
  }

   /**
   * The data rate of the audio files in kilobits/second
   * @return kbitsSecond
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "192", required = true, value = "The data rate of the audio files in kilobits/second")

  public Double getKbitsSecond() {
    return kbitsSecond;
  }


  public void setKbitsSecond(Double kbitsSecond) {
    
    
    
    this.kbitsSecond = kbitsSecond;
  }


  public AudioRendersFilesList sizeBytes(Double sizeBytes) {
    
    
    
    
    this.sizeBytes = sizeBytes;
    return this;
  }

  public AudioRendersFilesList sizeBytes(Integer sizeBytes) {
    
    
    
    
    this.sizeBytes = sizeBytes.doubleValue();
    return this;
  }

   /**
   * Size of the file in bytes
   * @return sizeBytes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "481556", required = true, value = "Size of the file in bytes")

  public Double getSizeBytes() {
    return sizeBytes;
  }


  public void setSizeBytes(Double sizeBytes) {
    
    
    
    this.sizeBytes = sizeBytes;
  }


  public AudioRendersFilesList tracks(List<String> tracks) {
    
    
    
    
    this.tracks = tracks;
    return this;
  }

  public AudioRendersFilesList addTracksItem(String tracksItem) {
    this.tracks.add(tracksItem);
    return this;
  }

   /**
   * An array of track names included in the file
   * @return tracks
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An array of track names included in the file")

  public List<String> getTracks() {
    return tracks;
  }


  public void setTracks(List<String> tracks) {
    
    
    
    this.tracks = tracks;
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
   * @return the AudioRendersFilesList instance itself
   */
  public AudioRendersFilesList putAdditionalProperty(String key, Object value) {
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
    AudioRendersFilesList audioRendersFilesList = (AudioRendersFilesList) o;
    return Objects.equals(this.bitsSample, audioRendersFilesList.bitsSample) &&
        Objects.equals(this.contentType, audioRendersFilesList.contentType) &&
        Objects.equals(this.downloadUrl, audioRendersFilesList.downloadUrl) &&
        Objects.equals(this.filename, audioRendersFilesList.filename) &&
        Objects.equals(this.frequencyHz, audioRendersFilesList.frequencyHz) &&
        Objects.equals(this.kbitsSecond, audioRendersFilesList.kbitsSecond) &&
        Objects.equals(this.sizeBytes, audioRendersFilesList.sizeBytes) &&
        Objects.equals(this.tracks, audioRendersFilesList.tracks)&&
        Objects.equals(this.additionalProperties, audioRendersFilesList.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bitsSample, contentType, downloadUrl, filename, frequencyHz, kbitsSecond, sizeBytes, tracks, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudioRendersFilesList {\n");
    sb.append("    bitsSample: ").append(toIndentedString(bitsSample)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    frequencyHz: ").append(toIndentedString(frequencyHz)).append("\n");
    sb.append("    kbitsSecond: ").append(toIndentedString(kbitsSecond)).append("\n");
    sb.append("    sizeBytes: ").append(toIndentedString(sizeBytes)).append("\n");
    sb.append("    tracks: ").append(toIndentedString(tracks)).append("\n");
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
    openapiFields.add("bits_sample");
    openapiFields.add("content_type");
    openapiFields.add("download_url");
    openapiFields.add("filename");
    openapiFields.add("frequency_hz");
    openapiFields.add("kbits_second");
    openapiFields.add("size_bytes");
    openapiFields.add("tracks");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("bits_sample");
    openapiRequiredFields.add("content_type");
    openapiRequiredFields.add("download_url");
    openapiRequiredFields.add("filename");
    openapiRequiredFields.add("frequency_hz");
    openapiRequiredFields.add("kbits_second");
    openapiRequiredFields.add("size_bytes");
    openapiRequiredFields.add("tracks");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AudioRendersFilesList
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AudioRendersFilesList.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AudioRendersFilesList is not found in the empty JSON string", AudioRendersFilesList.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AudioRendersFilesList.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("content_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content_type").toString()));
      }
      if (!jsonObj.get("download_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `download_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("download_url").toString()));
      }
      if (!jsonObj.get("filename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filename").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("tracks") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("tracks").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tracks` to be an array in the JSON string but got `%s`", jsonObj.get("tracks").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AudioRendersFilesList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AudioRendersFilesList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AudioRendersFilesList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AudioRendersFilesList.class));

       return (TypeAdapter<T>) new TypeAdapter<AudioRendersFilesList>() {
           @Override
           public void write(JsonWriter out, AudioRendersFilesList value) throws IOException {
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
           public AudioRendersFilesList read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AudioRendersFilesList instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AudioRendersFilesList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AudioRendersFilesList
  * @throws IOException if the JSON string is invalid with respect to AudioRendersFilesList
  */
  public static AudioRendersFilesList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AudioRendersFilesList.class);
  }

 /**
  * Convert an instance of AudioRendersFilesList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

