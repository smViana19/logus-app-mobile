package br.com.samuel.logus_app.ui.screens

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.samuel.logus_app.backendservices.api.ApiService
import br.com.samuel.logus_app.backendservices.sharedprefs.SharedPrefsService
import br.com.samuel.logus_app.model.ApiTokenRequest
import br.com.samuel.logus_app.ui.dialogs.DialogState
import br.com.samuel.logus_app.ui.dialogs.DialogType
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.HttpException
import javax.inject.Inject

@HiltViewModel
class ScreenLoginVm @Inject constructor(
    private val apiService: ApiService,
    private val sharedPrefsService: SharedPrefsService
) : ViewModel() {
    private val _email = mutableStateOf("")
    val email: MutableState<String> = _email
    private val _password = mutableStateOf("")
    val password: MutableState<String> = _password

    private val _isLoading = mutableStateOf(false)
    val isLoading: MutableState<Boolean> = _isLoading

    private val _dialogState = mutableStateOf(DialogState(open = false))
    val dialogState: State<DialogState> = _dialogState

    private fun saveUser(name: String, email: String, password: String, role: String) {
        sharedPrefsService.saveUserData(name, email, password, role)
    }

    fun onClickLoginButton() {
        viewModelScope.launch {

            val apiTokenRequest = ApiTokenRequest(email = _email.value, password = _password.value)
            try {
                _isLoading.value = true
                val response = apiService.requestTokenLogin(apiTokenRequest)
                if(response.status != 200) {
                    val responseErrors = response.errors
                    println("errors: $responseErrors")
                    _isLoading.value = false
                    _dialogState.value = DialogState(
                        open = true,
                        type = DialogType.ERROR,
                        title = "Erro ao fazer login",
                        msg = responseErrors.toString()
                    )
                } else {
                    val token = response.token
                    val role = response.user.role
                    val name = response.user.name
                    println("login successfully, Token: $token")
                    saveUser(name, email.value, password.value, role)
                    println("saveuser:$name, $role ")
                    _isLoading.value = false
                }
            } catch (e: HttpException) {
                val errorBody = e.response()?.errorBody()?.string()
                val errorMessage = errorBody?.substringAfterLast("\"errors\":[\"")?.substringBeforeLast("\"]") ?: "Erro desconhecido"
                println(errorBody)
                _isLoading.value = false
                _dialogState.value = DialogState(
                    open = true,
                    type = DialogType.ALERT,
                    title = "Erro ao fazer login",
                    msg = errorMessage,
                    onConfirm = {
                        onClickButtonDismissDialog()
                    }
                )

            } finally {
                _isLoading.value = false
            }
        }
    }



    private fun onClickButtonDismissDialog() {
        _dialogState.value = DialogState(
            open = false
        )
    }

}