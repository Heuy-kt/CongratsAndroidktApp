package com.example.firstandroidapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstandroidapp.ui.theme.FirstandroidAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstandroidAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background){
                    GreetingImage(name = stringResource(R.string.my_name_text), from ="Abor");
                    GreetingText(
                        message=stringResource(R.string.happy_convo_text),
                        name = stringResource(R.string.my_name_text),
                        from = stringResource(R.string.signature))
                }
            }
        }
    }
}



@Composable()
fun GreetingText(message:String, name:String, from:String, modifier:Modifier= Modifier){
    Column(verticalArrangement = Arrangement.Center, modifier=modifier){
        Text( text = "$message $name", fontSize = 100.sp, lineHeight = 113.sp, textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(20.dp)
                .background(color = Color.White))
        Text( text = from, fontSize = 20.sp, modifier = Modifier
            .padding(start = 2.dp, end = 3.dp, top = 1.dp, bottom = 25.dp)
            .background(color = Color.White)
            .align(alignment = Alignment.CenterHorizontally))
    }
}

@Composable
fun GreetingImage(name:String, from:String, modifier:Modifier=Modifier){
    val image = painterResource(R.drawable.androidparty)
    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.Crop,
        alpha = 0.49F,

    )
}

@Composable
@Preview(showBackground = false)
fun GreetingImagePreview(){
    GreetingImage(name = "Ridwan", from ="Abor");
    GreetingText(message = "Happy convo", name = "Ridwan", from = "Ab.or")
}

//@Preview(showBackground = true)
//@Composable()
//fun ConvocationCardPreview(){
//    FirstandroidAppTheme {
//        Surface(color = Color.LightGray) {
//            GreetingText(message = "Happy Convocation", name = "Ridwan", from = "AB..OR")
//        }
//    }
//
//}