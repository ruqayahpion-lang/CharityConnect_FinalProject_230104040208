package id.antasari.charityconnect.ui.report

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

data class ReportItem(
    val title: String,
    val description: String,
    val date: String
)

private val dummyReports = listOf(
    ReportItem(
        "Distribusi Tahap 1",
        "Dana digunakan untuk pembelian sembako",
        "10 Jan 2026"
    ),
    ReportItem(
        "Distribusi Tahap 2",
        "Dana digunakan untuk pengobatan",
        "15 Jan 2026"
    )
)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReportTimelineScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Laporan Penggunaan Dana") }
            )
        }
    ) { padding ->

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp)
        ) {
            items(dummyReports) { report ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 12.dp),
                    elevation = CardDefaults.cardElevation(2.dp)
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Text(report.title, style = MaterialTheme.typography.titleMedium)
                        Spacer(Modifier.height(4.dp))
                        Text(report.description)
                        Spacer(Modifier.height(4.dp))
                        Text(report.date, style = MaterialTheme.typography.labelSmall)
                    }
                }
            }
        }
    }
}
