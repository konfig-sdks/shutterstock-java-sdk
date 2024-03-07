

# OauthGetUserAccessTokenRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientId** | **String** | Client ID (Consumer Key) of your application |  |
|**clientSecret** | **String** | Client Secret (Consumer Secret) of your application |  [optional] |
|**code** | **String** | Response code from the /oauth/authorize flow; required if grant_type&#x3D;authorization_code |  [optional] |
|**expires** | **Boolean** | Whether or not the token expires, expiring tokens come with a refresh_token to renew the access_token |  [optional] |
|**grantType** | [**GrantTypeEnum**](#GrantTypeEnum) | Grant type: authorization_code generates user tokens, client_credentials generates short-lived client grants |  |
|**realm** | [**RealmEnum**](#RealmEnum) | User type to be authorized (usually &#39;customer&#39;) |  [optional] |
|**refreshToken** | **String** | Pass this along with grant_type&#x3D;refresh_token to get a fresh access token |  [optional] |



## Enum: GrantTypeEnum

| Name | Value |
|---- | -----|
| AUTHORIZATION_CODE | &quot;authorization_code&quot; |
| CLIENT_CREDENTIALS | &quot;client_credentials&quot; |
| REFRESH_TOKEN | &quot;refresh_token&quot; |



## Enum: RealmEnum

| Name | Value |
|---- | -----|
| CUSTOMER | &quot;customer&quot; |
| CONTRIBUTOR | &quot;contributor&quot; |



