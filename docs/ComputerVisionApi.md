# ComputerVisionApi

All URIs are relative to *https://api.shutterstock.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listSimilarImages**](ComputerVisionApi.md#listSimilarImages) | **GET** /v2/cv/similar/images | List similar images |
| [**listSimilarVideos**](ComputerVisionApi.md#listSimilarVideos) | **GET** /v2/cv/similar/videos | List similar videos |
| [**listSuggestedKeywords**](ComputerVisionApi.md#listSuggestedKeywords) | **GET** /v2/cv/keywords | List suggested keywords |
| [**uploadImage**](ComputerVisionApi.md#uploadImage) | **POST** /v2/cv/images | Upload images |
| [**uploadImageEphemeral**](ComputerVisionApi.md#uploadImageEphemeral) | **POST** /v2/images | Upload ephemeral images |


<a name="listSimilarImages"></a>
# **listSimilarImages**
> ImageSearchResults listSimilarImages(assetId).license(license).safe(safe).language(language).page(page).perPage(perPage).view(view).execute();

List similar images

This endpoint returns images that are visually similar to an image that you specify or upload.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ComputerVisionApi;
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
    String assetId = "U6ba16262e3bc2db470b8e3cfa8aaab25"; // The asset ID or upload ID to find similar images for
    List<String> license = Arrays.asList(); // Show only images with the specified license
    Boolean safe = true; // Enable or disable safe search
    Language language = Language.fromValue("ar"); // Language for the keywords and categories in the response
    Integer page = 1; // Page number
    Integer perPage = 20; // Number of results per page
    String view = "minimal"; // Amount of detail to render in the response
    try {
      ImageSearchResults result = client
              .computerVision
              .listSimilarImages(assetId)
              .license(license)
              .safe(safe)
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
      System.err.println("Exception when calling ComputerVisionApi#listSimilarImages");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ImageSearchResults> response = client
              .computerVision
              .listSimilarImages(assetId)
              .license(license)
              .safe(safe)
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
      System.err.println("Exception when calling ComputerVisionApi#listSimilarImages");
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
| **assetId** | **String**| The asset ID or upload ID to find similar images for | |
| **license** | [**List&lt;String&gt;**](String.md)| Show only images with the specified license | [optional] [enum: commercial, editorial] |
| **safe** | **Boolean**| Enable or disable safe search | [optional] [default to true] |
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

<a name="listSimilarVideos"></a>
# **listSimilarVideos**
> VideoSearchResults listSimilarVideos(assetId).license(license).safe(safe).language(language).page(page).perPage(perPage).view(view).execute();

List similar videos

This endpoint returns videos that are visually similar to an image that you specify or upload.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ComputerVisionApi;
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
    String assetId = "U6ba16262e3bc2db470b8e3cfa8aaab25"; // The asset ID or upload ID to find similar videos for
    List<String> license = Arrays.asList(); // Show only videos with the specified license
    Boolean safe = true; // Enable or disable safe search
    Language language = Language.fromValue("ar"); // Language for the keywords and categories in the response
    Integer page = 1; // Page number
    Integer perPage = 20; // Number of results per page
    String view = "minimal"; // Amount of detail to render in the response
    try {
      VideoSearchResults result = client
              .computerVision
              .listSimilarVideos(assetId)
              .license(license)
              .safe(safe)
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
      System.err.println("Exception when calling ComputerVisionApi#listSimilarVideos");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VideoSearchResults> response = client
              .computerVision
              .listSimilarVideos(assetId)
              .license(license)
              .safe(safe)
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
      System.err.println("Exception when calling ComputerVisionApi#listSimilarVideos");
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
| **assetId** | **String**| The asset ID or upload ID to find similar videos for | |
| **license** | [**List&lt;String&gt;**](String.md)| Show only videos with the specified license | [optional] [enum: commercial, editorial] |
| **safe** | **Boolean**| Enable or disable safe search | [optional] [default to true] |
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

<a name="listSuggestedKeywords"></a>
# **listSuggestedKeywords**
> KeywordDataList listSuggestedKeywords(assetId).execute();

List suggested keywords

This endpoint returns a list of suggested keywords for a media item that you specify or upload.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ComputerVisionApi;
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
    Object assetId = U6ba16262e3bc2db470b8e3cfa8aaab25; // The asset ID or upload ID to suggest keywords for
    try {
      KeywordDataList result = client
              .computerVision
              .listSuggestedKeywords(assetId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling ComputerVisionApi#listSuggestedKeywords");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<KeywordDataList> response = client
              .computerVision
              .listSuggestedKeywords(assetId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ComputerVisionApi#listSuggestedKeywords");
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
| **assetId** | [**Object**](.md)| The asset ID or upload ID to suggest keywords for | |

### Return type

[**KeywordDataList**](KeywordDataList.md)

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
| **415** | Unsupported Media Type |  -  |

<a name="uploadImage"></a>
# **uploadImage**
> ComputerVisionImageCreateResponse uploadImage(imageCreateRequest).execute();

Upload images

This endpoint uploads an image for reverse image or video search. Images must be in JPEG or PNG format. To get the search results, pass the upload ID that this endpoint returns to the GET /v2/cv/similar/images or GET /v2/cv/similar/videos endpoints. Contact us for access to this endpoint.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ComputerVisionApi;
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
    String base64Image = "base64Image_example"; // A Base 64 encoded jpeg or png; images can be no larger than 10mb and can be no larger than 10,000 pixels in width or height
    try {
      ComputerVisionImageCreateResponse result = client
              .computerVision
              .uploadImage(base64Image)
              .execute();
      System.out.println(result);
      System.out.println(result.getUploadId());
    } catch (ApiException e) {
      System.err.println("Exception when calling ComputerVisionApi#uploadImage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ComputerVisionImageCreateResponse> response = client
              .computerVision
              .uploadImage(base64Image)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ComputerVisionApi#uploadImage");
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
| **imageCreateRequest** | [**ImageCreateRequest**](ImageCreateRequest.md)| A Base 64 encoded jpeg or png; images can be no larger than 10mb and can be no larger than 10,000 pixels in width or height | |

### Return type

[**ComputerVisionImageCreateResponse**](ComputerVisionImageCreateResponse.md)

### Authorization

[basic](../README.md#basic), [customer_accessCode](../README.md#customer_accessCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **413** | Payload Too Large |  -  |
| **415** | Unsupported Media Type |  -  |

<a name="uploadImageEphemeral"></a>
# **uploadImageEphemeral**
> ImageCreateResponse uploadImageEphemeral(imageCreateRequest).execute();

Upload ephemeral images

Deprecated; use &#x60;POST /v2/cv/images&#x60; instead. This endpoint uploads an image for reverse image search. The image must be in JPEG or PNG format. To get the search results, pass the ID that this endpoint returns to the &#x60;GET /v2/images/{id}/similar&#x60; endpoint.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ComputerVisionApi;
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
    String base64Image = "base64Image_example"; // A Base 64 encoded jpeg or png; images can be no larger than 10mb and can be no larger than 10,000 pixels in width or height
    try {
      ImageCreateResponse result = client
              .computerVision
              .uploadImageEphemeral(base64Image)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling ComputerVisionApi#uploadImageEphemeral");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ImageCreateResponse> response = client
              .computerVision
              .uploadImageEphemeral(base64Image)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ComputerVisionApi#uploadImageEphemeral");
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
| **imageCreateRequest** | [**ImageCreateRequest**](ImageCreateRequest.md)| The image data in JPEG or PNG format | |

### Return type

[**ImageCreateResponse**](ImageCreateResponse.md)

### Authorization

[basic](../README.md#basic), [customer_accessCode](../README.md#customer_accessCode)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **413** | Payload Too Large |  -  |

