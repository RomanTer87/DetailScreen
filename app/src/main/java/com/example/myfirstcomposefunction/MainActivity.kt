package com.example.myfirstcomposefunction

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfirstcomposefunction.ui.theme.MyFirstComposeFunctionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyFirstComposeFunctionTheme {
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!",
        fontSize = 22.sp,
        color = Color.Blue
    )
}

@Composable
fun CutString(text: String) {
    Text(
        text = text,
        maxLines = 3,
        overflow = TextOverflow.Ellipsis,
        modifier = Modifier.padding(12.dp)
    )
}

@Composable
fun DifferentStyle (firstText:String, secondText:String, thirdText:String ){
    Column {
        Text(text = firstText, fontSize = 20.sp, color = Color.Red, fontWeight = FontWeight.Bold)
        Text(text = secondText, fontSize = 20.sp, color = Color.Green, fontStyle = FontStyle.Italic)
        Text(text = thirdText, fontSize = 30.sp, color = Color.Blue, textDecoration = TextDecoration.Underline)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyFirstComposeFunctionTheme {
        Column {
            Greeting("Roman")
            CutString("Lorem ipsum, Lorem ipsum,Lorem ipsum,Lorem ipsum," +
                    "Lorem ipsum,Lorem ipsum,Lorem ipsum,Lorem ipsum,Lorem ipsum," +
                    "Lorem ipsum,Lorem ipsum,Lorem ipsum,Lorem ipsum,Lorem ipsum," +
                    "Lorem ipsum,Lorem ipsum,Lorem ipsum,Lorem ipsum,Lorem ipsum," +
                    "Lorem ipsum,Lorem ipsum,Lorem ipsum,Lorem ipsum,Lorem ipsum,")
            DifferentStyle("Первый заголовок", "Второй заголовок", "Третий заголовок")
        }
    }
}