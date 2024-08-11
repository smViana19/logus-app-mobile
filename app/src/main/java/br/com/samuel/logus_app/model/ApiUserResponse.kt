package br.com.samuel.logus_app.model

import com.google.gson.annotations.SerializedName


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