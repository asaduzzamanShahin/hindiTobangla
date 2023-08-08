package com.ashahin.h2b;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;


public class SplashScreen extends AppCompatActivity {
    private SplashScreen splashScreen;
    private ProgressBar progressBar;
    private int progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide();

        setContentView(R.layout.activity_splash_screen);

        progressBar=findViewById(R.id.progressbarid);
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
            }
        });
        thread.start();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        },2000);
    }
    public void doWork(){
        for (progress=20;progress<=100; progress=progress+20){

            try {
                Thread.sleep(1000);
                progressBar.setProgress(progress);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}