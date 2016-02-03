package com.example.aubre.eightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class AnswerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(4);

        switch (randomNumber){
            case 0:
              getString(R.string.No);
                getColor(R.color.Red);
               return;

            case 1:
               getString(R.string.NOT);
                getColor(R.color.Gray);
                 return;

            case 2:
                getString(R.string.Yes);
                getColor(R.color.Blue);
                 return;

            case 3:
                getString(R.string.Got_it);
                getColor(R.color.Green);
                return;

        }



    }
}
