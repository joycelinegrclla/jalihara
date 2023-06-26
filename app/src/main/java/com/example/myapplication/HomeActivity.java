package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import com.google.android.material.navigation.NavigationView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

//        navigationView = findViewById(R.id.navigationView);

        // Mengambil username dari Intent
        Intent intent = getIntent();
        String username = intent.getStringExtra("USERNAME");

        // Menampilkan pesan selamat datang yang mengandung username
        TextView welcomeTextView = findViewById(R.id.welcomeTextView);
        welcomeTextView.setText("Welcome, " + username + "!");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_navbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.home:
                // Aksi yang diambil saat item "Home" diklik
                getSupportActionBar().setTitle("Jalihara");
                Intent home = new Intent(this, HomeActivity.class);
                startActivity(home);
                break;

            case R.id.aboutUs:
                // Aksi yang diambil saat item "About Us" diklik
                getSupportActionBar().setTitle("Jalihara");
                Intent aboutUs = new Intent(this, AboutUsActivity.class);
                startActivity(aboutUs);
                break;

            case R.id.logout:
                // Aksi yang diambil saat item "Logout" diklik
                Intent logout = new Intent(this, LoginActivity.class);
                startActivity(logout);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
