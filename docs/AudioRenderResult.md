

# AudioRenderResult

The output of an audio render in WAV or MP3 format

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdDate** | **OffsetDateTime** | The time the render was submitted to the API |  [optional] |
|**files** | [**List&lt;AudioRendersFilesList&gt;**](AudioRendersFilesList.md) | The files associated with the render |  [optional] |
|**id** | **String** | The alphanumeric ID of the simple render |  |
|**preset** | [**PresetEnum**](#PresetEnum) | The file format preset |  [optional] |
|**progressPercent** | **Integer** | The current progress of the render as a percentage |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | A coarse progress indicator |  |
|**timeline** | [**AudioRenderTimeline**](AudioRenderTimeline.md) |  |  |
|**updatedDate** | **OffsetDateTime** | The time that the audio output was uploaded |  [optional] |



## Enum: PresetEnum

| Name | Value |
|---- | -----|
| MASTER_MP3 | &quot;MASTER_MP3&quot; |
| MASTER_WAV | &quot;MASTER_WAV&quot; |
| STEMS_WAV | &quot;STEMS_WAV&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| WAITING_COMPOSE | &quot;WAITING_COMPOSE&quot; |
| RUNNING_COMPOSE | &quot;RUNNING_COMPOSE&quot; |
| WAITING_RENDER | &quot;WAITING_RENDER&quot; |
| RUNNING_RENDER | &quot;RUNNING_RENDER&quot; |
| CREATED | &quot;CREATED&quot; |
| FAILED_CREATE | &quot;FAILED_CREATE&quot; |



