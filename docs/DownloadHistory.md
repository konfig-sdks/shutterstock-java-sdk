

# DownloadHistory

Information about a downloaded media item. Applicable for all media types, only one of 'audio', 'image' or 'video' will be in a single DownloadHistory object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**audio** | [**DownloadHistoryMediaDetails**](DownloadHistoryMediaDetails.md) |  |  [optional] |
|**downloadTime** | **OffsetDateTime** | Date the media was downloaded the first time |  |
|**id** | **String** | ID of the download |  |
|**image** | [**DownloadHistoryMediaDetails**](DownloadHistoryMediaDetails.md) |  |  [optional] |
|**isDownloadable** | **Boolean** | Specifies if the media is downloadable via its respective downloads endpoint |  [optional] |
|**license** | **String** | The name of the license of this download |  |
|**metadata** | **Object** | The metadata that was passed in the original licensing request |  [optional] |
|**revshare** | [**DownloadHistoryRevshareDetails**](DownloadHistoryRevshareDetails.md) |  |  [optional] |
|**subscriptionId** | **String** | ID of the subscription used to perform this download |  [optional] |
|**user** | [**DownloadHistoryUserDetails**](DownloadHistoryUserDetails.md) |  |  [optional] |
|**video** | [**DownloadHistoryMediaDetails**](DownloadHistoryMediaDetails.md) |  |  [optional] |



