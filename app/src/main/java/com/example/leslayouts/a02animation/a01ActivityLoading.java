package com.example.leslayouts.a02animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.leslayouts.R;

public class a01ActivityLoading extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a01);
        ImageView imageView = findViewById(R.id.image_view);
        imageView.animate().alpha(1).rotation(3600).setDuration(2000);
    }
}