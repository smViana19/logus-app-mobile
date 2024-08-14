package br.com.samuel.logus_app.ui.screens

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.samuel.logus_app.backendservices.api.ApiService
import br.com.samuel.logus_app.model.ApiTokenRequest
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.HttpException
import javax.inject.Inject

@HiltViewModel
class ScreenLoginVm @Inject constructor(
    private val apiService: ApiService
) : ViewModel() {
    private val _email = mutableStateOf("")
    val email: MutableState<String> = _email
    private val _password = mutableStateOf("")
    val password: MutableState<String> = _password


    fun onClickLoginButton() {
        viewModelScope.launch {

            val apiTokenRequest = ApiTokenRequest(email = _email.value, password = _password.value)
            try {
                val response = apiService.requestTokenLogin(apiTokenRequest)
                if(response.status != 200) {
                    val responseErrors = response.errors
                    println("errors: $responseErrors")
                } else {
                    val token = response.token
                    println("login successfully, Token: $token")
                }
            } catch (e: HttpException) {
                val errorBody = e.response()?.errorBody()?.string()
                println("status: ${e.code()} - ${errorBody ?: "Unknown error"}")
            } catch (t: Throwable) {
                t.printStackTrace()
            }
        }
    }

}