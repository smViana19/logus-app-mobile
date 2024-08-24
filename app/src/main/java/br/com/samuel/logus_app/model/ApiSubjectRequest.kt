package br.com.samuel.logus_app.model

import com.google.gson.annotations.SerializedName

/**
 * Data class representing a subject request to be sent to the API.
 *
 * @property name The name of the subject.
 * @property userId The unique identifier of the user who created the subject.
 */

data class ApiSubjectRequest (
    @SerializedName("nome")
    var name: String,
    @SerializedName("user_id")
    var userId: Int,

    /*
    * CONSERTAR NA API DEPOIS O USER_ID
    */
)