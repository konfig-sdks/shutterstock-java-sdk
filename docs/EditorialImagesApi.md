# EditorialImagesApi

All URIs are relative to *https://api.shutterstock.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDetails**](EditorialImagesApi.md#getDetails) | **GET** /v2/editorial/{id} | (Deprecated) Get editorial content details |
| [**getImageDetails**](EditorialImagesApi.md#getImageDetails) | **GET** /v2/editorial/images/{id} | Get editorial content details |
| [**getLivefeedImages**](EditorialImagesApi.md#getLivefeedImages) | **GET** /v2/editorial/images/livefeeds/{id} | Get editorial livefeed |
| [**getLivefeedItems**](EditorialImagesApi.md#getLivefeedItems) | **GET** /v2/editorial/images/livefeeds/{id}/items | Get editorial livefeed items |
| [**getLivefeedItems_0**](EditorialImagesApi.md#getLivefeedItems_0) | **GET** /v2/editorial/livefeeds/{id} | (Deprecated) Get editorial livefeed |
| [**getLivefeedItems_1**](EditorialImagesApi.md#getLivefeedItems_1) | **GET** /v2/editorial/livefeeds/{id}/items | (Deprecated) Get editorial livefeed items |
| [**getLivefeedList**](EditorialImagesApi.md#getLivefeedList) | **GET** /v2/editorial/livefeeds | (Deprecated) Get editorial livefeed list |
| [**licenseContent**](EditorialImagesApi.md#licenseContent) | **POST** /v2/editorial/images/licenses | License editorial content |
| [**licenseContent_0**](EditorialImagesApi.md#licenseContent_0) | **POST** /v2/editorial/licenses | (Deprecated) License editorial content |
| [**listCategories**](EditorialImagesApi.md#listCategories) | **GET** /v2/editorial/categories | (Deprecated) List editorial categories |
| [**listCategories_0**](EditorialImagesApi.md#listCategories_0) | **GET** /v2/editorial/images/categories | List editorial categories |
| [**listLicenses**](EditorialImagesApi.md#listLicenses) | **GET** /v2/editorial/images/licenses | List editorial image licenses |
| [**listLivefeedImages**](EditorialImagesApi.md#listLivefeedImages) | **GET** /v2/editorial/images/livefeeds | Get editorial livefeed list |
| [**listUpdatedContent**](EditorialImagesApi.md#listUpdatedContent) | **GET** /v2/editorial/images/updated | List updated content |
| [**listUpdatedContent_0**](EditorialImagesApi.md#listUpdatedContent_0) | **GET** /v2/editorial/updated | (Deprecated) List updated content |
| [**search**](EditorialImagesApi.md#search) | **GET** /v2/editorial/images/search | Search editorial images |
| [**searchContent**](EditorialImagesApi.md#searchContent) | **GET** /v2/editorial/search | (Deprecated) Search editorial content |


<a name="getDetails"></a>
# **getDetails**
> EditorialContent getDetails(id, country).searchId(searchId).execute();

(Deprecated) Get editorial content details

Deprecated; use &#x60;GET /v2/editorial/images/{id}&#x60; instead to show information about an editorial image, including a URL to a preview image and the sizes that it is available in.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EditorialImagesApi;
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
    String id = "9926131a"; // Editorial ID
    String country = "USA"; // Returns only if the content is available for distribution in a certain country
    String searchId = "00000000-0000-0000-0000-000000000000"; // The ID of the search that is related to this request
    try {
      EditorialContent result = client
              .editorialImages
              .getDetails(id, country)
              .searchId(searchId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getAspect());
      System.out.println(result.getAssets());
      System.out.println(result.getByline());
      System.out.println(result.getCaption());
      System.out.println(result.getCategories());
      System.out.println(result.getDateTaken());
      System.out.println(result.getId());
      System.out.println(result.getKeywords());
      System.out.println(result.getSpecialInstructions());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialImagesApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EditorialContent> response = client
              .editorialImages
              .getDetails(id, country)
              .searchId(searchId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialImagesApi#getDetails");
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
| **id** | **String**| Editorial ID | |
| **country** | **String**| Returns only if the content is available for distribution in a certain country | |
| **searchId** | **String**| The ID of the search that is related to this request | [optional] |

### Return type

[**EditorialContent**](EditorialContent.md)

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
| **404** | Not Found |  -  |

<a name="getImageDetails"></a>
# **getImageDetails**
> EditorialContent getImageDetails(id, country).execute();

Get editorial content details

This endpoint shows information about an editorial image, including a URL to a preview image and the sizes that it is available in.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EditorialImagesApi;
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
    String id = "9926131a"; // Editorial ID
    String country = "USA"; // Returns only if the content is available for distribution in a certain country
    try {
      EditorialContent result = client
              .editorialImages
              .getImageDetails(id, country)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getAspect());
      System.out.println(result.getAssets());
      System.out.println(result.getByline());
      System.out.println(result.getCaption());
      System.out.println(result.getCategories());
      System.out.println(result.getDateTaken());
      System.out.println(result.getId());
      System.out.println(result.getKeywords());
      System.out.println(result.getSpecialInstructions());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialImagesApi#getImageDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EditorialContent> response = client
              .editorialImages
              .getImageDetails(id, country)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialImagesApi#getImageDetails");
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
| **id** | **String**| Editorial ID | |
| **country** | **String**| Returns only if the content is available for distribution in a certain country | |

### Return type

[**EditorialContent**](EditorialContent.md)

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
| **404** | Not Found |  -  |

<a name="getLivefeedImages"></a>
# **getLivefeedImages**
> EditorialImageLivefeed getLivefeedImages(id, country).execute();

Get editorial livefeed

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EditorialImagesApi;
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
    String id = "2018%2F10%2F15%2FWomen%20of%20the%20Year%20Lunch%20%26%20Awards%2C%20London"; // Editorial livefeed ID; must be an URI encoded string
    String country = "USA"; // Returns only if the livefeed is available for distribution in a certain country
    try {
      EditorialImageLivefeed result = client
              .editorialImages
              .getLivefeedImages(id, country)
              .execute();
      System.out.println(result);
      System.out.println(result.getCoverItem());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getTotalItemCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialImagesApi#getLivefeedImages");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EditorialImageLivefeed> response = client
              .editorialImages
              .getLivefeedImages(id, country)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialImagesApi#getLivefeedImages");
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
| **id** | **String**| Editorial livefeed ID; must be an URI encoded string | |
| **country** | **String**| Returns only if the livefeed is available for distribution in a certain country | |

### Return type

[**EditorialImageLivefeed**](EditorialImageLivefeed.md)

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
| **404** | Not Found |  -  |

<a name="getLivefeedItems"></a>
# **getLivefeedItems**
> EditorialImageContentDataList getLivefeedItems(id, country).execute();

Get editorial livefeed items

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EditorialImagesApi;
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
    String id = "2018%2F10%2F15%2FWomen%20of%20the%20Year%20Lunch%20%26%20Awards%2C%20London"; // Editorial livefeed ID; must be an URI encoded string
    String country = "USA"; // Returns only if the livefeed items are available for distribution in a certain country
    try {
      EditorialImageContentDataList result = client
              .editorialImages
              .getLivefeedItems(id, country)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getMessage());
      System.out.println(result.getPage());
      System.out.println(result.getPerPage());
      System.out.println(result.getTotalCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialImagesApi#getLivefeedItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EditorialImageContentDataList> response = client
              .editorialImages
              .getLivefeedItems(id, country)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialImagesApi#getLivefeedItems");
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
| **id** | **String**| Editorial livefeed ID; must be an URI encoded string | |
| **country** | **String**| Returns only if the livefeed items are available for distribution in a certain country | |

### Return type

[**EditorialImageContentDataList**](EditorialImageContentDataList.md)

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
| **404** | Not Found |  -  |

<a name="getLivefeedItems_0"></a>
# **getLivefeedItems_0**
> EditorialLivefeed getLivefeedItems_0(id, country).execute();

(Deprecated) Get editorial livefeed

Deprecated: use &#x60;GET /v2/editorial/images/livefeeds/{id}&#x60; instead to get an editorial livefeed.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EditorialImagesApi;
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
    String id = "2018%2F10%2F15%2FWomen%20of%20the%20Year%20Lunch%20%26%20Awards%2C%20London"; // Editorial livefeed ID; must be an URI encoded string
    String country = "USA"; // Returns only if the livefeed is available for distribution in a certain country
    try {
      EditorialLivefeed result = client
              .editorialImages
              .getLivefeedItems_0(id, country)
              .execute();
      System.out.println(result);
      System.out.println(result.getCoverItem());
      System.out.println(result.getCreatedTime());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getTotalItemCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialImagesApi#getLivefeedItems_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EditorialLivefeed> response = client
              .editorialImages
              .getLivefeedItems_0(id, country)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialImagesApi#getLivefeedItems_0");
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
| **id** | **String**| Editorial livefeed ID; must be an URI encoded string | |
| **country** | **String**| Returns only if the livefeed is available for distribution in a certain country | |

### Return type

[**EditorialLivefeed**](EditorialLivefeed.md)

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
| **406** | Not Acceptable |  -  |

<a name="getLivefeedItems_1"></a>
# **getLivefeedItems_1**
> EditorialContentDataList getLivefeedItems_1(id, country).execute();

(Deprecated) Get editorial livefeed items

Deprecated; use &#x60;GET /v2/editorial/images/livefeeds/{id}/items&#x60; instead to get editorial livefeed items.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EditorialImagesApi;
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
    String id = "2018%2F10%2F15%2FWomen%20of%20the%20Year%20Lunch%20%26%20Awards%2C%20London"; // Editorial livefeed ID; must be an URI encoded string
    String country = "USA"; // Returns only if the livefeed items are available for distribution in a certain country
    try {
      EditorialContentDataList result = client
              .editorialImages
              .getLivefeedItems_1(id, country)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getMessage());
      System.out.println(result.getPage());
      System.out.println(result.getPerPage());
      System.out.println(result.getTotalCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialImagesApi#getLivefeedItems_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EditorialContentDataList> response = client
              .editorialImages
              .getLivefeedItems_1(id, country)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialImagesApi#getLivefeedItems_1");
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
| **id** | **String**| Editorial livefeed ID; must be an URI encoded string | |
| **country** | **String**| Returns only if the livefeed items are available for distribution in a certain country | |

### Return type

[**EditorialContentDataList**](EditorialContentDataList.md)

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
| **406** | Not Acceptable |  -  |

<a name="getLivefeedList"></a>
# **getLivefeedList**
> EditorialLivefeedList getLivefeedList(country).page(page).perPage(perPage).execute();

(Deprecated) Get editorial livefeed list

Deprecated; use &#x60;GET /v2/editorial/images/livefeeds&#x60; instead to get a list of editorial livefeeds.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EditorialImagesApi;
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
    String country = "USA"; // Returns only livefeeds that are available for distribution in a certain country
    Integer page = 1; // Page number
    Integer perPage = 20; // Number of results per page
    try {
      EditorialLivefeedList result = client
              .editorialImages
              .getLivefeedList(country)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
      System.out.println(result.getPage());
      System.out.println(result.getPerPage());
      System.out.println(result.getTotalCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialImagesApi#getLivefeedList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EditorialLivefeedList> response = client
              .editorialImages
              .getLivefeedList(country)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialImagesApi#getLivefeedList");
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
| **country** | **String**| Returns only livefeeds that are available for distribution in a certain country | |
| **page** | **Integer**| Page number | [optional] [default to 1] |
| **perPage** | **Integer**| Number of results per page | [optional] [default to 20] |

### Return type

[**EditorialLivefeedList**](EditorialLivefeedList.md)

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
| **406** | Not Acceptable |  -  |

<a name="licenseContent"></a>
# **licenseContent**
> LicenseEditorialContentResults licenseContent(licenseEditorialContentRequest).execute();

License editorial content

This endpoint gets licenses for one or more editorial images. You must specify the country and one or more editorial images to license. The download links in the response are valid for 8 hours.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EditorialImagesApi;
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
    Object country = null;
    List<LicenseEditorialContent> editorial = Arrays.asList(); // Editorial content to license
    try {
      LicenseEditorialContentResults result = client
              .editorialImages
              .licenseContent(country, editorial)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getMessage());
      System.out.println(result.getPage());
      System.out.println(result.getPerPage());
      System.out.println(result.getTotalCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialImagesApi#licenseContent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LicenseEditorialContentResults> response = client
              .editorialImages
              .licenseContent(country, editorial)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialImagesApi#licenseContent");
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
| **licenseEditorialContentRequest** | [**LicenseEditorialContentRequest**](LicenseEditorialContentRequest.md)| License editorial content | |

### Return type

[**LicenseEditorialContentResults**](LicenseEditorialContentResults.md)

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
| **406** | Not Acceptable |  -  |

<a name="licenseContent_0"></a>
# **licenseContent_0**
> LicenseEditorialContentResults licenseContent_0(licenseEditorialContentRequest).execute();

(Deprecated) License editorial content

Deprecated; use &#x60;POST /v2/editorial/images/licenses&#x60; instead to get licenses for one or more editorial images. You must specify the country and one or more editorial images to license. The download links in the response are valid for 8 hours.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EditorialImagesApi;
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
    Object country = null;
    List<LicenseEditorialContent> editorial = Arrays.asList(); // Editorial content to license
    try {
      LicenseEditorialContentResults result = client
              .editorialImages
              .licenseContent_0(country, editorial)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getMessage());
      System.out.println(result.getPage());
      System.out.println(result.getPerPage());
      System.out.println(result.getTotalCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialImagesApi#licenseContent_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LicenseEditorialContentResults> response = client
              .editorialImages
              .licenseContent_0(country, editorial)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialImagesApi#licenseContent_0");
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
| **licenseEditorialContentRequest** | [**LicenseEditorialContentRequest**](LicenseEditorialContentRequest.md)| License editorial content | |

### Return type

[**LicenseEditorialContentResults**](LicenseEditorialContentResults.md)

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
| **406** | Not Acceptable |  -  |

<a name="listCategories"></a>
# **listCategories**
> EditorialCategoryResults listCategories().execute();

(Deprecated) List editorial categories

Deprecated; use &#x60;GET /v2/editorial/images/categories&#x60; instead. This endpoint lists the categories that editorial images can belong to, which are separate from the categories that other types of assets can belong to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EditorialImagesApi;
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
    try {
      EditorialCategoryResults result = client
              .editorialImages
              .listCategories()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialImagesApi#listCategories");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EditorialCategoryResults> response = client
              .editorialImages
              .listCategories()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialImagesApi#listCategories");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EditorialCategoryResults**](EditorialCategoryResults.md)

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

<a name="listCategories_0"></a>
# **listCategories_0**
> EditorialImageCategoryResults listCategories_0().execute();

List editorial categories

This endpoint lists the categories that editorial images can belong to, which are separate from the categories that other types of assets can belong to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EditorialImagesApi;
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
    try {
      EditorialImageCategoryResults result = client
              .editorialImages
              .listCategories_0()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialImagesApi#listCategories_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EditorialImageCategoryResults> response = client
              .editorialImages
              .listCategories_0()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialImagesApi#listCategories_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EditorialImageCategoryResults**](EditorialImageCategoryResults.md)

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

List editorial image licenses

This endpoint lists existing editorial image licenses.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EditorialImagesApi;
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
    String imageId = "12345678"; // Show licenses for the specified editorial image ID
    String license = "premier_editorial_all_digital"; // Show editorial images that are available with the specified license name
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
              .editorialImages
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
      System.err.println("Exception when calling EditorialImagesApi#listLicenses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DownloadHistoryDataList> response = client
              .editorialImages
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
      System.err.println("Exception when calling EditorialImagesApi#listLicenses");
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
| **imageId** | **String**| Show licenses for the specified editorial image ID | [optional] |
| **license** | **String**| Show editorial images that are available with the specified license name | [optional] |
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

<a name="listLivefeedImages"></a>
# **listLivefeedImages**
> EditorialImageLivefeedList listLivefeedImages(country).page(page).perPage(perPage).execute();

Get editorial livefeed list

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EditorialImagesApi;
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
    String country = "USA"; // Returns only livefeeds that are available for distribution in a certain country
    Integer page = 1; // Page number
    Integer perPage = 20; // Number of results per page
    try {
      EditorialImageLivefeedList result = client
              .editorialImages
              .listLivefeedImages(country)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
      System.out.println(result.getPage());
      System.out.println(result.getPerPage());
      System.out.println(result.getTotalCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialImagesApi#listLivefeedImages");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EditorialImageLivefeedList> response = client
              .editorialImages
              .listLivefeedImages(country)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialImagesApi#listLivefeedImages");
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
| **country** | **String**| Returns only livefeeds that are available for distribution in a certain country | |
| **page** | **Integer**| Page number | [optional] [default to 1] |
| **perPage** | **Integer**| Number of results per page | [optional] [default to 20] |

### Return type

[**EditorialImageLivefeedList**](EditorialImageLivefeedList.md)

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
| **404** | Not Found |  -  |

<a name="listUpdatedContent"></a>
# **listUpdatedContent**
> EditorialUpdatedResults listUpdatedContent(type, dateUpdatedStart, dateUpdatedEnd, country).dateTakenStart(dateTakenStart).dateTakenEnd(dateTakenEnd).cursor(cursor).sort(sort).supplierCode(supplierCode).perPage(perPage).execute();

List updated content

This endpoint lists editorial images that have been updated in the specified time period to update content management systems (CMS) or digital asset management (DAM) systems. In most cases, use the date_updated_start and date_updated_end parameters to specify a range updates based on when the updates happened. You can also use the date_taken_start and date_taken_end parameters to specify a range of updates based on when the image was taken.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EditorialImagesApi;
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
    String type = "edit"; // Specify `addition` to return only images that were added or `edit` to return only images that were edited or deleted
    OffsetDateTime dateUpdatedStart = OffsetDateTime.parse("2021-03-29T13:25:13.521Z"); // Show images images added, edited, or deleted after the specified date. Acceptable range is 1970-01-01T00:00:01 to 2038-01-19T00:00:00.
    OffsetDateTime dateUpdatedEnd = OffsetDateTime.parse("2021-03-29T13:25:13.521Z"); // Show images images added, edited, or deleted before the specified date. Acceptable range is 1970-01-01T00:00:01 to 2038-01-19T00:00:00.
    String country = "USA"; // Show only editorial content that is available for distribution in a certain country
    LocalDate dateTakenStart = LocalDate.parse("2020-02-04T00:00:00.000Z"); // Show images that were taken on or after the specified date; use this parameter if you want recently created images from the collection instead of updated older assets
    LocalDate dateTakenEnd = LocalDate.parse("2020-02-05T00:00:00.000Z"); // Show images that were taken before the specified date
    String cursor = "eyJ2IjoxLCJzIjoyfQ=="; // The cursor of the page with which to start fetching results; this cursor is returned from previous requests
    String sort = "newest"; // Sort by
    List<String> supplierCode = Arrays.asList(); // Show only editorial content from certain suppliers
    Integer perPage = 500; // Number of results per page
    try {
      EditorialUpdatedResults result = client
              .editorialImages
              .listUpdatedContent(type, dateUpdatedStart, dateUpdatedEnd, country)
              .dateTakenStart(dateTakenStart)
              .dateTakenEnd(dateTakenEnd)
              .cursor(cursor)
              .sort(sort)
              .supplierCode(supplierCode)
              .perPage(perPage)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
      System.out.println(result.getNext());
      System.out.println(result.getPerPage());
      System.out.println(result.getPrev());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialImagesApi#listUpdatedContent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EditorialUpdatedResults> response = client
              .editorialImages
              .listUpdatedContent(type, dateUpdatedStart, dateUpdatedEnd, country)
              .dateTakenStart(dateTakenStart)
              .dateTakenEnd(dateTakenEnd)
              .cursor(cursor)
              .sort(sort)
              .supplierCode(supplierCode)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialImagesApi#listUpdatedContent");
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
| **type** | **String**| Specify &#x60;addition&#x60; to return only images that were added or &#x60;edit&#x60; to return only images that were edited or deleted | [enum: edit, addition] |
| **dateUpdatedStart** | **OffsetDateTime**| Show images images added, edited, or deleted after the specified date. Acceptable range is 1970-01-01T00:00:01 to 2038-01-19T00:00:00. | |
| **dateUpdatedEnd** | **OffsetDateTime**| Show images images added, edited, or deleted before the specified date. Acceptable range is 1970-01-01T00:00:01 to 2038-01-19T00:00:00. | |
| **country** | **String**| Show only editorial content that is available for distribution in a certain country | |
| **dateTakenStart** | **LocalDate**| Show images that were taken on or after the specified date; use this parameter if you want recently created images from the collection instead of updated older assets | [optional] |
| **dateTakenEnd** | **LocalDate**| Show images that were taken before the specified date | [optional] |
| **cursor** | **String**| The cursor of the page with which to start fetching results; this cursor is returned from previous requests | [optional] |
| **sort** | **String**| Sort by | [optional] [default to newest] [enum: newest, oldest] |
| **supplierCode** | [**List&lt;String&gt;**](String.md)| Show only editorial content from certain suppliers | [optional] |
| **perPage** | **Integer**| Number of results per page | [optional] [default to 500] |

### Return type

[**EditorialUpdatedResults**](EditorialUpdatedResults.md)

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
| **406** | Not Acceptable |  -  |

<a name="listUpdatedContent_0"></a>
# **listUpdatedContent_0**
> EditorialUpdatedResults listUpdatedContent_0(type, dateUpdatedStart, dateUpdatedEnd, country).dateTakenStart(dateTakenStart).dateTakenEnd(dateTakenEnd).cursor(cursor).sort(sort).supplierCode(supplierCode).perPage(perPage).execute();

(Deprecated) List updated content

Deprecated; use &#x60;GET /v2/editorial/images/updated&#x60; instead to get recently updated items.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EditorialImagesApi;
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
    String type = "edit"; // Specify `addition` to return only images that were added or `edit` to return only images that were edited or deleted
    OffsetDateTime dateUpdatedStart = OffsetDateTime.parse("2021-03-29T13:25:13.521Z"); // Show images images added, edited, or deleted after the specified date. Acceptable range is 1970-01-01T00:00:01 to 2038-01-19T00:00:00.
    OffsetDateTime dateUpdatedEnd = OffsetDateTime.parse("2021-03-29T13:25:13.521Z"); // Show images images added, edited, or deleted before the specified date. Acceptable range is 1970-01-01T00:00:01 to 2038-01-19T00:00:00.
    String country = "USA"; // Show only editorial content that is available for distribution in a certain country
    LocalDate dateTakenStart = LocalDate.parse("2020-02-04T00:00:00.000Z"); // Show images that were taken on or after the specified date; use this parameter if you want recently created images from the collection instead of updated older assets
    LocalDate dateTakenEnd = LocalDate.parse("2020-02-05T00:00:00.000Z"); // Show images that were taken before the specified date
    String cursor = "eyJ2IjoxLCJzIjoyfQ=="; // The cursor of the page with which to start fetching results; this cursor is returned from previous requests
    String sort = "newest"; // Sort by
    List<String> supplierCode = Arrays.asList(); // Show only editorial content from certain suppliers
    Integer perPage = 500; // Number of results per page
    try {
      EditorialUpdatedResults result = client
              .editorialImages
              .listUpdatedContent_0(type, dateUpdatedStart, dateUpdatedEnd, country)
              .dateTakenStart(dateTakenStart)
              .dateTakenEnd(dateTakenEnd)
              .cursor(cursor)
              .sort(sort)
              .supplierCode(supplierCode)
              .perPage(perPage)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
      System.out.println(result.getNext());
      System.out.println(result.getPerPage());
      System.out.println(result.getPrev());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialImagesApi#listUpdatedContent_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EditorialUpdatedResults> response = client
              .editorialImages
              .listUpdatedContent_0(type, dateUpdatedStart, dateUpdatedEnd, country)
              .dateTakenStart(dateTakenStart)
              .dateTakenEnd(dateTakenEnd)
              .cursor(cursor)
              .sort(sort)
              .supplierCode(supplierCode)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialImagesApi#listUpdatedContent_0");
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
| **type** | **String**| Specify &#x60;addition&#x60; to return only images that were added or &#x60;edit&#x60; to return only images that were edited or deleted | [enum: edit, addition] |
| **dateUpdatedStart** | **OffsetDateTime**| Show images images added, edited, or deleted after the specified date. Acceptable range is 1970-01-01T00:00:01 to 2038-01-19T00:00:00. | |
| **dateUpdatedEnd** | **OffsetDateTime**| Show images images added, edited, or deleted before the specified date. Acceptable range is 1970-01-01T00:00:01 to 2038-01-19T00:00:00. | |
| **country** | **String**| Show only editorial content that is available for distribution in a certain country | |
| **dateTakenStart** | **LocalDate**| Show images that were taken on or after the specified date; use this parameter if you want recently created images from the collection instead of updated older assets | [optional] |
| **dateTakenEnd** | **LocalDate**| Show images that were taken before the specified date | [optional] |
| **cursor** | **String**| The cursor of the page with which to start fetching results; this cursor is returned from previous requests | [optional] |
| **sort** | **String**| Sort by | [optional] [default to newest] [enum: newest, oldest] |
| **supplierCode** | [**List&lt;String&gt;**](String.md)| Show only editorial content from certain suppliers | [optional] |
| **perPage** | **Integer**| Number of results per page | [optional] [default to 500] |

### Return type

[**EditorialUpdatedResults**](EditorialUpdatedResults.md)

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
| **406** | Not Acceptable |  -  |

<a name="search"></a>
# **search**
> EditorialSearchResults search(country).query(query).sort(sort).category(category).supplierCode(supplierCode).dateStart(dateStart).dateEnd(dateEnd).perPage(perPage).cursor(cursor).execute();

Search editorial images

This endpoint searches for editorial images. If you specify more than one search parameter, the API uses an AND condition. For example, if you set the &#x60;category&#x60; parameter to \&quot;Alone,Performing\&quot; and also specify a &#x60;query&#x60; parameter, the results include only images that match the query and are in both the Alone and Performing categories. You can also filter search terms out in the &#x60;query&#x60; parameter by prefixing the term with NOT.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EditorialImagesApi;
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
    String country = "USA"; // Show only editorial content that is available for distribution in a certain country
    String query = "The Academy Awards"; // One or more search terms separated by spaces
    String sort = "relevant"; // Sort by
    String category = "Alone,Performing"; // Show editorial content with each of the specified editorial categories; specify category names in a comma-separated list
    List<String> supplierCode = Arrays.asList(); // Show only editorial content from certain suppliers
    LocalDate dateStart = LocalDate.parse("2020-05-29T00:00:00.000Z"); // Show only editorial content generated on or after a specific date
    LocalDate dateEnd = LocalDate.parse("2021-05-29T00:00:00.000Z"); // Show only editorial content generated on or before a specific date
    Integer perPage = 20; // Number of results per page
    String cursor = "eyJ2IjoxLCJzIjoxfQ=="; // The cursor of the page with which to start fetching results; this cursor is returned from previous requests
    try {
      EditorialSearchResults result = client
              .editorialImages
              .search(country)
              .query(query)
              .sort(sort)
              .category(category)
              .supplierCode(supplierCode)
              .dateStart(dateStart)
              .dateEnd(dateEnd)
              .perPage(perPage)
              .cursor(cursor)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
      System.out.println(result.getNext());
      System.out.println(result.getPage());
      System.out.println(result.getPerPage());
      System.out.println(result.getPrev());
      System.out.println(result.getSearchId());
      System.out.println(result.getTotalCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialImagesApi#search");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EditorialSearchResults> response = client
              .editorialImages
              .search(country)
              .query(query)
              .sort(sort)
              .category(category)
              .supplierCode(supplierCode)
              .dateStart(dateStart)
              .dateEnd(dateEnd)
              .perPage(perPage)
              .cursor(cursor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialImagesApi#search");
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
| **country** | **String**| Show only editorial content that is available for distribution in a certain country | |
| **query** | **String**| One or more search terms separated by spaces | [optional] |
| **sort** | **String**| Sort by | [optional] [default to relevant] [enum: relevant, newest, oldest] |
| **category** | **String**| Show editorial content with each of the specified editorial categories; specify category names in a comma-separated list | [optional] |
| **supplierCode** | [**List&lt;String&gt;**](String.md)| Show only editorial content from certain suppliers | [optional] |
| **dateStart** | **LocalDate**| Show only editorial content generated on or after a specific date | [optional] |
| **dateEnd** | **LocalDate**| Show only editorial content generated on or before a specific date | [optional] |
| **perPage** | **Integer**| Number of results per page | [optional] [default to 20] |
| **cursor** | **String**| The cursor of the page with which to start fetching results; this cursor is returned from previous requests | [optional] |

### Return type

[**EditorialSearchResults**](EditorialSearchResults.md)

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
| **406** | Not Acceptable |  -  |

<a name="searchContent"></a>
# **searchContent**
> EditorialSearchResults searchContent(country).query(query).sort(sort).category(category).supplierCode(supplierCode).dateStart(dateStart).dateEnd(dateEnd).perPage(perPage).cursor(cursor).execute();

(Deprecated) Search editorial content

Deprecated; use &#x60;GET /v2/editorial/images/search&#x60; instead to search for editorial images.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EditorialImagesApi;
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
    String country = "USA"; // Show only editorial content that is available for distribution in a certain country
    String query = "query_example"; // One or more search terms separated by spaces
    String sort = "relevant"; // Sort by
    String category = "category_example"; // Show editorial content within a certain editorial category; specify by category name
    List<String> supplierCode = Arrays.asList(); // Show only editorial content from certain suppliers
    LocalDate dateStart = LocalDate.now(); // Show only editorial content generated on or after a specific date
    LocalDate dateEnd = LocalDate.now(); // Show only editorial content generated on or before a specific date
    Integer perPage = 20; // Number of results per page
    String cursor = "cursor_example"; // The cursor of the page with which to start fetching results; this cursor is returned from previous requests
    try {
      EditorialSearchResults result = client
              .editorialImages
              .searchContent(country)
              .query(query)
              .sort(sort)
              .category(category)
              .supplierCode(supplierCode)
              .dateStart(dateStart)
              .dateEnd(dateEnd)
              .perPage(perPage)
              .cursor(cursor)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
      System.out.println(result.getNext());
      System.out.println(result.getPage());
      System.out.println(result.getPerPage());
      System.out.println(result.getPrev());
      System.out.println(result.getSearchId());
      System.out.println(result.getTotalCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialImagesApi#searchContent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EditorialSearchResults> response = client
              .editorialImages
              .searchContent(country)
              .query(query)
              .sort(sort)
              .category(category)
              .supplierCode(supplierCode)
              .dateStart(dateStart)
              .dateEnd(dateEnd)
              .perPage(perPage)
              .cursor(cursor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialImagesApi#searchContent");
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
| **country** | **String**| Show only editorial content that is available for distribution in a certain country | |
| **query** | **String**| One or more search terms separated by spaces | [optional] |
| **sort** | **String**| Sort by | [optional] [default to relevant] [enum: relevant, newest, oldest] |
| **category** | **String**| Show editorial content within a certain editorial category; specify by category name | [optional] |
| **supplierCode** | [**List&lt;String&gt;**](String.md)| Show only editorial content from certain suppliers | [optional] |
| **dateStart** | **LocalDate**| Show only editorial content generated on or after a specific date | [optional] |
| **dateEnd** | **LocalDate**| Show only editorial content generated on or before a specific date | [optional] |
| **perPage** | **Integer**| Number of results per page | [optional] [default to 20] |
| **cursor** | **String**| The cursor of the page with which to start fetching results; this cursor is returned from previous requests | [optional] |

### Return type

[**EditorialSearchResults**](EditorialSearchResults.md)

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
| **406** | Not Acceptable |  -  |

