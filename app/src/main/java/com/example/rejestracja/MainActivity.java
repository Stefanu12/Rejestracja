package com.example.rejestracja;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView message = findViewById(R.id.message);
        EditText emailField = findViewById(R.id.email);
        EditText passwordField1 = findViewById(R.id.password_1);
        EditText passwordField2 = findViewById(R.id.password_2);
        Button submitButton = findViewById(R.id.button);

        message.setText("Autor: Stefan Urbaniak");

        submitButton.setOnClickListener(v -> {
            String email = emailField.getText().toString().trim();
            String password1 = passwordField1.getText().toString().trim();
            String password2 = passwordField2.getText().toString().trim();

            if (!email.contains("@") || !email.contains(".")) {
                message.setText("Nieprawidłowy adres e-mail");
            }
            else if (!password1.equals(password2)) {
                message.setText("Hasła się różnią");
            }
            else {
                message.setText("Witaj " + email);
            }
        });
    }
}
