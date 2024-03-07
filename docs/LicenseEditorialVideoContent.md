

# LicenseEditorialVideoContent

Individual editorial video content to license

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**editorialId** | **String** | Editorial ID |  |
|**license** | [**LicenseEnum**](#LicenseEnum) | License agreement to use for licensing |  |
|**metadata** | **Object** | Additional information for license requests for enterprise accounts and API subscriptions, 4 fields maximum; which fields are required is set by the account holder |  [optional] |
|**size** | [**SizeEnum**](#SizeEnum) | Asset size to download |  [optional] |



## Enum: LicenseEnum

| Name | Value |
|---- | -----|
| DIGITAL_ONLY | &quot;premier_editorial_video_digital_only&quot; |
| ALL_MEDIA | &quot;premier_editorial_video_all_media&quot; |
| ALL_MEDIA_SINGLE_TERRITORY | &quot;premier_editorial_video_all_media_single_territory&quot; |
| COMP | &quot;premier_editorial_video_comp&quot; |



## Enum: SizeEnum

| Name | Value |
|---- | -----|
| ORIGINAL | &quot;original&quot; |



