# ImagesApi

All URIs are relative to *https://api.shutterstock.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addToCollectionItems**](ImagesApi.md#addToCollectionItems) | **POST** /v2/images/collections/{id}/items | Add images to collections |
| [**createCollection**](ImagesApi.md#createCollection) | **POST** /v2/images/collections | Create image collections |
| [**deleteCollection**](ImagesApi.md#deleteCollection) | **DELETE** /v2/images/collections/{id} | Delete image collections |
| [**extractKeywordsFromText**](ImagesApi.md#extractKeywordsFromText) | **POST** /v2/images/search/suggestions | Get keywords from text |
| [**featuredCollectionDetails**](ImagesApi.md#featuredCollectionDetails) | **GET** /v2/images/collections/featured/{id} | Get the details of featured image collections |
| [**getCollectionDetails**](ImagesApi.md#getCollectionDetails) | **GET** /v2/images/collections/{id} | Get the details of image collections |
| [**getCollectionItems**](ImagesApi.md#getCollectionItems) | **GET** /v2/images/collections/featured/{id}/items | Get the contents of featured image collections |
| [**getCollectionItems_0**](ImagesApi.md#getCollectionItems_0) | **GET** /v2/images/collections/{id}/items | Get the contents of image collections |
| [**getDetails**](ImagesApi.md#getDetails) | **GET** /v2/images/{id} | Get details about images |
| [**getSearchSuggestions**](ImagesApi.md#getSearchSuggestions) | **GET** /v2/images/search/suggestions | Get suggestions for a search term |
| [**licenseImagesForMultiple**](ImagesApi.md#licenseImagesForMultiple) | **POST** /v2/images/licenses | License images |
| [**listCategories**](ImagesApi.md#listCategories) | **GET** /v2/images/categories | List image categories |
| [**listCollections**](ImagesApi.md#listCollections) | **GET** /v2/images/collections | List image collections |
| [**listFeaturedCollections**](ImagesApi.md#listFeaturedCollections) | **GET** /v2/images/collections/featured | List featured image collections |
| [**listInfo**](ImagesApi.md#listInfo) | **GET** /v2/images | List images |
| [**listLicenses**](ImagesApi.md#listLicenses) | **GET** /v2/images/licenses | List image licenses |
| [**listRecommendedImages**](ImagesApi.md#listRecommendedImages) | **GET** /v2/images/recommendations | List recommended images |
| [**listSimilarImages**](ImagesApi.md#listSimilarImages) | **GET** /v2/images/{id}/similar | List similar images |
| [**listUpdatedContent**](ImagesApi.md#listUpdatedContent) | **GET** /v2/images/updated | List updated images |
| [**redownloadLicense**](ImagesApi.md#redownloadLicense) | **POST** /v2/images/licenses/{id}/downloads | Download images |
| [**removeFromCollection**](ImagesApi.md#removeFromCollection) | **DELETE** /v2/images/collections/{id}/items | Remove images from collections |
| [**renameCollection**](ImagesApi.md#renameCollection) | **POST** /v2/images/collections/{id} | Rename image collections |
| [**runMultipleSearches**](ImagesApi.md#runMultipleSearches) | **POST** /v2/bulk_search/images | Run multiple image searches |
| [**searchImages**](ImagesApi.md#searchImages) | **GET** /v2/images/search | Search for images |


<a name="addToCollectionItems"></a>
# **addToCollectionItems**
> addToCollectionItems(id, collectionItemRequest).execute();

Add images to collections

This endpoint adds one or more images to a collection by image IDs.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shutterstock.com";
    
    // Configure OAuth2 access token for authorization: customer_accessCode
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Shutterstock client = new Shutterstock(configuration);
    List<CollectionItem> items = Arrays.asList(); // List of items
    String id = "126351027"; // Collection ID
    try {
      client
              .images
              .addToCollectionItems(items, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#addToCollectionItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .images
              .addToCollectionItems(items, id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#addToCollectionItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Collection ID | |
| **collectionItemRequest** | [**CollectionItemRequest**](CollectionItemRequest.md)| Array of image IDs to add to the collection | |

### Return type

null (empty response body)

### Authorization

[customer_accessCode](../README.md#customer_accessCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully added collection items |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Collection not found |  -  |

<a name="createCollection"></a>
# **createCollection**
> CollectionCreateResponse createCollection(collectionCreateRequest).execute();

Create image collections

This endpoint creates one or more image collections (lightboxes). To add images to the collections, use &#x60;POST /v2/images/collections/{id}/items&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shutterstock.com";
    
    // Configure OAuth2 access token for authorization: customer_accessCode
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Shutterstock client = new Shutterstock(configuration);
    String name = "name_example"; // The name of the collection
    try {
      CollectionCreateResponse result = client
              .images
              .createCollection(name)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#createCollection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CollectionCreateResponse> response = client
              .images
              .createCollection(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#createCollection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **collectionCreateRequest** | [**CollectionCreateRequest**](CollectionCreateRequest.md)| The names of the new collections | |

### Return type

[**CollectionCreateResponse**](CollectionCreateResponse.md)

### Authorization

[customer_accessCode](../README.md#customer_accessCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully created image collection |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="deleteCollection"></a>
# **deleteCollection**
> deleteCollection(id).execute();

Delete image collections

This endpoint deletes an image collection.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shutterstock.com";
    
    // Configure OAuth2 access token for authorization: customer_accessCode
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Shutterstock client = new Shutterstock(configuration);
    String id = "136351027"; // Collection ID
    try {
      client
              .images
              .deleteCollection(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#deleteCollection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .images
              .deleteCollection(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#deleteCollection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Collection ID | |

### Return type

null (empty response body)

### Authorization

[customer_accessCode](../README.md#customer_accessCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully deleted collection |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Collection not found |  -  |

<a name="extractKeywordsFromText"></a>
# **extractKeywordsFromText**
> SearchEntitiesResponse extractKeywordsFromText(searchEntitiesRequest).execute();

Get keywords from text

This endpoint returns up to 10 important keywords from a block of plain text.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shutterstock.com";
    
    // Configure HTTP basic authorization: basic
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    
    // Configure OAuth2 access token for authorization: customer_accessCode
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Shutterstock client = new Shutterstock(configuration);
    String text = "text_example"; // Plain text to extract keywords from
    try {
      SearchEntitiesResponse result = client
              .images
              .extractKeywordsFromText(text)
              .execute();
      System.out.println(result);
      System.out.println(result.getKeywords());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#extractKeywordsFromText");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SearchEntitiesResponse> response = client
              .images
              .extractKeywordsFromText(text)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#extractKeywordsFromText");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **searchEntitiesRequest** | [**SearchEntitiesRequest**](SearchEntitiesRequest.md)| Plain text to extract keywords from | |

### Return type

[**SearchEntitiesResponse**](SearchEntitiesResponse.md)

### Authorization

[basic](../README.md#basic), [customer_accessCode](../README.md#customer_accessCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="featuredCollectionDetails"></a>
# **featuredCollectionDetails**
> FeaturedCollection featuredCollectionDetails(id).embed(embed).assetHint(assetHint).execute();

Get the details of featured image collections

This endpoint gets more detailed information about a featured collection, including its cover image and timestamps for its creation and most recent update. To get the images, use &#x60;GET /v2/images/collections/featured/{id}/items&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shutterstock.com";
    
    // Configure HTTP basic authorization: basic
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    
    // Configure OAuth2 access token for authorization: customer_accessCode
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Shutterstock client = new Shutterstock(configuration);
    String id = "136351027"; // Collection ID
    String embed = "share_url"; // Which sharing information to include in the response, such as a URL to the collection
    String assetHint = "1x"; // Cover image size
    try {
      FeaturedCollection result = client
              .images
              .featuredCollectionDetails(id)
              .embed(embed)
              .assetHint(assetHint)
              .execute();
      System.out.println(result);
      System.out.println(result.getCoverItem());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getHeroItem());
      System.out.println(result.getId());
      System.out.println(result.getItemsUpdatedTime());
      System.out.println(result.getName());
      System.out.println(result.getShareUrl());
      System.out.println(result.getTotalItemCount());
      System.out.println(result.getUpdatedTime());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#featuredCollectionDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FeaturedCollection> response = client
              .images
              .featuredCollectionDetails(id)
              .embed(embed)
              .assetHint(assetHint)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#featuredCollectionDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Collection ID | |
| **embed** | **String**| Which sharing information to include in the response, such as a URL to the collection | [optional] [enum: share_url] |
| **assetHint** | **String**| Cover image size | [optional] [default to 1x] [enum: 1x, 2x] |

### Return type

[**FeaturedCollection**](FeaturedCollection.md)

### Authorization

[basic](../README.md#basic), [customer_accessCode](../README.md#customer_accessCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Featured collection not found |  -  |

<a name="getCollectionDetails"></a>
# **getCollectionDetails**
> Collection getCollectionDetails(id).embed(embed).shareCode(shareCode).execute();

Get the details of image collections

This endpoint gets more detailed information about a collection, including its cover image and timestamps for its creation and most recent update. To get the images in collections, use &#x60;GET /v2/images/collections/{id}/items&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shutterstock.com";
    
    // Configure OAuth2 access token for authorization: customer_accessCode
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Shutterstock client = new Shutterstock(configuration);
    String id = "126351027"; // Collection ID
    List<String> embed = Arrays.asList(); // Which sharing information to include in the response, such as a URL to the collection
    String shareCode = "shareCode_example"; // Code to retrieve a shared collection
    try {
      Collection result = client
              .images
              .getCollectionDetails(id)
              .embed(embed)
              .shareCode(shareCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getCoverItem());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getId());
      System.out.println(result.getItemsUpdatedTime());
      System.out.println(result.getName());
      System.out.println(result.getShareCode());
      System.out.println(result.getShareUrl());
      System.out.println(result.getTotalItemCount());
      System.out.println(result.getUpdatedTime());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#getCollectionDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Collection> response = client
              .images
              .getCollectionDetails(id)
              .embed(embed)
              .shareCode(shareCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#getCollectionDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Collection ID | |
| **embed** | [**List&lt;String&gt;**](String.md)| Which sharing information to include in the response, such as a URL to the collection | [optional] [enum: share_code, share_url] |
| **shareCode** | **String**| Code to retrieve a shared collection | [optional] |

### Return type

[**Collection**](Collection.md)

### Authorization

[customer_accessCode](../README.md#customer_accessCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Collection not found |  -  |

<a name="getCollectionItems"></a>
# **getCollectionItems**
> CollectionItemDataList getCollectionItems(id).page(page).perPage(perPage).execute();

Get the contents of featured image collections

This endpoint lists the IDs of images in a featured collection and the date that each was added.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shutterstock.com";
    
    // Configure HTTP basic authorization: basic
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    
    // Configure OAuth2 access token for authorization: customer_accessCode
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Shutterstock client = new Shutterstock(configuration);
    String id = "136351027"; // Collection ID
    Integer page = 1; // Page number
    Integer perPage = 100; // Number of results per page
    try {
      CollectionItemDataList result = client
              .images
              .getCollectionItems(id)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getMessage());
      System.out.println(result.getPage());
      System.out.println(result.getPerPage());
      System.out.println(result.getTotalCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#getCollectionItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CollectionItemDataList> response = client
              .images
              .getCollectionItems(id)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#getCollectionItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Collection ID | |
| **page** | **Integer**| Page number | [optional] [default to 1] |
| **perPage** | **Integer**| Number of results per page | [optional] [default to 100] |

### Return type

[**CollectionItemDataList**](CollectionItemDataList.md)

### Authorization

[basic](../README.md#basic), [customer_accessCode](../README.md#customer_accessCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Featured collection not found |  -  |

<a name="getCollectionItems_0"></a>
# **getCollectionItems_0**
> CollectionItemDataList getCollectionItems_0(id).page(page).perPage(perPage).shareCode(shareCode).sort(sort).execute();

Get the contents of image collections

This endpoint lists the IDs of images in a collection and the date that each was added.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shutterstock.com";
    
    // Configure OAuth2 access token for authorization: customer_accessCode
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Shutterstock client = new Shutterstock(configuration);
    String id = "126351027"; // Collection ID
    Integer page = 1; // Page number
    Integer perPage = 100; // Number of results per page
    String shareCode = "shareCode_example"; // Code to retrieve the contents of a shared collection
    String sort = "newest"; // Sort order
    try {
      CollectionItemDataList result = client
              .images
              .getCollectionItems_0(id)
              .page(page)
              .perPage(perPage)
              .shareCode(shareCode)
              .sort(sort)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getMessage());
      System.out.println(result.getPage());
      System.out.println(result.getPerPage());
      System.out.println(result.getTotalCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#getCollectionItems_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CollectionItemDataList> response = client
              .images
              .getCollectionItems_0(id)
              .page(page)
              .perPage(perPage)
              .shareCode(shareCode)
              .sort(sort)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#getCollectionItems_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Collection ID | |
| **page** | **Integer**| Page number | [optional] [default to 1] |
| **perPage** | **Integer**| Number of results per page | [optional] [default to 100] |
| **shareCode** | **String**| Code to retrieve the contents of a shared collection | [optional] |
| **sort** | **String**| Sort order | [optional] [default to oldest] [enum: newest, oldest] |

### Return type

[**CollectionItemDataList**](CollectionItemDataList.md)

### Authorization

[customer_accessCode](../README.md#customer_accessCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Collection not found |  -  |

<a name="getDetails"></a>
# **getDetails**
> Image getDetails(id).language(language).view(view).searchId(searchId).execute();

Get details about images

This endpoint shows information about an image, including a URL to a preview image and the sizes that it is available in.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shutterstock.com";
    
    // Configure HTTP basic authorization: basic
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    
    // Configure OAuth2 access token for authorization: customer_accessCode
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Shutterstock client = new Shutterstock(configuration);
    String id = "465011609"; // Image ID
    Language language = Language.fromValue("ar"); // Language for the keywords and categories in the response
    String view = "minimal"; // Amount of detail to render in the response
    String searchId = "00000000-0000-0000-0000-000000000000"; // The ID of the search that is related to this request
    try {
      Image result = client
              .images
              .getDetails(id)
              .language(language)
              .view(view)
              .searchId(searchId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getAddedDate());
      System.out.println(result.getAffiliateUrl());
      System.out.println(result.getAspect());
      System.out.println(result.getAssets());
      System.out.println(result.getCategories());
      System.out.println(result.getContributor());
      System.out.println(result.getHasModelRelease());
      System.out.println(result.getHasPropertyRelease());
      System.out.println(result.getId());
      System.out.println(result.getImageType());
      System.out.println(result.getInsights());
      System.out.println(result.getIsAdult());
      System.out.println(result.getIsEditorial());
      System.out.println(result.getIsIllustration());
      System.out.println(result.getKeywords());
      System.out.println(result.getMediaType());
      System.out.println(result.getModelReleases());
      System.out.println(result.getModels());
      System.out.println(result.getReleases());
      System.out.println(result.getUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Image> response = client
              .images
              .getDetails(id)
              .language(language)
              .view(view)
              .searchId(searchId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Image ID | |
| **language** | [**Language**](.md)| Language for the keywords and categories in the response | [optional] [enum: ar, bg, bn, cs, da, de, el, en, es, fi, fr, gu, he, hi, hr, hu, id, it, ja, kn, ko, ml, mr, nb, nl, or, pl, pt, ro, ru, sk, sl, sv, ta, te, th, tr, uk, ur, vi, zh, zh-Hant] |
| **view** | **String**| Amount of detail to render in the response | [optional] [default to full] [enum: minimal, full] |
| **searchId** | **String**| The ID of the search that is related to this request | [optional] |

### Return type

[**Image**](Image.md)

### Authorization

[basic](../README.md#basic), [customer_accessCode](../README.md#customer_accessCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="getSearchSuggestions"></a>
# **getSearchSuggestions**
> Suggestions getSearchSuggestions(query).limit(limit).execute();

Get suggestions for a search term

This endpoint provides autocomplete suggestions for partial search terms.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shutterstock.com";
    
    // Configure HTTP basic authorization: basic
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    
    // Configure OAuth2 access token for authorization: customer_accessCode
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Shutterstock client = new Shutterstock(configuration);
    String query = "cats"; // Search term for which you want keyword suggestions
    Integer limit = 10; // Limit the number of suggestions
    try {
      Suggestions result = client
              .images
              .getSearchSuggestions(query)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#getSearchSuggestions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Suggestions> response = client
              .images
              .getSearchSuggestions(query)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#getSearchSuggestions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **query** | **String**| Search term for which you want keyword suggestions | |
| **limit** | **Integer**| Limit the number of suggestions | [optional] [default to 10] |

### Return type

[**Suggestions**](Suggestions.md)

### Authorization

[basic](../README.md#basic), [customer_accessCode](../README.md#customer_accessCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="licenseImagesForMultiple"></a>
# **licenseImagesForMultiple**
> LicenseImageResultDataList licenseImagesForMultiple(licenseImageRequest).subscriptionId(subscriptionId).format(format).size(size).searchId(searchId).execute();

License images

This endpoint gets licenses for one or more images. You must specify the image IDs in the body parameter and other details like the format, size, and subscription ID either in the query parameter or with each image ID in the body parameter. Values in the body parameter override values in the query parameters. The download links in the response are valid for 8 hours.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shutterstock.com";
    
    // Configure OAuth2 access token for authorization: customer_accessCode
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Shutterstock client = new Shutterstock(configuration);
    List<VLicenseImage> images = Arrays.asList(); // Images to create licenses for
    String subscriptionId = "subscriptionId_example"; // Subscription ID to use to license the image
    String format = "eps"; // (Deprecated) Image format
    String size = "small"; // Image size
    String searchId = "searchId_example"; // Search ID that was provided in the results of an image search
    try {
      LicenseImageResultDataList result = client
              .images
              .licenseImagesForMultiple(images)
              .subscriptionId(subscriptionId)
              .format(format)
              .size(size)
              .searchId(searchId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getMessage());
      System.out.println(result.getPage());
      System.out.println(result.getPerPage());
      System.out.println(result.getTotalCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#licenseImagesForMultiple");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LicenseImageResultDataList> response = client
              .images
              .licenseImagesForMultiple(images)
              .subscriptionId(subscriptionId)
              .format(format)
              .size(size)
              .searchId(searchId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#licenseImagesForMultiple");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **licenseImageRequest** | [**LicenseImageRequest**](LicenseImageRequest.md)| List of images to request licenses for and information about each license transaction; these values override the defaults in the query parameters | |
| **subscriptionId** | **String**| Subscription ID to use to license the image | [optional] |
| **format** | **String**| (Deprecated) Image format | [optional] [enum: eps, jpg] |
| **size** | **String**| Image size | [optional] [default to huge] [enum: small, medium, huge, vector, custom] |
| **searchId** | **String**| Search ID that was provided in the results of an image search | [optional] |

### Return type

[**LicenseImageResultDataList**](LicenseImageResultDataList.md)

### Authorization

[customer_accessCode](../README.md#customer_accessCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="listCategories"></a>
# **listCategories**
> CategoryDataList listCategories().language(language).execute();

List image categories

This endpoint lists the categories (Shutterstock-assigned genres) that images can belong to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shutterstock.com";
    
    // Configure HTTP basic authorization: basic
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    
    // Configure OAuth2 access token for authorization: customer_accessCode
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Shutterstock client = new Shutterstock(configuration);
    Language language = Language.fromValue("ar"); // Language for the keywords and categories in the response
    try {
      CategoryDataList result = client
              .images
              .listCategories()
              .language(language)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getMessage());
      System.out.println(result.getPage());
      System.out.println(result.getPerPage());
      System.out.println(result.getTotalCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#listCategories");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CategoryDataList> response = client
              .images
              .listCategories()
              .language(language)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#listCategories");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **language** | [**Language**](.md)| Language for the keywords and categories in the response | [optional] [enum: ar, bg, bn, cs, da, de, el, en, es, fi, fr, gu, he, hi, hr, hu, id, it, ja, kn, ko, ml, mr, nb, nl, or, pl, pt, ro, ru, sk, sl, sv, ta, te, th, tr, uk, ur, vi, zh, zh-Hant] |

### Return type

[**CategoryDataList**](CategoryDataList.md)

### Authorization

[basic](../README.md#basic), [customer_accessCode](../README.md#customer_accessCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="listCollections"></a>
# **listCollections**
> CollectionDataList listCollections().embed(embed).page(page).perPage(perPage).execute();

List image collections

This endpoint lists your collections of images and their basic attributes.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shutterstock.com";
    
    // Configure OAuth2 access token for authorization: customer_accessCode
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Shutterstock client = new Shutterstock(configuration);
    List<String> embed = Arrays.asList(); // Which sharing information to include in the response, such as a URL to the collection
    Integer page = 1; // Page number
    Integer perPage = 100; // Number of results per page
    try {
      CollectionDataList result = client
              .images
              .listCollections()
              .embed(embed)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getMessage());
      System.out.println(result.getPage());
      System.out.println(result.getPerPage());
      System.out.println(result.getTotalCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#listCollections");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CollectionDataList> response = client
              .images
              .listCollections()
              .embed(embed)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#listCollections");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **embed** | [**List&lt;String&gt;**](String.md)| Which sharing information to include in the response, such as a URL to the collection | [optional] [enum: share_code, share_url] |
| **page** | **Integer**| Page number | [optional] [default to 1] |
| **perPage** | **Integer**| Number of results per page | [optional] [default to 100] |

### Return type

[**CollectionDataList**](CollectionDataList.md)

### Authorization

[customer_accessCode](../README.md#customer_accessCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="listFeaturedCollections"></a>
# **listFeaturedCollections**
> FeaturedCollectionDataList listFeaturedCollections().embed(embed).type(type).assetHint(assetHint).execute();

List featured image collections

This endpoint lists featured collections of specific types and a name and cover image for each collection.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shutterstock.com";
    
    // Configure HTTP basic authorization: basic
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    
    // Configure OAuth2 access token for authorization: customer_accessCode
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Shutterstock client = new Shutterstock(configuration);
    String embed = "share_url"; // Which sharing information to include in the response, such as a URL to the collection
    List<String> type = Arrays.asList(); // The types of collections to return
    String assetHint = "1x"; // Cover image size
    try {
      FeaturedCollectionDataList result = client
              .images
              .listFeaturedCollections()
              .embed(embed)
              .type(type)
              .assetHint(assetHint)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getMessage());
      System.out.println(result.getPage());
      System.out.println(result.getPerPage());
      System.out.println(result.getTotalCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#listFeaturedCollections");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FeaturedCollectionDataList> response = client
              .images
              .listFeaturedCollections()
              .embed(embed)
              .type(type)
              .assetHint(assetHint)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#listFeaturedCollections");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **embed** | **String**| Which sharing information to include in the response, such as a URL to the collection | [optional] [enum: share_url] |
| **type** | [**List&lt;String&gt;**](String.md)| The types of collections to return | [optional] [enum: photo, editorial, vector] |
| **assetHint** | **String**| Cover image size | [optional] [default to 1x] [enum: 1x, 2x] |

### Return type

[**FeaturedCollectionDataList**](FeaturedCollectionDataList.md)

### Authorization

[basic](../README.md#basic), [customer_accessCode](../README.md#customer_accessCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="listInfo"></a>
# **listInfo**
> ImageDataList listInfo(id).view(view).searchId(searchId).execute();

List images

This endpoint lists information about one or more images, including the available sizes.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shutterstock.com";
    
    // Configure HTTP basic authorization: basic
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    
    // Configure OAuth2 access token for authorization: customer_accessCode
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Shutterstock client = new Shutterstock(configuration);
    List<String> id = Arrays.asList(); // One or more image IDs
    String view = "minimal"; // Amount of detail to render in the response
    String searchId = "00000000-0000-0000-0000-000000000000"; // The ID of the search that is related to this request
    try {
      ImageDataList result = client
              .images
              .listInfo(id)
              .view(view)
              .searchId(searchId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getMessage());
      System.out.println(result.getPage());
      System.out.println(result.getPerPage());
      System.out.println(result.getTotalCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#listInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ImageDataList> response = client
              .images
              .listInfo(id)
              .view(view)
              .searchId(searchId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#listInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | [**List&lt;String&gt;**](String.md)| One or more image IDs | |
| **view** | **String**| Amount of detail to render in the response | [optional] [default to minimal] [enum: minimal, full] |
| **searchId** | **String**| The ID of the search that is related to this request | [optional] |

### Return type

[**ImageDataList**](ImageDataList.md)

### Authorization

[basic](../README.md#basic), [customer_accessCode](../README.md#customer_accessCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="listLicenses"></a>
# **listLicenses**
> DownloadHistoryDataList listLicenses().imageId(imageId).license(license).page(page).perPage(perPage).sort(sort).username(username).startDate(startDate).endDate(endDate).downloadAvailability(downloadAvailability).teamHistory(teamHistory).execute();

List image licenses

This endpoint lists existing licenses.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shutterstock.com";
    
    // Configure OAuth2 access token for authorization: customer_accessCode
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Shutterstock client = new Shutterstock(configuration);
    String imageId = "12345678"; // Show licenses for the specified image ID
    String license = "standard"; // Show images that are available with the specified license, such as `standard` or `enhanced`; prepending a `-` sign excludes results from that license
    Integer page = 1; // Page number
    Integer perPage = 20; // Number of results per page
    String sort = "newest"; // Sort order
    String username = "aUniqueUsername"; // Filter licenses by username of licensee
    OffsetDateTime startDate = OffsetDateTime.parse("2021-03-29T13:25:13.521Z"); // Show licenses created on or after the specified date
    OffsetDateTime endDate = OffsetDateTime.parse("2021-03-29T13:25:13.521Z"); // Show licenses created before the specified date
    String downloadAvailability = "all"; // Filter licenses by download availability
    Boolean teamHistory = false; // Set to true to see license history for all members of your team.
    try {
      DownloadHistoryDataList result = client
              .images
              .listLicenses()
              .imageId(imageId)
              .license(license)
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .username(username)
              .startDate(startDate)
              .endDate(endDate)
              .downloadAvailability(downloadAvailability)
              .teamHistory(teamHistory)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getMessage());
      System.out.println(result.getPage());
      System.out.println(result.getPerPage());
      System.out.println(result.getTotalCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#listLicenses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DownloadHistoryDataList> response = client
              .images
              .listLicenses()
              .imageId(imageId)
              .license(license)
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .username(username)
              .startDate(startDate)
              .endDate(endDate)
              .downloadAvailability(downloadAvailability)
              .teamHistory(teamHistory)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#listLicenses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **imageId** | **String**| Show licenses for the specified image ID | [optional] |
| **license** | **String**| Show images that are available with the specified license, such as &#x60;standard&#x60; or &#x60;enhanced&#x60;; prepending a &#x60;-&#x60; sign excludes results from that license | [optional] |
| **page** | **Integer**| Page number | [optional] [default to 1] |
| **perPage** | **Integer**| Number of results per page | [optional] [default to 20] |
| **sort** | **String**| Sort order | [optional] [default to newest] [enum: newest, oldest] |
| **username** | **String**| Filter licenses by username of licensee | [optional] |
| **startDate** | **OffsetDateTime**| Show licenses created on or after the specified date | [optional] |
| **endDate** | **OffsetDateTime**| Show licenses created before the specified date | [optional] |
| **downloadAvailability** | **String**| Filter licenses by download availability | [optional] [default to all] [enum: all, downloadable, non_downloadable] |
| **teamHistory** | **Boolean**| Set to true to see license history for all members of your team. | [optional] [default to false] |

### Return type

[**DownloadHistoryDataList**](DownloadHistoryDataList.md)

### Authorization

[customer_accessCode](../README.md#customer_accessCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="listRecommendedImages"></a>
# **listRecommendedImages**
> RecommendationDataList listRecommendedImages(id).maxItems(maxItems).safe(safe).execute();

List recommended images

This endpoint returns images that customers put in the same collection as the specified image IDs.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shutterstock.com";
    
    // Configure HTTP basic authorization: basic
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    
    // Configure OAuth2 access token for authorization: customer_accessCode
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Shutterstock client = new Shutterstock(configuration);
    List<String> id = Arrays.asList(); // Image IDs
    Integer maxItems = 20; // Maximum number of results returned in the response
    Boolean safe = true; // Restrict results to safe images
    try {
      RecommendationDataList result = client
              .images
              .listRecommendedImages(id)
              .maxItems(maxItems)
              .safe(safe)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getMessage());
      System.out.println(result.getPage());
      System.out.println(result.getPerPage());
      System.out.println(result.getTotalCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#listRecommendedImages");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecommendationDataList> response = client
              .images
              .listRecommendedImages(id)
              .maxItems(maxItems)
              .safe(safe)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#listRecommendedImages");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | [**List&lt;String&gt;**](String.md)| Image IDs | |
| **maxItems** | **Integer**| Maximum number of results returned in the response | [optional] [default to 20] |
| **safe** | **Boolean**| Restrict results to safe images | [optional] [default to true] |

### Return type

[**RecommendationDataList**](RecommendationDataList.md)

### Authorization

[basic](../README.md#basic), [customer_accessCode](../README.md#customer_accessCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="listSimilarImages"></a>
# **listSimilarImages**
> ImageSearchResults listSimilarImages(id).language(language).page(page).perPage(perPage).view(view).execute();

List similar images

This endpoint returns images that are visually similar to an image that you specify.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shutterstock.com";
    
    // Configure HTTP basic authorization: basic
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    
    // Configure OAuth2 access token for authorization: customer_accessCode
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Shutterstock client = new Shutterstock(configuration);
    String id = "465011609"; // Image ID
    Language language = Language.fromValue("ar"); // Language for the keywords and categories in the response
    Integer page = 1; // Page number
    Integer perPage = 20; // Number of results per page
    String view = "minimal"; // Amount of detail to render in the response
    try {
      ImageSearchResults result = client
              .images
              .listSimilarImages(id)
              .language(language)
              .page(page)
              .perPage(perPage)
              .view(view)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getInsights());
      System.out.println(result.getMessage());
      System.out.println(result.getPage());
      System.out.println(result.getPerPage());
      System.out.println(result.getSearchId());
      System.out.println(result.getSpellcheckInfo());
      System.out.println(result.getTotalCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#listSimilarImages");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ImageSearchResults> response = client
              .images
              .listSimilarImages(id)
              .language(language)
              .page(page)
              .perPage(perPage)
              .view(view)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#listSimilarImages");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Image ID | |
| **language** | [**Language**](.md)| Language for the keywords and categories in the response | [optional] [enum: ar, bg, bn, cs, da, de, el, en, es, fi, fr, gu, he, hi, hr, hu, id, it, ja, kn, ko, ml, mr, nb, nl, or, pl, pt, ro, ru, sk, sl, sv, ta, te, th, tr, uk, ur, vi, zh, zh-Hant] |
| **page** | **Integer**| Page number | [optional] [default to 1] |
| **perPage** | **Integer**| Number of results per page | [optional] [default to 20] |
| **view** | **String**| Amount of detail to render in the response | [optional] [default to minimal] [enum: minimal, full] |

### Return type

[**ImageSearchResults**](ImageSearchResults.md)

### Authorization

[basic](../README.md#basic), [customer_accessCode](../README.md#customer_accessCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="listUpdatedContent"></a>
# **listUpdatedContent**
> UpdatedMediaDataList listUpdatedContent().type(type).startDate(startDate).endDate(endDate).interval(interval).page(page).perPage(perPage).sort(sort).execute();

List updated images

This endpoint lists images that have been updated in the specified time period to update content management systems (CMS) or digital asset management (DAM) systems. In most cases, use the &#x60;interval&#x60; parameter to show images that were updated recently, but you can also use the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters to specify a range of no more than three days. Do not use the &#x60;interval&#x60; parameter with either &#x60;start_date&#x60; or &#x60;end_date&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shutterstock.com";
    
    // Configure HTTP basic authorization: basic
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    
    // Configure OAuth2 access token for authorization: customer_accessCode
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Shutterstock client = new Shutterstock(configuration);
    List<String> type = Arrays.asList(); // Show images that were added, deleted, or edited; by default, the endpoint returns images that were updated in any of these ways
    LocalDate startDate = LocalDate.parse("2021-03-29T00:00:00.000Z"); // Show images updated on or after the specified date
    LocalDate endDate = LocalDate.parse("2021-03-29T00:00:00.000Z"); // Show images updated before the specified date
    String interval = "1 HOUR"; // Show images updated in the specified time period, where the time period is an interval (like SQL INTERVAL) such as 1 DAY, 6 HOUR, or 30 MINUTE; the default is 1 HOUR, which shows images that were updated in the hour preceding the request
    Integer page = 1; // Page number
    Integer perPage = 100; // Number of results per page
    String sort = "newest"; // Sort order
    try {
      UpdatedMediaDataList result = client
              .images
              .listUpdatedContent()
              .type(type)
              .startDate(startDate)
              .endDate(endDate)
              .interval(interval)
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getMessage());
      System.out.println(result.getPage());
      System.out.println(result.getPerPage());
      System.out.println(result.getTotalCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#listUpdatedContent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UpdatedMediaDataList> response = client
              .images
              .listUpdatedContent()
              .type(type)
              .startDate(startDate)
              .endDate(endDate)
              .interval(interval)
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#listUpdatedContent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | [**List&lt;String&gt;**](String.md)| Show images that were added, deleted, or edited; by default, the endpoint returns images that were updated in any of these ways | [optional] [enum: addition, deletion, edit] |
| **startDate** | **LocalDate**| Show images updated on or after the specified date | [optional] |
| **endDate** | **LocalDate**| Show images updated before the specified date | [optional] |
| **interval** | **String**| Show images updated in the specified time period, where the time period is an interval (like SQL INTERVAL) such as 1 DAY, 6 HOUR, or 30 MINUTE; the default is 1 HOUR, which shows images that were updated in the hour preceding the request | [optional] [default to 1 HOUR] |
| **page** | **Integer**| Page number | [optional] [default to 1] |
| **perPage** | **Integer**| Number of results per page | [optional] [default to 100] |
| **sort** | **String**| Sort order | [optional] [default to newest] [enum: newest, oldest] |

### Return type

[**UpdatedMediaDataList**](UpdatedMediaDataList.md)

### Authorization

[basic](../README.md#basic), [customer_accessCode](../README.md#customer_accessCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="redownloadLicense"></a>
# **redownloadLicense**
> Url redownloadLicense(id, redownloadImage).execute();

Download images

This endpoint redownloads images that you have already received a license for. The download links in the response are valid for 8 hours.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shutterstock.com";
    
    // Configure OAuth2 access token for authorization: customer_accessCode
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Shutterstock client = new Shutterstock(configuration);
    String id = "e123"; // License ID
    Cookie authCookie = new Cookie();
    Boolean showModal = true; // (Deprecated)
    String size = "small"; // Size of the image
    String verificationCode = "verificationCode_example"; // (Deprecated)
    try {
      Url result = client
              .images
              .redownloadLicense(id)
              .authCookie(authCookie)
              .showModal(showModal)
              .size(size)
              .verificationCode(verificationCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#redownloadLicense");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Url> response = client
              .images
              .redownloadLicense(id)
              .authCookie(authCookie)
              .showModal(showModal)
              .size(size)
              .verificationCode(verificationCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#redownloadLicense");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| License ID | |
| **redownloadImage** | [**RedownloadImage**](RedownloadImage.md)| Information about the images to redownload | |

### Return type

[**Url**](Url.md)

### Authorization

[customer_accessCode](../README.md#customer_accessCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="removeFromCollection"></a>
# **removeFromCollection**
> removeFromCollection(id).itemId(itemId).execute();

Remove images from collections

This endpoint removes one or more images from a collection.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shutterstock.com";
    
    // Configure OAuth2 access token for authorization: customer_accessCode
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Shutterstock client = new Shutterstock(configuration);
    String id = "126351027"; // Collection ID
    List<String> itemId = Arrays.asList(); // One or more image IDs to remove from the collection
    try {
      client
              .images
              .removeFromCollection(id)
              .itemId(itemId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#removeFromCollection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .images
              .removeFromCollection(id)
              .itemId(itemId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#removeFromCollection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Collection ID | |
| **itemId** | [**List&lt;String&gt;**](String.md)| One or more image IDs to remove from the collection | [optional] |

### Return type

null (empty response body)

### Authorization

[customer_accessCode](../README.md#customer_accessCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully removed collection items |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Collection not found |  -  |

<a name="renameCollection"></a>
# **renameCollection**
> renameCollection(id, collectionUpdateRequest).execute();

Rename image collections

This endpoint sets a new name for an image collection.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shutterstock.com";
    
    // Configure OAuth2 access token for authorization: customer_accessCode
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Shutterstock client = new Shutterstock(configuration);
    String name = "name_example"; // The new name of the collection
    String id = "126351027"; // Collection ID
    try {
      client
              .images
              .renameCollection(name, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#renameCollection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .images
              .renameCollection(name, id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#renameCollection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| Collection ID | |
| **collectionUpdateRequest** | [**CollectionUpdateRequest**](CollectionUpdateRequest.md)| The new name for the collection | |

### Return type

null (empty response body)

### Authorization

[customer_accessCode](../README.md#customer_accessCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully updated collection |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Collection not found |  -  |

<a name="runMultipleSearches"></a>
# **runMultipleSearches**
> BulkImageSearchResults runMultipleSearches(searchImage).addedDate(addedDate).addedDateStart(addedDateStart).aspectRatioMin(aspectRatioMin).aspectRatioMax(aspectRatioMax).aspectRatio(aspectRatio).addedDateEnd(addedDateEnd).category(category).color(color).contributor(contributor).contributorCountry(contributorCountry).fields(fields).height(height).heightFrom(heightFrom).heightTo(heightTo).imageType(imageType).keywordSafeSearch(keywordSafeSearch).language(language).license(license).model(model).orientation(orientation).page(page).perPage(perPage).peopleModelReleased(peopleModelReleased).peopleAge(peopleAge).peopleEthnicity(peopleEthnicity).peopleGender(peopleGender).peopleNumber(peopleNumber).region(region).safe(safe).sort(sort).spellcheckQuery(spellcheckQuery).view(view).width(width).widthFrom(widthFrom).widthTo(widthTo).execute();

Run multiple image searches

This endpoint runs up to 5 image searches in a single request and returns up to 20 results per search. You can provide global search parameters in the query parameters and override them for each search in the body parameter. The query and body parameters are the same as in the &#x60;GET /v2/images/search&#x60; endpoint.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shutterstock.com";
    
    // Configure HTTP basic authorization: basic
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    
    // Configure OAuth2 access token for authorization: customer_accessCode
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Shutterstock client = new Shutterstock(configuration);
    LocalDate addedDate = LocalDate.parse("2021-03-29T00:00:00.000Z"); // Show images added on the specified date
    LocalDate addedDateStart = LocalDate.parse("2021-03-29T00:00:00.000Z"); // Show images added on or after the specified date
    Double aspectRatioMin = 1.7778D; // Show images with the specified aspect ratio or higher, using a positive decimal of the width divided by the height, such as 1.7778 for a 16:9 image
    Double aspectRatioMax = 1.7778D; // Show images with the specified aspect ratio or lower, using a positive decimal of the width divided by the height, such as 1.7778 for a 16:9 image
    Double aspectRatio = 1.7778D; // Show images with the specified aspect ratio, using a positive decimal of the width divided by the height, such as 1.7778 for a 16:9 image
    LocalDate addedDateEnd = LocalDate.parse("2021-03-29T00:00:00.000Z"); // Show images added before the specified date
    String category = "category_example"; // Show images with the specified Shutterstock-defined category; specify a category name or ID
    String color = "4F21EA"; // Specify either a hexadecimal color in the format '4F21EA' or 'grayscale'; the API returns images that use similar colors
    List<String> contributor = Arrays.asList(); // Show images with the specified contributor names or IDs, allows multiple
    Object contributorCountry = US; // Show images from contributors in one or more specified countries, or start with NOT to exclude a country from the search
    String fields = "fields_example"; // Fields to display in the response; see the documentation for the fields parameter in the overview section
    Integer height = 56; // (Deprecated; use height_from and height_to instead) Show images with the specified height
    Integer heightFrom = 1080; // Show images with the specified height or larger, in pixels
    Integer heightTo = 1080; // Show images with the specified height or smaller, in pixels
    List<String> imageType = Arrays.asList(); // Show images of the specified type
    Boolean keywordSafeSearch = true; // Hide results with potentially unsafe keywords
    Language language = Language.fromValue("ar"); // Set query and result language (uses Accept-Language header if not set)
    List<String> license = Arrays.asList("commercial"); // Show only images with the specified license
    List<String> model = Arrays.asList(); // Show image results with the specified model IDs
    String orientation = "horizontal"; // Show image results with horizontal or vertical orientation
    Integer page = 1; // Page number
    Integer perPage = 20; // Number of results per page
    Boolean peopleModelReleased = true; // Show images of people with a signed model release
    String peopleAge = "infants"; // Show images that feature people of the specified age category
    List<String> peopleEthnicity = Arrays.asList(); // Show images with people of the specified ethnicities, or start with NOT to show images without those ethnicities
    String peopleGender = "male"; // Show images with people of the specified gender
    Integer peopleNumber = 2; // Show images with the specified number of people
    String region = "US"; // Raise or lower search result rankings based on the result's relevance to a specified region; you can provide a country code or an IP address from which the API infers a country
    Boolean safe = true; // Enable or disable safe search
    String sort = "newest"; // Sort by
    Boolean spellcheckQuery = true; // Spellcheck the search query and return results on suggested spellings
    String view = "minimal"; // Amount of detail to render in the response
    Integer width = 56; // (Deprecated; use width_from and width_to instead) Show images with the specified width
    Integer widthFrom = 1920; // Show images with the specified width or larger, in pixels
    Integer widthTo = 1920; // Show images with the specified width or smaller, in pixels
    try {
      BulkImageSearchResults result = client
              .images
              .runMultipleSearches()
              .addedDate(addedDate)
              .addedDateStart(addedDateStart)
              .aspectRatioMin(aspectRatioMin)
              .aspectRatioMax(aspectRatioMax)
              .aspectRatio(aspectRatio)
              .addedDateEnd(addedDateEnd)
              .category(category)
              .color(color)
              .contributor(contributor)
              .contributorCountry(contributorCountry)
              .fields(fields)
              .height(height)
              .heightFrom(heightFrom)
              .heightTo(heightTo)
              .imageType(imageType)
              .keywordSafeSearch(keywordSafeSearch)
              .language(language)
              .license(license)
              .model(model)
              .orientation(orientation)
              .page(page)
              .perPage(perPage)
              .peopleModelReleased(peopleModelReleased)
              .peopleAge(peopleAge)
              .peopleEthnicity(peopleEthnicity)
              .peopleGender(peopleGender)
              .peopleNumber(peopleNumber)
              .region(region)
              .safe(safe)
              .sort(sort)
              .spellcheckQuery(spellcheckQuery)
              .view(view)
              .width(width)
              .widthFrom(widthFrom)
              .widthTo(widthTo)
              .execute();
      System.out.println(result);
      System.out.println(result.getBulkSearchId());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#runMultipleSearches");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BulkImageSearchResults> response = client
              .images
              .runMultipleSearches()
              .addedDate(addedDate)
              .addedDateStart(addedDateStart)
              .aspectRatioMin(aspectRatioMin)
              .aspectRatioMax(aspectRatioMax)
              .aspectRatio(aspectRatio)
              .addedDateEnd(addedDateEnd)
              .category(category)
              .color(color)
              .contributor(contributor)
              .contributorCountry(contributorCountry)
              .fields(fields)
              .height(height)
              .heightFrom(heightFrom)
              .heightTo(heightTo)
              .imageType(imageType)
              .keywordSafeSearch(keywordSafeSearch)
              .language(language)
              .license(license)
              .model(model)
              .orientation(orientation)
              .page(page)
              .perPage(perPage)
              .peopleModelReleased(peopleModelReleased)
              .peopleAge(peopleAge)
              .peopleEthnicity(peopleEthnicity)
              .peopleGender(peopleGender)
              .peopleNumber(peopleNumber)
              .region(region)
              .safe(safe)
              .sort(sort)
              .spellcheckQuery(spellcheckQuery)
              .view(view)
              .width(width)
              .widthFrom(widthFrom)
              .widthTo(widthTo)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#runMultipleSearches");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **searchImage** | [**List&lt;SearchImage&gt;**](SearchImage.md)| List of queries to request results for and filters to apply per query; these values override the defaults in the query parameters | |
| **addedDate** | **LocalDate**| Show images added on the specified date | [optional] |
| **addedDateStart** | **LocalDate**| Show images added on or after the specified date | [optional] |
| **aspectRatioMin** | **Double**| Show images with the specified aspect ratio or higher, using a positive decimal of the width divided by the height, such as 1.7778 for a 16:9 image | [optional] |
| **aspectRatioMax** | **Double**| Show images with the specified aspect ratio or lower, using a positive decimal of the width divided by the height, such as 1.7778 for a 16:9 image | [optional] |
| **aspectRatio** | **Double**| Show images with the specified aspect ratio, using a positive decimal of the width divided by the height, such as 1.7778 for a 16:9 image | [optional] |
| **addedDateEnd** | **LocalDate**| Show images added before the specified date | [optional] |
| **category** | **String**| Show images with the specified Shutterstock-defined category; specify a category name or ID | [optional] |
| **color** | **String**| Specify either a hexadecimal color in the format &#39;4F21EA&#39; or &#39;grayscale&#39;; the API returns images that use similar colors | [optional] |
| **contributor** | [**List&lt;String&gt;**](String.md)| Show images with the specified contributor names or IDs, allows multiple | [optional] |
| **contributorCountry** | [**Object**](.md)| Show images from contributors in one or more specified countries, or start with NOT to exclude a country from the search | [optional] |
| **fields** | **String**| Fields to display in the response; see the documentation for the fields parameter in the overview section | [optional] |
| **height** | **Integer**| (Deprecated; use height_from and height_to instead) Show images with the specified height | [optional] |
| **heightFrom** | **Integer**| Show images with the specified height or larger, in pixels | [optional] |
| **heightTo** | **Integer**| Show images with the specified height or smaller, in pixels | [optional] |
| **imageType** | [**List&lt;String&gt;**](String.md)| Show images of the specified type | [optional] [enum: photo, illustration, vector] |
| **keywordSafeSearch** | **Boolean**| Hide results with potentially unsafe keywords | [optional] [default to true] |
| **language** | [**Language**](.md)| Set query and result language (uses Accept-Language header if not set) | [optional] [enum: ar, bg, bn, cs, da, de, el, en, es, fi, fr, gu, he, hi, hr, hu, id, it, ja, kn, ko, ml, mr, nb, nl, or, pl, pt, ro, ru, sk, sl, sv, ta, te, th, tr, uk, ur, vi, zh, zh-Hant] |
| **license** | [**List&lt;String&gt;**](String.md)| Show only images with the specified license | [optional] [enum: commercial, editorial, enhanced] |
| **model** | [**List&lt;String&gt;**](String.md)| Show image results with the specified model IDs | [optional] |
| **orientation** | **String**| Show image results with horizontal or vertical orientation | [optional] [enum: horizontal, vertical] |
| **page** | **Integer**| Page number | [optional] [default to 1] |
| **perPage** | **Integer**| Number of results per page | [optional] [default to 20] |
| **peopleModelReleased** | **Boolean**| Show images of people with a signed model release | [optional] |
| **peopleAge** | **String**| Show images that feature people of the specified age category | [optional] [enum: infants, children, teenagers, 20s, 30s, 40s, 50s, 60s, older] |
| **peopleEthnicity** | [**List&lt;String&gt;**](String.md)| Show images with people of the specified ethnicities, or start with NOT to show images without those ethnicities | [optional] [enum: african, african_american, black, brazilian, chinese, caucasian, east_asian, hispanic, japanese, middle_eastern, native_american, pacific_islander, south_asian, southeast_asian, other, NOT african, NOT african_american, NOT black, NOT brazilian, NOT chinese, NOT caucasian, NOT east_asian, NOT hispanic, NOT japanese, NOT middle_eastern, NOT native_american, NOT pacific_islander, NOT south_asian, NOT southeast_asian, NOT other] |
| **peopleGender** | **String**| Show images with people of the specified gender | [optional] [enum: male, female, both] |
| **peopleNumber** | **Integer**| Show images with the specified number of people | [optional] |
| **region** | **String**| Raise or lower search result rankings based on the result&#39;s relevance to a specified region; you can provide a country code or an IP address from which the API infers a country | [optional] |
| **safe** | **Boolean**| Enable or disable safe search | [optional] [default to true] |
| **sort** | **String**| Sort by | [optional] [default to popular] [enum: newest, popular, relevance, random] |
| **spellcheckQuery** | **Boolean**| Spellcheck the search query and return results on suggested spellings | [optional] [default to true] |
| **view** | **String**| Amount of detail to render in the response | [optional] [default to minimal] [enum: minimal, full] |
| **width** | **Integer**| (Deprecated; use width_from and width_to instead) Show images with the specified width | [optional] |
| **widthFrom** | **Integer**| Show images with the specified width or larger, in pixels | [optional] |
| **widthTo** | **Integer**| Show images with the specified width or smaller, in pixels | [optional] |

### Return type

[**BulkImageSearchResults**](BulkImageSearchResults.md)

### Authorization

[basic](../README.md#basic), [customer_accessCode](../README.md#customer_accessCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="searchImages"></a>
# **searchImages**
> ImageSearchResults searchImages().addedDate(addedDate).addedDateStart(addedDateStart).aspectRatioMin(aspectRatioMin).aspectRatioMax(aspectRatioMax).aspectRatio(aspectRatio).aiSearch(aiSearch).aiLabelsLimit(aiLabelsLimit).aiIndustry(aiIndustry).aiObjective(aiObjective).addedDateEnd(addedDateEnd).category(category).color(color).contributor(contributor).contributorCountry(contributorCountry).fields(fields).height(height).heightFrom(heightFrom).heightTo(heightTo).imageType(imageType).keywordSafeSearch(keywordSafeSearch).language(language).license(license).model(model).orientation(orientation).page(page).perPage(perPage).peopleModelReleased(peopleModelReleased).peopleAge(peopleAge).peopleEthnicity(peopleEthnicity).peopleGender(peopleGender).peopleNumber(peopleNumber).query(query).region(region).safe(safe).sort(sort).spellcheckQuery(spellcheckQuery).view(view).width(width).widthFrom(widthFrom).widthTo(widthTo).execute();

Search for images

This endpoint searches for images. If you specify more than one search parameter, the API uses an AND condition. Array parameters can be specified multiple times; in this case, the API uses an AND or an OR condition with those values, depending on the parameter. You can also filter search terms out in the &#x60;query&#x60; parameter by prefixing the term with NOT. Free API accounts show results only from a limited library of media, not the full Shutterstock media library. Also, the number of search fields they can use in a request is limited.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ImagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shutterstock.com";
    
    // Configure HTTP basic authorization: basic
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    
    // Configure OAuth2 access token for authorization: customer_accessCode
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Shutterstock client = new Shutterstock(configuration);
    LocalDate addedDate = LocalDate.parse("2021-03-29T00:00:00.000Z"); // Show images added on the specified date
    LocalDate addedDateStart = LocalDate.parse("2021-03-29T00:00:00.000Z"); // Show images added on or after the specified date
    Double aspectRatioMin = 1.7778D; // Show images with the specified aspect ratio or higher, using a positive decimal of the width divided by the height, such as 1.7778 for a 16:9 image
    Double aspectRatioMax = 1.7778D; // Show images with the specified aspect ratio or lower, using a positive decimal of the width divided by the height, such as 1.7778 for a 16:9 image
    Double aspectRatio = 1.7778D; // Show images with the specified aspect ratio, using a positive decimal of the width divided by the height, such as 1.7778 for a 16:9 image
    Boolean aiSearch = true; // Set to true and specify the `ai_objective` and `ai_industry` parameters to use AI-powered search; the API returns information about how well images meet the objective for the industry 
    Integer aiLabelsLimit = 20; // For AI-powered search, specify the maximum number of labels to return
    String aiIndustry = "automotive"; // For AI-powered search, specify the industry to target; requires that the `ai_search` parameter is set to true
    String aiObjective = "awareness"; // For AI-powered search, specify the goal of the media; requires that the `ai_search` parameter is set to true
    LocalDate addedDateEnd = LocalDate.parse("2021-03-29T00:00:00.000Z"); // Show images added before the specified date
    String category = "category_example"; // Show images with the specified Shutterstock-defined category; specify a category name or ID
    String color = "4F21EA"; // Specify either a hexadecimal color in the format '4F21EA' or 'grayscale'; the API returns images that use similar colors
    List<String> contributor = Arrays.asList(); // Show images with the specified contributor names or IDs, allows multiple
    Object contributorCountry = US; // Show images from contributors in one or more specified countries, or start with NOT to exclude a country from the search
    String fields = "fields_example"; // Fields to display in the response; see the documentation for the fields parameter in the overview section
    Integer height = 56; // (Deprecated; use height_from and height_to instead) Show images with the specified height
    Integer heightFrom = 1080; // Show images with the specified height or larger, in pixels
    Integer heightTo = 1080; // Show images with the specified height or smaller, in pixels
    List<String> imageType = Arrays.asList(); // Show images of the specified type
    Boolean keywordSafeSearch = true; // Hide results with potentially unsafe keywords
    Language language = Language.fromValue("ar"); // Set query and result language (uses Accept-Language header if not set)
    List<String> license = Arrays.asList("commercial"); // Show only images with the specified license
    List<String> model = Arrays.asList(); // Show image results with the specified model IDs
    String orientation = "horizontal"; // Show image results with horizontal or vertical orientation
    Integer page = 1; // Page number
    Integer perPage = 20; // Number of results per page
    Boolean peopleModelReleased = true; // Show images of people with a signed model release
    String peopleAge = "infants"; // Show images that feature people of the specified age category
    List<String> peopleEthnicity = Arrays.asList(); // Show images with people of the specified ethnicities, or start with NOT to show images without those ethnicities
    String peopleGender = "male"; // Show images with people of the specified gender
    Integer peopleNumber = 2; // Show images with the specified number of people
    String query = "dogs on the beach"; // One or more search terms separated by spaces; you can use NOT to filter out images that match a term
    String region = "US"; // Raise or lower search result rankings based on the result's relevance to a specified region; you can provide a country code or an IP address from which the API infers a country
    Boolean safe = true; // Enable or disable safe search
    String sort = "newest"; // Sort by
    Boolean spellcheckQuery = true; // Spellcheck the search query and return results on suggested spellings
    String view = "minimal"; // Amount of detail to render in the response
    Integer width = 56; // (Deprecated; use width_from and width_to instead) Show images with the specified width
    Integer widthFrom = 1920; // Show images with the specified width or larger, in pixels
    Integer widthTo = 1920; // Show images with the specified width or smaller, in pixels
    try {
      ImageSearchResults result = client
              .images
              .searchImages()
              .addedDate(addedDate)
              .addedDateStart(addedDateStart)
              .aspectRatioMin(aspectRatioMin)
              .aspectRatioMax(aspectRatioMax)
              .aspectRatio(aspectRatio)
              .aiSearch(aiSearch)
              .aiLabelsLimit(aiLabelsLimit)
              .aiIndustry(aiIndustry)
              .aiObjective(aiObjective)
              .addedDateEnd(addedDateEnd)
              .category(category)
              .color(color)
              .contributor(contributor)
              .contributorCountry(contributorCountry)
              .fields(fields)
              .height(height)
              .heightFrom(heightFrom)
              .heightTo(heightTo)
              .imageType(imageType)
              .keywordSafeSearch(keywordSafeSearch)
              .language(language)
              .license(license)
              .model(model)
              .orientation(orientation)
              .page(page)
              .perPage(perPage)
              .peopleModelReleased(peopleModelReleased)
              .peopleAge(peopleAge)
              .peopleEthnicity(peopleEthnicity)
              .peopleGender(peopleGender)
              .peopleNumber(peopleNumber)
              .query(query)
              .region(region)
              .safe(safe)
              .sort(sort)
              .spellcheckQuery(spellcheckQuery)
              .view(view)
              .width(width)
              .widthFrom(widthFrom)
              .widthTo(widthTo)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getInsights());
      System.out.println(result.getMessage());
      System.out.println(result.getPage());
      System.out.println(result.getPerPage());
      System.out.println(result.getSearchId());
      System.out.println(result.getSpellcheckInfo());
      System.out.println(result.getTotalCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#searchImages");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ImageSearchResults> response = client
              .images
              .searchImages()
              .addedDate(addedDate)
              .addedDateStart(addedDateStart)
              .aspectRatioMin(aspectRatioMin)
              .aspectRatioMax(aspectRatioMax)
              .aspectRatio(aspectRatio)
              .aiSearch(aiSearch)
              .aiLabelsLimit(aiLabelsLimit)
              .aiIndustry(aiIndustry)
              .aiObjective(aiObjective)
              .addedDateEnd(addedDateEnd)
              .category(category)
              .color(color)
              .contributor(contributor)
              .contributorCountry(contributorCountry)
              .fields(fields)
              .height(height)
              .heightFrom(heightFrom)
              .heightTo(heightTo)
              .imageType(imageType)
              .keywordSafeSearch(keywordSafeSearch)
              .language(language)
              .license(license)
              .model(model)
              .orientation(orientation)
              .page(page)
              .perPage(perPage)
              .peopleModelReleased(peopleModelReleased)
              .peopleAge(peopleAge)
              .peopleEthnicity(peopleEthnicity)
              .peopleGender(peopleGender)
              .peopleNumber(peopleNumber)
              .query(query)
              .region(region)
              .safe(safe)
              .sort(sort)
              .spellcheckQuery(spellcheckQuery)
              .view(view)
              .width(width)
              .widthFrom(widthFrom)
              .widthTo(widthTo)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ImagesApi#searchImages");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **addedDate** | **LocalDate**| Show images added on the specified date | [optional] |
| **addedDateStart** | **LocalDate**| Show images added on or after the specified date | [optional] |
| **aspectRatioMin** | **Double**| Show images with the specified aspect ratio or higher, using a positive decimal of the width divided by the height, such as 1.7778 for a 16:9 image | [optional] |
| **aspectRatioMax** | **Double**| Show images with the specified aspect ratio or lower, using a positive decimal of the width divided by the height, such as 1.7778 for a 16:9 image | [optional] |
| **aspectRatio** | **Double**| Show images with the specified aspect ratio, using a positive decimal of the width divided by the height, such as 1.7778 for a 16:9 image | [optional] |
| **aiSearch** | **Boolean**| Set to true and specify the &#x60;ai_objective&#x60; and &#x60;ai_industry&#x60; parameters to use AI-powered search; the API returns information about how well images meet the objective for the industry  | [optional] |
| **aiLabelsLimit** | **Integer**| For AI-powered search, specify the maximum number of labels to return | [optional] [default to 20] |
| **aiIndustry** | **String**| For AI-powered search, specify the industry to target; requires that the &#x60;ai_search&#x60; parameter is set to true | [optional] [enum: automotive, cpg, finance, healthcare, retail, technology] |
| **aiObjective** | **String**| For AI-powered search, specify the goal of the media; requires that the &#x60;ai_search&#x60; parameter is set to true | [optional] [enum: awareness, traffic, conversions] |
| **addedDateEnd** | **LocalDate**| Show images added before the specified date | [optional] |
| **category** | **String**| Show images with the specified Shutterstock-defined category; specify a category name or ID | [optional] |
| **color** | **String**| Specify either a hexadecimal color in the format &#39;4F21EA&#39; or &#39;grayscale&#39;; the API returns images that use similar colors | [optional] |
| **contributor** | [**List&lt;String&gt;**](String.md)| Show images with the specified contributor names or IDs, allows multiple | [optional] |
| **contributorCountry** | [**Object**](.md)| Show images from contributors in one or more specified countries, or start with NOT to exclude a country from the search | [optional] |
| **fields** | **String**| Fields to display in the response; see the documentation for the fields parameter in the overview section | [optional] |
| **height** | **Integer**| (Deprecated; use height_from and height_to instead) Show images with the specified height | [optional] |
| **heightFrom** | **Integer**| Show images with the specified height or larger, in pixels | [optional] |
| **heightTo** | **Integer**| Show images with the specified height or smaller, in pixels | [optional] |
| **imageType** | [**List&lt;String&gt;**](String.md)| Show images of the specified type | [optional] [enum: photo, illustration, vector] |
| **keywordSafeSearch** | **Boolean**| Hide results with potentially unsafe keywords | [optional] [default to true] |
| **language** | [**Language**](.md)| Set query and result language (uses Accept-Language header if not set) | [optional] [enum: ar, bg, bn, cs, da, de, el, en, es, fi, fr, gu, he, hi, hr, hu, id, it, ja, kn, ko, ml, mr, nb, nl, or, pl, pt, ro, ru, sk, sl, sv, ta, te, th, tr, uk, ur, vi, zh, zh-Hant] |
| **license** | [**List&lt;String&gt;**](String.md)| Show only images with the specified license | [optional] [enum: commercial, editorial, enhanced] |
| **model** | [**List&lt;String&gt;**](String.md)| Show image results with the specified model IDs | [optional] |
| **orientation** | **String**| Show image results with horizontal or vertical orientation | [optional] [enum: horizontal, vertical] |
| **page** | **Integer**| Page number | [optional] [default to 1] |
| **perPage** | **Integer**| Number of results per page | [optional] [default to 20] |
| **peopleModelReleased** | **Boolean**| Show images of people with a signed model release | [optional] |
| **peopleAge** | **String**| Show images that feature people of the specified age category | [optional] [enum: infants, children, teenagers, 20s, 30s, 40s, 50s, 60s, older] |
| **peopleEthnicity** | [**List&lt;String&gt;**](String.md)| Show images with people of the specified ethnicities, or start with NOT to show images without those ethnicities | [optional] [enum: african, african_american, black, brazilian, chinese, caucasian, east_asian, hispanic, japanese, middle_eastern, native_american, pacific_islander, south_asian, southeast_asian, other, NOT african, NOT african_american, NOT black, NOT brazilian, NOT chinese, NOT caucasian, NOT east_asian, NOT hispanic, NOT japanese, NOT middle_eastern, NOT native_american, NOT pacific_islander, NOT south_asian, NOT southeast_asian, NOT other] |
| **peopleGender** | **String**| Show images with people of the specified gender | [optional] [enum: male, female, both] |
| **peopleNumber** | **Integer**| Show images with the specified number of people | [optional] |
| **query** | **String**| One or more search terms separated by spaces; you can use NOT to filter out images that match a term | [optional] |
| **region** | **String**| Raise or lower search result rankings based on the result&#39;s relevance to a specified region; you can provide a country code or an IP address from which the API infers a country | [optional] |
| **safe** | **Boolean**| Enable or disable safe search | [optional] [default to true] |
| **sort** | **String**| Sort by | [optional] [default to popular] [enum: newest, popular, relevance, random] |
| **spellcheckQuery** | **Boolean**| Spellcheck the search query and return results on suggested spellings | [optional] [default to true] |
| **view** | **String**| Amount of detail to render in the response | [optional] [default to minimal] [enum: minimal, full] |
| **width** | **Integer**| (Deprecated; use width_from and width_to instead) Show images with the specified width | [optional] |
| **widthFrom** | **Integer**| Show images with the specified width or larger, in pixels | [optional] |
| **widthTo** | **Integer**| Show images with the specified width or smaller, in pixels | [optional] |

### Return type

[**ImageSearchResults**](ImageSearchResults.md)

### Authorization

[basic](../README.md#basic), [customer_accessCode](../README.md#customer_accessCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

