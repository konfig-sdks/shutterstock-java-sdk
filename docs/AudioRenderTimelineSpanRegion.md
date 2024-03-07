

# AudioRenderTimelineSpanRegion

A period of music or silence, measured in beats

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**beat** | **Integer** | The beat, relative to the span, at which the region object&#39;s music begins |  |
|**descriptor** | **String** | The descriptor ID needed to compose the music |  |
|**endType** | [**AudioRenderTimelineSpanRegionEndType**](AudioRenderTimelineSpanRegionEndType.md) |  |  [optional] |
|**id** | **Double** | An identifier which must be unique within the parent span |  |
|**key** | [**AudioRenderTimelineSpanRegionKey**](AudioRenderTimelineSpanRegionKey.md) |  |  [optional] |
|**region** | [**RegionEnum**](#RegionEnum) | The type of region |  |



## Enum: RegionEnum

| Name | Value |
|---- | -----|
| MUSIC | &quot;music&quot; |
| SILENCE | &quot;silence&quot; |



