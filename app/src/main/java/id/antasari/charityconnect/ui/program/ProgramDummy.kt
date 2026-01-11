package id.antasari.charityconnect.ui.program

data class ProgramDetail(
    val id: Int,
    val title: String,
    val description: String,
    val collected: Int,
    val target: Int
)

val dummyProgramDetail = ProgramDetail(
    id = 1,
    title = "Bantu Korban Banjir",
    description =
        "Banjir besar melanda beberapa wilayah dan menyebabkan banyak warga kehilangan tempat tinggal.\n\n" +
                "Dana yang terkumpul akan digunakan untuk:\n" +
                "- Bantuan makanan\n" +
                "- Obat-obatan\n" +
                "- Perlengkapan darurat\n\n" +
                "Mari bersama membantu saudara kita yang terdampak bencana ini.\n\n" +
                "Setiap donasi sangat berarti.",
    collected = 2500000,
    target = 10000000
)
