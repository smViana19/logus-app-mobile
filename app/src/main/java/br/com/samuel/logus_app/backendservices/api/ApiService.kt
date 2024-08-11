package br.com.samuel.logus_app.backendservices.api

import br.com.samuel.logus_app.constants.URL_JSON_CREATE_USER
import br.com.samuel.logus_app.constants.URL_JSON_INDEX_USERS
import br.com.samuel.logus_app.constants.URL_JSON_SHOW_USER
import br.com.samuel.logus_app.constants.URL_JSON_TOKENS
import br.com.samuel.logus_app.constants.URL_JSON_UPDATE_USER
import br.com.samuel.logus_app.model.ApiTokenRequest
import br.com.samuel.logus_app.model.ApiTokenResponse
import br.com.samuel.logus_app.model.ApiUserRequest
import br.com.samuel.logus_app.model.ApiUserResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface ApiService {

    @POST(URL_JSON_CREATE_USER)
    suspend fun createUser(@Body apiUserRequest: ApiUserRequest): ApiUserResponse
    @GET(URL_JSON_INDEX_USERS)
    suspend fun getUsers(): List<ApiUserResponse>
    @GET(URL_JSON_SHOW_USER)
    suspend fun getUser(@Path("id") id: Int): ApiUserResponse
    @PUT(URL_JSON_UPDATE_USER)
    suspend fun updateUser(@Path("id") id: Int, @Body apiUserRequest: ApiUserRequest): ApiUserResponse

    @POST(URL_JSON_TOKENS)
    suspend fun requestTokenLogin(@Body apiTokenRequest: ApiTokenRequest) : ApiTokenResponse

}