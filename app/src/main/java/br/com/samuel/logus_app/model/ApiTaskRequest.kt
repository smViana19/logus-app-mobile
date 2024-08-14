package br.com.samuel.logus_app.model

import com.google.gson.annotations.SerializedName

data class ApiTaskRequest (
    @SerializedName("user_id")
    var userId: Int,
    @SerializedName("titulo")
    var title: String,
    @SerializedName("categoria")
    var category: String,
    @SerializedName("descricao")
    var description: String,
    @SerializedName("urgencia")
    var urgency: String,
)