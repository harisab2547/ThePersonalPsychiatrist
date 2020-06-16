package com.example.thepersonalpsychiatrist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class StatementActivity extends AppCompatActivity {
    Button button1,button2,button3,button4;
    TextView question;
    private Questions mQuestions = new Questions();
    private String mAnswer;
    private int mQuestionsLength = mQuestions.mQuestions.length;
    Random r = new Random();
int score =0;
int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statement);
        question = findViewById(R.id.question);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        updateQuestions(r.nextInt(20));

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                counter = counter + 1;

                score = 0;

                if (counter == 4){
                    Intent intent = new Intent(getApplicationContext(),picture.class);
                    intent.putExtra("score",score);
                    startActivity(intent);
                }

              updateQuestions(r.nextInt(20));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = counter + 1;
                score = score +1;
                if (counter == 4){
                    Intent intent = new Intent(getApplicationContext(),picture.class);
                    intent.putExtra("score",score);
                    startActivity(intent);
                }
                updateQuestions(r.nextInt(20));
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = counter + 1;
                score = score+2;
                if (counter == 4){
                    Intent intent = new Intent(getApplicationContext(),picture.class);
                    intent.putExtra("score",score);
                    startActivity(intent);
                }

                updateQuestions(r.nextInt(20));
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = counter + 1;
                score = score+3;
                if (counter == 4){
                    Intent intent = new Intent(getApplicationContext(),picture.class);
                    intent.putExtra("score",score);
                    startActivity(intent);
                }
                updateQuestions(r.nextInt(20));
            }
        });
    }
        private void updateQuestions (int num){
            question.setText(mQuestions.getQuestions(num));
      button1.setText(mQuestions.getChoices1(num));
            button2.setText(mQuestions.getChoices2(num));
            button3.setText(mQuestions.getChoices3(num));
            button4.setText(mQuestions.getChoices4(num));


        }


}
