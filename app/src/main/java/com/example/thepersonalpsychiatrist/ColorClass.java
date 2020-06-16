package com.example.thepersonalpsychiatrist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ColorClass extends AppCompatActivity {

    int intent2;
    TextView textView1;
    ImageView imageView1,imageView2,imageView3,imageView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_class);

        intent2 = getIntent().getIntExtra("scoree1",0);

        textView1 = findViewById(R.id.textView3);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scorevv = intent2 + 1;
                Intent intent1 = new Intent(ColorClass.this,Nature.class);
                intent1.putExtra("scoree2",scorevv);
                startActivity(intent1);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scorevv = intent2 + 4;
                //  Toast.makeText(getApplicationContext()," "+scorevv,Toast.LENGTH_LONG).show();
                Intent intent1 = new Intent(ColorClass.this,Nature.class);
                intent1.putExtra("scoree2",scorevv);
                startActivity(intent1);

            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scorevv = intent2 + 3;
                Intent intent1 = new Intent(ColorClass.this,Nature.class);
                intent1.putExtra("scoree2",scorevv);
                startActivity(intent1);
                //   Toast.makeText(getApplicationContext()," "+scorevv,Toast.LENGTH_LONG).show();
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scorevv = intent2 + 1;
                Intent intent1 = new Intent(ColorClass.this,Nature.class);
                intent1.putExtra("scoree2",scorevv);
                startActivity(intent1);
                //Toast.makeText(getApplicationContext()," "+scorevv,Toast.LENGTH_LONG).show();
            }
        });

    }
}
