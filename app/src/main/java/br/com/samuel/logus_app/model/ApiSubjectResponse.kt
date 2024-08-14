package br.com.samuel.logus_app.model

import com.google.gson.annotations.SerializedName

data class ApiSubjectResponse(
    @SerializedName("id")
    var id: Int,
    @SerializedName("nome")
    var name: String,
    @SerializedName("user_id")
    var userId: Int,
    @SerializedName("errors")
    val errors: List<String>,
    @SerializedName("status")
    val status: Int
    /*
     * ATUALMENTE ESSA ROTA NAO ESTA FUNCIONANDO A VINCULACAO COM O USUARIO LEMBRAR DE CONSCERTAR NA API!!!
     *
    */
)