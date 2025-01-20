package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Profile(
                    modifier = Modifier
                )
            }
        }
    }
}

@Composable
fun Profile(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier.fillMaxSize(),
        color = Color.White
    ) {
        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Introduction(modifier)
            Spacer(modifier = Modifier.size(24.dp))
            Column (
                modifier = Modifier,
            ) {
                MailIcon(modifier)
                CallIcon(modifier)
                WebIcon(modifier)
            }
        }
    }
}

@Composable
fun Introduction(modifier: Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Image(
            painter = painterResource(R.drawable.akoiking),
            contentDescription = null,
            modifier = Modifier
                .size(400.dp)
        )
        Text(
            text = "A-KoiKING",
            modifier = modifier,
            fontSize = 64.sp
        )
        Text(
            text = "Student",
            modifier = modifier,
            fontSize = 48.sp
        )
    }
}

@Composable
fun MailIcon(modifier: Modifier){
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ){
        Icon(
            imageVector = Icons.Outlined.MailOutline,
            contentDescription = "Mail Icon",
            modifier = Modifier.size(40.dp)
        )
        Text(
            text = "a-koiking@example.com",
            modifier = modifier.padding(start = 10.dp),
            fontSize = 24.sp
        )
    }
}

@Composable
fun CallIcon(modifier: Modifier) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Outlined.Call,
            contentDescription = "Call Icon",
            modifier = Modifier.size(40.dp)
        )
        Text(
            text = "+00 (00) 000 000",
            modifier = modifier.padding(start = 10.dp),
            fontSize = 24.sp
        )
    }
}

@Composable
fun WebIcon(modifier: Modifier) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ){
        Icon(
            painter = painterResource(id = R.drawable.baseline_language_24),
            contentDescription = "Web Icon",
            modifier = Modifier.size(40.dp)
        )
        Text(
            text = "https://github.com/A-KoiKING",
            modifier = modifier.padding(start = 10.dp),
            fontSize = 20.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        Profile()
    }
}