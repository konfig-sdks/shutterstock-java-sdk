# SoundEffectsApi

All URIs are relative to *https://api.shutterstock.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDetails**](SoundEffectsApi.md#getDetails) | **GET** /v2/sfx/{id} | Get details about sound effects |
| [**licenseAssets**](SoundEffectsApi.md#licenseAssets) | **POST** /v2/sfx/licenses | License sound effects |
| [**listDetails**](SoundEffectsApi.md#listDetails) | **GET** /v2/sfx | List details about sound effects |
| [**listLicenses**](SoundEffectsApi.md#listLicenses) | **GET** /v2/sfx/licenses | List sound effects licenses |
| [**redownloadLicenses**](SoundEffectsApi.md#redownloadLicenses) | **POST** /v2/sfx/licenses/{id}/downloads | Download sound effects |
| [**searchSoundEffects**](SoundEffectsApi.md#searchSoundEffects) | **GET** /v2/sfx/search | Search for sound effects |


<a name="getDetails"></a>
# **getDetails**
> SFX getDetails(id).language(language).view(view).library(library).searchId(searchId).execute();

Get details about sound effects

This endpoint shows information about a sound effect.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SoundEffectsApi;
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
    Integer id = 442583; // Audio track ID
    Language language = Language.fromValue("ar"); // Language for the keywords and categories in the response
    String view = "minimal"; // Amount of detail to render in the response
    String library = "shutterstock"; // Which library to fetch from
    String searchId = "00000000-0000-0000-0000-000000000000"; // The ID of the search that is related to this request
    try {
      SFX result = client
              .soundEffects
              .getDetails(id)
              .language(language)
              .view(view)
              .library(library)
              .searchId(searchId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getAddedDate());
      System.out.println(result.getAffiliateUrl());
      System.out.println(result.getArtist());
      System.out.println(result.getAssets());
      System.out.println(result.getContributor());
      System.out.println(result.getDuration());
      System.out.println(result.getId());
      System.out.println(result.getKeywords());
      System.out.println(result.getMediaType());
      System.out.println(result.getReleases());
      System.out.println(result.getUpdatedTime());
      System.out.println(result.getUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling SoundEffectsApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SFX> response = client
              .soundEffects
              .getDetails(id)
              .language(language)
              .view(view)
              .library(library)
              .searchId(searchId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SoundEffectsApi#getDetails");
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
| **id** | **Integer**| Audio track ID | |
| **language** | [**Language**](.md)| Language for the keywords and categories in the response | [optional] [enum: ar, bg, bn, cs, da, de, el, en, es, fi, fr, gu, he, hi, hr, hu, id, it, ja, kn, ko, ml, mr, nb, nl, or, pl, pt, ro, ru, sk, sl, sv, ta, te, th, tr, uk, ur, vi, zh, zh-Hant] |
| **view** | **String**| Amount of detail to render in the response | [optional] [default to minimal] [enum: minimal, full] |
| **library** | **String**| Which library to fetch from | [optional] [enum: shutterstock, premier, premiumbeat] |
| **searchId** | **String**| The ID of the search that is related to this request | [optional] |

### Return type

[**SFX**](SFX.md)

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
| **503** | Service Unavailable |  -  |

<a name="licenseAssets"></a>
# **licenseAssets**
> LicenseSFXResultDataList licenseAssets(licenseSFXRequest).execute();

License sound effects

This endpoint licenses sounds effect assets.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SoundEffectsApi;
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
    List<LicenseSFX> soundEffects = Arrays.asList(); // Sound effects to license for
    try {
      LicenseSFXResultDataList result = client
              .soundEffects
              .licenseAssets(soundEffects)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getErrors());
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling SoundEffectsApi#licenseAssets");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LicenseSFXResultDataList> response = client
              .soundEffects
              .licenseAssets(soundEffects)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SoundEffectsApi#licenseAssets");
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
| **licenseSFXRequest** | [**LicenseSFXRequest**](LicenseSFXRequest.md)|  | |

### Return type

[**LicenseSFXResultDataList**](LicenseSFXResultDataList.md)

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

<a name="listDetails"></a>
# **listDetails**
> SFXDataList listDetails(id).view(view).language(language).library(library).searchId(searchId).execute();

List details about sound effects

This endpoint shows information about sound effects.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SoundEffectsApi;
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
    List<String> id = Arrays.asList(); // One or more sound effect IDs
    String view = "minimal"; // Amount of detail to render in the response
    Language language = Language.fromValue("ar"); // Language for the keywords and categories in the response
    String library = "shutterstock"; // Which library to fetch from
    String searchId = "00000000-0000-0000-0000-000000000000"; // The ID of the search that is related to this request
    try {
      SFXDataList result = client
              .soundEffects
              .listDetails(id)
              .view(view)
              .language(language)
              .library(library)
              .searchId(searchId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling SoundEffectsApi#listDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SFXDataList> response = client
              .soundEffects
              .listDetails(id)
              .view(view)
              .language(language)
              .library(library)
              .searchId(searchId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SoundEffectsApi#listDetails");
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
| **id** | [**List&lt;String&gt;**](String.md)| One or more sound effect IDs | |
| **view** | **String**| Amount of detail to render in the response | [optional] [default to minimal] [enum: minimal, full] |
| **language** | [**Language**](.md)| Language for the keywords and categories in the response | [optional] [enum: ar, bg, bn, cs, da, de, el, en, es, fi, fr, gu, he, hi, hr, hu, id, it, ja, kn, ko, ml, mr, nb, nl, or, pl, pt, ro, ru, sk, sl, sv, ta, te, th, tr, uk, ur, vi, zh, zh-Hant] |
| **library** | **String**| Which library to fetch from | [optional] [enum: shutterstock, premier, premiumbeat] |
| **searchId** | **String**| The ID of the search that is related to this request | [optional] |

### Return type

[**SFXDataList**](SFXDataList.md)

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
> DownloadHistoryDataList listLicenses().sfxId(sfxId).license(license).page(page).perPage(perPage).sort(sort).username(username).startDate(startDate).endDate(endDate).licenseId(licenseId).downloadAvailability(downloadAvailability).teamHistory(teamHistory).execute();

List sound effects licenses

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
import com.konfigthis.client.api.SoundEffectsApi;
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
    String sfxId = "12345678"; // Show licenses for the specified sound effects ID
    String license = "standard"; // Show sound effects that are available with the specified license, such as `standard` or `enhanced`; prepending a `-` sign excludes results from that license
    Integer page = 1; // Page number
    Integer perPage = 20; // Number of results per page
    String sort = "newest"; // Sort order
    String username = "aUniqueUsername"; // Filter licenses by username of licensee
    OffsetDateTime startDate = OffsetDateTime.parse("2021-03-29T13:25:13.521Z"); // Show licenses created on or after the specified date
    OffsetDateTime endDate = OffsetDateTime.parse("2021-03-29T13:25:13.521Z"); // Show licenses created before the specified date
    String licenseId = "licenseId_example"; // Filter by the license ID
    String downloadAvailability = "all"; // Filter licenses by download availability
    Boolean teamHistory = false; // Set to true to see license history for all members of your team.
    try {
      DownloadHistoryDataList result = client
              .soundEffects
              .listLicenses()
              .sfxId(sfxId)
              .license(license)
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .username(username)
              .startDate(startDate)
              .endDate(endDate)
              .licenseId(licenseId)
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
      System.err.println("Exception when calling SoundEffectsApi#listLicenses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DownloadHistoryDataList> response = client
              .soundEffects
              .listLicenses()
              .sfxId(sfxId)
              .license(license)
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .username(username)
              .startDate(startDate)
              .endDate(endDate)
              .licenseId(licenseId)
              .downloadAvailability(downloadAvailability)
              .teamHistory(teamHistory)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SoundEffectsApi#listLicenses");
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
| **sfxId** | **String**| Show licenses for the specified sound effects ID | [optional] |
| **license** | **String**| Show sound effects that are available with the specified license, such as &#x60;standard&#x60; or &#x60;enhanced&#x60;; prepending a &#x60;-&#x60; sign excludes results from that license | [optional] |
| **page** | **Integer**| Page number | [optional] [default to 1] |
| **perPage** | **Integer**| Number of results per page | [optional] [default to 20] |
| **sort** | **String**| Sort order | [optional] [default to newest] [enum: newest, oldest] |
| **username** | **String**| Filter licenses by username of licensee | [optional] |
| **startDate** | **OffsetDateTime**| Show licenses created on or after the specified date | [optional] |
| **endDate** | **OffsetDateTime**| Show licenses created before the specified date | [optional] |
| **licenseId** | **String**| Filter by the license ID | [optional] |
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

<a name="redownloadLicenses"></a>
# **redownloadLicenses**
> SfxUrl redownloadLicenses(id).execute();

Download sound effects

This endpoint redownloads sound effects that you have already received a license for. The download links in the response are valid for 8 hours.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SoundEffectsApi;
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
    String id = "123"; // License ID
    try {
      SfxUrl result = client
              .soundEffects
              .redownloadLicenses(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling SoundEffectsApi#redownloadLicenses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SfxUrl> response = client
              .soundEffects
              .redownloadLicenses(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SoundEffectsApi#redownloadLicenses");
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

### Return type

[**SfxUrl**](SfxUrl.md)

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

<a name="searchSoundEffects"></a>
# **searchSoundEffects**
> SFXSearchResults searchSoundEffects().addedDate(addedDate).addedDateStart(addedDateStart).addedDateEnd(addedDateEnd).duration(duration).durationFrom(durationFrom).durationTo(durationTo).page(page).perPage(perPage).query(query).safe(safe).sort(sort).view(view).language(language).execute();

Search for sound effects

This endpoint searches for sound effects. If you specify more than one search parameter, the API uses an AND condition.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SoundEffectsApi;
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
    LocalDate addedDate = LocalDate.parse("2022-09-23T00:00:00.000Z"); // Show sound effects added on the specified date
    LocalDate addedDateStart = LocalDate.parse("2021-03-29T00:00:00.000Z"); // Show sound effects added on or after the specified date
    LocalDate addedDateEnd = LocalDate.parse("2021-03-29T00:00:00.000Z"); // Show sound effects added before the specified date
    Integer duration = 180; // Show sound effects with the specified duration in seconds
    Integer durationFrom = 30; // Show sound effects with the specified duration or longer in seconds
    Integer durationTo = 180; // Show sound effects with the specified duration or shorter in seconds
    Integer page = 1; // Page number
    Integer perPage = 20; // Number of results per page
    String query = "drum"; // One or more search terms separated by spaces
    Boolean safe = true; // Enable or disable safe search
    String sort = "popular"; // Sort by
    String view = "minimal"; // Amount of detail to render in the response
    Language language = Language.fromValue("ar"); // Set query and result language (uses Accept-Language header if not set)
    try {
      SFXSearchResults result = client
              .soundEffects
              .searchSoundEffects()
              .addedDate(addedDate)
              .addedDateStart(addedDateStart)
              .addedDateEnd(addedDateEnd)
              .duration(duration)
              .durationFrom(durationFrom)
              .durationTo(durationTo)
              .page(page)
              .perPage(perPage)
              .query(query)
              .safe(safe)
              .sort(sort)
              .view(view)
              .language(language)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
      System.out.println(result.getPage());
      System.out.println(result.getPerPage());
      System.out.println(result.getSearchId());
      System.out.println(result.getTotalCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling SoundEffectsApi#searchSoundEffects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SFXSearchResults> response = client
              .soundEffects
              .searchSoundEffects()
              .addedDate(addedDate)
              .addedDateStart(addedDateStart)
              .addedDateEnd(addedDateEnd)
              .duration(duration)
              .durationFrom(durationFrom)
              .durationTo(durationTo)
              .page(page)
              .perPage(perPage)
              .query(query)
              .safe(safe)
              .sort(sort)
              .view(view)
              .language(language)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SoundEffectsApi#searchSoundEffects");
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
| **addedDate** | **LocalDate**| Show sound effects added on the specified date | [optional] |
| **addedDateStart** | **LocalDate**| Show sound effects added on or after the specified date | [optional] |
| **addedDateEnd** | **LocalDate**| Show sound effects added before the specified date | [optional] |
| **duration** | **Integer**| Show sound effects with the specified duration in seconds | [optional] |
| **durationFrom** | **Integer**| Show sound effects with the specified duration or longer in seconds | [optional] |
| **durationTo** | **Integer**| Show sound effects with the specified duration or shorter in seconds | [optional] |
| **page** | **Integer**| Page number | [optional] [default to 1] |
| **perPage** | **Integer**| Number of results per page | [optional] [default to 20] |
| **query** | **String**| One or more search terms separated by spaces | [optional] |
| **safe** | **Boolean**| Enable or disable safe search | [optional] [default to true] |
| **sort** | **String**| Sort by | [optional] [default to popular] [enum: popular, newest, relevance, random, oldest] |
| **view** | **String**| Amount of detail to render in the response | [optional] [default to minimal] [enum: minimal, full] |
| **language** | [**Language**](.md)| Set query and result language (uses Accept-Language header if not set) | [optional] [enum: ar, bg, bn, cs, da, de, el, en, es, fi, fr, gu, he, hi, hr, hu, id, it, ja, kn, ko, ml, mr, nb, nl, or, pl, pt, ro, ru, sk, sl, sv, ta, te, th, tr, uk, ur, vi, zh, zh-Hant] |

### Return type

[**SFXSearchResults**](SFXSearchResults.md)

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
| **503** | Service Unavailable |  -  |

