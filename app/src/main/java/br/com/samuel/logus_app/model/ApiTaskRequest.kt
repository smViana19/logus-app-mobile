package br.com.samuel.logus_app.model

import com.google.gson.annotations.SerializedName


/**
 * Data class representing a task request to be sent to the API.
 *
 * @property userId The unique identifier of the user who created the task.
 * @property title The title of the task.
 * @property category The category of the task.
 * @property description The description of the task.
 * @property urgency The urgency of the task.
 */

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