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
import com.konfigthis.client.model.CollectionItem;
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
 * Metadata about a collection of assets
 */
@ApiModel(description = "Metadata about a collection of assets")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Collection {
  public static final String SERIALIZED_NAME_COVER_ITEM = "cover_item";
  @SerializedName(SERIALIZED_NAME_COVER_ITEM)
  private CollectionItem coverItem;

  public static final String SERIALIZED_NAME_CREATED_TIME = "created_time";
  @SerializedName(SERIALIZED_NAME_CREATED_TIME)
  private OffsetDateTime createdTime;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ITEMS_UPDATED_TIME = "items_updated_time";
  @SerializedName(SERIALIZED_NAME_ITEMS_UPDATED_TIME)
  private OffsetDateTime itemsUpdatedTime;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SHARE_CODE = "share_code";
  @SerializedName(SERIALIZED_NAME_SHARE_CODE)
  private String shareCode;

  public static final String SERIALIZED_NAME_SHARE_URL = "share_url";
  @SerializedName(SERIALIZED_NAME_SHARE_URL)
  private String shareUrl;

  public static final String SERIALIZED_NAME_TOTAL_ITEM_COUNT = "total_item_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_ITEM_COUNT)
  private Integer totalItemCount;

  public static final String SERIALIZED_NAME_UPDATED_TIME = "updated_time";
  @SerializedName(SERIALIZED_NAME_UPDATED_TIME)
  private OffsetDateTime updatedTime;

  public Collection() {
  }

  public Collection coverItem(CollectionItem coverItem) {
    
    
    
    
    this.coverItem = coverItem;
    return this;
  }

   /**
   * Get coverItem
   * @return coverItem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CollectionItem getCoverItem() {
    return coverItem;
  }


  public void setCoverItem(CollectionItem coverItem) {
    
    
    
    this.coverItem = coverItem;
  }


  public Collection createdTime(OffsetDateTime createdTime) {
    
    
    
    
    this.createdTime = createdTime;
    return this;
  }

   /**
   * When the collection was created
   * @return createdTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the collection was created")

  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }


  public void setCreatedTime(OffsetDateTime createdTime) {
    
    
    
    this.createdTime = createdTime;
  }


  public Collection id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The collection ID
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "293542904", required = true, value = "The collection ID")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public Collection itemsUpdatedTime(OffsetDateTime itemsUpdatedTime) {
    
    
    
    
    this.itemsUpdatedTime = itemsUpdatedTime;
    return this;
  }

   /**
   * The last time this collection&#39;s items were updated
   * @return itemsUpdatedTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-05-20T20:15:22Z", value = "The last time this collection's items were updated")

  public OffsetDateTime getItemsUpdatedTime() {
    return itemsUpdatedTime;
  }


  public void setItemsUpdatedTime(OffsetDateTime itemsUpdatedTime) {
    
    
    
    this.itemsUpdatedTime = itemsUpdatedTime;
  }


  public Collection name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the collection
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "My collection", required = true, value = "The name of the collection")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public Collection shareCode(String shareCode) {
    
    
    
    
    this.shareCode = shareCode;
    return this;
  }

   /**
   * A code that can be used to share the collection (optional)
   * @return shareCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A code that can be used to share the collection (optional)")

  public String getShareCode() {
    return shareCode;
  }


  public void setShareCode(String shareCode) {
    
    
    
    this.shareCode = shareCode;
  }


  public Collection shareUrl(String shareUrl) {
    
    
    
    
    this.shareUrl = shareUrl;
    return this;
  }

   /**
   * The browser URL that can be used to share the collection (optional)
   * @return shareUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The browser URL that can be used to share the collection (optional)")

  public String getShareUrl() {
    return shareUrl;
  }


  public void setShareUrl(String shareUrl) {
    
    
    
    this.shareUrl = shareUrl;
  }


  public Collection totalItemCount(Integer totalItemCount) {
    
    
    
    
    this.totalItemCount = totalItemCount;
    return this;
  }

   /**
   * The number of items in the collection
   * @return totalItemCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "85", required = true, value = "The number of items in the collection")

  public Integer getTotalItemCount() {
    return totalItemCount;
  }


  public void setTotalItemCount(Integer totalItemCount) {
    
    
    
    this.totalItemCount = totalItemCount;
  }


  public Collection updatedTime(OffsetDateTime updatedTime) {
    
    
    
    
    this.updatedTime = updatedTime;
    return this;
  }

   /**
   * The last time the collection was update (other than changes to the items in it)
   * @return updatedTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last time the collection was update (other than changes to the items in it)")

  public OffsetDateTime getUpdatedTime() {
    return updatedTime;
  }


  public void setUpdatedTime(OffsetDateTime updatedTime) {
    
    
    
    this.updatedTime = updatedTime;
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
   * @return the Collection instance itself
   */
  public Collection putAdditionalProperty(String key, Object value) {
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
    Collection collection = (Collection) o;
    return Objects.equals(this.coverItem, collection.coverItem) &&
        Objects.equals(this.createdTime, collection.createdTime) &&
        Objects.equals(this.id, collection.id) &&
        Objects.equals(this.itemsUpdatedTime, collection.itemsUpdatedTime) &&
        Objects.equals(this.name, collection.name) &&
        Objects.equals(this.shareCode, collection.shareCode) &&
        Objects.equals(this.shareUrl, collection.shareUrl) &&
        Objects.equals(this.totalItemCount, collection.totalItemCount) &&
        Objects.equals(this.updatedTime, collection.updatedTime)&&
        Objects.equals(this.additionalProperties, collection.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverItem, createdTime, id, itemsUpdatedTime, name, shareCode, shareUrl, totalItemCount, updatedTime, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Collection {\n");
    sb.append("    coverItem: ").append(toIndentedString(coverItem)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    itemsUpdatedTime: ").append(toIndentedString(itemsUpdatedTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shareCode: ").append(toIndentedString(shareCode)).append("\n");
    sb.append("    shareUrl: ").append(toIndentedString(shareUrl)).append("\n");
    sb.append("    totalItemCount: ").append(toIndentedString(totalItemCount)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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
    openapiFields.add("cover_item");
    openapiFields.add("created_time");
    openapiFields.add("id");
    openapiFields.add("items_updated_time");
    openapiFields.add("name");
    openapiFields.add("share_code");
    openapiFields.add("share_url");
    openapiFields.add("total_item_count");
    openapiFields.add("updated_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("total_item_count");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Collection
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Collection.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Collection is not found in the empty JSON string", Collection.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Collection.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `cover_item`
      if (jsonObj.get("cover_item") != null && !jsonObj.get("cover_item").isJsonNull()) {
        CollectionItem.validateJsonObject(jsonObj.getAsJsonObject("cover_item"));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("share_code") != null && !jsonObj.get("share_code").isJsonNull()) && !jsonObj.get("share_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `share_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("share_code").toString()));
      }
      if ((jsonObj.get("share_url") != null && !jsonObj.get("share_url").isJsonNull()) && !jsonObj.get("share_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `share_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("share_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Collection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Collection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Collection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Collection.class));

       return (TypeAdapter<T>) new TypeAdapter<Collection>() {
           @Override
           public void write(JsonWriter out, Collection value) throws IOException {
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
           public Collection read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Collection instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Collection given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Collection
  * @throws IOException if the JSON string is invalid with respect to Collection
  */
  public static Collection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Collection.class);
  }

 /**
  * Convert an instance of Collection to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

