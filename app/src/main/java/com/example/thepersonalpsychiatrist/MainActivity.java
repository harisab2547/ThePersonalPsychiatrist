package com.example.thepersonalpsychiatrist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            public void run() {

                StartNew();
                finish();

                //  notify11();
                //  startService(new Intent(getApplicationContext(), InfoServices.class));
            }
        }, 3000);



    }




    private void StartNew(){
        Intent intent = new Intent(this,UserAdmin.class);
        startActivity(intent);
    }

}
