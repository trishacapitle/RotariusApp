package com.example.usermanual.usermanual;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.usermanual.R;

public class UserManual extends AppCompatActivity {

    ImageView backBtn;
    CardView componentsBtn;
    CardView setUpInstructionsBtn;
    CardView operatingInstructionsBtn;
    CardView safetyPrecautionsBtn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_manual);
        initWidgets();
        setUpButtons();

        backBtn.setOnClickListener(v->{onBackPressed();});
    }

    private void setUpButtons() {
        componentsBtn.setOnClickListener(v->{startActivity(new Intent(UserManual.this, Components.class));});
        setUpInstructionsBtn.setOnClickListener(v->{startActivity(new Intent(UserManual.this, SetupInstructions.class));});
        operatingInstructionsBtn.setOnClickListener(v->{startActivity(new Intent(UserManual.this, OperatingInstructions.class));});
        safetyPrecautionsBtn.setOnClickListener(v->{startActivity(new Intent(UserManual.this, SafetyPrecautions.class));});
    }

    private void initWidgets() {
        backBtn = findViewById(R.id.back_Button);

        componentsBtn = findViewById(R.id.components_CardView);
        setUpInstructionsBtn = findViewById(R.id.setupInstruction_CardView);
        operatingInstructionsBtn = findViewById(R.id.operatingInstructions_CardView);
        safetyPrecautionsBtn = findViewById(R.id.safetyPrecautions_CardView);
    }
}