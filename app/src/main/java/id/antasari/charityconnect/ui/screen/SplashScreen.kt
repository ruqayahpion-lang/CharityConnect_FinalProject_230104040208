package id.antasari.charityconnect.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment

@Composable
fun SplashScreen(onFinish: () -> Unit) {
    LaunchedEffect(Unit) {
        kotlinx.coroutines.delay(1500)
        onFinish()
    }
    Box(contentAlignment = Alignment.Center) {
        Text("Charity Connect")
    }
}
