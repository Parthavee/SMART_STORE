package com.example.storage_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText email;
    EditText password;
    Button signup;
    TextView tologin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.email_sign);
        password = findViewById(R.id.password_sign);
        signup = findViewById(R.id.signup);
        tologin = findViewById(R.id.to_login);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.getText().toString().isEmpty() && password.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Please Enter All Details!", Toast.LENGTH_LONG).show();
                }
                else{
                    Intent intent = new Intent(MainActivity.this,Login.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        tologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Login.class);
                startActivity(intent);
                finish();
            }
        });
    }
}