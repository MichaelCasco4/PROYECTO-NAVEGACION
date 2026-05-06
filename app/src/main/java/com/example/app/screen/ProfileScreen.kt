package com.example.app.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.app.navegation.ProfileScreen

@Composable
fun ProfileScreen(GoBackHome: () -> Unit, GoBack: () -> Unit){

    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center)
    {
        Column(horizontalAlignment = Alignment.CenterHorizontally)
        {
            Text("Profile Screen",
                style = MaterialTheme.typography.headlineMedium)

            Spacer(modifier = Modifier.height(20.dp))

            Button(onClick = GoBackHome)
            {
                Text("Go Back Home")
            }

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedButton(onClick = GoBack)
            {
                Text("Go Back")
            }
        }
    }

}