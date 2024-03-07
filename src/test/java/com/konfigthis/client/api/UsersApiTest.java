/*
 * Shutterstock API Explorer
 * The Shutterstock API provides access to Shutterstock's library of media, as well as information about customers' accounts and the contributors that provide the media.
 *
 * The version of the OpenAPI document: 1.1.32
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.AccessTokenDetails;
import com.konfigthis.client.model.SubscriptionDataList;
import com.konfigthis.client.model.UserDetails;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
@Disabled
public class UsersApiTest {

    private static UsersApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new UsersApi(apiClient);
    }

    /**
     * Get access token details
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAccessTokenDetailsTest() throws ApiException {
        AccessTokenDetails response = api.getAccessTokenDetails()
                .execute();
        // TODO: test validations
    }

    /**
     * Get user details
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserDetailsTest() throws ApiException {
        UserDetails response = api.getUserDetails()
                .execute();
        // TODO: test validations
    }

    /**
     * List user subscriptions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listSubscriptionsTest() throws ApiException {
        SubscriptionDataList response = api.listSubscriptions()
                .execute();
        // TODO: test validations
    }

}