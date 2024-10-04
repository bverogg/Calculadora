package com.bverog.calculadora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.ColumnScopeInstance.weight
//import androidx.compose.foundation.layout.FlowColumnScopeInstance.weight
//import androidx.compose.foundation.layout.FlowRowScopeInstance.weight
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bverog.calculadora.ui.theme.CalculadoraTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyCalculadora()
                }

        }
    }
}


@Preview(showBackground = true)
@Composable
fun MyCalculadora() {
        Column(modifier = Modifier.fillMaxSize()){
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(50.dp)){
                Spacer(modifier = Modifier.width(20.dp))
            }

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)){
                CalculatorButton("1")
                CalculatorButton("2")
                CalculatorButton("3")
                CalculatorButton("+")
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)){
                CalculatorButton("4")
                CalculatorButton("5")
                CalculatorButton("6")
                CalculatorButton("-")
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)){
                CalculatorButton("7")
                CalculatorButton("8")
                CalculatorButton("9")
                CalculatorButton("*")
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)){
                CalculatorButton("0")
                CalculatorButton("C")
                CalculatorButton("=")
                CalculatorButton("/")
            }
        }
}
@Composable
fun CalculatorButton(label: String) {
    Button(
        onClick = { /* Manejar clic en el botón */ },
        shape = CircleShape, // Forma circular
        modifier = Modifier
            .padding(start = 16.dp, top = 8.dp, end = 16.dp, bottom = 8.dp)// Espacio entre botones
            .background(Color(0xFF6200EE), CircleShape) // Color morado y forma circular
    ) {
        Text(text = label,
            fontSize = 24.sp,
            color = Color.White,
            modifier = Modifier
                .padding(top = 10.dp, bottom = 10.dp)) // Tamaño de fuente para los botones
    }
}
