package com.example.usermanual.startup;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.usermanual.R;

public class StartUp extends AppCompatActivity {

    ImageView backBtn;
    CardView preStartBtn, startProdBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_up);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        initWidgets();
        setUpButtons();

        backBtn.setOnClickListener(v-> onBackPressed());
    }

    private void setUpButtons() {
        preStartBtn.setOnClickListener(v-> startActivity(new Intent(StartUp.this, PreStartCheck.class)));
        startProdBtn.setOnClickListener(v-> startActivity(new Intent(StartUp.this, StartProd.class)));
    }

    private void initWidgets() {
        backBtn = findViewById(R.id.back_Button);

        preStartBtn = findViewById(R.id.preStartCard);
        startProdBtn = findViewById(R.id.startCard);
    }
}