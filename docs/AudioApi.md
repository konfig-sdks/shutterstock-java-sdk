# AudioApi

All URIs are relative to *https://api.shutterstock.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addTracksToCollection**](AudioApi.md#addTracksToCollection) | **POST** /v2/audio/collections/{id}/items | Add audio tracks to collections |
| [**createCollections**](AudioApi.md#createCollections) | **POST** /v2/audio/collections | Create audio collections |
| [**deleteCollection**](AudioApi.md#deleteCollection) | **DELETE** /v2/audio/collections/{id} | Delete audio collections |
| [**getCollectionDetails**](AudioApi.md#getCollectionDetails) | **GET** /v2/audio/collections/{id} | Get the details of audio collections |
| [**getTrackDetails**](AudioApi.md#getTrackDetails) | **GET** /v2/audio/{id} | Get details about audio tracks |
| [**licenseTracks**](AudioApi.md#licenseTracks) | **POST** /v2/audio/licenses | License audio tracks |
| [**listAudioLicenses**](AudioApi.md#listAudioLicenses) | **GET** /v2/audio/licenses | List audio licenses |
| [**listCollectionItems**](AudioApi.md#listCollectionItems) | **GET** /v2/audio/collections/{id}/items | Get the contents of audio collections |
| [**listCollections**](AudioApi.md#listCollections) | **GET** /v2/audio/collections | List audio collections |
| [**listGenres**](AudioApi.md#listGenres) | **GET** /v2/audio/genres | List audio genres |
| [**listInstruments**](AudioApi.md#listInstruments) | **GET** /v2/audio/instruments | List audio instruments |
| [**listMoods**](AudioApi.md#listMoods) | **GET** /v2/audio/moods | List audio moods |
| [**listTracks**](AudioApi.md#listTracks) | **GET** /v2/audio | List audio tracks |
| [**redownloadTracks**](AudioApi.md#redownloadTracks) | **POST** /v2/audio/licenses/{id}/downloads | Download audio tracks |
| [**removeTracksFromCollection**](AudioApi.md#removeTracksFromCollection) | **DELETE** /v2/audio/collections/{id}/items | Remove audio tracks from collections |
| [**searchTracks**](AudioApi.md#searchTracks) | **GET** /v2/audio/search | Search for tracks |
| [**setCollectionName**](AudioApi.md#setCollectionName) | **POST** /v2/audio/collections/{id} | Rename audio collections |


<a name="addTracksToCollection"></a>
# **addTracksToCollection**
> addTracksToCollection(id, collectionItemRequest).execute();

Add audio tracks to collections

This endpoint adds one or more tracks to a collection by track IDs.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AudioApi;
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
    String id = "48433115"; // Collection ID
    try {
      client
              .audio
              .addTracksToCollection(items, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioApi#addTracksToCollection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .audio
              .addTracksToCollection(items, id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioApi#addTracksToCollection");
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
| **collectionItemRequest** | [**CollectionItemRequest**](CollectionItemRequest.md)| List of items to add to collection | |

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

<a name="createCollections"></a>
# **createCollections**
> CollectionCreateResponse createCollections(collectionCreateRequest).execute();

Create audio collections

This endpoint creates one or more collections (soundboxes). To add tracks, use &#x60;POST /v2/audio/collections/{id}/items&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AudioApi;
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
              .audio
              .createCollections(name)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioApi#createCollections");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CollectionCreateResponse> response = client
              .audio
              .createCollections(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioApi#createCollections");
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
| **201** | Successfully created audio collection |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="deleteCollection"></a>
# **deleteCollection**
> deleteCollection(id).execute();

Delete audio collections

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
import com.konfigthis.client.api.AudioApi;
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
    String id = "48433111"; // Collection ID
    try {
      client
              .audio
              .deleteCollection(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioApi#deleteCollection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .audio
              .deleteCollection(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioApi#deleteCollection");
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

<a name="getCollectionDetails"></a>
# **getCollectionDetails**
> Collection getCollectionDetails(id).embed(embed).shareCode(shareCode).execute();

Get the details of audio collections

This endpoint gets more detailed information about a collection, including the number of items in it and when it was last updated. To get the tracks in collections, use &#x60;GET /v2/audio/collections/{id}/items&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AudioApi;
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
    String id = "48433107"; // Collection ID
    List<String> embed = Arrays.asList(); // Which sharing information to include in the response, such as a URL to the collection
    String shareCode = "shareCode_example"; // Code to retrieve a shared collection
    try {
      Collection result = client
              .audio
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
      System.err.println("Exception when calling AudioApi#getCollectionDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Collection> response = client
              .audio
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
      System.err.println("Exception when calling AudioApi#getCollectionDetails");
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

<a name="getTrackDetails"></a>
# **getTrackDetails**
> Audio getTrackDetails(id).view(view).searchId(searchId).execute();

Get details about audio tracks

This endpoint shows information about a track, including its genres, instruments, and other attributes.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AudioApi;
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
    String view = "minimal"; // Amount of detail to render in the response
    String searchId = "00000000-0000-0000-0000-000000000000"; // The ID of the search that is related to this request
    try {
      Audio result = client
              .audio
              .getTrackDetails(id)
              .view(view)
              .searchId(searchId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getAddedDate());
      System.out.println(result.getAffiliateUrl());
      System.out.println(result.getAlbum());
      System.out.println(result.getArtists());
      System.out.println(result.getAssets());
      System.out.println(result.getBpm());
      System.out.println(result.getContributor());
      System.out.println(result.getDeletedTime());
      System.out.println(result.getDuration());
      System.out.println(result.getGenres());
      System.out.println(result.getId());
      System.out.println(result.getInstruments());
      System.out.println(result.getIsAdult());
      System.out.println(result.getIsInstrumental());
      System.out.println(result.getIsrc());
      System.out.println(result.getKeywords());
      System.out.println(result.getLanguage());
      System.out.println(result.getLyrics());
      System.out.println(result.getMediaType());
      System.out.println(result.getModelReleases());
      System.out.println(result.getMoods());
      System.out.println(result.getPublishedTime());
      System.out.println(result.getRecordingVersion());
      System.out.println(result.getReleases());
      System.out.println(result.getSimilarArtists());
      System.out.println(result.getSubmittedTime());
      System.out.println(result.getUpdatedTime());
      System.out.println(result.getUrl());
      System.out.println(result.getVocalDescription());
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioApi#getTrackDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Audio> response = client
              .audio
              .getTrackDetails(id)
              .view(view)
              .searchId(searchId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioApi#getTrackDetails");
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
| **view** | **String**| Amount of detail to render in the response | [optional] [default to full] [enum: minimal, full] |
| **searchId** | **String**| The ID of the search that is related to this request | [optional] |

### Return type

[**Audio**](Audio.md)

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

<a name="licenseTracks"></a>
# **licenseTracks**
> LicenseAudioResultDataList licenseTracks(licenseAudioRequest).license(license).searchId(searchId).execute();

License audio tracks

This endpoint gets licenses for one or more tracks. The download links in the response are valid for 8 hours.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AudioApi;
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
    List<LicenseAudio> audio = Arrays.asList(); // List of audio tracks to license
    String license = "audio_platform"; // License type
    String searchId = "p5S6QwRikdFJTHXwsoiqTg"; // The ID of the search that led to licensing this track
    try {
      LicenseAudioResultDataList result = client
              .audio
              .licenseTracks(audio)
              .license(license)
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
      System.err.println("Exception when calling AudioApi#licenseTracks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LicenseAudioResultDataList> response = client
              .audio
              .licenseTracks(audio)
              .license(license)
              .searchId(searchId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioApi#licenseTracks");
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
| **licenseAudioRequest** | [**LicenseAudioRequest**](LicenseAudioRequest.md)| Tracks to license | |
| **license** | **String**| License type | [optional] [enum: audio_platform, premier_music_basic, premier_music_extended, premier_music_pro, premier_music_comp, asset_all_music] |
| **searchId** | **String**| The ID of the search that led to licensing this track | [optional] |

### Return type

[**LicenseAudioResultDataList**](LicenseAudioResultDataList.md)

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

<a name="listAudioLicenses"></a>
# **listAudioLicenses**
> DownloadHistoryDataList listAudioLicenses().audioId(audioId).license(license).page(page).perPage(perPage).sort(sort).username(username).startDate(startDate).endDate(endDate).downloadAvailability(downloadAvailability).teamHistory(teamHistory).execute();

List audio licenses

This endpoint lists existing licenses. You can filter the results according to the track ID to see if you have an existing license for a specific track.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AudioApi;
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
    String audioId = "1"; // Show licenses for the specified track ID
    String license = "48433107"; // Restrict results by license. Prepending a `-` sign will exclude results by license
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
              .audio
              .listAudioLicenses()
              .audioId(audioId)
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
      System.err.println("Exception when calling AudioApi#listAudioLicenses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DownloadHistoryDataList> response = client
              .audio
              .listAudioLicenses()
              .audioId(audioId)
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
      System.err.println("Exception when calling AudioApi#listAudioLicenses");
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
| **audioId** | **String**| Show licenses for the specified track ID | [optional] |
| **license** | **String**| Restrict results by license. Prepending a &#x60;-&#x60; sign will exclude results by license | [optional] |
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

<a name="listCollectionItems"></a>
# **listCollectionItems**
> CollectionItemDataList listCollectionItems(id).page(page).perPage(perPage).shareCode(shareCode).sort(sort).execute();

Get the contents of audio collections

This endpoint lists the IDs of tracks in a collection and the date that each was added.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AudioApi;
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
              .audio
              .listCollectionItems(id)
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
      System.err.println("Exception when calling AudioApi#listCollectionItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CollectionItemDataList> response = client
              .audio
              .listCollectionItems(id)
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
      System.err.println("Exception when calling AudioApi#listCollectionItems");
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

<a name="listCollections"></a>
# **listCollections**
> CollectionDataList listCollections().page(page).perPage(perPage).embed(embed).execute();

List audio collections

This endpoint lists your collections of audio tracks and their basic attributes.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AudioApi;
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
              .audio
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
      System.err.println("Exception when calling AudioApi#listCollections");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CollectionDataList> response = client
              .audio
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
      System.err.println("Exception when calling AudioApi#listCollections");
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

<a name="listGenres"></a>
# **listGenres**
> GenreList listGenres().language(language).execute();

List audio genres

This endpoint returns a list of all audio genres.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AudioApi;
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
    String language = "language_example"; // Which language the genres will be returned
    try {
      GenreList result = client
              .audio
              .listGenres()
              .language(language)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioApi#listGenres");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GenreList> response = client
              .audio
              .listGenres()
              .language(language)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioApi#listGenres");
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
| **language** | **String**| Which language the genres will be returned | [optional] |

### Return type

[**GenreList**](GenreList.md)

### Authorization

[basic](../README.md#basic), [customer_accessCode](../README.md#customer_accessCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="listInstruments"></a>
# **listInstruments**
> InstrumentList listInstruments().language(language).execute();

List audio instruments

This endpoint returns a list of all audio instruments.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AudioApi;
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
    String language = "language_example"; // Which language the instruments will be returned in
    try {
      InstrumentList result = client
              .audio
              .listInstruments()
              .language(language)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioApi#listInstruments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InstrumentList> response = client
              .audio
              .listInstruments()
              .language(language)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioApi#listInstruments");
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
| **language** | **String**| Which language the instruments will be returned in | [optional] |

### Return type

[**InstrumentList**](InstrumentList.md)

### Authorization

[basic](../README.md#basic), [customer_accessCode](../README.md#customer_accessCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="listMoods"></a>
# **listMoods**
> MoodList listMoods().language(language).execute();

List audio moods

This endpoint returns a list of all audio moods.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AudioApi;
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
    String language = "language_example"; // Which language the moods will be returned in
    try {
      MoodList result = client
              .audio
              .listMoods()
              .language(language)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioApi#listMoods");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MoodList> response = client
              .audio
              .listMoods()
              .language(language)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioApi#listMoods");
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
| **language** | **String**| Which language the moods will be returned in | [optional] |

### Return type

[**MoodList**](MoodList.md)

### Authorization

[basic](../README.md#basic), [customer_accessCode](../README.md#customer_accessCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="listTracks"></a>
# **listTracks**
> AudioDataList listTracks(id).view(view).searchId(searchId).execute();

List audio tracks

This endpoint lists information about one or more audio tracks, including the description and publication date.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AudioApi;
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
    List<String> id = Arrays.asList(); // One or more audio IDs
    String view = "minimal"; // Amount of detail to render in the response
    String searchId = "00000000-0000-0000-0000-000000000000"; // The ID of the search that is related to this request
    try {
      AudioDataList result = client
              .audio
              .listTracks(id)
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
      System.err.println("Exception when calling AudioApi#listTracks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AudioDataList> response = client
              .audio
              .listTracks(id)
              .view(view)
              .searchId(searchId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioApi#listTracks");
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
| **id** | [**List&lt;String&gt;**](String.md)| One or more audio IDs | |
| **view** | **String**| Amount of detail to render in the response | [optional] [default to minimal] [enum: minimal, full] |
| **searchId** | **String**| The ID of the search that is related to this request | [optional] |

### Return type

[**AudioDataList**](AudioDataList.md)

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

<a name="redownloadTracks"></a>
# **redownloadTracks**
> AudioUrl redownloadTracks(id).execute();

Download audio tracks

This endpoint redownloads tracks that you have already received a license for. The download links in the response are valid for 8 hours.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AudioApi;
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
    try {
      AudioUrl result = client
              .audio
              .redownloadTracks(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getShortsLoopsStems());
      System.out.println(result.getUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioApi#redownloadTracks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AudioUrl> response = client
              .audio
              .redownloadTracks(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioApi#redownloadTracks");
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

[**AudioUrl**](AudioUrl.md)

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

<a name="removeTracksFromCollection"></a>
# **removeTracksFromCollection**
> removeTracksFromCollection(id).itemId(itemId).execute();

Remove audio tracks from collections

This endpoint removes one or more tracks from a collection.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AudioApi;
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
    String id = "48433119"; // Collection ID
    List<String> itemId = Arrays.asList(); // One or more item IDs to remove from the collection
    try {
      client
              .audio
              .removeTracksFromCollection(id)
              .itemId(itemId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioApi#removeTracksFromCollection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .audio
              .removeTracksFromCollection(id)
              .itemId(itemId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioApi#removeTracksFromCollection");
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
| **itemId** | [**List&lt;String&gt;**](String.md)| One or more item IDs to remove from the collection | [optional] |

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

<a name="searchTracks"></a>
# **searchTracks**
> AudioSearchResults searchTracks().artists(artists).bpm(bpm).bpmFrom(bpmFrom).bpmTo(bpmTo).duration(duration).durationFrom(durationFrom).durationTo(durationTo).genre(genre).isInstrumental(isInstrumental).instruments(instruments).moods(moods).page(page).perPage(perPage).query(query).sort(sort).sortOrder(sortOrder).vocalDescription(vocalDescription).view(view).fields(fields).library(library).language(language).execute();

Search for tracks

This endpoint searches for tracks. If you specify more than one search parameter, the API uses an AND condition. Array parameters can be specified multiple times; in this case, the API uses an AND or an OR condition with those values, depending on the parameter.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AudioApi;
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
    List<String> artists = Arrays.asList(); // Show tracks with one of the specified artist names or IDs
    Integer bpm = 56; // (Deprecated; use bpm_from and bpm_to instead) Show tracks with the specified beats per minute
    Integer bpmFrom = 80; // Show tracks with the specified beats per minute or faster
    Integer bpmTo = 120; // Show tracks with the specified beats per minute or slower
    Integer duration = 180; // Show tracks with the specified duration in seconds
    Integer durationFrom = 30; // Show tracks with the specified duration or longer in seconds
    Integer durationTo = 180; // Show tracks with the specified duration or shorter in seconds
    List<String> genre = Arrays.asList(); // Show tracks with each of the specified genres; to get the list of genres, use `GET /v2/audio/genres`
    Boolean isInstrumental = true; // Show instrumental music only
    List<String> instruments = Arrays.asList(); // Show tracks with each of the specified instruments; to get the list of instruments, use `GET /v2/audio/instruments`
    List<String> moods = Arrays.asList(); // Show tracks with each of the specified moods; to get the list of moods, use `GET /v2/audio/moods`
    Integer page = 1; // Page number
    Integer perPage = 20; // Number of results per page
    String query = "drum"; // One or more search terms separated by spaces
    String sort = "score"; // Sort by
    String sortOrder = "asc"; // Sort order
    String vocalDescription = "female"; // Show tracks with the specified vocal description (male, female)
    String view = "minimal"; // Amount of detail to render in the response
    String fields = "fields_example"; // Fields to display in the response; see the documentation for the fields parameter in the overview section
    String library = "shutterstock"; // Which library to search
    String language = "language_example"; // Which language to search in
    try {
      AudioSearchResults result = client
              .audio
              .searchTracks()
              .artists(artists)
              .bpm(bpm)
              .bpmFrom(bpmFrom)
              .bpmTo(bpmTo)
              .duration(duration)
              .durationFrom(durationFrom)
              .durationTo(durationTo)
              .genre(genre)
              .isInstrumental(isInstrumental)
              .instruments(instruments)
              .moods(moods)
              .page(page)
              .perPage(perPage)
              .query(query)
              .sort(sort)
              .sortOrder(sortOrder)
              .vocalDescription(vocalDescription)
              .view(view)
              .fields(fields)
              .library(library)
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
      System.err.println("Exception when calling AudioApi#searchTracks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AudioSearchResults> response = client
              .audio
              .searchTracks()
              .artists(artists)
              .bpm(bpm)
              .bpmFrom(bpmFrom)
              .bpmTo(bpmTo)
              .duration(duration)
              .durationFrom(durationFrom)
              .durationTo(durationTo)
              .genre(genre)
              .isInstrumental(isInstrumental)
              .instruments(instruments)
              .moods(moods)
              .page(page)
              .perPage(perPage)
              .query(query)
              .sort(sort)
              .sortOrder(sortOrder)
              .vocalDescription(vocalDescription)
              .view(view)
              .fields(fields)
              .library(library)
              .language(language)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioApi#searchTracks");
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
| **artists** | [**List&lt;String&gt;**](String.md)| Show tracks with one of the specified artist names or IDs | [optional] |
| **bpm** | **Integer**| (Deprecated; use bpm_from and bpm_to instead) Show tracks with the specified beats per minute | [optional] |
| **bpmFrom** | **Integer**| Show tracks with the specified beats per minute or faster | [optional] |
| **bpmTo** | **Integer**| Show tracks with the specified beats per minute or slower | [optional] |
| **duration** | **Integer**| Show tracks with the specified duration in seconds | [optional] |
| **durationFrom** | **Integer**| Show tracks with the specified duration or longer in seconds | [optional] |
| **durationTo** | **Integer**| Show tracks with the specified duration or shorter in seconds | [optional] |
| **genre** | [**List&lt;String&gt;**](String.md)| Show tracks with each of the specified genres; to get the list of genres, use &#x60;GET /v2/audio/genres&#x60; | [optional] |
| **isInstrumental** | **Boolean**| Show instrumental music only | [optional] |
| **instruments** | [**List&lt;String&gt;**](String.md)| Show tracks with each of the specified instruments; to get the list of instruments, use &#x60;GET /v2/audio/instruments&#x60; | [optional] |
| **moods** | [**List&lt;String&gt;**](String.md)| Show tracks with each of the specified moods; to get the list of moods, use &#x60;GET /v2/audio/moods&#x60; | [optional] |
| **page** | **Integer**| Page number | [optional] [default to 1] |
| **perPage** | **Integer**| Number of results per page | [optional] [default to 20] |
| **query** | **String**| One or more search terms separated by spaces | [optional] |
| **sort** | **String**| Sort by | [optional] [enum: score, ranking_all, artist, title, bpm, freshness, duration] |
| **sortOrder** | **String**| Sort order | [optional] [default to desc] [enum: asc, desc] |
| **vocalDescription** | **String**| Show tracks with the specified vocal description (male, female) | [optional] |
| **view** | **String**| Amount of detail to render in the response | [optional] [default to minimal] [enum: minimal, full] |
| **fields** | **String**| Fields to display in the response; see the documentation for the fields parameter in the overview section | [optional] |
| **library** | **String**| Which library to search | [optional] [default to premier] [enum: shutterstock, premier] |
| **language** | **String**| Which language to search in | [optional] |

### Return type

[**AudioSearchResults**](AudioSearchResults.md)

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

<a name="setCollectionName"></a>
# **setCollectionName**
> setCollectionName(id, collectionUpdateRequest).execute();

Rename audio collections

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
import com.konfigthis.client.api.AudioApi;
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
    String id = "48433107"; // Collection ID
    try {
      client
              .audio
              .setCollectionName(name, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioApi#setCollectionName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .audio
              .setCollectionName(name, id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioApi#setCollectionName");
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
| **collectionUpdateRequest** | [**CollectionUpdateRequest**](CollectionUpdateRequest.md)| Collection changes | |

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

