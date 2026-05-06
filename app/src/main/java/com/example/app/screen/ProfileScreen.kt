package com.example.app.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.app.navegation.ProfileScreen

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun ProfileScreen(GoBackHome: () -> Unit, GoBack: () -> Unit){

    Scaffold(topBar = {TopAppBar(title =
        { Text("Profile Screen") })})
    {
        padding ->

        Box(modifier = Modifier.padding(padding).fillMaxSize()
            .background(MaterialTheme.colorScheme.tertiaryContainer),
            contentAlignment = Alignment.Center)
        {
            Card(modifier = Modifier.padding(30.dp),
                shape = RoundedCornerShape(28.dp),
                elevation = CardDefaults.cardElevation(10.dp))
            {
                Column(modifier = Modifier.padding(30.dp),
                    horizontalAlignment = Alignment.CenterHorizontally)
                {
                    Surface(shape = CircleShape,
                        color = MaterialTheme.colorScheme.tertiary,
                        modifier = Modifier.size(90.dp))
                    {
                        Icon(imageVector = Icons.Default.Person,
                            contentDescription = "Profile",
                            modifier = Modifier.size(20.dp),
                            tint = MaterialTheme.colorScheme.onTertiary)
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(text = "User summary and navigation options",
                        style = MaterialTheme.typography.bodyMedium)

                    Spacer(modifier = Modifier.height(24.dp))

                    Button(onClick = GoBackHome,
                        shape = RoundedCornerShape(12.dp))
                    {
                        Text("Go Back Home")
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    OutlinedButton(onClick = GoBack)
                    {
                        Text("Go Back")
                    }
                }
            }
        }
    }
}