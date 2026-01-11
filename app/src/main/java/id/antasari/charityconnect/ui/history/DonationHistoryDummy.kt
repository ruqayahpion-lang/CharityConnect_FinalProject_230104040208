package id.antasari.charityconnect.ui.history

data class DonationHistory(
    val id: String,
    val programName: String,
    val amount: Int,
    val date: String,
    val status: String
)

val dummyDonationHistory = listOf(
    DonationHistory(
        id = "CC-001",
        programName = "Bantu Pendidikan Anak",
        amount = 10000,
        date = "11 Jan 2026",
        status = "Berhasil"
    ),
    DonationHistory(
        id = "CC-002",
        programName = "Bantu Korban Bencana",
        amount = 5000,
        date = "10 Jan 2026",
        status = "Berhasil"
    )
)
