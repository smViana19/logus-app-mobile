package br.com.samuel.logus_app.model

import com.google.gson.annotations.SerializedName

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