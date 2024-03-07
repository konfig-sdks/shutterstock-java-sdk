

# AudioRenderTimelineSpanRegionKey

The key signature active at the beginning of the region

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tonicAccidental** | [**TonicAccidentalEnum**](#TonicAccidentalEnum) | A text representation of the accidental; if this field is specified, the tonic_note field should also be specified |  [optional] |
|**tonicNote** | [**TonicNoteEnum**](#TonicNoteEnum) | A text representation of the musical note; if this field is specified, the tonic_accidental field should also be specified |  [optional] |
|**tonicQuality** | [**TonicQualityEnum**](#TonicQualityEnum) | The scale quality; if this field is not specified, the API selects the quality automatically |  [optional] |



## Enum: TonicAccidentalEnum

| Name | Value |
|---- | -----|
| DOUBLE_FLAT | &quot;double flat&quot; |
| FLAT | &quot;flat&quot; |
| NATURAL | &quot;natural&quot; |
| SHARP | &quot;sharp&quot; |
| DOUBLE_SHARP | &quot;double sharp&quot; |



## Enum: TonicNoteEnum

| Name | Value |
|---- | -----|
| C | &quot;c&quot; |
| D | &quot;d&quot; |
| E | &quot;e&quot; |
| F | &quot;f&quot; |
| G | &quot;g&quot; |
| A | &quot;a&quot; |
| B | &quot;b&quot; |



## Enum: TonicQualityEnum

| Name | Value |
|---- | -----|
| MAJOR | &quot;major&quot; |
| NATURAL_MINOR | &quot;natural_minor&quot; |
| HARMONIC_MINOR | &quot;harmonic_minor&quot; |
| MELODIC_MINOR | &quot;melodic_minor&quot; |
| IONIAN | &quot;ionian&quot; |
| DORIAN | &quot;dorian&quot; |
| PHRYGIAN | &quot;phrygian&quot; |
| LYDIAN | &quot;lydian&quot; |
| MIXOLYDIAN | &quot;mixolydian&quot; |
| AEOLIAN | &quot;aeolian&quot; |
| LOCRIAN | &quot;locrian&quot; |



