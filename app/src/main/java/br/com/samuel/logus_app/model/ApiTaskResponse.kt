package br.com.samuel.logus_app.model

import com.google.gson.annotations.SerializedName


/**
 * Data class representing a task response from the API.
 *
 * @property id The unique identifier of the task.
 * @property title The title of the task.
 * @property category The category of the task.
 * @property description The description of the task.
 * @property urgency The urgency of the task.
 * @property userId The unique identifier of the user who created the task.
 * @property userData A list of user data associated with the task.
 * @property errors A list of errors that occurred during the request.
 * @property status The status code of the response.
 */

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