package br.com.samuel.logus_app.model

import com.google.gson.annotations.SerializedName

data class ApiSubjectRequest (
    @SerializedName("nome")
    var name: String,
    @SerializedName("user_id")
    var userId: Int,

    /*
    * CONSERTAR NA API DEPOIS O USER_ID
    */
)