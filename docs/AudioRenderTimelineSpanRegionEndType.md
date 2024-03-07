

# AudioRenderTimelineSpanRegionEndType

A high-level description of how a region ends

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**beat** | **Double** | The beat, relative to the start of the active region, at which the end_type begins; in other words, the ending starts on this beat of the region |  |
|**event** | [**EventEnum**](#EventEnum) | The type of event |  |
|**type** | [**TypeEnum**](#TypeEnum) | The specific action to perform; if the event type is \&quot;ending\&quot; then this must be \&quot;ringout\&quot; and if event type is \&quot;transition\&quot; this must be \&quot;cut\&quot; |  |



## Enum: EventEnum

| Name | Value |
|---- | -----|
| ENDING | &quot;ending&quot; |
| TRANSITION | &quot;transition&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| RINGOUT | &quot;ringout&quot; |
| CUT | &quot;cut&quot; |



