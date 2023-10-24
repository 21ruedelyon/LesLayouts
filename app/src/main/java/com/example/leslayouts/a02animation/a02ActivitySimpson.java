package com.example.leslayouts.a02animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.leslayouts.R;

public class a02ActivitySimpson extends AppCompatActivity {

    ImageButton btnSimpson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a02_simpson);
        btnSimpson = findViewById(R.id.image_button);
        setBtnSimpson();
        ImageView ivSimpson = findViewById(R.id.image_view_simpson);
        ImageView ivBart = findViewById(R.id.image_view_bart);
        ivSimpson.animate().alpha(1).setStartDelay(1000).start();
        ivBart.animate().alpha(1).setStartDelay(1000).start();
        ivSimpson.animate().alpha(1).translationX(-2000).setDuration(3000);
        ivBart.animate().alpha(1).translationX(-2000).setDuration(3000);
    }
    private void setBtnSimpson() {
        btnSimpson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("JE PASSE");
                btnSimpson.animate().alpha(1).rotation(3600).setDuration(2000);
                Animation a = btnSimpson.getAnimation();
                System.out.println("A : " + a);
            }
        });
    }
}