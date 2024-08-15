package br.com.samuel.logus_app.backendservices.sharedprefs

import android.annotation.SuppressLint
import android.content.Context
import br.com.samuel.logus_app.model.ApiUserRequest

class SharedPrefsServiceImpl(context: Context): SharedPrefsService {
    private val sharedPreferences = context.getSharedPreferences("user_prefs", Context.MODE_PRIVATE)
    @SuppressLint("CommitPrefEdits")
    override fun saveUserData(
        name: String,
        email: String,
        password: String,
        role: String,
    ) {
        sharedPreferences.edit().apply {
            putString("user_name", name)
            putString("user_email", email)
            putString("user_password", password)
            putString("user_role", role)
            apply()
        }
    }

    override fun getUserData(): ApiUserRequest {
        val name = sharedPreferences.getString("user_name", "") ?: ""
        val email = sharedPreferences.getString("user_email", "") ?: ""
        val password = sharedPreferences.getString("user_password", "") ?: ""
        val role = sharedPreferences.getString("user_role", "") ?: ""
        return ApiUserRequest(name, password, email, role)
    }

}