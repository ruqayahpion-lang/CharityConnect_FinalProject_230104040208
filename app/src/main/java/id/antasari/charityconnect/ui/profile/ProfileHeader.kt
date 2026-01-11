package id.antasari.charityconnect.ui.profile

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ProfileHeader() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Surface(
            shape = MaterialTheme.shapes.large,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.size(80.dp)
        ) {}

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = dummyUser.name,
            style = MaterialTheme.typography.titleMedium
        )

        Text(
            text = dummyUser.email,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}
