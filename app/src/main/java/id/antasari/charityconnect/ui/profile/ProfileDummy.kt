package id.antasari.charityconnect.ui.profile

data class UserProfile(
    val name: String,
    val email: String
)

val dummyUser = UserProfile(
    name = "lisa",
    email = "Lisa@gmail.com"
)
