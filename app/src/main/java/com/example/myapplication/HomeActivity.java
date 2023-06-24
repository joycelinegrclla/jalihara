package com.example.myapplication;

<<<<<<< Updated upstream
=======
<<<<<<< HEAD
>>>>>>> Stashed changes
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

<<<<<<< Updated upstream
=======
=======
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

>>>>>>> 4caa13fbe773ad04ac5408fe3d43c411d5b306d1
>>>>>>> Stashed changes
public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<<<<<<< Updated upstream
=======
<<<<<<< HEAD
>>>>>>> Stashed changes
        setContentView(R.layout.activity_main);
        // Mengambil username dari Intent
        Intent intent = getIntent();
        String username = intent.getStringExtra("USERNAME");

        // Menampilkan pesan selamat datang yang mengandung username
        TextView welcomeTextView = findViewById(R.id.welcomeTextView);
        welcomeTextView.setText("Welcome, " + username + "!");
<<<<<<< Updated upstream
=======
=======
        setContentView(R.layout.home);
>>>>>>> 4caa13fbe773ad04ac5408fe3d43c411d5b306d1
>>>>>>> Stashed changes
    }
}