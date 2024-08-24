package br.com.samuel.logus_app.model

import com.google.gson.annotations.SerializedName

/**
 * Data class representing a user request to be sent to the API.
 *
 * @property name The name of the user.* @property password The password of the user.
 * @property email The email address of the user.
 * @property role The role of the user.
 */

data class ApiUserRequest (
    @SerializedName("nome")
    val name: String,
    @SerializedName("password")
    val password: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("role")
    val role: String
)