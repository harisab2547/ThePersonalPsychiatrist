package com.example.thepersonalpsychiatrist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_admin);

        Button adminButton, userButton ;
        adminButton = findViewById(R.id.Adminbutton);
        userButton = findViewById(R.id.Userbutton);
        userButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Login.class);
                startActivity(intent);

            }
        });
        adminButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(),Userdata.class);
                startActivity(intent);
            }
        });



    }

}
