

# CreateAudioRender

Data required to create an audio render

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**filename** | **String** | A user-specified file name suggestion; this file name becomes the filename property of the Content-Disposition header when the user downloads the rendered audio file |  |
|**preset** | [**PresetEnum**](#PresetEnum) | File format, such as MP3 file, combined WAV file, or individual track WAV files |  |
|**timeline** | [**AudioRenderTimeline**](AudioRenderTimeline.md) |  |  |



## Enum: PresetEnum

| Name | Value |
|---- | -----|
| MASTER_MP3 | &quot;MASTER_MP3&quot; |
| MASTER_WAV | &quot;MASTER_WAV&quot; |
| STEMS_WAV | &quot;STEMS_WAV&quot; |



