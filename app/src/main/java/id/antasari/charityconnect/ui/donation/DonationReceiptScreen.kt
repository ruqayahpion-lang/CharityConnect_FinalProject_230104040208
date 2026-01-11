package id.antasari.charityconnect.ui.donate

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DonationReceiptScreen(
    onFinish: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Bukti Donasi") }
            )
        }
    ) { padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Icon(
                imageVector = Icons.Filled.CheckCircle,
                contentDescription = "Success",
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.size(96.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Donasi Berhasil",
                style = MaterialTheme.typography.titleLarge
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Terima kasih telah berdonasi",
                style = MaterialTheme.typography.bodyMedium
            )

            Spacer(modifier = Modifier.height(24.dp))

            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant
                )
            ) {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    ReceiptRow("Program", "Bantu Pendidikan Anak")
                    ReceiptRow("Nominal", "Rp 10.000")
                    ReceiptRow("Tanggal", "11 Januari 2026")
                    ReceiptRow("ID Transaksi", "#CC-001234")
                }
            }

            Spacer(modifier = Modifier.height(32.dp))

            Button(
                onClick = onFinish,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Kembali ke Beranda")
            }
        }
    }
}

@Composable
private fun ReceiptRow(
    label: String,
    value: String
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(label, style = MaterialTheme.typography.bodyMedium)
        Text(value, style = MaterialTheme.typography.bodyMedium)
    }

    Spacer(modifier = Modifier.height(8.dp))
}
