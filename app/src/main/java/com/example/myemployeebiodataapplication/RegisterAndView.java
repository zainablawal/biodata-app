package com.example.myemployeebiodataapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterAndView extends AppCompatActivity {
    private Button registerNewEmployeeBtn;
    private Button viewEmployeeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_and_view);
        registerNewEmployeeBtn = findViewById(R.id.materialButtonRegister);
        viewEmployeeBtn = findViewById(R.id.materialButtonView);
        registerNewEmployeeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegisterPage();

            }
        });

        viewEmployeeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openViewEmployee();
            }
        });

    }
    private void openRegisterPage() {
        Intent intent = new Intent(RegisterAndView.this,RegisterPage.class);
        startActivity(intent);
    }

    private void openViewEmployee() {
        Intent intent = new Intent(RegisterAndView.this,ViewEmployees.class);
        startActivity(intent);

       }
   }
