package br.com.samuel.logus_app.constants

const val APP_URL = "http://10.0.2.2:3000" // Base URL da API utilizada na aplicação, apontando para o localhost do emulador Android.

/**
 * Api mappers User
 */
const val URL_JSON_CREATE_USER = "/users/" // Endpoint para criar um novo usuário no sistema (requisição POST).
const val URL_JSON_TOKENS = "/tokens/" // Endpoint para autenticação de usuário e geração de tokens (requisição POST).



const val URL_JSON_TASKS = "/tarefas" // Endpoint para ir as tarefas
const val URL_JSON_SUBJECTS = "/materias/" //Endpoint para a rota de materias
const val URL_JSON_SUBJECTS_MATERIALS = "/materias/material/" //Endpoint para ir aos materials

/**
 * Endpoints not used in Mobile (temporary)
 */
const val URL_JSON_SCHOOL_YEAR = "/admin/ano-escolar/" // Endpoint para os anos escolares
const val URL_JSON_EDUCATION_LEVEL = "/admin/nivel-ensino/" //Endpoints de admin para criar/listar niveis de ensino
const val URL_JSON_GRADE = "/admin/serie/" //Endpoint para listar/criar serie
const val URL_JSON_SCHOOL_YEAR_GRADE = "/admin/serie/turma/" //Endpoint para listar/criar turma