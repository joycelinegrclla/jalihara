package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    EditText username;
    EditText quantity;
    RadioGroup boothType;
    TextView errorMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form);

        username = findViewById(R.id.usernameTxt);
        quantity = findViewById(R.id.qtyTxt);
        boothType = findViewById(R.id.radioGroup);
        errorMessage = findViewById(R.id.errorMessage);

        Button submitBtn = findViewById(R.id.submitBtn);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateForm();
            }
        });
    }

    private void validateForm() {
        String customerName = username.getText().toString();
        String quantityValue = quantity.getText().toString();
        int selectedRadioButtonId = boothType.getCheckedRadioButtonId();

        if (customerName.isEmpty()) {
            errorMessage.setText("Customer name must be filled.");
            errorMessage.setVisibility(View.VISIBLE);
        } else if (quantityValue.isEmpty()) {
            errorMessage.setText("Quantity must be filled.");
            errorMessage.setVisibility(View.VISIBLE);
        } else if (Integer.parseInt(quantityValue) <= 0) {
            errorMessage.setText("Quantity must be more than 0.");
            errorMessage.setVisibility(View.VISIBLE);
        } else if (selectedRadioButtonId == -1) {
            errorMessage.setText("Booth type must be selected.");
            errorMessage.setVisibility(View.VISIBLE);
        } else {
//            returnnya masih gak bener
            redirectToHome();
            return;
        }
    }

    private void redirectToHome() {
        Intent intent = new Intent(FormActivity.this, HomeActivity.class);
        startActivity(intent);
        finish();
    }
}
