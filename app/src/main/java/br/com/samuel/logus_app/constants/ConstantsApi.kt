package br.com.samuel.logus_app.constants

const val APP_URL = "http://10.0.2.2:3000" // Base URL da API utilizada na aplicação, apontando para o localhost do emulador Android.
const val URL_JSON_CREATE_USER = "/users/" // Endpoint para criar um novo usuário no sistema (requisição POST).
const val URL_JSON_UPDATE_USER = "/users/{id}" // Endpoint para atualizar um usuário existente no sistema (requisição PUT). // O placeholder `{id}` deve ser substituído pelo ID real do usuário.
const val URL_JSON_SHOW_USER = "/users/{id}" // Endpoint para obter as informações de um usuário específico do sistema (requisição GET). // O placeholder `{id}` deve ser substituído pelo ID real do usuário.
const val URL_JSON_INDEX_USERS = "/users/" // Endpoint para listar todos os usuários no sistema (requisição GET).


const val URL_JSON_TOKENS = "/tokens/" // Endpoint para autenticação de usuário e geração de tokens (requisição POST).