package com.example.usermanual.startup;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.usermanual.R;
import com.example.usermanual.troubleshooting.ConnectivityIssues;
import com.example.usermanual.troubleshooting.Troubleshooting;

public class StartUp extends AppCompatActivity {

    ImageView backBtn;
    CardView preStartBtn, startProdBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_start_up);
        initWidgets();
        setUpButtons();

        backBtn.setOnClickListener(v->{onBackPressed();});
    }

    private void setUpButtons() {
        preStartBtn.setOnClickListener(v->{startActivity(new Intent(StartUp.this, PreStartCheck.class));});
        startProdBtn.setOnClickListener(v->{startActivity(new Intent(StartUp.this, StartProd.class));});
    }

    private void initWidgets() {
        backBtn = findViewById(R.id.back_Button);

        preStartBtn = findViewById(R.id.preStartCard);
        startProdBtn = findViewById(R.id.startCard);
    }
}