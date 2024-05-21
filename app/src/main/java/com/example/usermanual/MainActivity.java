package com.example.usermanual;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

import com.example.usermanual.maintenance.MaintenanceManual;
import com.example.usermanual.startup.StartUp;
import com.example.usermanual.troubleshooting.Troubleshooting;
import com.example.usermanual.usermanual.UserManual;

public class MainActivity extends AppCompatActivity {
    CardView userManualBtn, troubleShootBtn, learningMaterialsBtn, startUpBtn, maintenanceBtn, rotariusBtn, reviewBtn, qrBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidgets();
        setUpButtons();
    }

    private void setUpButtons() {
        userManualBtn.setOnClickListener(v->{startActivity(new Intent(MainActivity.this, UserManual.class));});
        troubleShootBtn.setOnClickListener(v->{startActivity(new Intent(MainActivity.this, Troubleshooting.class));});
        learningMaterialsBtn.setOnClickListener(v->{startActivity(new Intent(MainActivity.this, LearningMaterials.class));});
        startUpBtn.setOnClickListener(v->{startActivity(new Intent(MainActivity.this, StartUp.class));});
        maintenanceBtn.setOnClickListener(v->{startActivity(new Intent(MainActivity.this, MaintenanceManual.class));});
        rotariusBtn.setOnClickListener(v->{startActivity(new Intent(MainActivity.this, Rotarius.class));});
        reviewBtn.setOnClickListener(v->{startActivity(new Intent(MainActivity.this, ReviewSection.class));});
        qrBtn.setOnClickListener(v->{startActivity(new Intent(MainActivity.this, QRCode.class));});
    }

    private void initWidgets() {
        userManualBtn = findViewById(R.id.userManualCard);
        troubleShootBtn = findViewById(R.id.troublesCard);
        learningMaterialsBtn = findViewById(R.id.learningCard);
        startUpBtn = findViewById(R.id.startCard);
        maintenanceBtn = findViewById(R.id.maintenanceCard);
        rotariusBtn = findViewById(R.id.rotariusCard);
        reviewBtn = findViewById(R.id.reviewCard);
        qrBtn = findViewById(R.id.qrCard);
    }
}