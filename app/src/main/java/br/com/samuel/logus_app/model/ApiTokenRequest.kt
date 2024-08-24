package br.com.samuel.logus_app.model

import com.google.gson.annotations.SerializedName

/**
 * Data class representing a token request to be sent to the API.
 *
 * @property email The email address of the user.
 * @property password The password of the user.
 */

data class ApiTokenRequest(
    @SerializedName("email")
    val email: String,
    @SerializedName("password")
    val password: String,
)
