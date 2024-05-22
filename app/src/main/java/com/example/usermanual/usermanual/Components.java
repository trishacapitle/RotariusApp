package com.example.usermanual.usermanual;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.usermanual.R;

public class Components extends AppCompatActivity {
    ImageView backBtn;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_components);
        backBtn = findViewById(R.id.back_Button);
        backBtn.setOnClickListener(v->{onBackPressed();});
    }
}