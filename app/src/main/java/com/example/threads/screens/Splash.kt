package com.example.threads.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavHostController
import com.example.threads.naviagation.Routes
import com.example.threads.R
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.delay

@Composable
fun Splash(navController: NavHostController) {
    ConstraintLayout (modifier = Modifier.fillMaxSize()){
        val (image)= createRefs()
        Image(painter = painterResource(id = R.drawable.logo), contentDescription ="logo" ,
            modifier = Modifier.constrainAs(image){
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }.size(100.dp))
    }
    LaunchedEffect(key1 = true){
        if(FirebaseAuth.getInstance().currentUser!=null)
            navController.navigate(Routes.BottomNav.routes)
        else
            navController.navigate(Routes.Login.routes)
        delay(3000)
        navController.navigate(Routes.BottomNav.routes)
    }
}