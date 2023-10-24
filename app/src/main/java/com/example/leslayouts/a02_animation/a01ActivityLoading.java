package com.example.leslayouts.a02_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.leslayouts.HomeActivity;
import com.example.leslayouts.R;
import com.example.leslayouts.a01layout.F01FrameActivity;

public class a01ActivityLoading extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a01);
        ImageView imageView = findViewById(R.id.image_view);
        imageView.animate().alpha(1).rotation(3600).setDuration(2000);
    }
}