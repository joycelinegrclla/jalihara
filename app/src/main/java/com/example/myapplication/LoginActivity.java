package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity{
    private EditText usernameEditText, passwordEditText;
    private Button loginButton;
    private TextView pesan_error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);
        pesan_error = findViewById(R.id.pesan_error);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

                if (username.isEmpty()) {
                    pesan_error.setText("Please fill the username");
                    pesan_error.setVisibility(View.VISIBLE);
                    usernameEditText.requestFocus();
                    return;
                }

                if (username.length() <=5){
                    pesan_error.setText("Username length must be more than 5");
                    pesan_error.setVisibility(View.VISIBLE);
                    usernameEditText.requestFocus();
                    return;
                }

                if (password.isEmpty()) {
                    pesan_error.setText("Please fill the password");
                    pesan_error.setVisibility(View.VISIBLE);
                    usernameEditText.requestFocus();
                    return;
                }

                if (password.length() <= 8) {
                    pesan_error.setText("Password length must be more than 8");
                    pesan_error.setVisibility(View.VISIBLE);
                    usernameEditText.requestFocus();
                    return;
                }

                // If both username and password are valid, go to home activity
                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                intent.putExtra("USERNAME", username);
                startActivity(intent);
                finish();
            }
        });
    }
}
