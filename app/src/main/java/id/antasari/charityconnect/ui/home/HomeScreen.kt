package id.antasari.charityconnect.ui.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    onProgramClick: (Int) -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Charity Connect") }
            )
        }
    ) { padding ->

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            item {
                Text(
                    text = "Program Donasi",
                    style = MaterialTheme.typography.titleLarge
                )
            }

            items(dummyPrograms) { program ->
                ProgramCard(
                    program = program,
                    onClick = {
                        onProgramClick(program.id)
                    }
                )
            }
        }
    }
}
