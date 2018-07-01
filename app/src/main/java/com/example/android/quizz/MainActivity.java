package com.example.android.quizz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // These are the global variables
    int score = 0;
    //Declare the answers for  for the edit text options
    String q8 = "Kenyatta";
    String q9 = "Nairobi";
    String q10 = "Two";

    Button buttonSubmit;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // layout instances
        buttonSubmit = (Button) findViewById(R.id.btnSubmit);

        /*
            Submit Button
        */
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                if (((RadioButton)findViewById(R.id.binary)).isChecked()) {score++;}
                if (((RadioButton)findViewById(R.id.big_o_notation)).isChecked()) {score++;}
                if (((RadioButton)findViewById(R.id.html)).isChecked()) {score++;}
                if (((RadioButton)findViewById(R.id.image2)).isChecked()) {score++;}
                if (((CheckBox) findViewById(R.id.egypt)).isChecked() && ((CheckBox) findViewById(R.id.malawi)).isChecked()){score++;}
                if (((CheckBox) findViewById(R.id.mergesort)).isChecked() && ((CheckBox) findViewById(R.id.quicksort)).isChecked()){score++;}
                if (((CheckBox) findViewById(R.id.Char)).isChecked() && ((CheckBox) findViewById(R.id.integer)).isChecked()){score++;}

                // get answers from the edit text
                EditText questionEight = (EditText) findViewById(R.id.question_8);
                String questionEightAnswer = questionEight.getText().toString();

                EditText questionNine = (EditText) findViewById(R.id.question_9);
                String questionNineAnswer = questionNine.getText().toString();

                EditText questionTen = (EditText) findViewById(R.id.question_10);
                String questionTenAnswer = questionTen.getText().toString();

                if (questionEightAnswer.equalsIgnoreCase(q8)) {
                    score++;
                }
                if (questionNineAnswer.equalsIgnoreCase(q9)) {
                    score++;
                }
                if (questionTenAnswer.equalsIgnoreCase(q10)) {
                    score++;
                }

                {displayResult(score);}}


        });}
    private void displayResult(int score) {
        String message = "You scored " + score;
        message += " out of 10";
        message += "\nWell done!";
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0 , 0);
        toast.show();
    }


    }






