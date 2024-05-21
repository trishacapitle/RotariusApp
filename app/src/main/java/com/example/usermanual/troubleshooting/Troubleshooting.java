package com.example.usermanual.troubleshooting;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.usermanual.R;

public class Troubleshooting extends AppCompatActivity {
    ImageView backBtn;
    CardView powerIssuesBtnBtn;
    CardView servoMotorIssuesBtn;
    CardView stepperMotorIssuesBtn;
    CardView connectivityIssuesBtn;
    CardView movementIssuesBtn;
    CardView generalMaintenanceBtn;
    CardView emergencyShutdownBtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_troubleshooting);

       initWidgets();
       setUpButtons();

        backBtn.setOnClickListener(v->{onBackPressed();});


    }

    private void setUpButtons() {
        powerIssuesBtnBtn.setOnClickListener(v->{startActivity(new Intent(Troubleshooting.this, PowerIssues.class));});
        stepperMotorIssuesBtn.setOnClickListener(v->{startActivity(new Intent(Troubleshooting.this, StepperMotorIssues.class));});
        servoMotorIssuesBtn.setOnClickListener(v->{startActivity(new Intent(Troubleshooting.this, ServoMotorIssues.class));});
        connectivityIssuesBtn.setOnClickListener(v->{startActivity(new Intent(Troubleshooting.this, ConnectivityIssues.class));});
        movementIssuesBtn.setOnClickListener(v->{startActivity(new Intent(Troubleshooting.this, MovementIssues.class));});
        generalMaintenanceBtn.setOnClickListener(v->{startActivity(new Intent(Troubleshooting.this, GeneralMaintenance.class));});
        emergencyShutdownBtn.setOnClickListener(v->{startActivity(new Intent(Troubleshooting.this, EmergencyShutdown.class));});
    }

    private void initWidgets() {
        backBtn = findViewById(R.id.back_Button);

        powerIssuesBtnBtn = findViewById(R.id.powerIssues_CardView);
        stepperMotorIssuesBtn = findViewById(R.id.stepperMotorIssues_CardView);
        servoMotorIssuesBtn = findViewById(R.id.servoMotorIssue_CardView);
        connectivityIssuesBtn = findViewById(R.id.connectivityIssues_CardView);
        movementIssuesBtn = findViewById(R.id.movementIssues_CardView);
        generalMaintenanceBtn = findViewById(R.id.generalMaintenance_CardView);
        emergencyShutdownBtn  = findViewById(R.id.emergencyShutdown_CardView);
    }
}