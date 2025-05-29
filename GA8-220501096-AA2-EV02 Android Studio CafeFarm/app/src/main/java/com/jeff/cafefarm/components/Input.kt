package com.jeff.cafefarm.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun Input(label: String) {
    OutlinedTextField(
        value = "",
        onValueChange ={},
        label = {
            Text(text = label,
                color = MaterialTheme.colorScheme.onSurface

            )
        },
        singleLine = true,
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        visualTransformation = PasswordVisualTransformation(),


        )
}