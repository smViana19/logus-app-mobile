package br.com.samuel.logus_app.model

import com.google.gson.annotations.SerializedName

data class ApiTokenRequest(
    @SerializedName("email")
    val email: String,
    @SerializedName("password")
    val password: String,
)
