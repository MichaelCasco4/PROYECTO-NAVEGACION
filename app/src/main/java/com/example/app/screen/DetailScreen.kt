package com.example.app.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun DetailScreen(GoToProfile: () -> Unit, GoBackHome: () -> Unit){

    Scaffold(topBar = { TopAppBar(title =
       { Text("Detail Screen") })})
    {
        padding ->

        Box(modifier = Modifier.padding(padding).fillMaxSize()
            .background(MaterialTheme.colorScheme.secondaryContainer),
            contentAlignment = Alignment.Center)
        {
            Card(modifier = Modifier.padding(30.dp),
                shape = RoundedCornerShape(28.dp),
                elevation = CardDefaults.cardElevation(10.dp))
            {
                Column(modifier = Modifier.padding(30.dp),
                    horizontalAlignment = Alignment.CenterHorizontally)
                {
                    Icon(imageVector = Icons.Default.Info,
                        contentDescription = "Details",
                        modifier = Modifier.size(72.dp),
                        tint = MaterialTheme.colorScheme.secondary)

                    Spacer(modifier = Modifier.height(16.dp))

                    Text("Detail Screen",
                        style = MaterialTheme.typography.headlineMedium,
                        fontWeight = FontWeight.Bold)

                    Text(text = "Here you can see information about this app. ",
                        style = MaterialTheme.typography.bodyMedium)

                    Spacer(modifier = Modifier.height(24.dp))

                    Button(onClick = GoToProfile,
                        shape = RoundedCornerShape(12.dp))
                    {
                        Text("Go to Profile")

                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    OutlinedButton(onClick = GoBackHome)
                    {
                        Text("Go Back Home")
                    }

                }
            }
        }
    }

}