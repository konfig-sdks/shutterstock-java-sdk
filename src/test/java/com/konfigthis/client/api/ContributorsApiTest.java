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
import com.konfigthis.client.model.Collection;
import com.konfigthis.client.model.CollectionDataList;
import com.konfigthis.client.model.CollectionItemDataList;
import com.konfigthis.client.model.ContributorProfile;
import com.konfigthis.client.model.ContributorProfileDataList;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContributorsApi
 */
@Disabled
public class ContributorsApiTest {

    private static ContributorsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ContributorsApi(apiClient);
    }

    /**
     * Get details about contributors&#39; collections
     *
     * This endpoint gets more detailed information about a contributor&#39;s collection, including its cover image, timestamps for its creation, and most recent update. To get the items in collections, use GET /v2/contributors/{contributor_id}/collections/{id}/items.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCollectionDetailsTest() throws ApiException {
        String contributorId = null;
        String id = null;
        Collection response = api.getCollectionDetails(contributorId, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Get the items in contributors&#39; collections
     *
     * This endpoint lists the IDs of items in a contributor&#39;s collection and the date that each was added.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCollectionItemsTest() throws ApiException {
        String contributorId = null;
        String id = null;
        Integer page = null;
        Integer perPage = null;
        String sort = null;
        CollectionItemDataList response = api.getCollectionItems(contributorId, id)
                .page(page)
                .perPage(perPage)
                .sort(sort)
                .execute();
        // TODO: test validations
    }

    /**
     * Get details about a single contributor
     *
     * This endpoint shows information about a single contributor, including contributor type, equipment they use, and other attributes.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDetailsTest() throws ApiException {
        String contributorId = null;
        ContributorProfile response = api.getDetails(contributorId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get details about multiple contributors
     *
     * This endpoint lists information about one or more contributors, including contributor type, equipment they use and other attributes.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDetailsMultipleTest() throws ApiException {
        List<String> id = null;
        ContributorProfileDataList response = api.getDetailsMultiple(id)
                .execute();
        // TODO: test validations
    }

    /**
     * List contributors&#39; collections
     *
     * This endpoint lists collections based on contributor ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listCollectionsTest() throws ApiException {
        String contributorId = null;
        String sort = null;
        CollectionDataList response = api.listCollections(contributorId)
                .sort(sort)
                .execute();
        // TODO: test validations
    }

}