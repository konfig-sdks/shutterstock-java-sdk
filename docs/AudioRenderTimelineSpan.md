

# AudioRenderTimelineSpan

The beginning of a non-overlapping period of absolute time

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Double** | An identifier which must be unique within the parent span |  [optional] |
|**instrumentGroups** | [**List&lt;AudioRenderTimelineSpanInstrumentGroup&gt;**](AudioRenderTimelineSpanInstrumentGroup.md) | An array of instrument_group objects that are used in this span |  [optional] |
|**regions** | [**List&lt;AudioRenderTimelineSpanRegion&gt;**](AudioRenderTimelineSpanRegion.md) | An array of region objects within the span |  [optional] |
|**spanType** | [**SpanTypeEnum**](#SpanTypeEnum) | Type of span; metered spans represent a pariod of time with music, and unmetered spans denote the end of the prior metered span |  |
|**tempo** | **Integer** | The tempo, in beats per minute, at the start of the span; if not provided, the API selects a random tempo |  [optional] |
|**tempoChanges** | [**List&lt;AudioRenderTimelineSpanTempoChanges&gt;**](AudioRenderTimelineSpanTempoChanges.md) | Two or more inflection points in a tempo curve; the API creates a smoothly changing tempo by using a linear interpolation of the time between each tempo change |  [optional] |
|**time** | **Integer** | The absolute time, in seconds, at which the span starts |  |



## Enum: SpanTypeEnum

| Name | Value |
|---- | -----|
| METERED | &quot;metered&quot; |
| UNMETERED | &quot;unmetered&quot; |



