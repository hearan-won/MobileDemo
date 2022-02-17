package com.example.mobiledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NestedLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nested_layout);


        // go back to home page when back button is clicked
        View backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(v -> {
            finish();
        });

    }


}