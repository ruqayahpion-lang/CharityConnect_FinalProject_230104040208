package id.antasari.charityconnect.ui.onboarding

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.background
import androidx.compose.foundation.shape.CircleShape


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnboardingScreen(
    onFinish: () -> Unit
) {
    val pagerState = rememberPagerState(
        initialPage = 0,
        pageCount = { onboardingPages.size }
    )

    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        HorizontalPager(
            state = pagerState,
            modifier = Modifier.weight(1f)
        ) { page ->
            OnboardingPage(data = onboardingPages[page])
        }

        // 🔵 Indicator + Button
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.padding(bottom = 16.dp)
            ) {
                repeat(onboardingPages.size) { index ->
                    val selected = pagerState.currentPage == index
                    Box(
                        modifier = Modifier
                            .padding(4.dp)
                            .size(if (selected) 10.dp else 8.dp)
                            .background(
                                color = if (selected)
                                    MaterialTheme.colorScheme.primary
                                else
                                    MaterialTheme.colorScheme.outline,
                                shape = CircleShape
                            )
                    )
                }
            }

            Button(
                onClick = {
                    if (pagerState.currentPage == onboardingPages.lastIndex) {
                        onFinish()
                    }
                },
                modifier = Modifier.fillMaxWidth(),
                enabled = pagerState.currentPage == onboardingPages.lastIndex
            ) {
                Text("Mulai Sekarang")
            }
        }
    }
}
