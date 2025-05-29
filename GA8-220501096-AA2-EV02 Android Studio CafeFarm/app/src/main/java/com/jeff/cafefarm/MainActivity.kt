package com.jeff.cafefarm


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jeff.cafefarm.components.Input
import com.jeff.cafefarm.components.Logo
import com.jeff.cafefarm.ui.theme.CafeFarmTheme


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CafeFarmTheme() {
                Surface {

                    App2()
                }
            }

        }
    }
}
//yeferson David Cano Hernandez
@Preview(
    name = "ligthMode"
)

@Preview(
    name = "DarkMode",
    showBackground = true,
    uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES
)

@Preview(showBackground = true)
@Composable
fun App2() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Logo()
        Column(modifier = Modifier.padding(horizontal = 30.dp)) {
            Input(label = "Nombre")
            Input(label = "Correo electrónico")
            Input(label = "Contraseña")
            Boton2()
        }
    }
}

@Preview
@Composable
fun Boton2() {
    val context = LocalContext.current

    Button(
        onClick = {},
        modifier = Modifier.fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF246A4B),
            contentColor = Color(0xFFFFFFFF)
        ),
        shape = RoundedCornerShape(4.dp)

    ) {
        Text(
            style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold),
            text = "Registrar"
        )


    }
}





