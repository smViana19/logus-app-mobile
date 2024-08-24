package br.com.samuel.logus_app.model

import com.google.gson.annotations.SerializedName


/**
 * Data class that represents a user response from the API.
 *
 * @property id The unique identifier of the user.* @property name The name of the user.
 * @property email The email address of the user.
 * @property role The role of the user.
 */
data class ApiUserResponse(
    @SerializedName("id")
    val id: Int,
    @SerializedName("nome")
    val name: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("role")
    val role: String
)