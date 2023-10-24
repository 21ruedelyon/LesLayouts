package com.example.leslayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.leslayouts.a01layout.F01FrameActivity;
import com.example.leslayouts.a01layout.L01LinearActivity;
import com.example.leslayouts.a01layout.R01RelativeActivity;
import com.example.leslayouts.a02animation.a01ActivityLoading;
import com.example.leslayouts.a02animation.a02ActivitySimpson;
import com.example.leslayouts.a03list.ActivityListView;

public class HomeActivity extends AppCompatActivity {

    Button btnLinearLayout;
    Button btnFrameLayout;
    Button btnRelativeLayout;

    Button btnLoading;
    Button btnSimpson;
    Button btnLv;
    private void initUI() {
        btnLinearLayout = findViewById(R.id.btn_linear_layout);
        btnFrameLayout = findViewById(R.id.btn_frame_layout);
        btnRelativeLayout = findViewById(R.id.btn_relative_layout);
        btnLoading = findViewById(R.id.btn_loading);
        btnSimpson = findViewById(R.id.btn_simpson);
        btnLv = findViewById(R.id.btn_lv);
    }
    private void setBtnLvLayout() {
        btnLv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(HomeActivity.this, ActivityListView.class);
                startActivity(intent1);
            }
        });
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
    private void setBtnLoading() {
        btnLoading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(HomeActivity.this, a01ActivityLoading.class);
                startActivity(intent4);
            }
        });
    }
    private void setBtnSimpson() {
        btnSimpson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(HomeActivity.this, a02ActivitySimpson.class);
                startActivity(intent5);
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
        setBtnLoading();
        setBtnSimpson();
        setBtnLvLayout();
    }
}
