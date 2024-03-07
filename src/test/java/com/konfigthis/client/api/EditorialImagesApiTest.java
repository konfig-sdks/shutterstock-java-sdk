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
import com.konfigthis.client.model.DownloadHistoryDataList;
import com.konfigthis.client.model.EditorialCategoryResults;
import com.konfigthis.client.model.EditorialContent;
import com.konfigthis.client.model.EditorialContentDataList;
import com.konfigthis.client.model.EditorialImageCategoryResults;
import com.konfigthis.client.model.EditorialImageContentDataList;
import com.konfigthis.client.model.EditorialImageLivefeed;
import com.konfigthis.client.model.EditorialImageLivefeedList;
import com.konfigthis.client.model.EditorialLivefeed;
import com.konfigthis.client.model.EditorialLivefeedList;
import com.konfigthis.client.model.EditorialSearchResults;
import com.konfigthis.client.model.EditorialUpdatedResults;
import com.konfigthis.client.model.LicenseEditorialContent;
import com.konfigthis.client.model.LicenseEditorialContentRequest;
import com.konfigthis.client.model.LicenseEditorialContentResults;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EditorialImagesApi
 */
@Disabled
public class EditorialImagesApiTest {

    private static EditorialImagesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new EditorialImagesApi(apiClient);
    }

    /**
     * (Deprecated) Get editorial content details
     *
     * Deprecated; use &#x60;GET /v2/editorial/images/{id}&#x60; instead to show information about an editorial image, including a URL to a preview image and the sizes that it is available in.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDetailsTest() throws ApiException {
        String id = null;
        String country = null;
        String searchId = null;
        EditorialContent response = api.getDetails(id, country)
                .searchId(searchId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get editorial content details
     *
     * This endpoint shows information about an editorial image, including a URL to a preview image and the sizes that it is available in.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getImageDetailsTest() throws ApiException {
        String id = null;
        String country = null;
        EditorialContent response = api.getImageDetails(id, country)
                .execute();
        // TODO: test validations
    }

    /**
     * Get editorial livefeed
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLivefeedImagesTest() throws ApiException {
        String id = null;
        String country = null;
        EditorialImageLivefeed response = api.getLivefeedImages(id, country)
                .execute();
        // TODO: test validations
    }

    /**
     * Get editorial livefeed items
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLivefeedItemsTest() throws ApiException {
        String id = null;
        String country = null;
        EditorialImageContentDataList response = api.getLivefeedItems(id, country)
                .execute();
        // TODO: test validations
    }

    /**
     * (Deprecated) Get editorial livefeed
     *
     * Deprecated: use &#x60;GET /v2/editorial/images/livefeeds/{id}&#x60; instead to get an editorial livefeed.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLivefeedItems_0Test() throws ApiException {
        String id = null;
        String country = null;
        EditorialLivefeed response = api.getLivefeedItems_0(id, country)
                .execute();
        // TODO: test validations
    }

    /**
     * (Deprecated) Get editorial livefeed items
     *
     * Deprecated; use &#x60;GET /v2/editorial/images/livefeeds/{id}/items&#x60; instead to get editorial livefeed items.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLivefeedItems_1Test() throws ApiException {
        String id = null;
        String country = null;
        EditorialContentDataList response = api.getLivefeedItems_1(id, country)
                .execute();
        // TODO: test validations
    }

    /**
     * (Deprecated) Get editorial livefeed list
     *
     * Deprecated; use &#x60;GET /v2/editorial/images/livefeeds&#x60; instead to get a list of editorial livefeeds.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLivefeedListTest() throws ApiException {
        String country = null;
        Integer page = null;
        Integer perPage = null;
        EditorialLivefeedList response = api.getLivefeedList(country)
                .page(page)
                .perPage(perPage)
                .execute();
        // TODO: test validations
    }

    /**
     * License editorial content
     *
     * This endpoint gets licenses for one or more editorial images. You must specify the country and one or more editorial images to license. The download links in the response are valid for 8 hours.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void licenseContentTest() throws ApiException {
        Object country = null;
        List<LicenseEditorialContent> editorial = null;
        LicenseEditorialContentResults response = api.licenseContent(country, editorial)
                .execute();
        // TODO: test validations
    }

    /**
     * (Deprecated) License editorial content
     *
     * Deprecated; use &#x60;POST /v2/editorial/images/licenses&#x60; instead to get licenses for one or more editorial images. You must specify the country and one or more editorial images to license. The download links in the response are valid for 8 hours.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void licenseContent_0Test() throws ApiException {
        Object country = null;
        List<LicenseEditorialContent> editorial = null;
        LicenseEditorialContentResults response = api.licenseContent_0(country, editorial)
                .execute();
        // TODO: test validations
    }

    /**
     * (Deprecated) List editorial categories
     *
     * Deprecated; use &#x60;GET /v2/editorial/images/categories&#x60; instead. This endpoint lists the categories that editorial images can belong to, which are separate from the categories that other types of assets can belong to.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listCategoriesTest() throws ApiException {
        EditorialCategoryResults response = api.listCategories()
                .execute();
        // TODO: test validations
    }

    /**
     * List editorial categories
     *
     * This endpoint lists the categories that editorial images can belong to, which are separate from the categories that other types of assets can belong to.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listCategories_0Test() throws ApiException {
        EditorialImageCategoryResults response = api.listCategories_0()
                .execute();
        // TODO: test validations
    }

    /**
     * List editorial image licenses
     *
     * This endpoint lists existing editorial image licenses.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listLicensesTest() throws ApiException {
        String imageId = null;
        String license = null;
        Integer page = null;
        Integer perPage = null;
        String sort = null;
        String username = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String downloadAvailability = null;
        Boolean teamHistory = null;
        DownloadHistoryDataList response = api.listLicenses()
                .imageId(imageId)
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
        // TODO: test validations
    }

    /**
     * Get editorial livefeed list
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listLivefeedImagesTest() throws ApiException {
        String country = null;
        Integer page = null;
        Integer perPage = null;
        EditorialImageLivefeedList response = api.listLivefeedImages(country)
                .page(page)
                .perPage(perPage)
                .execute();
        // TODO: test validations
    }

    /**
     * List updated content
     *
     * This endpoint lists editorial images that have been updated in the specified time period to update content management systems (CMS) or digital asset management (DAM) systems. In most cases, use the date_updated_start and date_updated_end parameters to specify a range updates based on when the updates happened. You can also use the date_taken_start and date_taken_end parameters to specify a range of updates based on when the image was taken.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listUpdatedContentTest() throws ApiException {
        String type = null;
        OffsetDateTime dateUpdatedStart = null;
        OffsetDateTime dateUpdatedEnd = null;
        String country = null;
        LocalDate dateTakenStart = null;
        LocalDate dateTakenEnd = null;
        String cursor = null;
        String sort = null;
        List<String> supplierCode = null;
        Integer perPage = null;
        EditorialUpdatedResults response = api.listUpdatedContent(type, dateUpdatedStart, dateUpdatedEnd, country)
                .dateTakenStart(dateTakenStart)
                .dateTakenEnd(dateTakenEnd)
                .cursor(cursor)
                .sort(sort)
                .supplierCode(supplierCode)
                .perPage(perPage)
                .execute();
        // TODO: test validations
    }

    /**
     * (Deprecated) List updated content
     *
     * Deprecated; use &#x60;GET /v2/editorial/images/updated&#x60; instead to get recently updated items.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listUpdatedContent_0Test() throws ApiException {
        String type = null;
        OffsetDateTime dateUpdatedStart = null;
        OffsetDateTime dateUpdatedEnd = null;
        String country = null;
        LocalDate dateTakenStart = null;
        LocalDate dateTakenEnd = null;
        String cursor = null;
        String sort = null;
        List<String> supplierCode = null;
        Integer perPage = null;
        EditorialUpdatedResults response = api.listUpdatedContent_0(type, dateUpdatedStart, dateUpdatedEnd, country)
                .dateTakenStart(dateTakenStart)
                .dateTakenEnd(dateTakenEnd)
                .cursor(cursor)
                .sort(sort)
                .supplierCode(supplierCode)
                .perPage(perPage)
                .execute();
        // TODO: test validations
    }

    /**
     * Search editorial images
     *
     * This endpoint searches for editorial images. If you specify more than one search parameter, the API uses an AND condition. For example, if you set the &#x60;category&#x60; parameter to \&quot;Alone,Performing\&quot; and also specify a &#x60;query&#x60; parameter, the results include only images that match the query and are in both the Alone and Performing categories. You can also filter search terms out in the &#x60;query&#x60; parameter by prefixing the term with NOT.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchTest() throws ApiException {
        String country = null;
        String query = null;
        String sort = null;
        String category = null;
        List<String> supplierCode = null;
        LocalDate dateStart = null;
        LocalDate dateEnd = null;
        Integer perPage = null;
        String cursor = null;
        EditorialSearchResults response = api.search(country)
                .query(query)
                .sort(sort)
                .category(category)
                .supplierCode(supplierCode)
                .dateStart(dateStart)
                .dateEnd(dateEnd)
                .perPage(perPage)
                .cursor(cursor)
                .execute();
        // TODO: test validations
    }

    /**
     * (Deprecated) Search editorial content
     *
     * Deprecated; use &#x60;GET /v2/editorial/images/search&#x60; instead to search for editorial images.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchContentTest() throws ApiException {
        String country = null;
        String query = null;
        String sort = null;
        String category = null;
        List<String> supplierCode = null;
        LocalDate dateStart = null;
        LocalDate dateEnd = null;
        Integer perPage = null;
        String cursor = null;
        EditorialSearchResults response = api.searchContent(country)
                .query(query)
                .sort(sort)
                .category(category)
                .supplierCode(supplierCode)
                .dateStart(dateStart)
                .dateEnd(dateEnd)
                .perPage(perPage)
                .cursor(cursor)
                .execute();
        // TODO: test validations
    }

}