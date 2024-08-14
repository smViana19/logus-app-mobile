package br.com.samuel.logus_app.model

import com.google.gson.annotations.SerializedName

data class ApiTokenResponse(
    @SerializedName("token")
    val token: String,
    @SerializedName("user")
    val user: ApiUserResponse,
    @SerializedName("errors")
    val errors: List<String>,
    @SerializedName("status")
    val status: Int
)
