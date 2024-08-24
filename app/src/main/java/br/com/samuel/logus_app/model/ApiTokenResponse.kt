package br.com.samuel.logus_app.model

import com.google.gson.annotations.SerializedName

/**
 * Data class representing a token response from the API.
 *
 * @property token The token string.
 * @property userThe user data associated with the token.
 * @property errors A list of errors that occurred during the request.
 * @property status The status code of the response.
 * @property msgSuccess The success message of the response.
 */
data class ApiTokenResponse(
    @SerializedName("token")
    val token: String,
    @SerializedName("user")
    val user: ApiUserResponse,
    @SerializedName("errors")
    val errors: List<String>,
    @SerializedName("status")
    val status: Int,
    @SerializedName("msg")
    val msgSuccess: String?
)
