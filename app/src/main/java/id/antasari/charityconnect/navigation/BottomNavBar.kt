package id.antasari.charityconnect.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun BottomNavBar(navController: NavHostController) {

    NavigationBar {

        NavigationBarItem(
            selected = false,
            onClick = {
                navController.navigate(NavRoute.HOME)
            },
            icon = { Icon(Icons.Default.Home, null) },
            label = { Text("Home") }
        )

        NavigationBarItem(
            selected = false,
            onClick = {
                navController.navigate(NavRoute.HISTORY)
            },
            icon = { Icon(Icons.Default.History, null) },
            label = { Text("Riwayat") }
        )

        NavigationBarItem(
            selected = false,
            onClick = {
                navController.navigate(NavRoute.PROFILE)
            },
            icon = { Icon(Icons.Default.Person, null) },
            label = { Text("Profil") }
        )
    }
}
