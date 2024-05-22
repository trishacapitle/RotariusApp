package com.example.usermanual.onboarding;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;

import com.example.usermanual.MainActivity;
import com.example.usermanual.R;

public class Onboarding extends AppCompatActivity {

    private ViewPager viewPager;
    private Button btnBack, btnNext;

    private final ViewPager.OnPageChangeListener viewPagerListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            // No operation
        }

        @Override
        public void onPageSelected(int position) {
            if (position > 0) {
                btnBack.setVisibility(View.VISIBLE);
            } else {
                btnBack.setVisibility(View.INVISIBLE);
            }
            if (position == 1) {
                btnNext.setText("DONE");
            } else {
                btnNext.setText("NEXT");
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {
            // No operation
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Check if terms and conditions have already been accepted
        if (isTermsAccepted()) {
            // Terms already accepted, navigate to the main activity
            navigateToMainActivity();
        } else {
            // Terms not accepted, proceed with onboarding
            initializeViews();
        }
    }

    private boolean isTermsAccepted() {
        // Retrieve the flag indicating whether terms are accepted from SharedPreferences
        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        return sharedPreferences.getBoolean("TermsAccepted", false);
    }

    private void setTermsAccepted() {
        // Set the flag indicating that terms are accepted in SharedPreferences
        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("TermsAccepted", true);
        editor.apply();
    }

    private void navigateToMainActivity() {
        // Navigate to the main activity
        Intent intent = new Intent(Onboarding.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    private void initializeViews() {
        setContentView(R.layout.activity_onboarding);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnBack = findViewById(R.id.btnBack);
        btnNext = findViewById(R.id.btnNext);

        btnBack.setOnClickListener(v -> {
            if (getItem(0) > 0) {
                viewPager.setCurrentItem(getItem(-1), true);
            }
        });

        btnNext.setOnClickListener(v -> {
            // Get the currently displayed view in the ViewPager
            View currentView = viewPager.getChildAt(viewPager.getCurrentItem());
            CheckBox checkBox = currentView.findViewById(R.id.checkBox);
            if (checkBox.isChecked()) {
                if (getItem(0) < 1) {
                    viewPager.setCurrentItem(getItem(1), true);
                } else {
                    // Set terms as accepted
                    setTermsAccepted();
                    // Navigate to the main activity
                    navigateToMainActivity();
                }
            } else {
                // Checkbox is not checked, show a message or perform appropriate action
                if (getItem(0) == 1) {
                    Toast.makeText(Onboarding.this, "Please follow the safety precautions", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Onboarding.this, "Please agree to the terms and conditions", Toast.LENGTH_SHORT).show();
                }
            }
        });

        viewPager = findViewById(R.id.viewPager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.addOnPageChangeListener(viewPagerListener);
    }

    private int getItem(int i) {
        return viewPager.getCurrentItem() + i;
    }
}
