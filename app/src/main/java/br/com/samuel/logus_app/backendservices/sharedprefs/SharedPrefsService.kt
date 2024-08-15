package br.com.samuel.logus_app.backendservices.sharedprefs

import br.com.samuel.logus_app.model.ApiUserRequest

interface SharedPrefsService {

    fun saveUserData(name: String, email: String, password: String, role: String)
    fun getUserData(): ApiUserRequest

}