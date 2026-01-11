package id.antasari.charityconnect.ui.home

data class DonationProgram(
    val id: Int,
    val title: String,
    val description: String,
    val collected: Int,
    val target: Int
)

val dummyPrograms = listOf(
    DonationProgram(
        id = 1,
        title = "Bantu Korban Banjir",
        description = "Donasi untuk korban banjir di wilayah terdampak",
        collected = 2500000,
        target = 10000000
    ),
    DonationProgram(
        id = 2,
        title = "Pendidikan Anak Yatim",
        description = "Dukung pendidikan anak-anak yatim",
        collected = 5000000,
        target = 15000000
    )
)
