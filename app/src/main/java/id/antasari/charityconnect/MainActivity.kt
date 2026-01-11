package id.antasari.charityconnect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import id.antasari.charityconnect.navigation.AppNav
import id.antasari.charityconnect.ui.theme.CharityConnectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CharityConnectTheme {
                AppNav()
            }
        }
    }
}
