package com.example.usermanual.troubleshooting;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.usermanual.R;

public class EmergencyShutdown extends AppCompatActivity {
    ImageView backBtn;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_shutdown);
        backBtn = findViewById(R.id.back_Button);
        backBtn.setOnClickListener(v->{onBackPressed();});
    }
}