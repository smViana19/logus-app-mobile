package br.com.samuel.logus_app.backendservices.sharedprefs

import br.com.samuel.logus_app.model.ApiUserRequest


/**
 * An interface that defines the shared preferences service.
 */

interface SharedPrefsService {
    /**
     * Saves user datato shared preferences.
     *
     * @param name The user's name.
     * @param email The user's email.
     * @param password The user's password.
     * @param role The user's role.
     */
    fun saveUserData(name: String, email: String, password: String, role: String)
    /**
     * Gets user data from shared preferences.
     *
     * @return The user data as an ApiUserRequest object.
     */
    fun getUserData(): ApiUserRequest

}