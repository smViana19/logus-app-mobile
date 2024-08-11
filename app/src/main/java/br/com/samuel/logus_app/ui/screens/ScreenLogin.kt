package br.com.samuel.logus_app.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.withAnnotation
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import br.com.samuel.logus_app.R


@OptIn(ExperimentalTextApi::class)
@Composable
fun ScreenLogin(
    vm: ScreenLoginVm = hiltViewModel()
) {
    var text by remember { mutableStateOf("") }

    val textAnnoted = buildAnnotatedString {
        append("Não possui uma conta?")
        withAnnotation("squiggles", annotation = "ignored") {
            withStyle(SpanStyle(color = Color(0xFF5A1B8D))) {
                append(" Cadastre-se")
            }
        }
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row {
            Text(
                text = "Olá, novamente",
                fontSize = 24.sp,
                fontWeight = FontWeight(600)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(id = R.drawable.logo_logus),
                contentDescription = "logo-logus"
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            OutlinedTextField(
                value = vm.email.value,
                onValueChange = {newValue ->
                    vm.email.value  = newValue
                },
                modifier = Modifier
                    .fillMaxWidth(),
                label = { Text(text = "E-mail") },
                shape = RoundedCornerShape(10.dp),
                trailingIcon = {
                    Icon(
                        painter = painterResource(R.drawable.ic_email_24dp),
                        contentDescription = "Email"
                    )
                }
            )
            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = vm.password.value,
                onValueChange = {newValue ->
                    vm.password.value = newValue
                },
                modifier = Modifier
                    .fillMaxWidth(),
                label = { Text(text = "Senha") },
                visualTransformation = PasswordVisualTransformation(),
                shape = RoundedCornerShape(10.dp),
                trailingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_password_enabled_24dp),
                        contentDescription = "Hide/show pass"
                    )
                }
            )
            Spacer(modifier = Modifier.height(32.dp))
            Button(
                modifier = Modifier
                    .fillMaxWidth(),
                onClick = { vm.onClickLoginButton() },
                shape = RoundedCornerShape(8.dp),
                colors = ButtonColors(
                    containerColor = Color(0xFF820AD1),
                    contentColor = Color(0xFFFFFFFF),
                    disabledContainerColor = Color(0xFF665287),
                    disabledContentColor = Color(0xFFFFFFFF)
                )
            ) {
                Text(text = "Login")
            }

            Text(
                text = "Esqueceu sua senha?",
                modifier = Modifier.padding(top = 16.dp),
                color =  Color(0xFF5A1B8D)
            )
            Row(
                modifier = Modifier
                    .padding(top = 16.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(text = textAnnoted)
            }
        }


    }
}


@Preview(showBackground = true)
@Composable
private fun ScreenLoginPreview() {
    ScreenLogin()
}