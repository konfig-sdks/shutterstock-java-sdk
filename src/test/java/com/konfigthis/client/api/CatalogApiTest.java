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
import com.konfigthis.client.model.CatalogCollection;
import com.konfigthis.client.model.CatalogCollectionDataList;
import com.konfigthis.client.model.CatalogCollectionItemDataList;
import com.konfigthis.client.model.CreateCatalogCollection;
import com.konfigthis.client.model.CreateCatalogCollectionItem;
import com.konfigthis.client.model.CreateCatalogCollectionItems;
import com.konfigthis.client.model.RemoveCatalogCollectionItem;
import com.konfigthis.client.model.RemoveCatalogCollectionItems;
import com.konfigthis.client.model.UpdateCatalogCollection;
import com.konfigthis.client.model.UpdateCatalogCollectionCoverAsset;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CatalogApi
 */
@Disabled
public class CatalogApiTest {

    private static CatalogApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new CatalogApi(apiClient);
    }

    /**
     * Add items to catalog collections
     *
     * This endpoint adds assets to a catalog collection. It also automatically adds the assets to the user&#39;s account&#39;s catalog.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addToCollectionItemsTest() throws ApiException {
        List<CreateCatalogCollectionItem> items = null;
        String collectionId = null;
        CatalogCollection response = api.addToCollectionItems(items, collectionId)
                .execute();
        // TODO: test validations
    }

    /**
     * Create catalog collections
     *
     * This endpoint creates a catalog collection and optionally adds assets. To add assets to the collection later, use &#x60;PATCH /v2/catalog/collections/{collection_id}/items&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCollectionTest() throws ApiException {
        String name = null;
        List<CreateCatalogCollectionItem> items = null;
        String visibility = null;
        CatalogCollection response = api.createCollection(name)
                .items(items)
                .visibility(visibility)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete catalog collections
     *
     * This endpoint deletes a catalog collection. It does not remove the assets from the user&#39;s account&#39;s catalog.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCollectionTest() throws ApiException {
        String collectionId = null;
        api.deleteCollection(collectionId)
                .execute();
        // TODO: test validations
    }

    /**
     * List catalog collections
     *
     * This endpoint returns a list of catalog collections.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listCollectionsTest() throws ApiException {
        Integer page = null;
        Integer perPage = null;
        String sort = null;
        Boolean shared = null;
        CatalogCollectionDataList response = api.listCollections()
                .page(page)
                .perPage(perPage)
                .sort(sort)
                .shared(shared)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove items from catalog collection
     *
     * This endpoint removes assets from a catalog collection. It does not remove the assets from the user&#39;s account&#39;s catalog.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeItemsFromCollectionTest() throws ApiException {
        List<RemoveCatalogCollectionItem> items = null;
        String collectionId = null;
        CatalogCollection response = api.removeItemsFromCollection(items, collectionId)
                .execute();
        // TODO: test validations
    }

    /**
     * Search catalogs for assets
     *
     * This endpoint searches for assets in the account&#39;s catalog. If you specify more than one search parameter, the API uses an AND condition. Array parameters can be specified multiple times; in this case, the API uses an AND or an OR condition with those values, depending on the parameter. You can also filter search terms out in the &#x60;query&#x60; parameter by prefixing the term with NOT.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchAssetsTest() throws ApiException {
        String sort = null;
        Integer page = null;
        Integer perPage = null;
        String query = null;
        List<String> collectionId = null;
        List<String> assetType = null;
        CatalogCollectionItemDataList response = api.searchAssets()
                .sort(sort)
                .page(page)
                .perPage(perPage)
                .query(query)
                .collectionId(collectionId)
                .assetType(assetType)
                .execute();
        // TODO: test validations
    }

    /**
     * Update collection metadata
     *
     * This endpoint updates the metadata of a catalog collection.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCollectionMetadataTest() throws ApiException {
        String collectionId = null;
        UpdateCatalogCollectionCoverAsset coverAsset = null;
        String name = null;
        String visibility = null;
        CatalogCollection response = api.updateCollectionMetadata(collectionId)
                .coverAsset(coverAsset)
                .name(name)
                .visibility(visibility)
                .execute();
        // TODO: test validations
    }

}