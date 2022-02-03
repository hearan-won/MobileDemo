package com.example.mobiledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent i;
        switch(view.getId()) {
            case R.id.nlButton:
                i = new Intent(this, NestedLayoutActivity.class);
                break;
            default:
                i = new Intent(this, NestedLayoutActivity.class);

        }
        startActivity(i);
    }
}