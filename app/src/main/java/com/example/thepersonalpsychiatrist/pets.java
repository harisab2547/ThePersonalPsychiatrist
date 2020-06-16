package com.example.thepersonalpsychiatrist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class pets extends AppCompatActivity {

    TextView textView ;
    ImageView imageView1,imageView2,imageView3,imageView4;
    int intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pets);
        intent = getIntent().getIntExtra("scoree",0);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int scorevv = intent+1;
                Toast.makeText(pets.this, ""+scorevv, Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(pets.this,ColorClass.class);
                intent1.putExtra("scoree1",scorevv);
                startActivity(intent1);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scorevv = intent + 4;
                //  Toast.makeText(getApplicationContext()," "+scorevv,Toast.LENGTH_LONG).show();
                Intent intent1 = new Intent(pets.this,ColorClass.class);
                intent1.putExtra("scoree1",scorevv);
                startActivity(intent1);

            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scorevv = intent + 3;
                Intent intent1 = new Intent(pets.this,ColorClass.class);
                intent1.putExtra("scoree1",scorevv);
                startActivity(intent1);
                //   Toast.makeText(getApplicationContext()," "+scorevv,Toast.LENGTH_LONG).show();
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scorevv = intent + 1;
                Intent intent1 = new Intent(pets.this,ColorClass.class);
                intent1.putExtra("scoree1",scorevv);
                startActivity(intent1);
                //Toast.makeText(getApplicationContext()," "+scorevv,Toast.LENGTH_LONG).show();
            }
        });

    }
}
