package com.example.builduicomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.builduicomposable.ui.theme.BuildUiComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BuildUiComposableTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFF3ddc84)
                ) {
                    CardBusiness()
                }
            }
        }
    }
}

@Composable
fun CardBusiness() {
    Column(
        Modifier.fillMaxSize()
    ) {
        CardInfoUser(
            fullName = stringResource(R.string.fullName_info_card),
            title = stringResource(R.string.title_info_card),
            phoneNumber = stringResource(R.string.phone_info_card),
            email = stringResource(R.string.email_info_card),
            socialMedia = stringResource(R.string.social_info_card),
        )
    }
}

@Composable
private fun CardInfoUser(
    fullName: String,
    title: String,
    phoneNumber: String,
    email: String,
    socialMedia: String,
) {
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        val imageProfile = painterResource(R.drawable.icon_profile)
        Column(
            modifier = Modifier.padding(top = 220.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                painter = imageProfile,
                contentDescription = null,
                modifier = Modifier
                    .size(width = 230.dp, height = 180.dp)
                    .padding(bottom = 16.dp)
            )
            Text(
                text = fullName,
                fontSize = 32.sp,
                modifier = Modifier.padding(start = 22.dp, end = 22.dp),
                fontFamily = FontFamily.SansSerif,

            )
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                fontFamily = FontFamily.SansSerif,
            )
        }

        Column (
            Modifier.padding(bottom = 28.dp)
        ){
            Row (
                Modifier.padding(top = 6.dp)
            ){
                Icon(
                    painter = painterResource(R.drawable.phone_16dp_5f6368),
                    contentDescription = null
                )
                Text(
                    text = phoneNumber,
                    modifier = Modifier.padding(start = 16.dp),
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold
                )
            }
            Row (
                Modifier.padding(top = 6.dp)
            ){
                Icon(
                    painter = painterResource(R.drawable.share_16dp_5f6368),
                    contentDescription = null
                )
                Text(
                    text = socialMedia,
                    modifier = Modifier.padding(start = 16.dp),
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold
                )
            }
            Row (
                Modifier.padding(top = 6.dp)
            ){
                Icon(
                    painter = painterResource(R.drawable.email_16dp_5f6368),
                    contentDescription = null
                )
                Text(
                    text = email,
                    modifier = Modifier.padding(start = 16.dp),
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BuildUiComposableTheme {
        CardBusiness()
    }
}