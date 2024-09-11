package br.com.samuel.logus_app.backendservices.api

import br.com.samuel.logus_app.constants.URL_JSON_TOKENS
import br.com.samuel.logus_app.model.ApiTokenRequest
import br.com.samuel.logus_app.model.ApiTokenResponse
import retrofit2.http.Body
import retrofit2.http.POST


/**
 * An interface that defines the API service.
 */
interface ApiService {
//    /**
//     * Creates a new user.*
//     * @param apiUserRequest The user request.
//     * @return The user response.
//     */
//    @POST(URL_JSON_CREATE_USER)
//    suspend fun createUser(@Body apiUserRequest: ApiUserRequest): ApiUserResponse
//    /**
//     * Gets all users.
//     *
//     * @return A list of user responses.
//     */
//    @GET(URL_JSON_INDEX_USERS)
//    suspend fun getUsers(): List<ApiUserResponse>
//
//    /**
//     * Gets a user by ID.
//     *
//     * @param id The user ID.
//     * @return The user response.
//     */
//    @GET(URL_JSON_SHOW_USER)
//    suspend fun getUser(@Path("id") id: Int): ApiUserResponse
//
//    /**
//     * Updates a user.
//     *
//     *@param id The user ID.
//     * @param apiUserRequest The user request.
//     * @return The user response.
//     */
//
//    @PUT(URL_JSON_UPDATE_USER)
//    suspend fun updateUser(@Path("id") id: Int, @Body apiUserRequest: ApiUserRequest): ApiUserResponse
//    /**
//     * Requests a login token.
//     *
//     * @param apiTokenRequest The token request.
//     * @return The token response.
//     */
    @POST(URL_JSON_TOKENS)
    suspend fun requestTokenLogin(@Body apiTokenRequest: ApiTokenRequest) : ApiTokenResponse

}