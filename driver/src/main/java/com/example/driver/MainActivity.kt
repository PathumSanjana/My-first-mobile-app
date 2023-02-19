package com.example.driver

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.driver.ui.theme.First_Mobile_AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            First_Mobile_AppTheme {
                // A surface container using the 'background' color from the theme
                TwoGreetings()
            }
        }
    }
}
@Composable
fun TwoGreetings(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column() {
        Greeting("Pathum")
        Greeting("Sanjana")
        Button(onClick = {
            Log.d("TwoGreetings","You clicked")
        }) {
            Text(text = "Click on this")
        }    
        }
    }
}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name Welcome!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewLight() {
    First_Mobile_AppTheme {
        TwoGreetings()
    }
}

/*@Preview(showBackground = true)
@Composable
fun DefaultPreviewDark() {
    First_Mobile_AppTheme(darkTheme = true) {
        Greeting("Pathum Sanjana")
    }
}*/