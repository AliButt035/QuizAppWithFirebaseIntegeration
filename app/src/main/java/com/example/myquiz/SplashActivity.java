package com.example.myquiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private TextView appName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        appName=findViewById(R.id.appName);

        Typeface typeface = ResourcesCompat.getFont(this, R.font.blacklist);
        appName.setTypeface(typeface);

        Animation anim= AnimationUtils.loadAnimation(this,R.anim.myanim);
        appName.setAnimation(anim);


        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(3000);


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Intent intent=new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);

            }
        }).start();
    }
}