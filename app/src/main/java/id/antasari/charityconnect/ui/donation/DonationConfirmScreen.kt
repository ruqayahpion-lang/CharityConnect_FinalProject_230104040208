package id.antasari.charityconnect.ui.donate

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DonationConfirmScreen(
    amount: Int,
    onBack: () -> Unit,
    onConfirm: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Konfirmasi Donasi") }
            )
        }
    ) { padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            Text(
                text = "Ringkasan Donasi",
                style = MaterialTheme.typography.titleLarge
            )

            Card(
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text("Program Donasi", style = MaterialTheme.typography.labelMedium)
                    Text("Bantu Pendidikan Anak", style = MaterialTheme.typography.bodyLarge)

                    Divider()

                    Text("Nominal Donasi", style = MaterialTheme.typography.labelMedium)
                    Text("Rp $amount", style = MaterialTheme.typography.bodyLarge)
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = onConfirm,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Konfirmasi Donasi")
            }

            OutlinedButton(
                onClick = onBack,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Kembali")
            }
        }
    }
}
