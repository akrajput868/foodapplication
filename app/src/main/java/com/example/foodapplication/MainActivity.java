package com.example.foodapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.WindowManager;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button login,register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS

        );

        getSupportActionBar().hide();

     login = findViewById(R.id.btnlogin);
     register=findViewById(R.id.btnregister);

      login.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Toast.makeText(MainActivity.this, "Login hase been clicked", Toast.LENGTH_LONG).show();

              Intent in=new Intent(MainActivity.this ,SignIn_Activity.class);
              startActivity(in);
          }
      });

      register.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Toast.makeText(MainActivity.this, "Register hase been clicked", Toast.LENGTH_LONG).show();

              Intent in2=new Intent(MainActivity.this,Signup_Activity.class);
              startActivity(in2);
          }
      });

    }
}