package id.antasari.charityconnect.ui.profile

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Profil") }
            )
        }
    ) { padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .verticalScroll(rememberScrollState())
        ) {

            ProfileHeader()

            Divider()

            ProfileMenuItem("Edit Profil") {}
            ProfileMenuItem("Bantuan") {}
            ProfileMenuItem("Keamanan") {}

            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = {
                    // nanti: logout logic
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            ) {
                Text("Keluar")
            }

            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}
