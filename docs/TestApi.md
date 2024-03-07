# TestApi

All URIs are relative to *https://api.shutterstock.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**echoText**](TestApi.md#echoText) | **GET** /v2/test | Echo text |
| [**inputValidation**](TestApi.md#inputValidation) | **GET** /v2/test/validate | Validate input |


<a name="echoText"></a>
# **echoText**
> TestEcho echoText().text(text).execute();

Echo text

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TestApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shutterstock.com";
    Shutterstock client = new Shutterstock(configuration);
    String text = "ok"; // Text to echo
    try {
      TestEcho result = client
              .test
              .echoText()
              .text(text)
              .execute();
      System.out.println(result);
      System.out.println(result.getText());
    } catch (ApiException e) {
      System.err.println("Exception when calling TestApi#echoText");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TestEcho> response = client
              .test
              .echoText()
              .text(text)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TestApi#echoText");
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
| **text** | **String**| Text to echo | [optional] [default to ok] |

### Return type

[**TestEcho**](TestEcho.md)

### Authorization

No authorization required

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

<a name="inputValidation"></a>
# **inputValidation**
> TestValidate inputValidation(id).tag(tag).userAgent(userAgent).execute();

Validate input

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TestApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shutterstock.com";
    Shutterstock client = new Shutterstock(configuration);
    Integer id = 123; // Integer ID
    List<String> tag = Arrays.asList(); // List of tags
    String userAgent = "userAgent_example"; // User agent
    try {
      TestValidate result = client
              .test
              .inputValidation(id)
              .tag(tag)
              .userAgent(userAgent)
              .execute();
      System.out.println(result);
      System.out.println(result.getHeader());
      System.out.println(result.getQuery());
    } catch (ApiException e) {
      System.err.println("Exception when calling TestApi#inputValidation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TestValidate> response = client
              .test
              .inputValidation(id)
              .tag(tag)
              .userAgent(userAgent)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TestApi#inputValidation");
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
| **id** | **Integer**| Integer ID | |
| **tag** | [**List&lt;String&gt;**](String.md)| List of tags | [optional] |
| **userAgent** | **String**| User agent | [optional] |

### Return type

[**TestValidate**](TestValidate.md)

### Authorization

No authorization required

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

