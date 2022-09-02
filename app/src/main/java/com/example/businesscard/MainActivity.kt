package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Business()
                }
            }
        }
    }
}
@Composable
fun MidPart(){
    val image = painterResource(id = R.drawable.android_logo)
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(top=200.dp),
        //.fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(
            painter=image,
            contentDescription ="android logo",
            modifier= Modifier
                .height(130.dp)
                .wrapContentWidth(align = Alignment.CenterHorizontally)
        )
        Text(
            text= stringResource(R.string.full_name),
            fontSize=50.sp
        )
        Text(
            text= stringResource(id = R.string.title),
            fontSize=25.sp,
            color = Color(0xFF3ddc84)

        )
    }

}
@Composable
fun BottomPart(){
    Column(
        modifier=Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(bottom=100.dp),
        horizontalAlignment=Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom){
        Divider(color = Color.Gray, thickness = 1.dp)
        Row(
            modifier=Modifier.fillMaxWidth()
                .padding(start=70.dp,top=10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ){

            Icon(Icons.Rounded.Phone,contentDescription = "Phone",tint=Color(0xFF3ddc84))
            Text(modifier=Modifier.padding(start=30.dp),
                text= stringResource(R.string.phone_number),
                color=Color(0xFF3ddc84),
                fontSize=24.sp
            )

        }
        Divider(modifier=Modifier.padding(top=10.dp),color = Color.Gray, thickness = 1.dp)
        Row(
            modifier=Modifier.fillMaxWidth()
                .padding(start=70.dp,top=10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {

            Icon(Icons.Rounded.Share, contentDescription = "Phone",tint=Color(0xFF3ddc84))
            Text(modifier=Modifier.padding(start=30.dp),
                text = stringResource(R.string.socialhandle),
                color=Color(0xFF3ddc84),
                fontSize=24.sp
            )
        }
        Divider(modifier=Modifier.padding(top=10.dp),color = Color.Gray, thickness = 1.dp)
        Row(
            modifier=Modifier.fillMaxWidth()
                .padding(start=70.dp,top=10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {

            Icon(Icons.Rounded.Email, contentDescription = "Phone",tint=Color(0xFF3ddc84))
            Text(modifier=Modifier.padding(start=30.dp),
                text = stringResource(R.string.email),
                color=Color(0xFF3ddc84),
                fontSize=24.sp
            )
        }
        Divider(modifier=Modifier.padding(top=10.dp),color = Color.Gray, thickness = 1.dp)
    }
}
@Composable
fun Business() {
    Column{
        MidPart()
        BottomPart()
    }
}
