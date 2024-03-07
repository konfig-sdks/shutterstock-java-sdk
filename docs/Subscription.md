

# Subscription

Subscription information

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description of the subscription |  [optional] |
|**allotment** | [**Allotment**](Allotment.md) |  |  [optional] |
|**assetType** | **String** | Identifier for the type of assets associated with this subscription (images, videos, audio, editorial) |  [optional] |
|**expirationTime** | **OffsetDateTime** | Date the subscription ends |  [optional] |
|**formats** | [**List&lt;LicenseFormat&gt;**](LicenseFormat.md) | List of formats that are licensable for the subscription |  [optional] |
|**id** | **String** | Unique internal identifier for the subscription |  |
|**license** | **String** | Internal identifier for the type of subscription |  [optional] |
|**metadata** | **Object** | Subscription metadata; different for each customer |  [optional] |
|**pricePerDownload** | [**Price**](Price.md) |  |  [optional] |



