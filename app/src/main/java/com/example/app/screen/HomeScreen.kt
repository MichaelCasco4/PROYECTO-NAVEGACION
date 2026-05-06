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
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app.navegation.HomeScreen
import androidx.compose.material3.ExperimentalMaterial3Api

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(GoToDetail: () -> Unit) {

    Scaffold(topBar = { TopAppBar(title =
        { Text("Home Screen") })})
    {
        padding ->

        Box(modifier = Modifier.padding(padding).fillMaxSize()
            .background(MaterialTheme.colorScheme.primaryContainer),
            contentAlignment = Alignment.Center)
        {
            Card(modifier = Modifier.padding(24.dp),
                shape = RoundedCornerShape(28.dp),
                elevation = CardDefaults.cardElevation(10.dp))
            {
                Column(modifier = Modifier.padding(30.dp),
                    horizontalAlignment = Alignment.CenterHorizontally)
                {
                    Icon(imageVector = Icons.Default.Home,
                        contentDescription = "Home",
                        modifier = Modifier.size(72.dp),
                        tint = MaterialTheme.colorScheme.primary)

                    Spacer(modifier = Modifier.height(16.dp))

                    Text("Navegation App",
                        style = MaterialTheme.typography.bodyMedium)

                    Spacer(modifier = Modifier.height(24.dp))

                    Button(onClick = GoToDetail,
                        shape = RoundedCornerShape(12.dp))
                    {
                        Text("Go to Detail")
                    }
                }
            }
        }
    }

}