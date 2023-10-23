package com.example.leslayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.leslayouts.a01layout.F01FrameActivity;
import com.example.leslayouts.a01layout.L01LinearActivity;
import com.example.leslayouts.a01layout.R01RelativeActivity;

public class HomeActivity extends AppCompatActivity {

    Button btnLinearLayout;
    Button btnFrameLayout;
    Button btnRelativeLayout;

    private void initUI() {
        btnLinearLayout = findViewById(R.id.btn_linear_layout);
        btnFrameLayout = findViewById(R.id.btn_frame_layout);
        btnRelativeLayout = findViewById(R.id.btn_relative_layout);
    }

    //Gestion boutons
    private void setBtnLinearLayout() {
        btnLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(HomeActivity.this, L01LinearActivity.class);
                startActivity(intent1);
            }
        });
    }
    private void setBtnFrameLayout() {
        btnFrameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(HomeActivity.this, F01FrameActivity.class);
                startActivity(intent2);
            }
        });
    }
    private void setBtnRelativeLayout() {
        btnRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(HomeActivity.this, R01RelativeActivity.class);
                startActivity(intent3);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initUI();
        setBtnLinearLayout();
        setBtnFrameLayout();
        setBtnRelativeLayout();
    }
}