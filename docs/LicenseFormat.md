

# LicenseFormat

Description of a license

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description of the license |  [optional] |
|**format** | **String** | Format or extension of the media, such as mpeg for videos or jpeg for images |  [optional] |
|**mediaType** | [**MediaTypeEnum**](#MediaTypeEnum) | Media type of the license |  [optional] |
|**minResolution** | **Integer** | Width of the media, in pixels, allowed by this license |  [optional] |
|**size** | **String** | Keyword that details the size of the media, such as hd or sd for video, huge or vector for images |  [optional] |



## Enum: MediaTypeEnum

| Name | Value |
|---- | -----|
| IMAGE | &quot;image&quot; |
| VIDEO | &quot;video&quot; |
| AUDIO | &quot;audio&quot; |
| EDITORIAL | &quot;editorial&quot; |



