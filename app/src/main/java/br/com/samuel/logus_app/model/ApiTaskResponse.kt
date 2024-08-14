package br.com.samuel.logus_app.model

import com.google.gson.annotations.SerializedName

data class ApiTaskResponse(
    @SerializedName("id")
    var id: Int,
    @SerializedName("titulo")
    var title: String,
    @SerializedName("categoria")
    var category: String,
    @SerializedName("descricao")
    var description: String,
    @SerializedName("urgencia")
    var urgency: String,
    @SerializedName("user_id")
    var userId: Int,
    @SerializedName("user")
    var userData: List<ApiUserResponse>,
    @SerializedName("errors")
    val errors: List<String>,
    @SerializedName("status")
    val status: Int
)