

# SearchImage

Data required to search for an image

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addedDate** | **LocalDate** | Show images added on the specified date |  [optional] |
|**addedDateEnd** | **LocalDate** | Show images added before the specified date |  [optional] |
|**addedDateStart** | **LocalDate** | Show images added on or after the specified date |  [optional] |
|**aspectRatio** | **Double** | Show images with the specified aspect ratio, using a positive decimal of the width divided by the height, such as 1.7778 for a 16:9 image |  [optional] |
|**aspectRatioMax** | **Double** | Show images with the specified aspect ratio or lower, using a positive decimal of the width divided by the height, such as 1.7778 for a 16:9 image |  [optional] |
|**aspectRatioMin** | **Double** | Show images with the specified aspect ratio or higher, using a positive decimal of the width divided by the height, such as 1.7778 for a 16:9 image |  [optional] |
|**authentic** | **Boolean** | Show only authentic images |  [optional] |
|**category** | **String** | Show images with the specified Shutterstock-defined category; specify a category name or ID |  [optional] |
|**color** | **String** | Specify either a hexadecimal color in the format &#39;4F21EA&#39; or &#39;grayscale&#39;; the API returns images that use similar colors |  [optional] |
|**contributor** | **List&lt;String&gt;** | Show images with the specified contributor names or IDs, allows multiple |  [optional] |
|**contributorCountry** | **Object** |  |  [optional] |
|**fields** | **String** | Fields to display in the response; see the documentation for the fields parameter in the overview section |  [optional] |
|**height** | **Integer** | (Deprecated; use height_from and height_to instead) Show images with the specified height |  [optional] |
|**heightFrom** | **Integer** | Show images with the specified height or larger, in pixels |  [optional] |
|**heightTo** | **Integer** | Show images with the specified height or smaller, in pixels |  [optional] |
|**imageType** | [**List&lt;ImageTypeEnum&gt;**](#List&lt;ImageTypeEnum&gt;) | Show images of the specified type |  [optional] |
|**keywordSafeSearch** | **Boolean** | Hide results with potentially unsafe keywords |  [optional] |
|**language** | **Language** |  |  [optional] |
|**license** | [**List&lt;LicenseEnum&gt;**](#List&lt;LicenseEnum&gt;) | Show only images with the specified license |  [optional] |
|**model** | **List&lt;String&gt;** | Show image results with the specified model IDs |  [optional] |
|**orientation** | [**OrientationEnum**](#OrientationEnum) | Show image results with horizontal or vertical orientation |  [optional] |
|**page** | **Integer** | Page number |  [optional] |
|**peopleAge** | [**PeopleAgeEnum**](#PeopleAgeEnum) | Show images that feature people of the specified age category |  [optional] |
|**peopleEthnicity** | [**List&lt;PeopleEthnicityEnum&gt;**](#List&lt;PeopleEthnicityEnum&gt;) | Show images with people of the specified ethnicities, or start with NOT to show images without those ethnicities |  [optional] |
|**peopleGender** | [**PeopleGenderEnum**](#PeopleGenderEnum) | Show images with people of the specified gender |  [optional] |
|**peopleModelReleased** | **Boolean** | Show images of people with a signed model release |  [optional] |
|**peopleNumber** | **Integer** | Show images with the specified number of people |  [optional] |
|**perPage** | **Integer** | Number of results per page |  [optional] |
|**query** | **String** | One or more search terms separated by spaces; you can use NOT to filter out images that match a term |  [optional] |
|**region** | **String** |  |  [optional] |
|**safe** | **Boolean** | Enable or disable safe search |  [optional] |
|**sort** | [**SortEnum**](#SortEnum) | Sort by |  [optional] |
|**spellcheckQuery** | **Boolean** | Spellcheck the search query and return results on suggested spellings |  [optional] |
|**view** | [**ViewEnum**](#ViewEnum) | Amount of detail to render in the response |  [optional] |
|**width** | **Integer** | (Deprecated; use width_from and width_to instead) Show images with the specified width |  [optional] |
|**widthFrom** | **Integer** | Show images with the specified width or larger, in pixels |  [optional] |
|**widthTo** | **Integer** | Show images with the specified width or smaller, in pixels |  [optional] |



## Enum: List&lt;ImageTypeEnum&gt;

| Name | Value |
|---- | -----|
| PHOTO | &quot;photo&quot; |
| ILLUSTRATION | &quot;illustration&quot; |
| VECTOR | &quot;vector&quot; |



## Enum: List&lt;LicenseEnum&gt;

| Name | Value |
|---- | -----|
| COMMERCIAL | &quot;commercial&quot; |
| EDITORIAL | &quot;editorial&quot; |
| ENHANCED | &quot;enhanced&quot; |



## Enum: OrientationEnum

| Name | Value |
|---- | -----|
| HORIZONTAL | &quot;horizontal&quot; |
| VERTICAL | &quot;vertical&quot; |



## Enum: PeopleAgeEnum

| Name | Value |
|---- | -----|
| INFANTS | &quot;infants&quot; |
| CHILDREN | &quot;children&quot; |
| TEENAGERS | &quot;teenagers&quot; |
| _20S | &quot;20s&quot; |
| _30S | &quot;30s&quot; |
| _40S | &quot;40s&quot; |
| _50S | &quot;50s&quot; |
| _60S | &quot;60s&quot; |
| OLDER | &quot;older&quot; |



## Enum: List&lt;PeopleEthnicityEnum&gt;

| Name | Value |
|---- | -----|
| AFRICAN | &quot;african&quot; |
| AFRICAN_AMERICAN | &quot;african_american&quot; |
| BLACK | &quot;black&quot; |
| BRAZILIAN | &quot;brazilian&quot; |
| CHINESE | &quot;chinese&quot; |
| CAUCASIAN | &quot;caucasian&quot; |
| EAST_ASIAN | &quot;east_asian&quot; |
| HISPANIC | &quot;hispanic&quot; |
| JAPANESE | &quot;japanese&quot; |
| MIDDLE_EASTERN | &quot;middle_eastern&quot; |
| NATIVE_AMERICAN | &quot;native_american&quot; |
| PACIFIC_ISLANDER | &quot;pacific_islander&quot; |
| SOUTH_ASIAN | &quot;south_asian&quot; |
| SOUTHEAST_ASIAN | &quot;southeast_asian&quot; |
| OTHER | &quot;other&quot; |
| NOT_AFRICAN | &quot;NOT african&quot; |
| NOT_AFRICAN_AMERICAN | &quot;NOT african_american&quot; |
| NOT_BLACK | &quot;NOT black&quot; |
| NOT_BRAZILIAN | &quot;NOT brazilian&quot; |
| NOT_CHINESE | &quot;NOT chinese&quot; |
| NOT_CAUCASIAN | &quot;NOT caucasian&quot; |
| NOT_EAST_ASIAN | &quot;NOT east_asian&quot; |
| NOT_HISPANIC | &quot;NOT hispanic&quot; |
| NOT_JAPANESE | &quot;NOT japanese&quot; |
| NOT_MIDDLE_EASTERN | &quot;NOT middle_eastern&quot; |
| NOT_NATIVE_AMERICAN | &quot;NOT native_american&quot; |
| NOT_PACIFIC_ISLANDER | &quot;NOT pacific_islander&quot; |
| NOT_SOUTH_ASIAN | &quot;NOT south_asian&quot; |
| NOT_SOUTHEAST_ASIAN | &quot;NOT southeast_asian&quot; |
| NOT_OTHER | &quot;NOT other&quot; |



## Enum: PeopleGenderEnum

| Name | Value |
|---- | -----|
| MALE | &quot;male&quot; |
| FEMALE | &quot;female&quot; |
| BOTH | &quot;both&quot; |



## Enum: SortEnum

| Name | Value |
|---- | -----|
| NEWEST | &quot;newest&quot; |
| POPULAR | &quot;popular&quot; |
| RELEVANCE | &quot;relevance&quot; |
| RANDOM | &quot;random&quot; |



## Enum: ViewEnum

| Name | Value |
|---- | -----|
| MINIMAL | &quot;minimal&quot; |
| FULL | &quot;full&quot; |



