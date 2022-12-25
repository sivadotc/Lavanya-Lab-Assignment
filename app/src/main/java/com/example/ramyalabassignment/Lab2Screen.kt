package com.example.ramyalabassignment


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.ramyalabassignment.ui.theme.*
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@Composable
fun Lab2Screen(navigator: DestinationsNavigator){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Brown)){
        val windowInfo = rememberWindowInfo()
        if (windowInfo.screenWidthInfo is WindowInfo.WindowType.Compact) {
            Lab2CompactScreen(navigator)
        } else {
            Lab2MediumScreen(navigator)
        }
    }

}
