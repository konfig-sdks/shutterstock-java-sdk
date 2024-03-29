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
import com.konfigthis.client.model.CategoryDataList;
import com.konfigthis.client.model.Collection;
import com.konfigthis.client.model.CollectionCreateRequest;
import com.konfigthis.client.model.CollectionCreateResponse;
import com.konfigthis.client.model.CollectionDataList;
import com.konfigthis.client.model.CollectionItem;
import com.konfigthis.client.model.CollectionItemDataList;
import com.konfigthis.client.model.CollectionItemRequest;
import com.konfigthis.client.model.CollectionUpdateRequest;
import com.konfigthis.client.model.Cookie;
import com.konfigthis.client.model.DownloadHistoryDataList;
import com.konfigthis.client.model.FeaturedCollection;
import com.konfigthis.client.model.FeaturedCollectionDataList;
import com.konfigthis.client.model.Language;
import com.konfigthis.client.model.LicenseVideo;
import com.konfigthis.client.model.LicenseVideoRequest;
import com.konfigthis.client.model.LicenseVideoResultDataList;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import com.konfigthis.client.model.RedownloadVideo;
import com.konfigthis.client.model.Suggestions;
import com.konfigthis.client.model.UpdatedMediaDataList;
import com.konfigthis.client.model.Url;
import com.konfigthis.client.model.Video;
import com.konfigthis.client.model.VideoCollectionItemDataList;
import com.konfigthis.client.model.VideoDataList;
import com.konfigthis.client.model.VideoSearchResults;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VideosApi
 */
@Disabled
public class VideosApiTest {

