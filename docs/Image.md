

# Image

Information about an image

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Detailed description of the image |  [optional] |
|**addedDate** | **LocalDate** | Date that the image was added by the contributor |  [optional] |
|**affiliateUrl** | **URI** | Affiliate referral link; appears only for registered affiliate partners |  [optional] |
|**aspect** | **Double** | Aspect ratio of the image in decimal format, such as 0.6667 |  [optional] |
|**assets** | [**ImageAssets**](ImageAssets.md) |  |  [optional] |
|**categories** | [**List&lt;Category&gt;**](Category.md) | Categories that this image is a part of |  [optional] |
|**contributor** | [**Contributor**](Contributor.md) |  |  |
|**hasModelRelease** | **Boolean** | Indicates whether there are model releases for the image |  [optional] |
|**hasPropertyRelease** | **Boolean** | Indicates whether there are property releases for the image |  [optional] |
|**id** | **String** | Image ID |  |
|**imageType** | **String** | Type of image |  [optional] |
|**insights** | [**ImageInsights**](ImageInsights.md) |  |  [optional] |
|**isAdult** | **Boolean** | Whether or not this image contains adult content |  [optional] |
|**isEditorial** | **Boolean** | Whether or not this image is editorial content |  [optional] |
|**isIllustration** | **Boolean** | Whether or not this image is an illustration |  [optional] |
|**keywords** | **List&lt;String&gt;** | Keywords associated with the content of this image |  [optional] |
|**mediaType** | **String** | Media type of this image, should always be \&quot;image\&quot; |  |
|**modelReleases** | [**List&lt;ModelRelease&gt;**](ModelRelease.md) | List of model releases |  [optional] |
|**models** | [**List&lt;Model&gt;**](Model.md) | List of models |  [optional] |
|**releases** | **List&lt;String&gt;** | List of all releases of this image |  [optional] |
|**url** | **String** | Link to image information page; included only for certain accounts |  [optional] |



