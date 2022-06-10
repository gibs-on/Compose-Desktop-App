// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }

    MaterialTheme {


        Column(
            modifier = Modifier.fillMaxSize()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Button(onClick = {
            text = "Hello, Desktop!"

            }) {
                Text(text)
            }

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                modifier = Modifier.fillMaxSize()
                    ,
                text = "In some situations, we don’t want to allow to take screenshots or screen recordings of our android application. Here we are going to explain how to prevent Android from taking a screenshot or screen recording when the app goes to the background. Generally, when we take a screenshot, we will see a Screen Capture notification in the notification bar and you can see that screenshot in the Gallery app if you click that notification. And some of the android application we can’t take a screenshot of the visible screen because of the screen secured by the developer. In this situation, we’ll see the message in the notification bar or in the Toast over the screen. Some of the payment transfer apps or course-containing apps have this feature. In this article, we’re going to create a simple project to demonstrate how this feature works. A sample GIF is given below to get an idea about what we are going to do in this article. Note that we are going to implement this project using the Java language. "
            )
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
