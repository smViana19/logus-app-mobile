package br.com.samuel.logus_app.ui.navigation

import androidx.navigation.NavController
import br.com.samuel.logus_app.model.ApiTokenResponse
import javax.inject.Inject

class NavigationManagerImpl @Inject constructor(
    private val navController: NavController
): NavigationManager {
    override fun navigateToDashboard(apiTokenResponse: ApiTokenResponse) {
        navController.navigate("dashboard/${apiTokenResponse.user.email}")
    }

}