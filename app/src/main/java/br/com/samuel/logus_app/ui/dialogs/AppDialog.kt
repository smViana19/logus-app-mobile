package br.com.samuel.logus_app.ui.dialogs

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import br.com.samuel.logus_app.R
import br.com.samuel.logus_app.ui.screens.ScreenLoginVm
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition

@Composable
fun CustomDialog(
    state: DialogState,
    modifier: Modifier = Modifier
) {
    if(state.open) {

        Dialog(
            onDismissRequest = state.onDismiss,
        ) {
            Card(
                modifier = modifier,
                elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
                shape = RoundedCornerShape(16.dp),
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    when (state.type) {
                        DialogType.SUCCESS -> LottieAnimation(
                            modifier = modifier.size(72.dp),
                            composition = rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.sucess_animation)).value,
                        )

                        DialogType.ERROR -> LottieAnimation(
                            modifier = modifier.size(72.dp),
                            composition = rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.error_animation)).value,
                        )

                        DialogType.ALERT -> LottieAnimation(
                            modifier = modifier.size(72.dp),
                            composition = rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.alert_animation)).value,
                        )

                        else -> {}
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    state.title?.let {
                        Text(text = it)
                        Spacer(modifier = Modifier.height(8.dp))
                    }
                    state.msg?.let {
                        Text(text = it)
                        Spacer(modifier = Modifier.height(16.dp))
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        // Botão de Cancelar (opcional)
                        state.dismissButton?.let {
                            TextButton(onClick = state.onDismiss) {

                            }
                            Spacer(modifier = Modifier.width(8.dp))
                        }

                        // Botão de Confirmar (opcional, com padrão "OK")
                        Button(
                            onClick = state.onConfirm,
                            colors = ButtonColors(
                                containerColor = Color(0xFF820AD1),
                                contentColor = Color(0xFFFFFFFF),
                                disabledContainerColor = Color(0xFF665287),
                                disabledContentColor = Color(0xFFFFFFFF)
                            )
                        ) {
                            Text(state.confirmButton)
                        }
                    }
                }
            }
        }
    }
}


@Preview
@Composable
fun AppDialogPreview(modifier: Modifier = Modifier) {
    CustomDialog(state = DialogState(
        type = DialogType.SUCCESS,
        title = "Sucesso",
        msg = "Logado com sucesso",

    ))
}