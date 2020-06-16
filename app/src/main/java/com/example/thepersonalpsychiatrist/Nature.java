package com.example.thepersonalpsychiatrist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Nature extends AppCompatActivity {
    TextView textView;
    ImageView imageView5,imageView6,imageView7,imageView8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nature);

        final int intent = getIntent().getIntExtra("scoree2",0);


        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);

       // Toast.makeText(this, ""+intent, Toast.LENGTH_LONG).show();
        imageView5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int scorevv = intent+1;
                Intent intent1 = new Intent(Nature.this,AccessoriesBoys.class);
                intent1.putExtra("scoree3",scorevv);
                startActivity(intent1);
            }
        });
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scorevv = intent + 4;
                //  Toast.makeText(getApplicationContext()," "+scorevv,Toast.LENGTH_LONG).show();
                Intent intent1 = new Intent(Nature.this,AccessoriesBoys.class);
                intent1.putExtra("scoree3",scorevv);
                startActivity(intent1);

            }
        });
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scorevv = intent + 3;
                Intent intent1 = new Intent(Nature.this,AccessoriesBoys.class);
                intent1.putExtra("scoree3",scorevv);
                startActivity(intent1);
                //   Toast.makeText(getApplicationContext()," "+scorevv,Toast.LENGTH_LONG).show();
            }
        });
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scorevv = intent + 1;
                Intent intent1 = new Intent(Nature.this,AccessoriesBoys.class);
                intent1.putExtra("scoree3",scorevv);
                startActivity(intent1);
                //Toast.makeText(getApplicationContext()," "+scorevv,Toast.LENGTH_LONG).show();
            }
        });
    }
}

