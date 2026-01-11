package id.antasari.charityconnect.ui.onboarding

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VolunteerActivism

data class OnboardingData(
    val title: String,
    val description: String,
    val icon: androidx.compose.ui.graphics.vector.ImageVector
)

val onboardingPages = listOf(
    OnboardingData(
        title = "Donasi Jadi Lebih Mudah",
        description = "Salurkan kebaikan hanya dengan beberapa langkah sederhana.",
        icon = Icons.Filled.VolunteerActivism
    ),
    OnboardingData(
        title = "Transparan & Terpercaya",
        description = "Pantau laporan penggunaan dana secara real-time.",
        icon = Icons.Filled.Visibility
    ),
    OnboardingData(
        title = "Mulai dari Donasi Mikro",
        description = "Berdonasi mulai dari Rp1.000 untuk perubahan nyata.",
        icon = Icons.Filled.Favorite
    )
)
