package id.antasari.charityconnect.ui.donation

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DonationAmountScreen(
    onBack: () -> Unit,
    onContinue: (Int) -> Unit
) {
    var selectedAmount by remember { mutableStateOf(0) }
    var customAmount by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Pilih Nominal Donasi") }
            )
        }
    ) { padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            Text(
                text = "Pilih Nominal",
                style = MaterialTheme.typography.titleMedium
            )

            // Nominal cepat (tanpa FlowRow)
            listOf(1000, 2000, 5000, 10000).chunked(2).forEach { row ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    row.forEach { amount ->
                        OutlinedButton(
                            onClick = {
                                selectedAmount = amount
                                customAmount = ""
                            },
                            modifier = Modifier.weight(1f)
                        ) {
                            Text("Rp $amount")
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Atau masukkan nominal sendiri",
                style = MaterialTheme.typography.titleSmall
            )

            OutlinedTextField(
                value = customAmount,
                onValueChange = {
                    customAmount = it
                    selectedAmount = it.toIntOrNull() ?: 0
                },
                label = { Text("Nominal Donasi") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = { onContinue(selectedAmount) },
                modifier = Modifier.fillMaxWidth(),
                enabled = selectedAmount > 0
            ) {
                Text("Lanjutkan")
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
