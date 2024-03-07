<div align="center">

[![Visit Shutterstock](./header.png)](https://developers.shutterstock.com)

# [Shutterstock](https://developers.shutterstock.com)

The Shutterstock API provides access to Shutterstock's library of media, as well as information about customers' accounts and the contributors that provide the media.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Shutterstock&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>shutterstock-java-sdk</artifactId>
  <version>1.1.32</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:shutterstock-java-sdk:1.1.32"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/shutterstock-java-sdk-1.1.32.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://api.shutterstock.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AudioApi* | [**addTracksToCollection**](docs/AudioApi.md#addTracksToCollection) | **POST** /v2/audio/collections/{id}/items | Add audio tracks to collections
*AudioApi* | [**createCollections**](docs/AudioApi.md#createCollections) | **POST** /v2/audio/collections | Create audio collections
*AudioApi* | [**deleteCollection**](docs/AudioApi.md#deleteCollection) | **DELETE** /v2/audio/collections/{id} | Delete audio collections
*AudioApi* | [**getCollectionDetails**](docs/AudioApi.md#getCollectionDetails) | **GET** /v2/audio/collections/{id} | Get the details of audio collections
*AudioApi* | [**getTrackDetails**](docs/AudioApi.md#getTrackDetails) | **GET** /v2/audio/{id} | Get details about audio tracks
*AudioApi* | [**licenseTracks**](docs/AudioApi.md#licenseTracks) | **POST** /v2/audio/licenses | License audio tracks
*AudioApi* | [**listAudioLicenses**](docs/AudioApi.md#listAudioLicenses) | **GET** /v2/audio/licenses | List audio licenses
*AudioApi* | [**listCollectionItems**](docs/AudioApi.md#listCollectionItems) | **GET** /v2/audio/collections/{id}/items | Get the contents of audio collections
*AudioApi* | [**listCollections**](docs/AudioApi.md#listCollections) | **GET** /v2/audio/collections | List audio collections
*AudioApi* | [**listGenres**](docs/AudioApi.md#listGenres) | **GET** /v2/audio/genres | List audio genres
*AudioApi* | [**listInstruments**](docs/AudioApi.md#listInstruments) | **GET** /v2/audio/instruments | List audio instruments
*AudioApi* | [**listMoods**](docs/AudioApi.md#listMoods) | **GET** /v2/audio/moods | List audio moods
*AudioApi* | [**listTracks**](docs/AudioApi.md#listTracks) | **GET** /v2/audio | List audio tracks
*AudioApi* | [**redownloadTracks**](docs/AudioApi.md#redownloadTracks) | **POST** /v2/audio/licenses/{id}/downloads | Download audio tracks
*AudioApi* | [**removeTracksFromCollection**](docs/AudioApi.md#removeTracksFromCollection) | **DELETE** /v2/audio/collections/{id}/items | Remove audio tracks from collections
*AudioApi* | [**searchTracks**](docs/AudioApi.md#searchTracks) | **GET** /v2/audio/search | Search for tracks
*AudioApi* | [**setCollectionName**](docs/AudioApi.md#setCollectionName) | **POST** /v2/audio/collections/{id} | Rename audio collections
*CatalogApi* | [**addToCollectionItems**](docs/CatalogApi.md#addToCollectionItems) | **POST** /v2/catalog/collections/{collection_id}/items | Add items to catalog collections
*CatalogApi* | [**createCollection**](docs/CatalogApi.md#createCollection) | **POST** /v2/catalog/collections | Create catalog collections
*CatalogApi* | [**deleteCollection**](docs/CatalogApi.md#deleteCollection) | **DELETE** /v2/catalog/collections/{collection_id} | Delete catalog collections
*CatalogApi* | [**listCollections**](docs/CatalogApi.md#listCollections) | **GET** /v2/catalog/collections | List catalog collections
*CatalogApi* | [**removeItemsFromCollection**](docs/CatalogApi.md#removeItemsFromCollection) | **DELETE** /v2/catalog/collections/{collection_id}/items | Remove items from catalog collection
*CatalogApi* | [**searchAssets**](docs/CatalogApi.md#searchAssets) | **GET** /v2/catalog/search | Search catalogs for assets
*CatalogApi* | [**updateCollectionMetadata**](docs/CatalogApi.md#updateCollectionMetadata) | **PATCH** /v2/catalog/collections/{collection_id} | Update collection metadata
*ComputerVisionApi* | [**listSimilarImages**](docs/ComputerVisionApi.md#listSimilarImages) | **GET** /v2/cv/similar/images | List similar images
*ComputerVisionApi* | [**listSimilarVideos**](docs/ComputerVisionApi.md#listSimilarVideos) | **GET** /v2/cv/similar/videos | List similar videos
*ComputerVisionApi* | [**listSuggestedKeywords**](docs/ComputerVisionApi.md#listSuggestedKeywords) | **GET** /v2/cv/keywords | List suggested keywords
*ComputerVisionApi* | [**uploadImage**](docs/ComputerVisionApi.md#uploadImage) | **POST** /v2/cv/images | Upload images
*ComputerVisionApi* | [**uploadImageEphemeral**](docs/ComputerVisionApi.md#uploadImageEphemeral) | **POST** /v2/images | Upload ephemeral images
*ContributorsApi* | [**getCollectionDetails**](docs/ContributorsApi.md#getCollectionDetails) | **GET** /v2/contributors/{contributor_id}/collections/{id} | Get details about contributors&#39; collections
*ContributorsApi* | [**getCollectionItems**](docs/ContributorsApi.md#getCollectionItems) | **GET** /v2/contributors/{contributor_id}/collections/{id}/items | Get the items in contributors&#39; collections
*ContributorsApi* | [**getDetails**](docs/ContributorsApi.md#getDetails) | **GET** /v2/contributors/{contributor_id} | Get details about a single contributor
*ContributorsApi* | [**getDetailsMultiple**](docs/ContributorsApi.md#getDetailsMultiple) | **GET** /v2/contributors | Get details about multiple contributors
*ContributorsApi* | [**listCollections**](docs/ContributorsApi.md#listCollections) | **GET** /v2/contributors/{contributor_id}/collections | List contributors&#39; collections
*CustomMusicApi* | [**createRenderedAudio**](docs/CustomMusicApi.md#createRenderedAudio) | **POST** /v2/ai/audio/renders | Create rendered audio
*CustomMusicApi* | [**getAudioRendersDetails**](docs/CustomMusicApi.md#getAudioRendersDetails) | **GET** /v2/ai/audio/renders | Get details about audio renders
*CustomMusicApi* | [**listAudioDescriptors**](docs/CustomMusicApi.md#listAudioDescriptors) | **GET** /v2/ai/audio/descriptors | List computer audio descriptors
*CustomMusicApi* | [**listComputerAudioInstruments**](docs/CustomMusicApi.md#listComputerAudioInstruments) | **GET** /v2/ai/audio/instruments | List computer audio instruments
*EditorialImagesApi* | [**getDetails**](docs/EditorialImagesApi.md#getDetails) | **GET** /v2/editorial/{id} | (Deprecated) Get editorial content details
*EditorialImagesApi* | [**getImageDetails**](docs/EditorialImagesApi.md#getImageDetails) | **GET** /v2/editorial/images/{id} | Get editorial content details
*EditorialImagesApi* | [**getLivefeedImages**](docs/EditorialImagesApi.md#getLivefeedImages) | **GET** /v2/editorial/images/livefeeds/{id} | Get editorial livefeed
*EditorialImagesApi* | [**getLivefeedItems**](docs/EditorialImagesApi.md#getLivefeedItems) | **GET** /v2/editorial/images/livefeeds/{id}/items | Get editorial livefeed items
*EditorialImagesApi* | [**getLivefeedItems_0**](docs/EditorialImagesApi.md#getLivefeedItems_0) | **GET** /v2/editorial/livefeeds/{id} | (Deprecated) Get editorial livefeed
*EditorialImagesApi* | [**getLivefeedItems_1**](docs/EditorialImagesApi.md#getLivefeedItems_1) | **GET** /v2/editorial/livefeeds/{id}/items | (Deprecated) Get editorial livefeed items
*EditorialImagesApi* | [**getLivefeedList**](docs/EditorialImagesApi.md#getLivefeedList) | **GET** /v2/editorial/livefeeds | (Deprecated) Get editorial livefeed list
*EditorialImagesApi* | [**licenseContent**](docs/EditorialImagesApi.md#licenseContent) | **POST** /v2/editorial/images/licenses | License editorial content
*EditorialImagesApi* | [**licenseContent_0**](docs/EditorialImagesApi.md#licenseContent_0) | **POST** /v2/editorial/licenses | (Deprecated) License editorial content
*EditorialImagesApi* | [**listCategories**](docs/EditorialImagesApi.md#listCategories) | **GET** /v2/editorial/categories | (Deprecated) List editorial categories
*EditorialImagesApi* | [**listCategories_0**](docs/EditorialImagesApi.md#listCategories_0) | **GET** /v2/editorial/images/categories | List editorial categories
*EditorialImagesApi* | [**listLicenses**](docs/EditorialImagesApi.md#listLicenses) | **GET** /v2/editorial/images/licenses | List editorial image licenses
*EditorialImagesApi* | [**listLivefeedImages**](docs/EditorialImagesApi.md#listLivefeedImages) | **GET** /v2/editorial/images/livefeeds | Get editorial livefeed list
*EditorialImagesApi* | [**listUpdatedContent**](docs/EditorialImagesApi.md#listUpdatedContent) | **GET** /v2/editorial/images/updated | List updated content
*EditorialImagesApi* | [**listUpdatedContent_0**](docs/EditorialImagesApi.md#listUpdatedContent_0) | **GET** /v2/editorial/updated | (Deprecated) List updated content
*EditorialImagesApi* | [**search**](docs/EditorialImagesApi.md#search) | **GET** /v2/editorial/images/search | Search editorial images
*EditorialImagesApi* | [**searchContent**](docs/EditorialImagesApi.md#searchContent) | **GET** /v2/editorial/search | (Deprecated) Search editorial content
*EditorialVideoApi* | [**getContentDetails**](docs/EditorialVideoApi.md#getContentDetails) | **GET** /v2/editorial/videos/{id} | Get editorial video content details
*EditorialVideoApi* | [**licenseVideos**](docs/EditorialVideoApi.md#licenseVideos) | **POST** /v2/editorial/videos/licenses | License editorial video content
*EditorialVideoApi* | [**listVideoCategories**](docs/EditorialVideoApi.md#listVideoCategories) | **GET** /v2/editorial/videos/categories | List editorial video categories
*EditorialVideoApi* | [**listVideoLicenses**](docs/EditorialVideoApi.md#listVideoLicenses) | **GET** /v2/editorial/videos/licenses | List editorial video licenses
*EditorialVideoApi* | [**searchVideoContent**](docs/EditorialVideoApi.md#searchVideoContent) | **GET** /v2/editorial/videos/search | Search editorial video content
*ImagesApi* | [**addToCollectionItems**](docs/ImagesApi.md#addToCollectionItems) | **POST** /v2/images/collections/{id}/items | Add images to collections
*ImagesApi* | [**createCollection**](docs/ImagesApi.md#createCollection) | **POST** /v2/images/collections | Create image collections
*ImagesApi* | [**deleteCollection**](docs/ImagesApi.md#deleteCollection) | **DELETE** /v2/images/collections/{id} | Delete image collections
*ImagesApi* | [**extractKeywordsFromText**](docs/ImagesApi.md#extractKeywordsFromText) | **POST** /v2/images/search/suggestions | Get keywords from text
*ImagesApi* | [**featuredCollectionDetails**](docs/ImagesApi.md#featuredCollectionDetails) | **GET** /v2/images/collections/featured/{id} | Get the details of featured image collections
*ImagesApi* | [**getCollectionDetails**](docs/ImagesApi.md#getCollectionDetails) | **GET** /v2/images/collections/{id} | Get the details of image collections
*ImagesApi* | [**getCollectionItems**](docs/ImagesApi.md#getCollectionItems) | **GET** /v2/images/collections/featured/{id}/items | Get the contents of featured image collections
*ImagesApi* | [**getCollectionItems_0**](docs/ImagesApi.md#getCollectionItems_0) | **GET** /v2/images/collections/{id}/items | Get the contents of image collections
*ImagesApi* | [**getDetails**](docs/ImagesApi.md#getDetails) | **GET** /v2/images/{id} | Get details about images
*ImagesApi* | [**getSearchSuggestions**](docs/ImagesApi.md#getSearchSuggestions) | **GET** /v2/images/search/suggestions | Get suggestions for a search term
*ImagesApi* | [**licenseImagesForMultiple**](docs/ImagesApi.md#licenseImagesForMultiple) | **POST** /v2/images/licenses | License images
*ImagesApi* | [**listCategories**](docs/ImagesApi.md#listCategories) | **GET** /v2/images/categories | List image categories
*ImagesApi* | [**listCollections**](docs/ImagesApi.md#listCollections) | **GET** /v2/images/collections | List image collections
*ImagesApi* | [**listFeaturedCollections**](docs/ImagesApi.md#listFeaturedCollections) | **GET** /v2/images/collections/featured | List featured image collections
*ImagesApi* | [**listInfo**](docs/ImagesApi.md#listInfo) | **GET** /v2/images | List images
*ImagesApi* | [**listLicenses**](docs/ImagesApi.md#listLicenses) | **GET** /v2/images/licenses | List image licenses
*ImagesApi* | [**listRecommendedImages**](docs/ImagesApi.md#listRecommendedImages) | **GET** /v2/images/recommendations | List recommended images
*ImagesApi* | [**listSimilarImages**](docs/ImagesApi.md#listSimilarImages) | **GET** /v2/images/{id}/similar | List similar images
*ImagesApi* | [**listUpdatedContent**](docs/ImagesApi.md#listUpdatedContent) | **GET** /v2/images/updated | List updated images
*ImagesApi* | [**redownloadLicense**](docs/ImagesApi.md#redownloadLicense) | **POST** /v2/images/licenses/{id}/downloads | Download images
*ImagesApi* | [**removeFromCollection**](docs/ImagesApi.md#removeFromCollection) | **DELETE** /v2/images/collections/{id}/items | Remove images from collections
*ImagesApi* | [**renameCollection**](docs/ImagesApi.md#renameCollection) | **POST** /v2/images/collections/{id} | Rename image collections
*ImagesApi* | [**runMultipleSearches**](docs/ImagesApi.md#runMultipleSearches) | **POST** /v2/bulk_search/images | Run multiple image searches
*ImagesApi* | [**searchImages**](docs/ImagesApi.md#searchImages) | **GET** /v2/images/search | Search for images
*OauthApi* | [**authorizeApplications**](docs/OauthApi.md#authorizeApplications) | **GET** /v2/oauth/authorize | Authorize applications
*OauthApi* | [**getUserAccessToken**](docs/OauthApi.md#getUserAccessToken) | **POST** /v2/oauth/access_token | Get access tokens
*SoundEffectsApi* | [**getDetails**](docs/SoundEffectsApi.md#getDetails) | **GET** /v2/sfx/{id} | Get details about sound effects
*SoundEffectsApi* | [**licenseAssets**](docs/SoundEffectsApi.md#licenseAssets) | **POST** /v2/sfx/licenses | License sound effects
*SoundEffectsApi* | [**listDetails**](docs/SoundEffectsApi.md#listDetails) | **GET** /v2/sfx | List details about sound effects
*SoundEffectsApi* | [**listLicenses**](docs/SoundEffectsApi.md#listLicenses) | **GET** /v2/sfx/licenses | List sound effects licenses
*SoundEffectsApi* | [**redownloadLicenses**](docs/SoundEffectsApi.md#redownloadLicenses) | **POST** /v2/sfx/licenses/{id}/downloads | Download sound effects
*SoundEffectsApi* | [**searchSoundEffects**](docs/SoundEffectsApi.md#searchSoundEffects) | **GET** /v2/sfx/search | Search for sound effects
*TestApi* | [**echoText**](docs/TestApi.md#echoText) | **GET** /v2/test | Echo text
*TestApi* | [**inputValidation**](docs/TestApi.md#inputValidation) | **GET** /v2/test/validate | Validate input
*UsersApi* | [**getAccessTokenDetails**](docs/UsersApi.md#getAccessTokenDetails) | **GET** /v2/user/access_token | Get access token details
*UsersApi* | [**getUserDetails**](docs/UsersApi.md#getUserDetails) | **GET** /v2/user | Get user details
*UsersApi* | [**listSubscriptions**](docs/UsersApi.md#listSubscriptions) | **GET** /v2/user/subscriptions | List user subscriptions
*VideosApi* | [**addToCollectionItems**](docs/VideosApi.md#addToCollectionItems) | **POST** /v2/videos/collections/{id}/items | Add videos to collections
*VideosApi* | [**collectionDetailsGet**](docs/VideosApi.md#collectionDetailsGet) | **GET** /v2/videos/collections/featured/{id} | Get the details of featured video collections
*VideosApi* | [**collectionDetailsGet_0**](docs/VideosApi.md#collectionDetailsGet_0) | **GET** /v2/videos/collections/{id} | Get the details of video collections
*VideosApi* | [**createVideoCollections**](docs/VideosApi.md#createVideoCollections) | **POST** /v2/videos/collections | Create video collections
*VideosApi* | [**deleteCollection**](docs/VideosApi.md#deleteCollection) | **DELETE** /v2/videos/collections/{id} | Delete video collections
*VideosApi* | [**findSimilar**](docs/VideosApi.md#findSimilar) | **GET** /v2/videos/{id}/similar | List similar videos
*VideosApi* | [**getCollectionItems**](docs/VideosApi.md#getCollectionItems) | **GET** /v2/videos/collections/{id}/items | Get the contents of video collections
*VideosApi* | [**getFeaturedCollectionItems**](docs/VideosApi.md#getFeaturedCollectionItems) | **GET** /v2/videos/collections/featured/{id}/items | Get the contents of featured video collections
*VideosApi* | [**licenseVideos**](docs/VideosApi.md#licenseVideos) | **POST** /v2/videos/licenses | License videos
*VideosApi* | [**listCategories**](docs/VideosApi.md#listCategories) | **GET** /v2/videos/categories | List video categories
*VideosApi* | [**listCollections**](docs/VideosApi.md#listCollections) | **GET** /v2/videos/collections | List video collections
*VideosApi* | [**listFeaturedVideoCollections**](docs/VideosApi.md#listFeaturedVideoCollections) | **GET** /v2/videos/collections/featured | List featured video collections
*VideosApi* | [**listLicenses**](docs/VideosApi.md#listLicenses) | **GET** /v2/videos/licenses | List video licenses
*VideosApi* | [**listUpdatedVideos**](docs/VideosApi.md#listUpdatedVideos) | **GET** /v2/videos/updated | List updated videos
*VideosApi* | [**listVideo**](docs/VideosApi.md#listVideo) | **GET** /v2/videos | List videos
*VideosApi* | [**redownloadDownloads**](docs/VideosApi.md#redownloadDownloads) | **POST** /v2/videos/licenses/{id}/downloads | Download videos
*VideosApi* | [**removeFromCollection**](docs/VideosApi.md#removeFromCollection) | **DELETE** /v2/videos/collections/{id}/items | Remove videos from collections
*VideosApi* | [**searchSuggestions**](docs/VideosApi.md#searchSuggestions) | **GET** /v2/videos/search/suggestions | Get suggestions for a search term
*VideosApi* | [**searchVideo**](docs/VideosApi.md#searchVideo) | **GET** /v2/videos/search | Search for videos
*VideosApi* | [**setNewName**](docs/VideosApi.md#setNewName) | **POST** /v2/videos/collections/{id} | Rename video collections
*VideosApi* | [**videoDetails**](docs/VideosApi.md#videoDetails) | **GET** /v2/videos/{id} | Get details about videos


## Documentation for Models

 - [AccessTokenDetails](docs/AccessTokenDetails.md)
 - [Album](docs/Album.md)
 - [Allotment](docs/Allotment.md)
 - [Artist](docs/Artist.md)
 - [Audio](docs/Audio.md)
 - [AudioAssetDetails](docs/AudioAssetDetails.md)
 - [AudioAssets](docs/AudioAssets.md)
 - [AudioDataList](docs/AudioDataList.md)
 - [AudioRenderResult](docs/AudioRenderResult.md)
 - [AudioRenderTimeline](docs/AudioRenderTimeline.md)
 - [AudioRenderTimelineSpan](docs/AudioRenderTimelineSpan.md)
 - [AudioRenderTimelineSpanInstrumentGroup](docs/AudioRenderTimelineSpanInstrumentGroup.md)
 - [AudioRenderTimelineSpanInstrumentGroupStatus](docs/AudioRenderTimelineSpanInstrumentGroupStatus.md)
 - [AudioRenderTimelineSpanRegion](docs/AudioRenderTimelineSpanRegion.md)
 - [AudioRenderTimelineSpanRegionEndType](docs/AudioRenderTimelineSpanRegionEndType.md)
 - [AudioRenderTimelineSpanRegionKey](docs/AudioRenderTimelineSpanRegionKey.md)
 - [AudioRenderTimelineSpanTempoChanges](docs/AudioRenderTimelineSpanTempoChanges.md)
 - [AudioRendersFilesList](docs/AudioRendersFilesList.md)
 - [AudioRendersListResults](docs/AudioRendersListResults.md)
 - [AudioSearchResults](docs/AudioSearchResults.md)
 - [AudioUrl](docs/AudioUrl.md)
 - [Bands](docs/Bands.md)
 - [BulkImageSearchResults](docs/BulkImageSearchResults.md)
 - [CatalogCollection](docs/CatalogCollection.md)
 - [CatalogCollectionDataList](docs/CatalogCollectionDataList.md)
 - [CatalogCollectionItem](docs/CatalogCollectionItem.md)
 - [CatalogCollectionItemAsset](docs/CatalogCollectionItemAsset.md)
 - [CatalogCollectionItemDataList](docs/CatalogCollectionItemDataList.md)
 - [CatalogCollectionRole](docs/CatalogCollectionRole.md)
 - [CatalogCollectionRoleAssignments](docs/CatalogCollectionRoleAssignments.md)
 - [CatalogCollectionRoleAssignmentsRoles](docs/CatalogCollectionRoleAssignmentsRoles.md)
 - [Category](docs/Category.md)
 - [CategoryDataList](docs/CategoryDataList.md)
 - [Collection](docs/Collection.md)
 - [CollectionCreateRequest](docs/CollectionCreateRequest.md)
 - [CollectionCreateResponse](docs/CollectionCreateResponse.md)
 - [CollectionDataList](docs/CollectionDataList.md)
 - [CollectionItem](docs/CollectionItem.md)
 - [CollectionItemDataList](docs/CollectionItemDataList.md)
 - [CollectionItemRequest](docs/CollectionItemRequest.md)
 - [CollectionUpdateRequest](docs/CollectionUpdateRequest.md)
 - [ComputerVisionImageCreateResponse](docs/ComputerVisionImageCreateResponse.md)
 - [Contributor](docs/Contributor.md)
 - [ContributorProfile](docs/ContributorProfile.md)
 - [ContributorProfileDataList](docs/ContributorProfileDataList.md)
 - [ContributorProfileSocialMedia](docs/ContributorProfileSocialMedia.md)
 - [Cookie](docs/Cookie.md)
 - [CreateAudioRender](docs/CreateAudioRender.md)
 - [CreateAudioRendersRequest](docs/CreateAudioRendersRequest.md)
 - [CreateCatalogCollection](docs/CreateCatalogCollection.md)
 - [CreateCatalogCollectionItem](docs/CreateCatalogCollectionItem.md)
 - [CreateCatalogCollectionItemAsset](docs/CreateCatalogCollectionItemAsset.md)
 - [CreateCatalogCollectionItems](docs/CreateCatalogCollectionItems.md)
 - [CustomSizeDimensions](docs/CustomSizeDimensions.md)
 - [Descriptors](docs/Descriptors.md)
 - [DescriptorsListResult](docs/DescriptorsListResult.md)
 - [DownloadHistory](docs/DownloadHistory.md)
 - [DownloadHistoryDataList](docs/DownloadHistoryDataList.md)
 - [DownloadHistoryFormatDetails](docs/DownloadHistoryFormatDetails.md)
 - [DownloadHistoryMediaDetails](docs/DownloadHistoryMediaDetails.md)
 - [DownloadHistoryRevshareDetails](docs/DownloadHistoryRevshareDetails.md)
 - [DownloadHistoryUserDetails](docs/DownloadHistoryUserDetails.md)
 - [EditorialAssets](docs/EditorialAssets.md)
 - [EditorialCategory](docs/EditorialCategory.md)
 - [EditorialCategoryResults](docs/EditorialCategoryResults.md)
 - [EditorialContent](docs/EditorialContent.md)
 - [EditorialContentDataList](docs/EditorialContentDataList.md)
 - [EditorialCoverItem](docs/EditorialCoverItem.md)
 - [EditorialImageCategoryResults](docs/EditorialImageCategoryResults.md)
 - [EditorialImageContentDataList](docs/EditorialImageContentDataList.md)
 - [EditorialImageLivefeed](docs/EditorialImageLivefeed.md)
 - [EditorialImageLivefeedList](docs/EditorialImageLivefeedList.md)
 - [EditorialLivefeed](docs/EditorialLivefeed.md)
 - [EditorialLivefeedList](docs/EditorialLivefeedList.md)
 - [EditorialSearchResults](docs/EditorialSearchResults.md)
 - [EditorialUpdatedContent](docs/EditorialUpdatedContent.md)
 - [EditorialUpdatedContentCommercialStatus](docs/EditorialUpdatedContentCommercialStatus.md)
 - [EditorialUpdatedContentRights](docs/EditorialUpdatedContentRights.md)
 - [EditorialUpdatedResults](docs/EditorialUpdatedResults.md)
 - [EditorialVideoAssets](docs/EditorialVideoAssets.md)
 - [EditorialVideoCategoryResults](docs/EditorialVideoCategoryResults.md)
 - [EditorialVideoContent](docs/EditorialVideoContent.md)
 - [EditorialVideoSearchResults](docs/EditorialVideoSearchResults.md)
 - [Error](docs/Error.md)
 - [FeaturedCollection](docs/FeaturedCollection.md)
 - [FeaturedCollectionCoverItem](docs/FeaturedCollectionCoverItem.md)
 - [FeaturedCollectionDataList](docs/FeaturedCollectionDataList.md)
 - [GenreList](docs/GenreList.md)
 - [Image](docs/Image.md)
 - [ImageAssets](docs/ImageAssets.md)
 - [ImageCreateRequest](docs/ImageCreateRequest.md)
 - [ImageCreateResponse](docs/ImageCreateResponse.md)
 - [ImageDataList](docs/ImageDataList.md)
 - [ImageInsights](docs/ImageInsights.md)
 - [ImageSearchResults](docs/ImageSearchResults.md)
 - [ImageSizeDetails](docs/ImageSizeDetails.md)
 - [Insights](docs/Insights.md)
 - [InsightsLabelPerformanceInner](docs/InsightsLabelPerformanceInner.md)
 - [Instrument](docs/Instrument.md)
 - [InstrumentList](docs/InstrumentList.md)
 - [Instruments](docs/Instruments.md)
 - [InstrumentsListResult](docs/InstrumentsListResult.md)
 - [KeywordDataList](docs/KeywordDataList.md)
 - [Language](docs/Language.md)
 - [LicenseAudio](docs/LicenseAudio.md)
 - [LicenseAudioRequest](docs/LicenseAudioRequest.md)
 - [LicenseAudioResult](docs/LicenseAudioResult.md)
 - [LicenseAudioResultDataList](docs/LicenseAudioResultDataList.md)
 - [LicenseEditorialContent](docs/LicenseEditorialContent.md)
 - [LicenseEditorialContentRequest](docs/LicenseEditorialContentRequest.md)
 - [LicenseEditorialContentResult](docs/LicenseEditorialContentResult.md)
 - [LicenseEditorialContentResults](docs/LicenseEditorialContentResults.md)
 - [LicenseEditorialVideoContent](docs/LicenseEditorialVideoContent.md)
 - [LicenseEditorialVideoContentRequest](docs/LicenseEditorialVideoContentRequest.md)
 - [LicenseFormat](docs/LicenseFormat.md)
 - [LicenseImage](docs/LicenseImage.md)
 - [LicenseImageAuthCookie](docs/LicenseImageAuthCookie.md)
 - [LicenseImageRequest](docs/LicenseImageRequest.md)
 - [LicenseImageResult](docs/LicenseImageResult.md)
 - [LicenseImageResultDataList](docs/LicenseImageResultDataList.md)
 - [LicenseImageVector](docs/LicenseImageVector.md)
 - [LicenseSFX](docs/LicenseSFX.md)
 - [LicenseSFXRequest](docs/LicenseSFXRequest.md)
 - [LicenseSFXResult](docs/LicenseSFXResult.md)
 - [LicenseSFXResultDataList](docs/LicenseSFXResultDataList.md)
 - [LicenseVideo](docs/LicenseVideo.md)
 - [LicenseVideoRequest](docs/LicenseVideoRequest.md)
 - [LicenseVideoResult](docs/LicenseVideoResult.md)
 - [LicenseVideoResultDataList](docs/LicenseVideoResultDataList.md)
 - [Model](docs/Model.md)
 - [ModelRelease](docs/ModelRelease.md)
 - [MoodList](docs/MoodList.md)
 - [OauthAccessTokenResponse](docs/OauthAccessTokenResponse.md)
 - [OauthGetUserAccessTokenRequest](docs/OauthGetUserAccessTokenRequest.md)
 - [OauthGetUserAccessTokenRequest1](docs/OauthGetUserAccessTokenRequest1.md)
 - [Preview](docs/Preview.md)
 - [Price](docs/Price.md)
 - [Recommendation](docs/Recommendation.md)
 - [RecommendationDataList](docs/RecommendationDataList.md)
 - [RedownloadImage](docs/RedownloadImage.md)
 - [RedownloadVideo](docs/RedownloadVideo.md)
 - [RemoveCatalogCollectionItem](docs/RemoveCatalogCollectionItem.md)
 - [RemoveCatalogCollectionItems](docs/RemoveCatalogCollectionItems.md)
 - [SFX](docs/SFX.md)
 - [SFXAssetDetails](docs/SFXAssetDetails.md)
 - [SFXAssets](docs/SFXAssets.md)
 - [SFXDataList](docs/SFXDataList.md)
 - [SFXSearchResults](docs/SFXSearchResults.md)
 - [SearchEntitiesRequest](docs/SearchEntitiesRequest.md)
 - [SearchEntitiesResponse](docs/SearchEntitiesResponse.md)
 - [SearchImage](docs/SearchImage.md)
 - [SfxUrl](docs/SfxUrl.md)
 - [ShortsLoopsStems](docs/ShortsLoopsStems.md)
 - [ShortsLoopsStemsLoopsValue](docs/ShortsLoopsStemsLoopsValue.md)
 - [Subscription](docs/Subscription.md)
 - [SubscriptionDataList](docs/SubscriptionDataList.md)
 - [Suggestions](docs/Suggestions.md)
 - [TestEcho](docs/TestEcho.md)
 - [TestValidate](docs/TestValidate.md)
 - [TestValidateHeader](docs/TestValidateHeader.md)
 - [TestValidateQuery](docs/TestValidateQuery.md)
 - [Thumbnail](docs/Thumbnail.md)
 - [UpdateCatalogCollection](docs/UpdateCatalogCollection.md)
 - [UpdateCatalogCollectionCoverAsset](docs/UpdateCatalogCollectionCoverAsset.md)
 - [UpdatedMedia](docs/UpdatedMedia.md)
 - [UpdatedMediaDataList](docs/UpdatedMediaDataList.md)
 - [Url](docs/Url.md)
 - [Urls](docs/Urls.md)
 - [UserDetails](docs/UserDetails.md)
 - [VLicenseImage](docs/VLicenseImage.md)
 - [Video](docs/Video.md)
 - [VideoAssets](docs/VideoAssets.md)
 - [VideoCollectionItemDataList](docs/VideoCollectionItemDataList.md)
 - [VideoDataList](docs/VideoDataList.md)
 - [VideoPreviewUrl](docs/VideoPreviewUrl.md)
 - [VideoSearchResults](docs/VideoSearchResults.md)
 - [VideoSizeDetails](docs/VideoSizeDetails.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
