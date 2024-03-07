# CustomMusicApi

All URIs are relative to *https://api.shutterstock.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRenderedAudio**](CustomMusicApi.md#createRenderedAudio) | **POST** /v2/ai/audio/renders | Create rendered audio |
| [**getAudioRendersDetails**](CustomMusicApi.md#getAudioRendersDetails) | **GET** /v2/ai/audio/renders | Get details about audio renders |
| [**listAudioDescriptors**](CustomMusicApi.md#listAudioDescriptors) | **GET** /v2/ai/audio/descriptors | List computer audio descriptors |
| [**listComputerAudioInstruments**](CustomMusicApi.md#listComputerAudioInstruments) | **GET** /v2/ai/audio/instruments | List computer audio instruments |


<a name="createRenderedAudio"></a>
# **createRenderedAudio**
> AudioRendersListResults createRenderedAudio(createAudioRendersRequest).execute();

Create rendered audio

This endpoint creates rendered audio from timeline data. It returns a render ID that you can use to download the finished audio when it is ready. The render ID is valid for up to 48 hours.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomMusicApi;
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
    List<CreateAudioRender> audioRenders = Arrays.asList(); // Parameters to create computer audio renders
    try {
      AudioRendersListResults result = client
              .customMusic
              .createRenderedAudio(audioRenders)
              .execute();
      System.out.println(result);
      System.out.println(result.getAudioRenders());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomMusicApi#createRenderedAudio");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AudioRendersListResults> response = client
              .customMusic
              .createRenderedAudio(audioRenders)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomMusicApi#createRenderedAudio");
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
| **createAudioRendersRequest** | [**CreateAudioRendersRequest**](CreateAudioRendersRequest.md)| Parameters for the audio, including the timeline and information about the output file | |

### Return type

[**AudioRendersListResults**](AudioRendersListResults.md)

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

<a name="getAudioRendersDetails"></a>
# **getAudioRendersDetails**
> AudioRendersListResults getAudioRendersDetails(id).execute();

Get details about audio renders

This endpoint shows the status of one or more audio renders, including download links for completed audio.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomMusicApi;
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
    List<String> id = Arrays.asList(); // One or more render IDs
    try {
      AudioRendersListResults result = client
              .customMusic
              .getAudioRendersDetails(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getAudioRenders());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomMusicApi#getAudioRendersDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AudioRendersListResults> response = client
              .customMusic
              .getAudioRendersDetails(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomMusicApi#getAudioRendersDetails");
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
| **id** | [**List&lt;String&gt;**](String.md)| One or more render IDs | |

### Return type

[**AudioRendersListResults**](AudioRendersListResults.md)

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

<a name="listAudioDescriptors"></a>
# **listAudioDescriptors**
> DescriptorsListResult listAudioDescriptors().renderSpeedOver(renderSpeedOver).bandId(bandId).bandName(bandName).page(page).perPage(perPage).id(id).instrumentName(instrumentName).instrumentId(instrumentId).tempo(tempo).tempoTo(tempoTo).tempoFrom(tempoFrom).name(name).tag(tag).execute();

List computer audio descriptors

This endpoint lists the descriptors that you can use in the audio regions in an audio render.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomMusicApi;
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
    Double renderSpeedOver = 5D; // Show descriptors with an average render speed that is greater than or equal to the specified value
    String bandId = "Corporate Folk Bonfire Band 1"; // Show descriptors that contain the specified band (case-sentsitive)
    String bandName = "Documentary Underscore Heartfelt Band 1"; // Show descriptors with the specified band name (case-sensitive)
    Integer page = 1; // Page number
    Integer perPage = 20; // Number of results per page
    List<String> id = Arrays.asList(); // Show descriptors with the specified IDs (case-sensitive)
    String instrumentName = "Precision Bass - Full"; // Show descriptors with the specified instrument name (case-sensitive)
    String instrumentId = "direct_fluorescent_synth_lead"; // Show descriptors with the specified instrument ID (case-sensitive)
    Double tempo = 90D; // Show descriptors whose tempo range includes the specified tempo in beats per minute
    Double tempoTo = 120D; // Show descriptors with a tempo that is less than or equal to the specified number
    Double tempoFrom = 60D; // Show descriptors that have a tempo range that includes the specified tempo in beats per minute
    String name = "Corporate Pop Inspirational High Energy"; // Show descriptors with the specified name (case-sensitive)
    String tag = "Cinematic"; // Show descriptors with the specified tag, such as Cinematic or Roomy (case-sensitive)
    try {
      DescriptorsListResult result = client
              .customMusic
              .listAudioDescriptors()
              .renderSpeedOver(renderSpeedOver)
              .bandId(bandId)
              .bandName(bandName)
              .page(page)
              .perPage(perPage)
              .id(id)
              .instrumentName(instrumentName)
              .instrumentId(instrumentId)
              .tempo(tempo)
              .tempoTo(tempoTo)
              .tempoFrom(tempoFrom)
              .name(name)
              .tag(tag)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getPage());
      System.out.println(result.getPerPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomMusicApi#listAudioDescriptors");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DescriptorsListResult> response = client
              .customMusic
              .listAudioDescriptors()
              .renderSpeedOver(renderSpeedOver)
              .bandId(bandId)
              .bandName(bandName)
              .page(page)
              .perPage(perPage)
              .id(id)
              .instrumentName(instrumentName)
              .instrumentId(instrumentId)
              .tempo(tempo)
              .tempoTo(tempoTo)
              .tempoFrom(tempoFrom)
              .name(name)
              .tag(tag)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomMusicApi#listAudioDescriptors");
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
| **renderSpeedOver** | **Double**| Show descriptors with an average render speed that is greater than or equal to the specified value | [optional] |
| **bandId** | **String**| Show descriptors that contain the specified band (case-sentsitive) | [optional] |
| **bandName** | **String**| Show descriptors with the specified band name (case-sensitive) | [optional] |
| **page** | **Integer**| Page number | [optional] [default to 1] |
| **perPage** | **Integer**| Number of results per page | [optional] [default to 20] |
| **id** | [**List&lt;String&gt;**](String.md)| Show descriptors with the specified IDs (case-sensitive) | [optional] |
| **instrumentName** | **String**| Show descriptors with the specified instrument name (case-sensitive) | [optional] |
| **instrumentId** | **String**| Show descriptors with the specified instrument ID (case-sensitive) | [optional] |
| **tempo** | **Double**| Show descriptors whose tempo range includes the specified tempo in beats per minute | [optional] |
| **tempoTo** | **Double**| Show descriptors with a tempo that is less than or equal to the specified number | [optional] |
| **tempoFrom** | **Double**| Show descriptors that have a tempo range that includes the specified tempo in beats per minute | [optional] |
| **name** | **String**| Show descriptors with the specified name (case-sensitive) | [optional] |
| **tag** | **String**| Show descriptors with the specified tag, such as Cinematic or Roomy (case-sensitive) | [optional] |

### Return type

[**DescriptorsListResult**](DescriptorsListResult.md)

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

<a name="listComputerAudioInstruments"></a>
# **listComputerAudioInstruments**
> InstrumentsListResult listComputerAudioInstruments().id(id).perPage(perPage).page(page).name(name).tag(tag).execute();

List computer audio instruments

This endpoint lists the instruments that you can include in computer audio. If you specify more than one search parameter, the API uses an AND condition.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CustomMusicApi;
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
    List<String> id = Arrays.asList(); // Show instruments with the specified ID
    Integer perPage = 20; // Number of results per page
    Integer page = 1; // Page number
    String name = "Precision Bass - Full"; // Show instruments with the specified name (case-sensitive)
    String tag = "Percussion"; // Show instruments with the specified tag, such as Percussion or Strings (case-sensitive)
    try {
      InstrumentsListResult result = client
              .customMusic
              .listComputerAudioInstruments()
              .id(id)
              .perPage(perPage)
              .page(page)
              .name(name)
              .tag(tag)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getPage());
      System.out.println(result.getPerPage());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomMusicApi#listComputerAudioInstruments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<InstrumentsListResult> response = client
              .customMusic
              .listComputerAudioInstruments()
              .id(id)
              .perPage(perPage)
              .page(page)
              .name(name)
              .tag(tag)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomMusicApi#listComputerAudioInstruments");
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
| **id** | [**List&lt;String&gt;**](String.md)| Show instruments with the specified ID | [optional] |
| **perPage** | **Integer**| Number of results per page | [optional] [default to 20] |
| **page** | **Integer**| Page number | [optional] [default to 1] |
| **name** | **String**| Show instruments with the specified name (case-sensitive) | [optional] |
| **tag** | **String**| Show instruments with the specified tag, such as Percussion or Strings (case-sensitive) | [optional] |

### Return type

[**InstrumentsListResult**](InstrumentsListResult.md)

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

