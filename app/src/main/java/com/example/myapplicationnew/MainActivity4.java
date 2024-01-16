package com.example.myapplicationnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void animate(View abc) {
        Animation a = AnimationUtils.loadAnimation(MainActivity4.this,R.anim.gourav);
        abc.startAnimation(a);
    }
}