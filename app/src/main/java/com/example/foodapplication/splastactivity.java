package com.example.foodapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class splastactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splastactivity);

        getSupportActionBar().hide();

        Thread th=new Thread(){

            public void run()
            {
                try {
                    sleep(2000);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                finally {
                    Intent in=new Intent(splastactivity.this  ,MainActivity.class);
                    startActivity(in);
                }
            }
        };th.start();
    }
}