package com.example.thepersonalpsychiatrist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button signin;
        signin = findViewById(R.id.signin);
       signin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               EditText name,password;
               name = findViewById(R.id.name);
               password = findViewById(R.id.password);
               if (name.getText().toString().equals("Shiza") && ( password.getText().toString().equals("123"))){
                   Intent intent = new Intent(getApplicationContext(),AdminLogin.class);
                   startActivity(intent);
               }
               else{
                   Toast.makeText(Login.this, "Wrong Name or Password ", Toast.LENGTH_LONG).show();
               }
           }
       });
}
    }

