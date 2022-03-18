package com.example.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout wrapButtonFb;
    RelativeLayout wrapButtonGg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wrapButtonFb = findViewById(R.id.wrap_button_fb);
        wrapButtonGg = findViewById(R.id.wrap_button_gg);
    }
    private void processLayout(){
        wrapButtonFb.setOnClickListener((View view) -> {

        });
    }
}