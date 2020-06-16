package com.example.thepersonalpsychiatrist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class AccessoriesGirls extends AppCompatActivity {

    ImageView imageView13,imageView14,imageView15,imageView16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accessories_girls);
        imageView13 = findViewById(R.id.imageView13);
        imageView14 = findViewById(R.id.imageView14);
        imageView15 = findViewById(R.id.imageView15);
        imageView16 = findViewById(R.id.imageView16);

        final int intent4 = getIntent().getIntExtra("score4",0);
        imageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scorevv = intent4 + 1;
                Toast.makeText(AccessoriesGirls.this, ""+scorevv, Toast.LENGTH_LONG).show();
                ;
            }
        });
        imageView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scorevv = intent4 + 4;
                  Toast.makeText(getApplicationContext()," "+scorevv,Toast.LENGTH_LONG).show();

            }
        });
        imageView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scorevv = intent4 + 3;
                   Toast.makeText(getApplicationContext()," "+scorevv,Toast.LENGTH_LONG).show();
            }
        });
        imageView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scorevv = intent4+2;
                Toast.makeText(getApplicationContext()," "+scorevv,Toast.LENGTH_LONG).show();
            }
        });

    }
}
