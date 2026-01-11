package id.antasari.charityconnect.navigation

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.*
import androidx.compose.foundation.layout.padding
import androidx.navigation.NavType
import androidx.navigation.navArgument
import id.antasari.charityconnect.ui.auth.LoginScreen
import id.antasari.charityconnect.ui.home.HomeScreen
import id.antasari.charityconnect.ui.history.DonationHistoryScreen
import id.antasari.charityconnect.ui.onboarding.OnboardingScreen
import id.antasari.charityconnect.ui.profile.ProfileScreen
import id.antasari.charityconnect.ui.splash.SplashScreen
import id.antasari.charityconnect.ui.program.ProgramDetailScreen
import id.antasari.charityconnect.ui.donation.DonationAmountScreen
import id.antasari.charityconnect.ui.donate.DonationConfirmScreen
import id.antasari.charityconnect.ui.donate.DonationReceiptScreen

@Composable
fun AppNav() {
    val navController = rememberNavController()

    val currentBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = currentBackStackEntry?.destination?.route

    val showBottomBar = currentRoute in listOf(
        NavRoute.HOME,
        NavRoute.HISTORY,
        NavRoute.PROFILE
    )

    Scaffold(
        bottomBar = {
            if (showBottomBar) {
                BottomNavBar(navController)
            }
        }
    ) { padding ->

        NavHost(
            navController = navController,
            startDestination = NavRoute.SPLASH,
            modifier = Modifier.padding(padding)
        ) {

            // SPLASH
            composable(NavRoute.SPLASH) {
                SplashScreen {
                    navController.navigate(NavRoute.ONBOARDING) {
                        popUpTo(NavRoute.SPLASH) { inclusive = true }
                    }
                }
            }

            // ONBOARDING
            composable(NavRoute.ONBOARDING) {
                OnboardingScreen {
                    navController.navigate(NavRoute.LOGIN) {
                        popUpTo(NavRoute.ONBOARDING) { inclusive = true }
                    }
                }
            }

            // LOGIN
            composable(NavRoute.LOGIN) {
                LoginScreen(
                    onLoginSuccess = {
                        navController.navigate(NavRoute.HOME) {
                            popUpTo(NavRoute.LOGIN) { inclusive = true }
                        }
                    }
                )
            }

            // HOME
            composable(NavRoute.HOME) {
                HomeScreen(
                    onProgramClick = { programId ->
                        navController.navigate("detail/$programId")
                    }
                )
            }

            // DETAIL PROGRAM
            composable(
                route = "detail/{id}",
                arguments = listOf(
                    navArgument("id") { type = NavType.IntType }
                )
            ) { backStack ->
                val id = backStack.arguments?.getInt("id") ?: 0

                ProgramDetailScreen(
                    programId = id,
                    onDonateClick = {
                        navController.navigate(NavRoute.DONATION)
                    }
                )
            }

            // PILIH NOMINAL (FASE 6)
            composable(NavRoute.DONATION) {
                DonationAmountScreen(
                    onBack = {
                        navController.popBackStack()
                    },
                    onContinue = { amount ->
                        navController.navigate("${NavRoute.CONFIRM}/$amount")
                    }
                )
            }

            // KONFIRMASI DONASI (FASE 7)
            composable(
                route = "${NavRoute.CONFIRM}/{amount}",
                arguments = listOf(
                    navArgument("amount") { type = NavType.IntType }
                )
            ) { backStack ->
                val amount = backStack.arguments?.getInt("amount") ?: 0

                DonationConfirmScreen(
                    amount = amount,
                    onBack = {
                        navController.popBackStack()
                    },
                    onConfirm = {
                        navController.navigate(NavRoute.RECEIPT)
                    }
                )
            }

            // BUKTI DONASI (FASE 8)
            composable(NavRoute.RECEIPT) {
                DonationReceiptScreen(
                    onFinish = {
                        navController.navigate(NavRoute.HOME) {
                            popUpTo(NavRoute.HOME) { inclusive = true }
                        }
                    }
                )
            }

            // HISTORY
            composable(NavRoute.HISTORY) {
                DonationHistoryScreen()
            }

            // PROFILE
            composable(NavRoute.PROFILE) {
                ProfileScreen()
            }
            composable(NavRoute.HISTORY) {
                DonationHistoryScreen()
            }
        }
    }
}
