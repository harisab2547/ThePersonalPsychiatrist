package com.example.thepersonalpsychiatrist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AccessoriesBoys extends AppCompatActivity {

    TextView textView1;
    ImageView imageView9,imageView10,imageView11,imageView12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accessories_boys);

        imageView9 = findViewById(R.id.imageView9);
        imageView10 = findViewById(R.id.imageView10);
        imageView11 = findViewById(R.id.imageView11);
        imageView12 = findViewById(R.id.imageView12);

        final int intent3 = getIntent().getIntExtra("scoree3",0);

        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scorevv = intent3 + 1;
                Intent intent1 = new Intent(AccessoriesBoys.this,AccessoriesGirls.class);
                intent1.putExtra("scoree4",scorevv);
                startActivity(intent1);
            }
        });
        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scorevv = intent3 + 4;
                //  Toast.makeText(getApplicationContext()," "+scorevv,Toast.LENGTH_LONG).show();
                Intent intent1 = new Intent(AccessoriesBoys.this,AccessoriesGirls.class);
                intent1.putExtra("scoree4",scorevv);
                startActivity(intent1);

            }
        });
        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scorevv = intent3 + 3;
                Intent intent1 = new Intent(AccessoriesBoys.this,AccessoriesGirls.class);
                intent1.putExtra("scoree4",scorevv);
                startActivity(intent1);
                //   Toast.makeText(getApplicationContext()," "+scorevv,Toast.LENGTH_LONG).show();
            }
        });
        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scorevv = intent3 + 1;
                Intent intent1 = new Intent(AccessoriesBoys.this,AccessoriesGirls.class);
                intent1.putExtra("scoree4",scorevv);
                startActivity(intent1);
                //Toast.makeText(getApplicationContext()," "+scorevv,Toast.LENGTH_LONG).show();
            }
        });
    }
}
