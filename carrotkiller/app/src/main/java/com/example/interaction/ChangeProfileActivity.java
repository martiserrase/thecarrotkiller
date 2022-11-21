package com.example.interaction;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ChangeProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.changeprofile);

        Button photo_button = findViewById(R.id.change_photo);
        Button cancel_button = findViewById(R.id.cancel_button);
        Button save_button = findViewById(R.id.save_button);

        photo_button.setOnClickListener(view -> Toast.makeText(ChangeProfileActivity.this, "Saltaría una pestaña para seleccionar foto??", Toast.LENGTH_SHORT).show());

        cancel_button.setOnClickListener(view -> {
            Intent intent = new Intent(ChangeProfileActivity.this, ProfileActivity.class);
            startActivity(intent);
        });

        save_button.setOnClickListener(view -> {
            // tendríamos que guardar la info en la base de datos
            Intent intent = new Intent(ChangeProfileActivity.this, ProfileActivity.class);
            startActivity(intent);
        });

    }
}