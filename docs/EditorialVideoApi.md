# EditorialVideoApi

All URIs are relative to *https://api.shutterstock.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getContentDetails**](EditorialVideoApi.md#getContentDetails) | **GET** /v2/editorial/videos/{id} | Get editorial video content details |
| [**licenseVideos**](EditorialVideoApi.md#licenseVideos) | **POST** /v2/editorial/videos/licenses | License editorial video content |
| [**listVideoCategories**](EditorialVideoApi.md#listVideoCategories) | **GET** /v2/editorial/videos/categories | List editorial video categories |
| [**listVideoLicenses**](EditorialVideoApi.md#listVideoLicenses) | **GET** /v2/editorial/videos/licenses | List editorial video licenses |
| [**searchVideoContent**](EditorialVideoApi.md#searchVideoContent) | **GET** /v2/editorial/videos/search | Search editorial video content |


<a name="getContentDetails"></a>
# **getContentDetails**
> EditorialVideoContent getContentDetails(id, country).searchId(searchId).execute();

Get editorial video content details

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
import com.konfigthis.client.api.EditorialVideoApi;
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
      EditorialVideoContent result = client
              .editorialVideo
              .getContentDetails(id, country)
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
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialVideoApi#getContentDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EditorialVideoContent> response = client
              .editorialVideo
              .getContentDetails(id, country)
              .searchId(searchId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialVideoApi#getContentDetails");
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

[**EditorialVideoContent**](EditorialVideoContent.md)

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

<a name="licenseVideos"></a>
# **licenseVideos**
> LicenseEditorialContentResults licenseVideos(licenseEditorialVideoContentRequest).execute();

License editorial video content

This endpoint gets licenses for one or more editorial videos. You must specify the country and one or more editorial videos to license. The download links in the response are valid for 8 hours.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EditorialVideoApi;
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
    List<LicenseEditorialVideoContent> editorial = Arrays.asList(); // Editorial content to license
    try {
      LicenseEditorialContentResults result = client
              .editorialVideo
              .licenseVideos(country, editorial)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getMessage());
      System.out.println(result.getPage());
      System.out.println(result.getPerPage());
      System.out.println(result.getTotalCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialVideoApi#licenseVideos");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LicenseEditorialContentResults> response = client
              .editorialVideo
              .licenseVideos(country, editorial)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialVideoApi#licenseVideos");
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
| **licenseEditorialVideoContentRequest** | [**LicenseEditorialVideoContentRequest**](LicenseEditorialVideoContentRequest.md)| License editorial video content | |

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

<a name="listVideoCategories"></a>
# **listVideoCategories**
> EditorialVideoCategoryResults listVideoCategories().execute();

List editorial video categories

This endpoint lists the categories that editorial videos can belong to, which are separate from the categories that other types of assets can belong to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EditorialVideoApi;
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
      EditorialVideoCategoryResults result = client
              .editorialVideo
              .listVideoCategories()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialVideoApi#listVideoCategories");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EditorialVideoCategoryResults> response = client
              .editorialVideo
              .listVideoCategories()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialVideoApi#listVideoCategories");
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

[**EditorialVideoCategoryResults**](EditorialVideoCategoryResults.md)

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

<a name="listVideoLicenses"></a>
# **listVideoLicenses**
> DownloadHistoryDataList listVideoLicenses().videoId(videoId).license(license).page(page).perPage(perPage).sort(sort).username(username).startDate(startDate).endDate(endDate).downloadAvailability(downloadAvailability).teamHistory(teamHistory).execute();

List editorial video licenses

This endpoint lists existing editorial video licenses.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EditorialVideoApi;
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
    String videoId = "12345678"; // Show licenses for the specified editorial video ID
    String license = "premier_editorial_all_media"; // Show editorial videos that are available with the specified license name
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
              .editorialVideo
              .listVideoLicenses()
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
      System.err.println("Exception when calling EditorialVideoApi#listVideoLicenses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DownloadHistoryDataList> response = client
              .editorialVideo
              .listVideoLicenses()
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
      System.err.println("Exception when calling EditorialVideoApi#listVideoLicenses");
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
| **videoId** | **String**| Show licenses for the specified editorial video ID | [optional] |
| **license** | **String**| Show editorial videos that are available with the specified license name | [optional] |
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

<a name="searchVideoContent"></a>
# **searchVideoContent**
> EditorialVideoSearchResults searchVideoContent(country).query(query).sort(sort).category(category).supplierCode(supplierCode).dateStart(dateStart).dateEnd(dateEnd).resolution(resolution).fps(fps).perPage(perPage).cursor(cursor).execute();

Search editorial video content

This endpoint searches for editorial videos. If you specify more than one search parameter, the API uses an AND condition. For example, if you set the &#x60;category&#x60; parameter to \&quot;Alone,Performing\&quot; and also specify a &#x60;query&#x60; parameter, the results include only videos that match the query and are in both the Alone and Performing categories.  You can also filter search terms out in the &#x60;query&#x60; parameter by prefixing the term with NOT.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EditorialVideoApi;
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
    String country = "USA"; // Show only editorial video content that is available for distribution in a certain country
    String query = "The Academy Awards"; // One or more search terms separated by spaces
    String sort = "relevant"; // Sort by
    String category = "Alone,Performing"; // Show editorial content with each of the specified editorial categories; specify category names in a comma-separated list
    List<String> supplierCode = Arrays.asList(); // Show only editorial video content from certain suppliers
    LocalDate dateStart = LocalDate.parse("2020-05-29T00:00:00.000Z"); // Show only editorial video content generated on or after a specific date
    LocalDate dateEnd = LocalDate.parse("2021-05-29T00:00:00.000Z"); // Show only editorial video content generated on or before a specific date
    String resolution = "4k"; // Show only editorial video content with specific resolution
    Double fps = 24D; // Show only editorial video content generated with specific frames per second
    Integer perPage = 20; // Number of results per page
    String cursor = "eyJ2IjoxLCJzIjoxfQ=="; // The cursor of the page with which to start fetching results; this cursor is returned from previous requests
    try {
      EditorialVideoSearchResults result = client
              .editorialVideo
              .searchVideoContent(country)
              .query(query)
              .sort(sort)
              .category(category)
              .supplierCode(supplierCode)
              .dateStart(dateStart)
              .dateEnd(dateEnd)
              .resolution(resolution)
              .fps(fps)
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
      System.err.println("Exception when calling EditorialVideoApi#searchVideoContent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EditorialVideoSearchResults> response = client
              .editorialVideo
              .searchVideoContent(country)
              .query(query)
              .sort(sort)
              .category(category)
              .supplierCode(supplierCode)
              .dateStart(dateStart)
              .dateEnd(dateEnd)
              .resolution(resolution)
              .fps(fps)
              .perPage(perPage)
              .cursor(cursor)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EditorialVideoApi#searchVideoContent");
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
| **country** | **String**| Show only editorial video content that is available for distribution in a certain country | |
| **query** | **String**| One or more search terms separated by spaces | [optional] |
| **sort** | **String**| Sort by | [optional] [default to relevant] [enum: relevant, newest, oldest] |
| **category** | **String**| Show editorial content with each of the specified editorial categories; specify category names in a comma-separated list | [optional] |
| **supplierCode** | [**List&lt;String&gt;**](String.md)| Show only editorial video content from certain suppliers | [optional] |
| **dateStart** | **LocalDate**| Show only editorial video content generated on or after a specific date | [optional] |
| **dateEnd** | **LocalDate**| Show only editorial video content generated on or before a specific date | [optional] |
| **resolution** | **String**| Show only editorial video content with specific resolution | [optional] [enum: 4k, high_definition, standard_definition] |
| **fps** | **Double**| Show only editorial video content generated with specific frames per second | [optional] |
| **perPage** | **Integer**| Number of results per page | [optional] [default to 20] |
| **cursor** | **String**| The cursor of the page with which to start fetching results; this cursor is returned from previous requests | [optional] |

### Return type

[**EditorialVideoSearchResults**](EditorialVideoSearchResults.md)

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

