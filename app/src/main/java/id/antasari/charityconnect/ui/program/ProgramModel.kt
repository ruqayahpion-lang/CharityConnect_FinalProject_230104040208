package id.antasari.charityconnect.ui.program

data class Program(
    val id: Int,
    val title: String,
    val description: String,
    val collected: Long,
    val target: Long
)
