package id.antasari.charityconnect.ui.program

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProgramDetailScreen(
    programId: Int,
    onDonateClick: () -> Unit
) {
    val program = dummyProgramDetail
    val progress =
        program.collected.toFloat() / program.target.toFloat()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Detail Program") }
            )
        }
    ) { padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .verticalScroll(rememberScrollState())
                .padding(16.dp)
        ) {

            // Judul
            Text(
                text = program.title,
                style = MaterialTheme.typography.titleLarge
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Progress
            LinearProgressIndicator(
                progress = progress,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Terkumpul Rp ${program.collected} dari Rp ${program.target}",
                style = MaterialTheme.typography.bodyMedium
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Deskripsi
            Text(
                text = "Deskripsi Program",
                style = MaterialTheme.typography.titleMedium
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = program.description,
                style = MaterialTheme.typography.bodyMedium
            )

            Spacer(modifier = Modifier.height(40.dp))

            // CTA DONASI
            Button(
                onClick = onDonateClick,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Donasi Sekarang")
            }
        }
    }
}