    private static VideosApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new VideosApi(apiClient);
    }

    /**
     * Add videos to collections
     *
     * This endpoint adds one or more videos to a collection by video IDs.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addToCollectionItemsTest() throws ApiException {
        List<CollectionItem> items = null;
        String id = null;
        api.addToCollectionItems(items, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Get the details of featured video collections
     *
     * This endpoint gets more detailed information about a featured video collection, including its cover video and timestamps for its creation and most recent update. To get the videos, use &#x60;GET /v2/videos/collections/featured/{id}/items&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void collectionDetailsGetTest() throws ApiException {
        String id = null;
        String embed = null;
        FeaturedCollection response = api.collectionDetailsGet(id)
                .embed(embed)
                .execute();
        // TODO: test validations
    }

    /**
     * Get the details of video collections
     *
     * This endpoint gets more detailed information about a collection, including the timestamp for its creation and the number of videos in it. To get the videos in collections, use GET /v2/videos/collections/{id}/items.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void collectionDetailsGet_0Test() throws ApiException {
        String id = null;
        List<String> embed = null;
        String shareCode = null;
        Collection response = api.collectionDetailsGet_0(id)
                .embed(embed)
                .shareCode(shareCode)
                .execute();
        // TODO: test validations
    }

    /**
     * Create video collections
     *
     * This endpoint creates one or more collections (clipboxes). To add videos to collections, use &#x60;POST /v2/videos/collections/{id}/items&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createVideoCollectionsTest() throws ApiException {
        String name = null;
        CollectionCreateResponse response = api.createVideoCollections(name)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete video collections
     *
     * This endpoint deletes a collection.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCollectionTest() throws ApiException {
        String id = null;
        api.deleteCollection(id)
                .execute();
        // TODO: test validations
    }

    /**
     * List similar videos
     *
     * This endpoint searches for videos that are similar to a video that you specify.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findSimilarTest() throws ApiException {
        String id = null;
        Language language = null;
        Integer page = null;
        Integer perPage = null;
        String view = null;
        VideoSearchResults response = api.findSimilar(id)
                .language(language)
                .page(page)
                .perPage(perPage)
                .view(view)
                .execute();
        // TODO: test validations
    }

    /**
     * Get the contents of video collections
     *
     * This endpoint lists the IDs of videos in a collection and the date that each was added.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCollectionItemsTest() throws ApiException {
        String id = null;
        Integer page = null;
        Integer perPage = null;
        String shareCode = null;
        String sort = null;
        CollectionItemDataList response = api.getCollectionItems(id)
                .page(page)
                .perPage(perPage)
                .shareCode(shareCode)
                .sort(sort)
                .execute();
        // TODO: test validations
    }

    /**
     * Get the contents of featured video collections
     *
     * This endpoint lists the IDs of videos in a featured collection and the date that each was added.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFeaturedCollectionItemsTest() throws ApiException {
        String id = null;
        Integer page = null;
        Integer perPage = null;
        VideoCollectionItemDataList response = api.getFeaturedCollectionItems(id)
                .page(page)
                .perPage(perPage)
                .execute();
        // TODO: test validations
    }

    /**
     * License videos
     *
     * This endpoint gets licenses for one or more videos. You must specify the video IDs in the body parameter and the size and subscription ID either in the query parameter or with each video ID in the body parameter. Values in the body parameter override values in the query parameters. The download links in the response are valid for 8 hours.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void licenseVideosTest() throws ApiException {
        List<LicenseVideo> videos = null;
        String subscriptionId = null;
        String size = null;
        String searchId = null;
        LicenseVideoResultDataList response = api.licenseVideos(videos)
                .subscriptionId(subscriptionId)
                .size(size)
                .searchId(searchId)
                .execute();
        // TODO: test validations
    }

    /**
     * List video categories
     *
     * This endpoint lists the categories (Shutterstock-assigned genres) that videos can belong to.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listCategoriesTest() throws ApiException {
        Language language = null;
        CategoryDataList response = api.listCategories()
                .language(language)
                .execute();
        // TODO: test validations
    }

    /**
     * List video collections
     *
     * This endpoint lists your collections of videos and their basic attributes.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listCollectionsTest() throws ApiException {
        Integer page = null;
        Integer perPage = null;
        List<String> embed = null;
        CollectionDataList response = api.listCollections()
                .page(page)
                .perPage(perPage)
                .embed(embed)
                .execute();
        // TODO: test validations
    }

    /**
     * List featured video collections
     *
     * This endpoint lists featured video collections and a name and cover video for each collection.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listFeaturedVideoCollectionsTest() throws ApiException {
        String embed = null;
        FeaturedCollectionDataList response = api.listFeaturedVideoCollections()
                .embed(embed)
                .execute();
        // TODO: test validations
    }

    /**
     * List video licenses
     *
     * This endpoint lists existing licenses.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listLicensesTest() throws ApiException {
        String videoId = null;
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
        // TODO: test validations
    }

    /**
     * List updated videos
     *
     * This endpoint lists videos that have been updated in the specified time period to update content management systems (CMS) or digital asset management (DAM) systems. In most cases, use the &#x60;interval&#x60; parameter to show videos that were updated recently, but you can also use the &#x60;start_date&#x60; and &#x60;end_date&#x60; parameters to specify a range of no more than three days. Do not use the &#x60;interval&#x60; parameter with either &#x60;start_date&#x60; or &#x60;end_date&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listUpdatedVideosTest() throws ApiException {
        LocalDate startDate = null;
        LocalDate endDate = null;
        String interval = null;
        Integer page = null;
        Integer perPage = null;
        String sort = null;
        UpdatedMediaDataList response = api.listUpdatedVideos()
                .startDate(startDate)
                .endDate(endDate)
                .interval(interval)
                .page(page)
                .perPage(perPage)
                .sort(sort)
                .execute();
        // TODO: test validations
    }

    /**
     * List videos
     *
     * This endpoint lists information about one or more videos, including the aspect ratio and URLs to previews.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listVideoTest() throws ApiException {
        List<String> id = null;
        String view = null;
        String searchId = null;
        VideoDataList response = api.listVideo(id)
                .view(view)
                .searchId(searchId)
                .execute();
        // TODO: test validations
    }

    /**
     * Download videos
     *
     * This endpoint redownloads videos that you have already received a license for.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void redownloadDownloadsTest() throws ApiException {
        String id = null;
        Cookie authCookie = null;
        Boolean showModal = null;
        String size = null;
        String verificationCode = null;
        Url response = api.redownloadDownloads(id)
                .authCookie(authCookie)
                .showModal(showModal)
                .size(size)
                .verificationCode(verificationCode)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove videos from collections
     *
     * This endpoint removes one or more videos from a collection.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeFromCollectionTest() throws ApiException {
        String id = null;
        List<String> itemId = null;
        api.removeFromCollection(id)
                .itemId(itemId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get suggestions for a search term
     *
     * This endpoint provides autocomplete suggestions for partial search terms.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchSuggestionsTest() throws ApiException {
        String query = null;
        Integer limit = null;
        Suggestions response = api.searchSuggestions(query)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Search for videos
     *
     * This endpoint searches for videos. If you specify more than one search parameter, the API uses an AND condition. Array parameters can be specified multiple times; in this case, the API uses an AND or an OR condition with those values, depending on the parameter. You can also filter search terms out in the &#x60;query&#x60; parameter by prefixing the term with NOT.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchVideoTest() throws ApiException {
        LocalDate addedDate = null;
        LocalDate addedDateStart = null;
        LocalDate addedDateEnd = null;
        String aspectRatio = null;
        String category = null;
        List<String> contributor = null;
        List<String> contributorCountry = null;
        Integer duration = null;
        Integer durationFrom = null;
        Integer durationTo = null;
        Double fps = null;
        Double fpsFrom = null;
        Double fpsTo = null;
        Boolean keywordSafeSearch = null;
        Language language = null;
        List<String> license = null;
        List<String> model = null;
        Integer page = null;
        Integer perPage = null;
        String peopleAge = null;
        List<String> peopleEthnicity = null;
        String peopleGender = null;
        Integer peopleNumber = null;
        Boolean peopleModelReleased = null;
        String query = null;
        String resolution = null;
        Boolean safe = null;
        String sort = null;
        String view = null;
        VideoSearchResults response = api.searchVideo()
                .addedDate(addedDate)
                .addedDateStart(addedDateStart)
                .addedDateEnd(addedDateEnd)
                .aspectRatio(aspectRatio)
                .category(category)
                .contributor(contributor)
                .contributorCountry(contributorCountry)
                .duration(duration)
                .durationFrom(durationFrom)
                .durationTo(durationTo)
                .fps(fps)
                .fpsFrom(fpsFrom)
                .fpsTo(fpsTo)
                .keywordSafeSearch(keywordSafeSearch)
                .language(language)
                .license(license)
                .model(model)
                .page(page)
                .perPage(perPage)
                .peopleAge(peopleAge)
                .peopleEthnicity(peopleEthnicity)
                .peopleGender(peopleGender)
                .peopleNumber(peopleNumber)
                .peopleModelReleased(peopleModelReleased)
                .query(query)
                .resolution(resolution)
                .safe(safe)
                .sort(sort)
                .view(view)
                .execute();
        // TODO: test validations
    }

    /**
     * Rename video collections
     *
     * This endpoint sets a new name for a collection.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setNewNameTest() throws ApiException {
        String name = null;
        String id = null;
        api.setNewName(name, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Get details about videos
     *
     * This endpoint shows information about a video, including URLs to previews and the sizes that it is available in.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void videoDetailsTest() throws ApiException {
        String id = null;
        Language language = null;
        String view = null;
        String searchId = null;
        Video response = api.videoDetails(id)
                .language(language)
                .view(view)
                .searchId(searchId)
                .execute();
        // TODO: test validations
    }

}
