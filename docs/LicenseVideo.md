

# LicenseVideo

Data required to license a video

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authCookie** | [**Cookie**](Cookie.md) |  |  [optional] |
|**editorialAcknowledgement** | **Boolean** | Whether or not this item is editorial content |  [optional] |
|**metadata** | **Object** | Additional information for license requests for enterprise accounts and API subscriptions, 4 fields maximum; which fields are required is set by the account holder |  [optional] |
|**price** | **Double** | Retail price amount as a floating-point number in the transaction currency, such as 12.34; only for rev-share partners |  [optional] |
|**searchId** | **String** | ID of the search that led to this licensing event |  [optional] |
|**showModal** | **Boolean** | (Deprecated) |  [optional] |
|**size** | [**SizeEnum**](#SizeEnum) | Size of the video being licensed |  [optional] |
|**subscriptionId** | **String** | ID of the subscription used for this license |  [optional] |
|**videoId** | **String** | ID of the video being licensed |  |



## Enum: SizeEnum

| Name | Value |
|---- | -----|
| WEB | &quot;web&quot; |
| SD | &quot;sd&quot; |
| HD | &quot;hd&quot; |
| _4K | &quot;4k&quot; |



