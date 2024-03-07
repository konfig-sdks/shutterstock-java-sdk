

# AccessTokenDetails

Access token details that are currently associated with this user

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientId** | **String** | Client ID that is associated with the user |  [optional] |
|**contributorId** | **String** | Contributor ID that is associated with the user |  [optional] |
|**customerId** | **String** | Customer ID that is associated with the user |  [optional] |
|**expiresIn** | **Integer** | Number of seconds until the access token expires; no expiration if this value is null |  [optional] |
|**organizationId** | **String** | Organization ID that is associated with the user |  [optional] |
|**realm** | [**RealmEnum**](#RealmEnum) | Type of access token |  [optional] |
|**scopes** | **List&lt;String&gt;** | Scopes that this access token provides when used as authentication |  [optional] |
|**userId** | **String** | User ID that is associated with the user |  [optional] |
|**username** | **String** | User name that is associated with the user |  [optional] |



## Enum: RealmEnum

| Name | Value |
|---- | -----|
| CUSTOMER | &quot;customer&quot; |
| CONTRIBUTOR | &quot;contributor&quot; |



