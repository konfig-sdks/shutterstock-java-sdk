# CatalogApi

All URIs are relative to *https://api.shutterstock.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addToCollectionItems**](CatalogApi.md#addToCollectionItems) | **POST** /v2/catalog/collections/{collection_id}/items | Add items to catalog collections |
| [**createCollection**](CatalogApi.md#createCollection) | **POST** /v2/catalog/collections | Create catalog collections |
| [**deleteCollection**](CatalogApi.md#deleteCollection) | **DELETE** /v2/catalog/collections/{collection_id} | Delete catalog collections |
| [**listCollections**](CatalogApi.md#listCollections) | **GET** /v2/catalog/collections | List catalog collections |
| [**removeItemsFromCollection**](CatalogApi.md#removeItemsFromCollection) | **DELETE** /v2/catalog/collections/{collection_id}/items | Remove items from catalog collection |
| [**searchAssets**](CatalogApi.md#searchAssets) | **GET** /v2/catalog/search | Search catalogs for assets |
| [**updateCollectionMetadata**](CatalogApi.md#updateCollectionMetadata) | **PATCH** /v2/catalog/collections/{collection_id} | Update collection metadata |


<a name="addToCollectionItems"></a>
# **addToCollectionItems**
> CatalogCollection addToCollectionItems(collectionId, createCatalogCollectionItems).execute();

Add items to catalog collections

This endpoint adds assets to a catalog collection. It also automatically adds the assets to the user&#39;s account&#39;s catalog.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CatalogApi;
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
    List<CreateCatalogCollectionItem> items = Arrays.asList();
    String collectionId = "126351028"; // The ID of the collection to add assets to
    try {
      CatalogCollection result = client
              .catalog
              .addToCollectionItems(items, collectionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCoverAsset());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getRoleAssignments());
      System.out.println(result.getTotalItemCount());
      System.out.println(result.getUpdatedTime());
      System.out.println(result.getVisibility());
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#addToCollectionItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CatalogCollection> response = client
              .catalog
              .addToCollectionItems(items, collectionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#addToCollectionItems");
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
| **collectionId** | **String**| The ID of the collection to add assets to | |
| **createCatalogCollectionItems** | [**CreateCatalogCollectionItems**](CreateCatalogCollectionItems.md)| Collection item attributes to add to collection | |

### Return type

[**CatalogCollection**](CatalogCollection.md)

### Authorization

[customer_accessCode](../README.md#customer_accessCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createCollection"></a>
# **createCollection**
> CatalogCollection createCollection(createCatalogCollection).execute();

Create catalog collections

This endpoint creates a catalog collection and optionally adds assets. To add assets to the collection later, use &#x60;PATCH /v2/catalog/collections/{collection_id}/items&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CatalogApi;
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
    String name = "name_example";
    List<CreateCatalogCollectionItem> items = Arrays.asList();
    String visibility = "private";
    try {
      CatalogCollection result = client
              .catalog
              .createCollection(name)
              .items(items)
              .visibility(visibility)
              .execute();
      System.out.println(result);
      System.out.println(result.getCoverAsset());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getRoleAssignments());
      System.out.println(result.getTotalItemCount());
      System.out.println(result.getUpdatedTime());
      System.out.println(result.getVisibility());
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#createCollection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CatalogCollection> response = client
              .catalog
              .createCollection(name)
              .items(items)
              .visibility(visibility)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#createCollection");
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
| **createCatalogCollection** | [**CreateCatalogCollection**](CreateCatalogCollection.md)| Create a catalog collection and, optionally, add items. | |

### Return type

[**CatalogCollection**](CatalogCollection.md)

### Authorization

[customer_accessCode](../README.md#customer_accessCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | OK |  -  |

<a name="deleteCollection"></a>
# **deleteCollection**
> deleteCollection(collectionId).execute();

Delete catalog collections

This endpoint deletes a catalog collection. It does not remove the assets from the user&#39;s account&#39;s catalog.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CatalogApi;
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
    String collectionId = "126351028"; // The ID of the collection to delete
    try {
      client
              .catalog
              .deleteCollection(collectionId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#deleteCollection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .catalog
              .deleteCollection(collectionId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#deleteCollection");
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
| **collectionId** | **String**| The ID of the collection to delete | |

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
| **204** | OK |  -  |
| **404** | Collection not found |  -  |

<a name="listCollections"></a>
# **listCollections**
> CatalogCollectionDataList listCollections().page(page).perPage(perPage).sort(sort).shared(shared).execute();

List catalog collections

This endpoint returns a list of catalog collections.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CatalogApi;
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
    Integer perPage = 20; // Number of results per page
    String sort = "newest"; // Sort by
    Boolean shared = false; // Set to true to omit collections that you own and return only collections  that are shared with you
    try {
      CatalogCollectionDataList result = client
              .catalog
              .listCollections()
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .shared(shared)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getPage());
      System.out.println(result.getPerPage());
      System.out.println(result.getTotalCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#listCollections");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CatalogCollectionDataList> response = client
              .catalog
              .listCollections()
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .shared(shared)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#listCollections");
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
| **perPage** | **Integer**| Number of results per page | [optional] [default to 20] |
| **sort** | **String**| Sort by | [optional] [default to newest] [enum: newest, oldest] |
| **shared** | **Boolean**| Set to true to omit collections that you own and return only collections  that are shared with you | [optional] [default to false] |

### Return type

[**CatalogCollectionDataList**](CatalogCollectionDataList.md)

### Authorization

[customer_accessCode](../README.md#customer_accessCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid status value |  -  |

<a name="removeItemsFromCollection"></a>
# **removeItemsFromCollection**
> CatalogCollection removeItemsFromCollection(collectionId, removeCatalogCollectionItems).execute();

Remove items from catalog collection

This endpoint removes assets from a catalog collection. It does not remove the assets from the user&#39;s account&#39;s catalog.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CatalogApi;
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
    List<RemoveCatalogCollectionItem> items = Arrays.asList();
    String collectionId = "126351028"; // The ID of the collection to remove assets from
    try {
      CatalogCollection result = client
              .catalog
              .removeItemsFromCollection(items, collectionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCoverAsset());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getRoleAssignments());
      System.out.println(result.getTotalItemCount());
      System.out.println(result.getUpdatedTime());
      System.out.println(result.getVisibility());
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#removeItemsFromCollection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CatalogCollection> response = client
              .catalog
              .removeItemsFromCollection(items, collectionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#removeItemsFromCollection");
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
| **collectionId** | **String**| The ID of the collection to remove assets from | |
| **removeCatalogCollectionItems** | [**RemoveCatalogCollectionItems**](RemoveCatalogCollectionItems.md)| Items to remove from the collection | |

### Return type

[**CatalogCollection**](CatalogCollection.md)

### Authorization

[customer_accessCode](../README.md#customer_accessCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="searchAssets"></a>
# **searchAssets**
> CatalogCollectionItemDataList searchAssets().sort(sort).page(page).perPage(perPage).query(query).collectionId(collectionId).assetType(assetType).execute();

Search catalogs for assets

This endpoint searches for assets in the account&#39;s catalog. If you specify more than one search parameter, the API uses an AND condition. Array parameters can be specified multiple times; in this case, the API uses an AND or an OR condition with those values, depending on the parameter. You can also filter search terms out in the &#x60;query&#x60; parameter by prefixing the term with NOT.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CatalogApi;
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
    String sort = "newest"; // Sort by
    Integer page = 1; // Page number
    Integer perPage = 20; // Number of results per page
    String query = "dogs on the beach"; // One or more search terms separated by spaces
    List<String> collectionId = Arrays.asList(); // Filter by collection id
    List<String> assetType = Arrays.asList(); // Filter by asset type
    try {
      CatalogCollectionItemDataList result = client
              .catalog
              .searchAssets()
              .sort(sort)
              .page(page)
              .perPage(perPage)
              .query(query)
              .collectionId(collectionId)
              .assetType(assetType)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getPage());
      System.out.println(result.getPerPage());
      System.out.println(result.getTotalCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#searchAssets");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CatalogCollectionItemDataList> response = client
              .catalog
              .searchAssets()
              .sort(sort)
              .page(page)
              .perPage(perPage)
              .query(query)
              .collectionId(collectionId)
              .assetType(assetType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#searchAssets");
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
| **sort** | **String**| Sort by | [optional] [default to newest] [enum: newest, oldest] |
| **page** | **Integer**| Page number | [optional] [default to 1] |
| **perPage** | **Integer**| Number of results per page | [optional] [default to 20] |
| **query** | **String**| One or more search terms separated by spaces | [optional] |
| **collectionId** | [**List&lt;String&gt;**](String.md)| Filter by collection id | [optional] |
| **assetType** | [**List&lt;String&gt;**](String.md)| Filter by asset type | [optional] [enum: image, video, audio, elements, editorial-image, editorial-video] |

### Return type

[**CatalogCollectionItemDataList**](CatalogCollectionItemDataList.md)

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

<a name="updateCollectionMetadata"></a>
# **updateCollectionMetadata**
> CatalogCollection updateCollectionMetadata(collectionId, updateCatalogCollection).execute();

Update collection metadata

This endpoint updates the metadata of a catalog collection.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CatalogApi;
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
    String collectionId = "126351028"; // ID of collection that needs to be modified
    UpdateCatalogCollectionCoverAsset coverAsset = new UpdateCatalogCollectionCoverAsset();
    String name = "name_example";
    String visibility = "private";
    try {
      CatalogCollection result = client
              .catalog
              .updateCollectionMetadata(collectionId)
              .coverAsset(coverAsset)
              .name(name)
              .visibility(visibility)
              .execute();
      System.out.println(result);
      System.out.println(result.getCoverAsset());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getRoleAssignments());
      System.out.println(result.getTotalItemCount());
      System.out.println(result.getUpdatedTime());
      System.out.println(result.getVisibility());
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#updateCollectionMetadata");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CatalogCollection> response = client
              .catalog
              .updateCollectionMetadata(collectionId)
              .coverAsset(coverAsset)
              .name(name)
              .visibility(visibility)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#updateCollectionMetadata");
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
| **collectionId** | **String**| ID of collection that needs to be modified | |
| **updateCatalogCollection** | [**UpdateCatalogCollection**](UpdateCatalogCollection.md)| Collections Metadata to update | |

### Return type

[**CatalogCollection**](CatalogCollection.md)

### Authorization

[customer_accessCode](../README.md#customer_accessCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

