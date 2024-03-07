# OauthApi

All URIs are relative to *https://api.shutterstock.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authorizeApplications**](OauthApi.md#authorizeApplications) | **GET** /v2/oauth/authorize | Authorize applications |
| [**getUserAccessToken**](OauthApi.md#getUserAccessToken) | **POST** /v2/oauth/access_token | Get access tokens |


<a name="authorizeApplications"></a>
# **authorizeApplications**
> authorizeApplications(clientId, redirectUri, responseType, state).realm(realm).scope(scope).execute();

Authorize applications

This endpoint returns a redirect URI (in the &#39;Location&#39; header) that the customer uses to authorize your application and, together with POST /v2/oauth/access_token, generate an access token that represents that authorization.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OauthApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shutterstock.com";
    Shutterstock client = new Shutterstock(configuration);
    String clientId = "6d097450b209c6dcd859"; // Client ID (Consumer Key) of your application
    String redirectUri = "localhost"; // The callback URI to send the request to after authorization; must use a host name that is registered with your application
    String responseType = "code"; // Type of temporary authorization code that will be used to generate an access code; the only valid value is 'code'
    String state = "1540290465000"; // Unique value used by the calling app to verify the request
    String realm = "customer"; // User type to be authorized (usually 'customer')
    String scope = "user.view"; // Space-separated list of scopes to be authorized
    try {
      client
              .oauth
              .authorizeApplications(clientId, redirectUri, responseType, state)
              .realm(realm)
              .scope(scope)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#authorizeApplications");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .oauth
              .authorizeApplications(clientId, redirectUri, responseType, state)
              .realm(realm)
              .scope(scope)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#authorizeApplications");
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
| **clientId** | **String**| Client ID (Consumer Key) of your application | |
| **redirectUri** | **String**| The callback URI to send the request to after authorization; must use a host name that is registered with your application | |
| **responseType** | **String**| Type of temporary authorization code that will be used to generate an access code; the only valid value is &#39;code&#39; | [enum: code] |
| **state** | **String**| Unique value used by the calling app to verify the request | |
| **realm** | **String**| User type to be authorized (usually &#39;customer&#39;) | [optional] [default to customer] [enum: customer, contributor] |
| **scope** | **String**| Space-separated list of scopes to be authorized | [optional] [default to user.view] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="getUserAccessToken"></a>
# **getUserAccessToken**
> OauthAccessTokenResponse getUserAccessToken().oauthGetUserAccessTokenRequest(oauthGetUserAccessTokenRequest).execute();

Get access tokens

This endpoint returns an access token for the specified user and with the specified scopes. The token does not expire until the user changes their password. The body parameters must be encoded as form data.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Shutterstock;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OauthApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.shutterstock.com";
    Shutterstock client = new Shutterstock(configuration);
    String clientId = "clientId_example"; // Client ID (Consumer Key) of your application
    String grantType = "authorization_code"; // Grant type: authorization_code generates user tokens, client_credentials generates short-lived client grants
    String clientSecret = "clientSecret_example"; // Client Secret (Consumer Secret) of your application
    String code = "code_example"; // Response code from the /oauth/authorize flow; required if grant_type=authorization_code
    Boolean expires = false; // Whether or not the token expires, expiring tokens come with a refresh_token to renew the access_token
    String realm = "customer"; // User type to be authorized (usually 'customer')
    String refreshToken = "refreshToken_example"; // Pass this along with grant_type=refresh_token to get a fresh access token
    try {
      OauthAccessTokenResponse result = client
              .oauth
              .getUserAccessToken(clientId, grantType)
              .clientSecret(clientSecret)
              .code(code)
              .expires(expires)
              .realm(realm)
              .refreshToken(refreshToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessToken());
      System.out.println(result.getExpiresIn());
      System.out.println(result.getRefreshToken());
      System.out.println(result.getTokenType());
      System.out.println(result.getUserToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#getUserAccessToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OauthAccessTokenResponse> response = client
              .oauth
              .getUserAccessToken(clientId, grantType)
              .clientSecret(clientSecret)
              .code(code)
              .expires(expires)
              .realm(realm)
              .refreshToken(refreshToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#getUserAccessToken");
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
| **oauthGetUserAccessTokenRequest** | [**OauthGetUserAccessTokenRequest**](OauthGetUserAccessTokenRequest.md)|  | [optional] |

### Return type

[**OauthAccessTokenResponse**](OauthAccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

