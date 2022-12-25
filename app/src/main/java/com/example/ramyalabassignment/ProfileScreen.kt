package com.example.ramyalabassignment

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.ramyalabassignment.ui.theme.*

@Composable
fun ProfileScreen(){
    Box(modifier = Modifier
        .fillMaxSize()
        ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
        ) {
            PhotoAndName()
            DetailSection()
            Spacer(modifier = Modifier.height(20.dp))
            AboutMe()

        }
    }
}

@Composable
fun PhotoAndName(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 15.dp, vertical = 30.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painterResource(id = R.drawable.girl), contentDescription = null, modifier = Modifier.size(150.dp))
        Text(text = "Ramya", style = Typography.h1)
    }
}

@Composable
fun DetailSection(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 40.dp, vertical = 15.dp),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .clip(RoundedCornerShape(30.dp))
                .background(ButtonBlue),
            contentAlignment = Alignment.Center
        ){
            Text(text = "WIMS 2019", style = Typography.h2, modifier = Modifier.padding(15.dp), color = TextWhite)
        }
        Spacer(modifier = Modifier.width(25.dp))
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .clip(RoundedCornerShape(30.dp))
                .background(ButtonBlue),
            contentAlignment = Alignment.Center
        ){
            Text(text = "KOCHI", style = Typography.h2, modifier = Modifier.padding(15.dp), color = TextWhite)
        }

    }
}

@Composable
fun AboutMe() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "ABOUT ME", style = Typography.h1)
        Box(
            modifier = Modifier
                .padding(15.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(20.dp))
                .background(LightGreen1), contentAlignment = Alignment.Center
        ) {
            Text(
                text = stringResource(id = R.string.about_me),
                style = Typography.h2,
                modifier = Modifier.padding(15.dp), textAlign = TextAlign.Justify
            )
        }
    }
}