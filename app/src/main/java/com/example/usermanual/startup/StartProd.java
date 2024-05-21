package com.example.usermanual.startup;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.usermanual.R;

public class StartProd extends AppCompatActivity {

    CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8, checkBox9, checkBox10;
    ImageView backBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_prod);

        backBtn = findViewById(R.id.back_Button);
        backBtn.setOnClickListener(v->{onBackPressed();});

        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 = findViewById(R.id.checkBox5);
        checkBox6 = findViewById(R.id.checkBox6);
        checkBox7 = findViewById(R.id.checkBox7);
        checkBox8 = findViewById(R.id.checkBox8);
        checkBox9 = findViewById(R.id.checkBox9);
        checkBox10 = findViewById(R.id.checkBox10);

        checkBox1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                showConfirmationDialog();
            }
        });
        checkBox2.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                showConfirmationDialog();
            }
        });
        checkBox3.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                showConfirmationDialog();
            }
        });
        checkBox4.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                showConfirmationDialog();
            }
        });
        checkBox5.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                showConfirmationDialog();
            }
        });
        checkBox6.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                showConfirmationDialog();
            }
        });
        checkBox7.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                showConfirmationDialog();
            }
        });
        checkBox8.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                showConfirmationDialog();
            }
        });
        checkBox9.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                showConfirmationDialog();
            }
        });
        checkBox10.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                showConfirmationDialog();
            }
        });
    }

    private void showConfirmationDialog() {
        // Create AlertDialog.Builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        // Inflate custom layout
        View dialogView = getLayoutInflater().inflate(R.layout.confirm_dialog, null);
        builder.setView(dialogView);

        // Find views in custom layout
        TextView titleTextView = dialogView.findViewById(R.id.confirm_title);
        TextView messageTextView = dialogView.findViewById(R.id.confirm_message);
        Button positiveButton = dialogView.findViewById(R.id.btnYes);
        Button negativeButton = dialogView.findViewById(R.id.btnNo);

        // Set custom title and message
        titleTextView.setText("Confirmation");
        messageTextView.setText("Did you perform the action?");

        // Create and show the dialog
        AlertDialog dialog = builder.create();
        dialog.show();

        // Set button click listeners
        positiveButton.setOnClickListener(v -> {
            // Continue with the checked state
            dialog.dismiss();
        });
        negativeButton.setOnClickListener(v -> {
            // Revert the checked state
            checkBox1.setChecked(false);
            dialog.dismiss();
        });
    }

}