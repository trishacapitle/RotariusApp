package com.example.usermanual.maintenance;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.usermanual.R;
import com.example.usermanual.usermanual.Components;
import com.example.usermanual.usermanual.UserManual;

public class MaintenanceManual extends AppCompatActivity {

    ImageView backBtn;

    CardView dailyBtn, weeklyBtn, monthlyBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_maintenance_manual);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        initWidgets();
        setUpButtons();

        backBtn.setOnClickListener(v->{onBackPressed();});
    }

    private void setUpButtons() {
        dailyBtn.setOnClickListener(v->{startActivity(new Intent(MaintenanceManual.this, DailyMaintenance.class));});
        weeklyBtn.setOnClickListener(v->{startActivity(new Intent(MaintenanceManual.this, WeeklyMaintenance.class));});
        monthlyBtn.setOnClickListener(v->{startActivity(new Intent(MaintenanceManual.this, MonthlyMaintenance.class));});
    }

    private void initWidgets() {
        backBtn = findViewById(R.id.back_Button);

        dailyBtn = findViewById(R.id.dailyCard);
        weeklyBtn = findViewById(R.id.weeklyCard);
        monthlyBtn = findViewById(R.id.monthlyCard);
    }
}