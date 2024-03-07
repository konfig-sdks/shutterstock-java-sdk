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
import com.konfigthis.client.model.Category;
import com.konfigthis.client.model.Contributor;
import com.konfigthis.client.model.ImageAssets;
import com.konfigthis.client.model.ImageInsights;
import com.konfigthis.client.model.Model;
import com.konfigthis.client.model.ModelRelease;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.time.LocalDate;
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
 * Information about an image
 */
@ApiModel(description = "Information about an image")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Image {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ADDED_DATE = "added_date";
  @SerializedName(SERIALIZED_NAME_ADDED_DATE)
  private LocalDate addedDate;

  public static final String SERIALIZED_NAME_AFFILIATE_URL = "affiliate_url";
  @SerializedName(SERIALIZED_NAME_AFFILIATE_URL)
  private URI affiliateUrl;

  public static final String SERIALIZED_NAME_ASPECT = "aspect";
  @SerializedName(SERIALIZED_NAME_ASPECT)
  private Double aspect;

  public static final String SERIALIZED_NAME_ASSETS = "assets";
  @SerializedName(SERIALIZED_NAME_ASSETS)
  private ImageAssets assets;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<Category> categories = null;

  public static final String SERIALIZED_NAME_CONTRIBUTOR = "contributor";
  @SerializedName(SERIALIZED_NAME_CONTRIBUTOR)
  private Contributor contributor;

  public static final String SERIALIZED_NAME_HAS_MODEL_RELEASE = "has_model_release";
  @SerializedName(SERIALIZED_NAME_HAS_MODEL_RELEASE)
  private Boolean hasModelRelease;

  public static final String SERIALIZED_NAME_HAS_PROPERTY_RELEASE = "has_property_release";
  @SerializedName(SERIALIZED_NAME_HAS_PROPERTY_RELEASE)
  private Boolean hasPropertyRelease;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IMAGE_TYPE = "image_type";
  @SerializedName(SERIALIZED_NAME_IMAGE_TYPE)
  private String imageType;

  public static final String SERIALIZED_NAME_INSIGHTS = "insights";
  @SerializedName(SERIALIZED_NAME_INSIGHTS)
  private ImageInsights insights;

  public static final String SERIALIZED_NAME_IS_ADULT = "is_adult";
  @SerializedName(SERIALIZED_NAME_IS_ADULT)
  private Boolean isAdult;

  public static final String SERIALIZED_NAME_IS_EDITORIAL = "is_editorial";
  @SerializedName(SERIALIZED_NAME_IS_EDITORIAL)
  private Boolean isEditorial;

  public static final String SERIALIZED_NAME_IS_ILLUSTRATION = "is_illustration";
  @SerializedName(SERIALIZED_NAME_IS_ILLUSTRATION)
  private Boolean isIllustration;

  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private List<String> keywords = null;

  public static final String SERIALIZED_NAME_MEDIA_TYPE = "media_type";
  @SerializedName(SERIALIZED_NAME_MEDIA_TYPE)
  private String mediaType;

  public static final String SERIALIZED_NAME_MODEL_RELEASES = "model_releases";
  @SerializedName(SERIALIZED_NAME_MODEL_RELEASES)
  private List<ModelRelease> modelReleases = null;

  public static final String SERIALIZED_NAME_MODELS = "models";
  @SerializedName(SERIALIZED_NAME_MODELS)
  private List<Model> models = null;

  public static final String SERIALIZED_NAME_RELEASES = "releases";
  @SerializedName(SERIALIZED_NAME_RELEASES)
  private List<String> releases = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public Image() {
  }

  public Image description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Detailed description of the image
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "cropped image of woman gardening", value = "Detailed description of the image")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public Image addedDate(LocalDate addedDate) {
    
    
    
    
    this.addedDate = addedDate;
    return this;
  }

   /**
   * Date that the image was added by the contributor
   * @return addedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date that the image was added by the contributor")

  public LocalDate getAddedDate() {
    return addedDate;
  }


  public void setAddedDate(LocalDate addedDate) {
    
    
    
    this.addedDate = addedDate;
  }


  public Image affiliateUrl(URI affiliateUrl) {
    
    
    
    
    this.affiliateUrl = affiliateUrl;
    return this;
  }

   /**
   * Affiliate referral link; appears only for registered affiliate partners
   * @return affiliateUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Affiliate referral link; appears only for registered affiliate partners")

  public URI getAffiliateUrl() {
    return affiliateUrl;
  }


  public void setAffiliateUrl(URI affiliateUrl) {
    
    
    
    this.affiliateUrl = affiliateUrl;
  }


  public Image aspect(Double aspect) {
    
    
    
    
    this.aspect = aspect;
    return this;
  }

  public Image aspect(Integer aspect) {
    
    
    
    
    this.aspect = aspect.doubleValue();
    return this;
  }

   /**
   * Aspect ratio of the image in decimal format, such as 0.6667
   * @return aspect
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.5", value = "Aspect ratio of the image in decimal format, such as 0.6667")

  public Double getAspect() {
    return aspect;
  }


  public void setAspect(Double aspect) {
    
    
    
    this.aspect = aspect;
  }


  public Image assets(ImageAssets assets) {
    
    
    
    
    this.assets = assets;
    return this;
  }

   /**
   * Get assets
   * @return assets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ImageAssets getAssets() {
    return assets;
  }


  public void setAssets(ImageAssets assets) {
    
    
    
    this.assets = assets;
  }


  public Image categories(List<Category> categories) {
    
    
    
    
    this.categories = categories;
    return this;
  }

  public Image addCategoriesItem(Category categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Categories that this image is a part of
   * @return categories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Categories that this image is a part of")

  public List<Category> getCategories() {
    return categories;
  }


  public void setCategories(List<Category> categories) {
    
    
    
    this.categories = categories;
  }


  public Image contributor(Contributor contributor) {
    
    
    
    
    this.contributor = contributor;
    return this;
  }

   /**
   * Get contributor
   * @return contributor
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Contributor getContributor() {
    return contributor;
  }


  public void setContributor(Contributor contributor) {
    
    
    
    this.contributor = contributor;
  }


  public Image hasModelRelease(Boolean hasModelRelease) {
    
    
    
    
    this.hasModelRelease = hasModelRelease;
    return this;
  }

   /**
   * Indicates whether there are model releases for the image
   * @return hasModelRelease
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates whether there are model releases for the image")

  public Boolean getHasModelRelease() {
    return hasModelRelease;
  }


  public void setHasModelRelease(Boolean hasModelRelease) {
    
    
    
    this.hasModelRelease = hasModelRelease;
  }


  public Image hasPropertyRelease(Boolean hasPropertyRelease) {
    
    
    
    
    this.hasPropertyRelease = hasPropertyRelease;
    return this;
  }

   /**
   * Indicates whether there are property releases for the image
   * @return hasPropertyRelease
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether there are property releases for the image")

  public Boolean getHasPropertyRelease() {
    return hasPropertyRelease;
  }


  public void setHasPropertyRelease(Boolean hasPropertyRelease) {
    
    
    
    this.hasPropertyRelease = hasPropertyRelease;
  }


  public Image id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Image ID
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1572478477X", required = true, value = "Image ID")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public Image imageType(String imageType) {
    
    
    
    
    this.imageType = imageType;
    return this;
  }

   /**
   * Type of image
   * @return imageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "photo", value = "Type of image")

  public String getImageType() {
    return imageType;
  }


  public void setImageType(String imageType) {
    
    
    
    this.imageType = imageType;
  }


  public Image insights(ImageInsights insights) {
    
    
    
    
    this.insights = insights;
    return this;
  }

   /**
   * Get insights
   * @return insights
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ImageInsights getInsights() {
    return insights;
  }


  public void setInsights(ImageInsights insights) {
    
    
    
    this.insights = insights;
  }


  public Image isAdult(Boolean isAdult) {
    
    
    
    
    this.isAdult = isAdult;
    return this;
  }

   /**
   * Whether or not this image contains adult content
   * @return isAdult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not this image contains adult content")

  public Boolean getIsAdult() {
    return isAdult;
  }


  public void setIsAdult(Boolean isAdult) {
    
    
    
    this.isAdult = isAdult;
  }


  public Image isEditorial(Boolean isEditorial) {
    
    
    
    
    this.isEditorial = isEditorial;
    return this;
  }

   /**
   * Whether or not this image is editorial content
   * @return isEditorial
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not this image is editorial content")

  public Boolean getIsEditorial() {
    return isEditorial;
  }


  public void setIsEditorial(Boolean isEditorial) {
    
    
    
    this.isEditorial = isEditorial;
  }


  public Image isIllustration(Boolean isIllustration) {
    
    
    
    
    this.isIllustration = isIllustration;
    return this;
  }

   /**
   * Whether or not this image is an illustration
   * @return isIllustration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not this image is an illustration")

  public Boolean getIsIllustration() {
    return isIllustration;
  }


  public void setIsIllustration(Boolean isIllustration) {
    
    
    
    this.isIllustration = isIllustration;
  }


  public Image keywords(List<String> keywords) {
    
    
    
    
    this.keywords = keywords;
    return this;
  }

  public Image addKeywordsItem(String keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * Keywords associated with the content of this image
   * @return keywords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Keywords associated with the content of this image")

  public List<String> getKeywords() {
    return keywords;
  }


  public void setKeywords(List<String> keywords) {
    
    
    
    this.keywords = keywords;
  }


  public Image mediaType(String mediaType) {
    
    
    
    
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Media type of this image, should always be \&quot;image\&quot;
   * @return mediaType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "image", required = true, value = "Media type of this image, should always be \"image\"")

  public String getMediaType() {
    return mediaType;
  }


  public void setMediaType(String mediaType) {
    
    
    
    this.mediaType = mediaType;
  }


  public Image modelReleases(List<ModelRelease> modelReleases) {
    
    
    
    
    this.modelReleases = modelReleases;
    return this;
  }

  public Image addModelReleasesItem(ModelRelease modelReleasesItem) {
    if (this.modelReleases == null) {
      this.modelReleases = new ArrayList<>();
    }
    this.modelReleases.add(modelReleasesItem);
    return this;
  }

   /**
   * List of model releases
   * @return modelReleases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of model releases")

  public List<ModelRelease> getModelReleases() {
    return modelReleases;
  }


  public void setModelReleases(List<ModelRelease> modelReleases) {
    
    
    
    this.modelReleases = modelReleases;
  }


  public Image models(List<Model> models) {
    
    
    
    
    this.models = models;
    return this;
  }

  public Image addModelsItem(Model modelsItem) {
    if (this.models == null) {
      this.models = new ArrayList<>();
    }
    this.models.add(modelsItem);
    return this;
  }

   /**
   * List of models
   * @return models
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of models")

  public List<Model> getModels() {
    return models;
  }


  public void setModels(List<Model> models) {
    
    
    
    this.models = models;
  }


  public Image releases(List<String> releases) {
    
    
    
    
    this.releases = releases;
    return this;
  }

  public Image addReleasesItem(String releasesItem) {
    if (this.releases == null) {
      this.releases = new ArrayList<>();
    }
    this.releases.add(releasesItem);
    return this;
  }

   /**
   * List of all releases of this image
   * @return releases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of all releases of this image")

  public List<String> getReleases() {
    return releases;
  }


  public void setReleases(List<String> releases) {
    
    
    
    this.releases = releases;
  }


  public Image url(String url) {
    
    
    
    
    this.url = url;
    return this;
  }

   /**
   * Link to image information page; included only for certain accounts
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Link to image information page; included only for certain accounts")

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
   * @return the Image instance itself
   */
  public Image putAdditionalProperty(String key, Object value) {
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
    Image image = (Image) o;
    return Objects.equals(this.description, image.description) &&
        Objects.equals(this.addedDate, image.addedDate) &&
        Objects.equals(this.affiliateUrl, image.affiliateUrl) &&
        Objects.equals(this.aspect, image.aspect) &&
        Objects.equals(this.assets, image.assets) &&
        Objects.equals(this.categories, image.categories) &&
        Objects.equals(this.contributor, image.contributor) &&
        Objects.equals(this.hasModelRelease, image.hasModelRelease) &&
        Objects.equals(this.hasPropertyRelease, image.hasPropertyRelease) &&
        Objects.equals(this.id, image.id) &&
        Objects.equals(this.imageType, image.imageType) &&
        Objects.equals(this.insights, image.insights) &&
        Objects.equals(this.isAdult, image.isAdult) &&
        Objects.equals(this.isEditorial, image.isEditorial) &&
        Objects.equals(this.isIllustration, image.isIllustration) &&
        Objects.equals(this.keywords, image.keywords) &&
        Objects.equals(this.mediaType, image.mediaType) &&
        Objects.equals(this.modelReleases, image.modelReleases) &&
        Objects.equals(this.models, image.models) &&
        Objects.equals(this.releases, image.releases) &&
        Objects.equals(this.url, image.url)&&
        Objects.equals(this.additionalProperties, image.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, addedDate, affiliateUrl, aspect, assets, categories, contributor, hasModelRelease, hasPropertyRelease, id, imageType, insights, isAdult, isEditorial, isIllustration, keywords, mediaType, modelReleases, models, releases, url, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Image {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    addedDate: ").append(toIndentedString(addedDate)).append("\n");
    sb.append("    affiliateUrl: ").append(toIndentedString(affiliateUrl)).append("\n");
    sb.append("    aspect: ").append(toIndentedString(aspect)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    contributor: ").append(toIndentedString(contributor)).append("\n");
    sb.append("    hasModelRelease: ").append(toIndentedString(hasModelRelease)).append("\n");
    sb.append("    hasPropertyRelease: ").append(toIndentedString(hasPropertyRelease)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
    sb.append("    insights: ").append(toIndentedString(insights)).append("\n");
    sb.append("    isAdult: ").append(toIndentedString(isAdult)).append("\n");
    sb.append("    isEditorial: ").append(toIndentedString(isEditorial)).append("\n");
    sb.append("    isIllustration: ").append(toIndentedString(isIllustration)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    modelReleases: ").append(toIndentedString(modelReleases)).append("\n");
    sb.append("    models: ").append(toIndentedString(models)).append("\n");
    sb.append("    releases: ").append(toIndentedString(releases)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("added_date");
    openapiFields.add("affiliate_url");
    openapiFields.add("aspect");
    openapiFields.add("assets");
    openapiFields.add("categories");
    openapiFields.add("contributor");
    openapiFields.add("has_model_release");
    openapiFields.add("has_property_release");
    openapiFields.add("id");
    openapiFields.add("image_type");
    openapiFields.add("insights");
    openapiFields.add("is_adult");
    openapiFields.add("is_editorial");
    openapiFields.add("is_illustration");
    openapiFields.add("keywords");
    openapiFields.add("media_type");
    openapiFields.add("model_releases");
    openapiFields.add("models");
    openapiFields.add("releases");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("contributor");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("media_type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Image
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Image.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Image is not found in the empty JSON string", Image.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Image.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("affiliate_url") != null && !jsonObj.get("affiliate_url").isJsonNull()) && !jsonObj.get("affiliate_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `affiliate_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("affiliate_url").toString()));
      }
      // validate the optional field `assets`
      if (jsonObj.get("assets") != null && !jsonObj.get("assets").isJsonNull()) {
        ImageAssets.validateJsonObject(jsonObj.getAsJsonObject("assets"));
      }
      if (jsonObj.get("categories") != null && !jsonObj.get("categories").isJsonNull()) {
        JsonArray jsonArraycategories = jsonObj.getAsJsonArray("categories");
        if (jsonArraycategories != null) {
          // ensure the json data is an array
          if (!jsonObj.get("categories").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `categories` to be an array in the JSON string but got `%s`", jsonObj.get("categories").toString()));
          }

          // validate the optional field `categories` (array)
          for (int i = 0; i < jsonArraycategories.size(); i++) {
            Category.validateJsonObject(jsonArraycategories.get(i).getAsJsonObject());
          };
        }
      }
      // validate the required field `contributor`
      Contributor.validateJsonObject(jsonObj.getAsJsonObject("contributor"));
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("image_type") != null && !jsonObj.get("image_type").isJsonNull()) && !jsonObj.get("image_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image_type").toString()));
      }
      // validate the optional field `insights`
      if (jsonObj.get("insights") != null && !jsonObj.get("insights").isJsonNull()) {
        ImageInsights.validateJsonObject(jsonObj.getAsJsonObject("insights"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("keywords") != null && !jsonObj.get("keywords").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `keywords` to be an array in the JSON string but got `%s`", jsonObj.get("keywords").toString()));
      }
      if (!jsonObj.get("media_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `media_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("media_type").toString()));
      }
      if (jsonObj.get("model_releases") != null && !jsonObj.get("model_releases").isJsonNull()) {
        JsonArray jsonArraymodelReleases = jsonObj.getAsJsonArray("model_releases");
        if (jsonArraymodelReleases != null) {
          // ensure the json data is an array
          if (!jsonObj.get("model_releases").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `model_releases` to be an array in the JSON string but got `%s`", jsonObj.get("model_releases").toString()));
          }

          // validate the optional field `model_releases` (array)
          for (int i = 0; i < jsonArraymodelReleases.size(); i++) {
            ModelRelease.validateJsonObject(jsonArraymodelReleases.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("models") != null && !jsonObj.get("models").isJsonNull()) {
        JsonArray jsonArraymodels = jsonObj.getAsJsonArray("models");
        if (jsonArraymodels != null) {
          // ensure the json data is an array
          if (!jsonObj.get("models").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `models` to be an array in the JSON string but got `%s`", jsonObj.get("models").toString()));
          }

          // validate the optional field `models` (array)
          for (int i = 0; i < jsonArraymodels.size(); i++) {
            Model.validateJsonObject(jsonArraymodels.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("releases") != null && !jsonObj.get("releases").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `releases` to be an array in the JSON string but got `%s`", jsonObj.get("releases").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Image.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Image' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Image> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Image.class));

       return (TypeAdapter<T>) new TypeAdapter<Image>() {
           @Override
           public void write(JsonWriter out, Image value) throws IOException {
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
           public Image read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Image instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Image given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Image
  * @throws IOException if the JSON string is invalid with respect to Image
  */
  public static Image fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Image.class);
  }

 /**
  * Convert an instance of Image to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

