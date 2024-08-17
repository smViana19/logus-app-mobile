package br.com.samuel.logus_app.ui.navigation

import br.com.samuel.logus_app.model.ApiTokenResponse

interface NavigationManager {

    fun navigateToDashboard(apiTokenResponse: ApiTokenResponse)
}