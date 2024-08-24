package br.com.samuel.logus_app.model

import com.google.gson.annotations.SerializedName

/**
 * Data class representing a subject response from the API.
 *
 * @property id The unique identifier of the subject.
 * @property name The name of the subject.
 * @property userId The unique identifier of the user who created the subject.
 * @property errors A list of errors that occurred during the request.
 * @property status The status code of the response.
 */

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