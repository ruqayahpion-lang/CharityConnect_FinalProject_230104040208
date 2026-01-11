package id.antasari.charityconnect.ui.history

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DonationHistoryScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Riwayat Donasi") }
            )
        }
    ) { padding ->

        if (dummyDonationHistory.isEmpty()) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding),
                contentAlignment = androidx.compose.ui.Alignment.Center
            ) {
                Text("Belum ada riwayat donasi")
            }
        } else {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
                    .padding(16.dp)
            ) {
                items(dummyDonationHistory) { history ->
                    DonationHistoryItem(history)
                }
            }
        }
    }
}
