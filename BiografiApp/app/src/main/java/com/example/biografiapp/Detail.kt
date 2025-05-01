package com.example.biografiapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import com.example.biografiapp.R

@Composable
fun DetailScreen(navController: NavController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(24.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.foto),
                contentDescription = "Foto Mahasiswa",
                modifier = Modifier
                    .size(250.dp)
                    .align(Alignment.CenterHorizontally)
                    .padding(vertical = 16.dp)
            )

            Text("Nama: Firda Khoirunisa")
            Text("NIM: 2310817220025")
            Text("Program Studi: Teknologi Informasi")
            Text("Semester: 4")
            Text("Alamat: Banjarbaru")
            Text("No HP: 08123456789")

            Spacer(modifier = Modifier.height(42.dp))

            Button(
                onClick = { navController.navigate("home") },
                modifier = Modifier.align(Alignment.Start)
            ) {
                Text("Kembali")
            }

            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}