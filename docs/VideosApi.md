# VideosApi

All URIs are relative to *https://api.shutterstock.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addToCollectionItems**](VideosApi.md#addToCollectionItems) | **POST** /v2/videos/collections/{id}/items | Add videos to collections |
| [**collectionDetailsGet**](VideosApi.md#collectionDetailsGet) | **GET** /v2/videos/collections/featured/{id} | Get the details of featured video collections |
| [**collectionDetailsGet_0**](VideosApi.md#collectionDetailsGet_0) | **GET** /v2/videos/collections/{id} | Get the details of video collections |
| [**createVideoCollections**](VideosApi.md#createVideoCollections) | **POST** /v2/videos/collections | Create video collections |
| [**deleteCollection**](VideosApi.md#deleteCollection) | **DELETE** /v2/videos/collections/{id} | Delete video collections |
| [**findSimilar**](VideosApi.md#findSimilar) | **GET** /v2/videos/{id}/similar | List similar videos |
| [**getCollectionItems**](VideosApi.md#getCollectionItems) | **GET** /v2/videos/collections/{id}/items | Get the contents of video collections |
| [**getFeaturedCollectionItems**](VideosApi.md#getFeaturedCollectionItems) | **GET** /v2/videos/collections/featured/{id}/items | Get the contents of featured video collections |
| [**licenseVideos**](VideosApi.md#licenseVideos) | **POST** /v2/videos/licenses | License videos |
| [**listCategories**](VideosApi.md#listCategories) | **GET** /v2/videos/categories | List video categories |
| [**listCollections**](VideosApi.md#listCollections) | **GET** /v2/videos/collections | List video collections |
| [**listFeaturedVideoCollections**](VideosApi.md#listFeaturedVideoCollections) | **GET** /v2/videos/collections/featured | List featured video collections |
| [**listLicenses**](VideosApi.md#listLicenses) | **GET** /v2/videos/licenses | List video licenses |
| [**listUpdatedVideos**](VideosApi.md#listUpdatedVideos) | **GET** /v2/videos/updated | List updated videos |
| [**listVideo**](VideosApi.md#listVideo) | **GET** /v2/videos | List videos |
| [**redownloadDownloads**](VideosApi.md#redownloadDownloads) | **POST** /v2/videos/licenses/{id}/downloads | Download videos |
| [**removeFromCollection**](VideosApi.md#removeFromCollection) | **DELETE** /v2/videos/collections/{id}/items | Remove videos from collections |
| [**searchSuggestions**](VideosApi.md#searchSuggestions) | **GET** /v2/videos/search/suggestions | Get suggestions for a search term |
| [**searchVideo**](VideosApi.md#searchVideo) | **GET** /v2/videos/search | Search for videos |
| [**setNewName**](VideosApi.md#setNewName) | **POST** /v2/videos/collections/{id} | Rename video collections |
| [**videoDetails**](VideosApi.md#videoDetails) | **GET** /v2/videos/{id} | Get details about videos |


<a name="addToCollectionItems"></a>
# **addToCollectionItems**
> addToCollectionItems(id, collectionItemRequest).execute();

Add videos to collections

This endpoint adds one or more videos to a collection by video IDs.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosApi;
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
    String id = "17555176"; // The ID of the collection to which items should be added
    try {
      client
              .videos
              .addToCollectionItems(items, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#addToCollectionItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .videos
              .addToCollectionItems(items, id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#addToCollectionItems");
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
| **id** | **String**| The ID of the collection to which items should be added | |
| **collectionItemRequest** | [**CollectionItemRequest**](CollectionItemRequest.md)| Array of video IDs to add to the collection | |

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

<a name="collectionDetailsGet"></a>
# **collectionDetailsGet**
> FeaturedCollection collectionDetailsGet(id).embed(embed).execute();

Get the details of featured video collections

This endpoint gets more detailed information about a featured video collection, including its cover video and timestamps for its creation and most recent update. To get the videos, use &#x60;GET /v2/videos/collections/featured/{id}/items&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosApi;
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
    String embed = "share_url"; // What information to include in the response, such as a URL to the collection
    try {
      FeaturedCollection result = client
              .videos
              .collectionDetailsGet(id)
              .embed(embed)
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
      System.err.println("Exception when calling VideosApi#collectionDetailsGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FeaturedCollection> response = client
              .videos
              .collectionDetailsGet(id)
              .embed(embed)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#collectionDetailsGet");
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
| **embed** | **String**| What information to include in the response, such as a URL to the collection | [optional] [enum: share_url] |

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

<a name="collectionDetailsGet_0"></a>
# **collectionDetailsGet_0**
> Collection collectionDetailsGet_0(id).embed(embed).shareCode(shareCode).execute();

Get the details of video collections

This endpoint gets more detailed information about a collection, including the timestamp for its creation and the number of videos in it. To get the videos in collections, use GET /v2/videos/collections/{id}/items.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosApi;
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
    String id = "17555176"; // The ID of the collection to return
    List<String> embed = Arrays.asList(); // Which sharing information to include in the response, such as a URL to the collection
    String shareCode = "shareCode_example"; // Code to retrieve a shared collection
    try {
      Collection result = client
              .videos
              .collectionDetailsGet_0(id)
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
      System.err.println("Exception when calling VideosApi#collectionDetailsGet_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Collection> response = client
              .videos
              .collectionDetailsGet_0(id)
              .embed(embed)
              .shareCode(shareCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#collectionDetailsGet_0");
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
| **id** | **String**| The ID of the collection to return | |
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

<a name="createVideoCollections"></a>
# **createVideoCollections**
> CollectionCreateResponse createVideoCollections(collectionCreateRequest).execute();

Create video collections

This endpoint creates one or more collections (clipboxes). To add videos to collections, use &#x60;POST /v2/videos/collections/{id}/items&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosApi;
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
              .videos
              .createVideoCollections(name)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#createVideoCollections");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CollectionCreateResponse> response = client
              .videos
              .createVideoCollections(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#createVideoCollections");
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
| **collectionCreateRequest** | [**CollectionCreateRequest**](CollectionCreateRequest.md)| Collection metadata | |

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
| **201** | Successfully created video collection |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="deleteCollection"></a>
# **deleteCollection**
> deleteCollection(id).execute();

Delete video collections

This endpoint deletes a collection.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosApi;
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
    String id = "17555176"; // The ID of the collection to delete
    try {
      client
              .videos
              .deleteCollection(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#deleteCollection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .videos
              .deleteCollection(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#deleteCollection");
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
| **id** | **String**| The ID of the collection to delete | |

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

<a name="findSimilar"></a>
# **findSimilar**
> VideoSearchResults findSimilar(id).language(language).page(page).perPage(perPage).view(view).execute();

List similar videos

This endpoint searches for videos that are similar to a video that you specify.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosApi;
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
    String id = "2140697"; // The ID of a video for which similar videos should be returned
    Language language = Language.fromValue("ar"); // Language for the keywords and categories in the response
    Integer page = 1; // Page number
    Integer perPage = 20; // Number of results per page
    String view = "minimal"; // Amount of detail to render in the response
    try {
      VideoSearchResults result = client
              .videos
              .findSimilar(id)
              .language(language)
              .page(page)
              .perPage(perPage)
              .view(view)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
      System.out.println(result.getPage());
      System.out.println(result.getPerPage());
      System.out.println(result.getSearchId());
      System.out.println(result.getTotalCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#findSimilar");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VideoSearchResults> response = client
              .videos
              .findSimilar(id)
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
      System.err.println("Exception when calling VideosApi#findSimilar");
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
| **id** | **String**| The ID of a video for which similar videos should be returned | |
| **language** | [**Language**](.md)| Language for the keywords and categories in the response | [optional] [enum: ar, bg, bn, cs, da, de, el, en, es, fi, fr, gu, he, hi, hr, hu, id, it, ja, kn, ko, ml, mr, nb, nl, or, pl, pt, ro, ru, sk, sl, sv, ta, te, th, tr, uk, ur, vi, zh, zh-Hant] |
| **page** | **Integer**| Page number | [optional] [default to 1] |
| **perPage** | **Integer**| Number of results per page | [optional] [default to 20] |
| **view** | **String**| Amount of detail to render in the response | [optional] [default to minimal] [enum: minimal, full] |

### Return type

[**VideoSearchResults**](VideoSearchResults.md)

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

<a name="getCollectionItems"></a>
# **getCollectionItems**
> CollectionItemDataList getCollectionItems(id).page(page).perPage(perPage).shareCode(shareCode).sort(sort).execute();

Get the contents of video collections

This endpoint lists the IDs of videos in a collection and the date that each was added.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosApi;
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
    String id = "17555176"; // Collection ID
    Integer page = 1; // Page number
    Integer perPage = 100; // Number of results per page
    String shareCode = "shareCode_example"; // Code to retrieve the contents of a shared collection
    String sort = "newest"; // Sort order
    try {
      CollectionItemDataList result = client
              .videos
              .getCollectionItems(id)
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
      System.err.println("Exception when calling VideosApi#getCollectionItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CollectionItemDataList> response = client
              .videos
              .getCollectionItems(id)
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
      System.err.println("Exception when calling VideosApi#getCollectionItems");
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

<a name="getFeaturedCollectionItems"></a>
# **getFeaturedCollectionItems**
> VideoCollectionItemDataList getFeaturedCollectionItems(id).page(page).perPage(perPage).execute();

Get the contents of featured video collections

This endpoint lists the IDs of videos in a featured collection and the date that each was added.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosApi;
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
      VideoCollectionItemDataList result = client
              .videos
              .getFeaturedCollectionItems(id)
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
      System.err.println("Exception when calling VideosApi#getFeaturedCollectionItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VideoCollectionItemDataList> response = client
              .videos
              .getFeaturedCollectionItems(id)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#getFeaturedCollectionItems");
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

[**VideoCollectionItemDataList**](VideoCollectionItemDataList.md)

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

<a name="licenseVideos"></a>
# **licenseVideos**
> LicenseVideoResultDataList licenseVideos(licenseVideoRequest).subscriptionId(subscriptionId).size(size).searchId(searchId).execute();

License videos

This endpoint gets licenses for one or more videos. You must specify the video IDs in the body parameter and the size and subscription ID either in the query parameter or with each video ID in the body parameter. Values in the body parameter override values in the query parameters. The download links in the response are valid for 8 hours.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosApi;
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
    List<LicenseVideo> videos = Arrays.asList(); // Videos to license
    String subscriptionId = "s12345678"; // The subscription ID to use for licensing
    String size = "web"; // The size of the video to license
    String searchId = "searchId_example"; // The Search ID that led to this licensing event
    try {
      LicenseVideoResultDataList result = client
              .videos
              .licenseVideos(videos)
              .subscriptionId(subscriptionId)
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
      System.err.println("Exception when calling VideosApi#licenseVideos");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LicenseVideoResultDataList> response = client
              .videos
              .licenseVideos(videos)
              .subscriptionId(subscriptionId)
              .size(size)
              .searchId(searchId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#licenseVideos");
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
| **licenseVideoRequest** | [**LicenseVideoRequest**](LicenseVideoRequest.md)| List of videos to request licenses for and information about each license transaction; these values override the defaults in the query parameters | |
| **subscriptionId** | **String**| The subscription ID to use for licensing | [optional] |
| **size** | **String**| The size of the video to license | [optional] [default to web] [enum: web, sd, hd, 4k] |
| **searchId** | **String**| The Search ID that led to this licensing event | [optional] |

### Return type

[**LicenseVideoResultDataList**](LicenseVideoResultDataList.md)

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

List video categories

This endpoint lists the categories (Shutterstock-assigned genres) that videos can belong to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosApi;
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
              .videos
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
      System.err.println("Exception when calling VideosApi#listCategories");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CategoryDataList> response = client
              .videos
              .listCategories()
              .language(language)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#listCategories");
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
> CollectionDataList listCollections().page(page).perPage(perPage).embed(embed).execute();

List video collections

This endpoint lists your collections of videos and their basic attributes.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosApi;
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
    Integer page = 1; // Page number
    Integer perPage = 100; // Number of results per page
    List<String> embed = Arrays.asList(); // Which sharing information to include in the response, such as a URL to the collection
    try {
      CollectionDataList result = client
              .videos
              .listCollections()
              .page(page)
              .perPage(perPage)
              .embed(embed)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getMessage());
      System.out.println(result.getPage());
      System.out.println(result.getPerPage());
      System.out.println(result.getTotalCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#listCollections");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CollectionDataList> response = client
              .videos
              .listCollections()
              .page(page)
              .perPage(perPage)
              .embed(embed)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#listCollections");
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
| **page** | **Integer**| Page number | [optional] [default to 1] |
| **perPage** | **Integer**| Number of results per page | [optional] [default to 100] |
| **embed** | [**List&lt;String&gt;**](String.md)| Which sharing information to include in the response, such as a URL to the collection | [optional] [enum: share_code, share_url] |

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

<a name="listFeaturedVideoCollections"></a>
# **listFeaturedVideoCollections**
> FeaturedCollectionDataList listFeaturedVideoCollections().embed(embed).execute();

List featured video collections

This endpoint lists featured video collections and a name and cover video for each collection.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosApi;
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
    String embed = "share_url"; // What information to include in the response, such as a URL to the collection
    try {
      FeaturedCollectionDataList result = client
              .videos
              .listFeaturedVideoCollections()
              .embed(embed)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getMessage());
      System.out.println(result.getPage());
      System.out.println(result.getPerPage());
      System.out.println(result.getTotalCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#listFeaturedVideoCollections");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FeaturedCollectionDataList> response = client
              .videos
              .listFeaturedVideoCollections()
              .embed(embed)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#listFeaturedVideoCollections");
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
| **embed** | **String**| What information to include in the response, such as a URL to the collection | [optional] [enum: share_url] |

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

<a name="listLicenses"></a>
# **listLicenses**
> DownloadHistoryDataList listLicenses().videoId(videoId).license(license).page(page).perPage(perPage).sort(sort).username(username).startDate(startDate).endDate(endDate).downloadAvailability(downloadAvailability).teamHistory(teamHistory).execute();

List video licenses

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
import com.konfigthis.client.api.VideosApi;
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
    String videoId = "12345678"; // Show licenses for the specified video ID
    String license = "standard"; // Show videos that are available with the specified license, such as `standard` or `enhanced`; prepending a `-` sign excludes results from that license
    Integer page = 1; // Page number
    Integer perPage = 20; // Number of results per page
    String sort = "newest"; // Sort by oldest or newest videos first
    String username = "aUniqueUsername"; // Filter licenses by username of licensee
    OffsetDateTime startDate = OffsetDateTime.parse("2021-03-29T13:25:13.521Z"); // Show licenses created on or after the specified date
    OffsetDateTime endDate = OffsetDateTime.parse("2021-03-29T13:25:13.521Z"); // Show licenses created before the specified date
    String downloadAvailability = "all"; // Filter licenses by download availability
    Boolean teamHistory = false; // Set to true to see license history for all members of your team.
    try {
      DownloadHistoryDataList result = client
              .videos
              .listLicenses()
              .videoId(videoId)
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
      System.err.println("Exception when calling VideosApi#listLicenses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DownloadHistoryDataList> response = client
              .videos
              .listLicenses()
              .videoId(videoId)
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
      System.err.println("Exception when calling VideosApi#listLicenses");
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
| **videoId** | **String**| Show licenses for the specified video ID | [optional] |
| **license** | **String**| Show videos that are available with the specified license, such as &#x60;standard&#x60; or &#x60;enhanced&#x60;; prepending a &#x60;-&#x60; sign excludes results from that license | [optional] |
| **page** | **Integer**| Page number | [optional] [default to 1] |
| **perPage** | **Integer**| Number of results per page | [optional] [default to 20] |
| **sort** | **String**| Sort by oldest or newest videos first | [optional] [default to newest] [enum: newest, oldest] |
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

<a name="listUpdatedVideos"></a>
# **listUpdatedVideos**
> UpdatedMediaDataList listUpdatedVideos().startDate(startDate).endDate(endDate).interval(interval).page(page).perPage(perPage).sort(sort).execute();

List updated videos

This endpoint lists videos that have been updated in the specified time period to update content management systems (CMS) or digital asset management (DAM) systems. In most cases, use the &#x60;interval&#x60; parameter to show videos that were updated recently, but you can also use the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters to specify a range of no more than three days. Do not use the &#x60;interval&#x60; parameter with either &#x60;start_date&#x60; or &#x60;end_date&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosApi;
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
    LocalDate startDate = LocalDate.parse("2020-05-29T00:00:00.000Z"); // Show videos updated on or after the specified date
    LocalDate endDate = LocalDate.parse("2021-05-29T00:00:00.000Z"); // Show videos updated before the specified date
    String interval = "1 HOUR"; // Show videos updated in the specified time period, where the time period is an interval (like SQL INTERVAL) such as 1 DAY, 6 HOUR, or 30 MINUTE; the default is 1 HOUR, which shows videos that were updated in the hour preceding the request
    Integer page = 1; // Page number
    Integer perPage = 100; // Number of results per page
    String sort = "newest"; // Sort by oldest or newest videos first
    try {
      UpdatedMediaDataList result = client
              .videos
              .listUpdatedVideos()
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
      System.err.println("Exception when calling VideosApi#listUpdatedVideos");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UpdatedMediaDataList> response = client
              .videos
              .listUpdatedVideos()
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
      System.err.println("Exception when calling VideosApi#listUpdatedVideos");
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
| **startDate** | **LocalDate**| Show videos updated on or after the specified date | [optional] |
| **endDate** | **LocalDate**| Show videos updated before the specified date | [optional] |
| **interval** | **String**| Show videos updated in the specified time period, where the time period is an interval (like SQL INTERVAL) such as 1 DAY, 6 HOUR, or 30 MINUTE; the default is 1 HOUR, which shows videos that were updated in the hour preceding the request | [optional] [default to 1 HOUR] |
| **page** | **Integer**| Page number | [optional] [default to 1] |
| **perPage** | **Integer**| Number of results per page | [optional] [default to 100] |
| **sort** | **String**| Sort by oldest or newest videos first | [optional] [default to newest] [enum: newest, oldest] |

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

<a name="listVideo"></a>
# **listVideo**
> VideoDataList listVideo(id).view(view).searchId(searchId).execute();

List videos

This endpoint lists information about one or more videos, including the aspect ratio and URLs to previews.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosApi;
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
    List<String> id = Arrays.asList(); // One or more video IDs
    String view = "minimal"; // Amount of detail to render in the response
    String searchId = "00000000-0000-0000-0000-000000000000"; // The ID of the search that is related to this request
    try {
      VideoDataList result = client
              .videos
              .listVideo(id)
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
      System.err.println("Exception when calling VideosApi#listVideo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VideoDataList> response = client
              .videos
              .listVideo(id)
              .view(view)
              .searchId(searchId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#listVideo");
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
| **id** | [**List&lt;String&gt;**](String.md)| One or more video IDs | |
| **view** | **String**| Amount of detail to render in the response | [optional] [default to minimal] [enum: minimal, full] |
| **searchId** | **String**| The ID of the search that is related to this request | [optional] |

### Return type

[**VideoDataList**](VideoDataList.md)

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

<a name="redownloadDownloads"></a>
# **redownloadDownloads**
> Url redownloadDownloads(id, redownloadVideo).execute();

Download videos

This endpoint redownloads videos that you have already received a license for.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosApi;
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
    String id = "e123"; // The license ID of the item to (re)download. The download links in the response are valid for 8 hours.
    Cookie authCookie = new Cookie();
    Boolean showModal = true; // (Deprecated)
    String size = "web"; // Size of the video
    String verificationCode = "verificationCode_example"; // (Deprecated)
    try {
      Url result = client
              .videos
              .redownloadDownloads(id)
              .authCookie(authCookie)
              .showModal(showModal)
              .size(size)
              .verificationCode(verificationCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#redownloadDownloads");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Url> response = client
              .videos
              .redownloadDownloads(id)
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
      System.err.println("Exception when calling VideosApi#redownloadDownloads");
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
| **id** | **String**| The license ID of the item to (re)download. The download links in the response are valid for 8 hours. | |
| **redownloadVideo** | [**RedownloadVideo**](RedownloadVideo.md)| Information about the videos to redownload | |

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

Remove videos from collections

This endpoint removes one or more videos from a collection.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosApi;
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
    String id = "17555176"; // The ID of the Collection from which items will be deleted
    List<String> itemId = Arrays.asList(); // One or more video IDs to remove from the collection
    try {
      client
              .videos
              .removeFromCollection(id)
              .itemId(itemId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#removeFromCollection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .videos
              .removeFromCollection(id)
              .itemId(itemId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#removeFromCollection");
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
| **id** | **String**| The ID of the Collection from which items will be deleted | |
| **itemId** | [**List&lt;String&gt;**](String.md)| One or more video IDs to remove from the collection | [optional] |

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

<a name="searchSuggestions"></a>
# **searchSuggestions**
> Suggestions searchSuggestions(query).limit(limit).execute();

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
import com.konfigthis.client.api.VideosApi;
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
    Integer limit = 10; // Limit the number of the suggestions
    try {
      Suggestions result = client
              .videos
              .searchSuggestions(query)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#searchSuggestions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Suggestions> response = client
              .videos
              .searchSuggestions(query)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#searchSuggestions");
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
| **limit** | **Integer**| Limit the number of the suggestions | [optional] [default to 10] |

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

<a name="searchVideo"></a>
# **searchVideo**
> VideoSearchResults searchVideo().addedDate(addedDate).addedDateStart(addedDateStart).addedDateEnd(addedDateEnd).aspectRatio(aspectRatio).category(category).contributor(contributor).contributorCountry(contributorCountry).duration(duration).durationFrom(durationFrom).durationTo(durationTo).fps(fps).fpsFrom(fpsFrom).fpsTo(fpsTo).keywordSafeSearch(keywordSafeSearch).language(language).license(license).model(model).page(page).perPage(perPage).peopleAge(peopleAge).peopleEthnicity(peopleEthnicity).peopleGender(peopleGender).peopleNumber(peopleNumber).peopleModelReleased(peopleModelReleased).query(query).resolution(resolution).safe(safe).sort(sort).view(view).execute();

Search for videos

This endpoint searches for videos. If you specify more than one search parameter, the API uses an AND condition. Array parameters can be specified multiple times; in this case, the API uses an AND or an OR condition with those values, depending on the parameter. You can also filter search terms out in the &#x60;query&#x60; parameter by prefixing the term with NOT.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosApi;
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
    LocalDate addedDate = LocalDate.parse("2020-05-29T00:00:00.000Z"); // Show videos added on the specified date
    LocalDate addedDateStart = LocalDate.parse("2020-05-29T00:00:00.000Z"); // Show videos added on or after the specified date
    LocalDate addedDateEnd = LocalDate.parse("2020-05-29T00:00:00.000Z"); // Show videos added before the specified date
    String aspectRatio = "43"; // Show videos with the specified aspect ratio
    String category = "category_example"; // Show videos with the specified Shutterstock-defined category; specify a category name or ID
    List<String> contributor = Arrays.asList(); // Show videos with the specified artist names or IDs
    List<String> contributorCountry = Arrays.asList(); // Show videos from contributors in one or more specified countries
    Integer duration = 56; // (Deprecated; use duration_from and duration_to instead) Show videos with the specified duration in seconds
    Integer durationFrom = 60; // Show videos with the specified duration or longer in seconds
    Integer durationTo = 180; // Show videos with the specified duration or shorter in seconds
    Double fps = 3.4D; // (Deprecated; use fps_from and fps_to instead) Show videos with the specified frames per second
    Double fpsFrom = 24D; // Show videos with the specified frames per second or more
    Double fpsTo = 60D; // Show videos with the specified frames per second or fewer
    Boolean keywordSafeSearch = true; // Hide results with potentially unsafe keywords
    Language language = Language.fromValue("ar"); // Set query and result language (uses Accept-Language header if not set)
    List<String> license = Arrays.asList("commercial"); // Show only videos with the specified license or licenses
    List<String> model = Arrays.asList(); // Show videos with each of the specified models
    Integer page = 1; // Page number
    Integer perPage = 20; // Number of results per page
    String peopleAge = "infants"; // Show videos that feature people of the specified age range
    List<String> peopleEthnicity = Arrays.asList(); // Show videos with people of the specified ethnicities
    String peopleGender = "male"; // Show videos with people with the specified gender
    Integer peopleNumber = 2; // Show videos with the specified number of people
    Boolean peopleModelReleased = true; // Show only videos of people with a signed model release
    String query = "dogs running on the beach"; // One or more search terms separated by spaces; you can use NOT to filter out videos that match a term
    String resolution = "4k"; // Show videos with the specified resolution
    Boolean safe = true; // Enable or disable safe search
    String sort = "newest"; // Sort by one of these categories
    String view = "minimal"; // Amount of detail to render in the response
    try {
      VideoSearchResults result = client
              .videos
              .searchVideo()
              .addedDate(addedDate)
              .addedDateStart(addedDateStart)
              .addedDateEnd(addedDateEnd)
              .aspectRatio(aspectRatio)
              .category(category)
              .contributor(contributor)
              .contributorCountry(contributorCountry)
              .duration(duration)
              .durationFrom(durationFrom)
              .durationTo(durationTo)
              .fps(fps)
              .fpsFrom(fpsFrom)
              .fpsTo(fpsTo)
              .keywordSafeSearch(keywordSafeSearch)
              .language(language)
              .license(license)
              .model(model)
              .page(page)
              .perPage(perPage)
              .peopleAge(peopleAge)
              .peopleEthnicity(peopleEthnicity)
              .peopleGender(peopleGender)
              .peopleNumber(peopleNumber)
              .peopleModelReleased(peopleModelReleased)
              .query(query)
              .resolution(resolution)
              .safe(safe)
              .sort(sort)
              .view(view)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
      System.out.println(result.getPage());
      System.out.println(result.getPerPage());
      System.out.println(result.getSearchId());
      System.out.println(result.getTotalCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#searchVideo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VideoSearchResults> response = client
              .videos
              .searchVideo()
              .addedDate(addedDate)
              .addedDateStart(addedDateStart)
              .addedDateEnd(addedDateEnd)
              .aspectRatio(aspectRatio)
              .category(category)
              .contributor(contributor)
              .contributorCountry(contributorCountry)
              .duration(duration)
              .durationFrom(durationFrom)
              .durationTo(durationTo)
              .fps(fps)
              .fpsFrom(fpsFrom)
              .fpsTo(fpsTo)
              .keywordSafeSearch(keywordSafeSearch)
              .language(language)
              .license(license)
              .model(model)
              .page(page)
              .perPage(perPage)
              .peopleAge(peopleAge)
              .peopleEthnicity(peopleEthnicity)
              .peopleGender(peopleGender)
              .peopleNumber(peopleNumber)
              .peopleModelReleased(peopleModelReleased)
              .query(query)
              .resolution(resolution)
              .safe(safe)
              .sort(sort)
              .view(view)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#searchVideo");
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
| **addedDate** | **LocalDate**| Show videos added on the specified date | [optional] |
| **addedDateStart** | **LocalDate**| Show videos added on or after the specified date | [optional] |
| **addedDateEnd** | **LocalDate**| Show videos added before the specified date | [optional] |
| **aspectRatio** | **String**| Show videos with the specified aspect ratio | [optional] [enum: 43, 169, nonstandard] |
| **category** | **String**| Show videos with the specified Shutterstock-defined category; specify a category name or ID | [optional] |
| **contributor** | [**List&lt;String&gt;**](String.md)| Show videos with the specified artist names or IDs | [optional] |
| **contributorCountry** | [**List&lt;String&gt;**](String.md)| Show videos from contributors in one or more specified countries | [optional] |
| **duration** | **Integer**| (Deprecated; use duration_from and duration_to instead) Show videos with the specified duration in seconds | [optional] |
| **durationFrom** | **Integer**| Show videos with the specified duration or longer in seconds | [optional] |
| **durationTo** | **Integer**| Show videos with the specified duration or shorter in seconds | [optional] |
| **fps** | **Double**| (Deprecated; use fps_from and fps_to instead) Show videos with the specified frames per second | [optional] |
| **fpsFrom** | **Double**| Show videos with the specified frames per second or more | [optional] |
| **fpsTo** | **Double**| Show videos with the specified frames per second or fewer | [optional] |
| **keywordSafeSearch** | **Boolean**| Hide results with potentially unsafe keywords | [optional] [default to true] |
| **language** | [**Language**](.md)| Set query and result language (uses Accept-Language header if not set) | [optional] [enum: ar, bg, bn, cs, da, de, el, en, es, fi, fr, gu, he, hi, hr, hu, id, it, ja, kn, ko, ml, mr, nb, nl, or, pl, pt, ro, ru, sk, sl, sv, ta, te, th, tr, uk, ur, vi, zh, zh-Hant] |
| **license** | [**List&lt;String&gt;**](String.md)| Show only videos with the specified license or licenses | [optional] [enum: commercial, editorial] |
| **model** | [**List&lt;String&gt;**](String.md)| Show videos with each of the specified models | [optional] |
| **page** | **Integer**| Page number | [optional] [default to 1] |
| **perPage** | **Integer**| Number of results per page | [optional] [default to 20] |
| **peopleAge** | **String**| Show videos that feature people of the specified age range | [optional] [enum: infants, children, teenagers, 20s, 30s, 40s, 50s, 60s, older] |
| **peopleEthnicity** | [**List&lt;String&gt;**](String.md)| Show videos with people of the specified ethnicities | [optional] [enum: african, african_american, black, brazilian, chinese, caucasian, east_asian, hispanic, japanese, middle_eastern, native_american, pacific_islander, south_asian, southeast_asian, other] |
| **peopleGender** | **String**| Show videos with people with the specified gender | [optional] [enum: male, female, both] |
| **peopleNumber** | **Integer**| Show videos with the specified number of people | [optional] |
| **peopleModelReleased** | **Boolean**| Show only videos of people with a signed model release | [optional] |
| **query** | **String**| One or more search terms separated by spaces; you can use NOT to filter out videos that match a term | [optional] |
| **resolution** | **String**| Show videos with the specified resolution | [optional] [enum: 4k, standard_definition, high_definition] |
| **safe** | **Boolean**| Enable or disable safe search | [optional] [default to true] |
| **sort** | **String**| Sort by one of these categories | [optional] [default to popular] [enum: newest, popular, relevance, random] |
| **view** | **String**| Amount of detail to render in the response | [optional] [default to minimal] [enum: minimal, full] |

### Return type

[**VideoSearchResults**](VideoSearchResults.md)

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
| **404** | Not found |  -  |

<a name="setNewName"></a>
# **setNewName**
> setNewName(id, collectionUpdateRequest).execute();

Rename video collections

This endpoint sets a new name for a collection.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosApi;
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
    String id = "17555176"; // The ID of the collection to rename
    try {
      client
              .videos
              .setNewName(name, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#setNewName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .videos
              .setNewName(name, id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#setNewName");
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
| **id** | **String**| The ID of the collection to rename | |
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

<a name="videoDetails"></a>
# **videoDetails**
> Video videoDetails(id).language(language).view(view).searchId(searchId).execute();

Get details about videos

This endpoint shows information about a video, including URLs to previews and the sizes that it is available in.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideosApi;
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
    String id = "639703"; // Video ID
    Language language = Language.fromValue("ar"); // Language for the keywords and categories in the response
    String view = "minimal"; // Amount of detail to render in the response
    String searchId = "00000000-0000-0000-0000-000000000000"; // The ID of the search that is related to this request
    try {
      Video result = client
              .videos
              .videoDetails(id)
              .language(language)
              .view(view)
              .searchId(searchId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getAddedDate());
      System.out.println(result.getAffiliateUrl());
      System.out.println(result.getAspect());
      System.out.println(result.getAspectRatio());
      System.out.println(result.getAssets());
      System.out.println(result.getCategories());
      System.out.println(result.getContributor());
      System.out.println(result.getDuration());
      System.out.println(result.getHasModelRelease());
      System.out.println(result.getHasPropertyRelease());
      System.out.println(result.getId());
      System.out.println(result.getIsAdult());
      System.out.println(result.getIsEditorial());
      System.out.println(result.getKeywords());
      System.out.println(result.getMediaType());
      System.out.println(result.getModels());
      System.out.println(result.getUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideosApi#videoDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Video> response = client
              .videos
              .videoDetails(id)
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
      System.err.println("Exception when calling VideosApi#videoDetails");
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
| **id** | **String**| Video ID | |
| **language** | [**Language**](.md)| Language for the keywords and categories in the response | [optional] [enum: ar, bg, bn, cs, da, de, el, en, es, fi, fr, gu, he, hi, hr, hu, id, it, ja, kn, ko, ml, mr, nb, nl, or, pl, pt, ro, ru, sk, sl, sv, ta, te, th, tr, uk, ur, vi, zh, zh-Hant] |
| **view** | **String**| Amount of detail to render in the response | [optional] [default to full] [enum: minimal, full] |
| **searchId** | **String**| The ID of the search that is related to this request | [optional] |

### Return type

[**Video**](Video.md)

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
| **404** | Not found |  -  |

