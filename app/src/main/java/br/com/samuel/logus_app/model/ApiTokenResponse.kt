package br.com.samuel.logus_app.model

data class ApiTokenResponse(
    val token: String,
    val user: ApiUserResponse,
    val errors: List<String>,
    val status: Int
)
