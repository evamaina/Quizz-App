package com.example.android.quizz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // These are the global variables
    int score = 0;
    RadioGroup radio_group1, radio_group2,radio_group3;
    RadioButton selectedRadioButton, selectedRadioButton2,selectedRadioButton3;
    CheckBox selectedCheckBox;
    Button buttonSubmit;
    CheckBox cb1, cb2, cb3, cb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb1 = (CheckBox) findViewById(R.id.cb1);
        cb2 = (CheckBox) findViewById(R.id.cb2);
        cb3 = (CheckBox) findViewById(R.id.cb3);
        cb4 = (CheckBox) findViewById(R.id.cb4);

        // layout instances
        buttonSubmit = (Button) findViewById(R.id.btnSubmit);
        radio_group1 = (RadioGroup) findViewById(R.id.radio_group1);

        /*
            Submit Button
        */
        buttonSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // get the selected RadioButton of the group
                selectedRadioButton  = (RadioButton)findViewById(radio_group1.getCheckedRadioButtonId());
                //get RadioButton text
                String yourAnswer = selectedRadioButton.getText().toString();

                // get the selected RadioButton2 of the group
                selectedRadioButton2  = (RadioButton)findViewById(radio_group2.getCheckedRadioButtonId());
                //get RadioButton text
                String yourAnswer2 = selectedRadioButton2.getText().toString();

                // get the selected RadioButton3 of the group
                selectedRadioButton3  = (RadioButton)findViewById(radio_group3.getCheckedRadioButtonId());
                //get RadioButton text
                String yourAnswer3 = selectedRadioButton3.getText().toString();

                String checkBoxChoices = selectedCheckBox.getText().toString();

                if (cb1.isChecked()) {
                    checkBoxChoices += cb1.getText().toString();
                }
                else{
                    checkBoxChoices += cb1.getText().toString();
                }

                if (cb2.isChecked()) {
                    checkBoxChoices += cb2.getText().toString() ;
                }
                else{
                    checkBoxChoices += cb2.getText().toString();
                }

                if (cb3.isChecked()) {
                    checkBoxChoices += cb3.getText().toString() ;
                }
                else{
                    checkBoxChoices += cb3.getText().toString() ;
                }

                if (cb4.isChecked()) {
                    checkBoxChoices += cb4.getText().toString();
                }
                else{
                    checkBoxChoices += cb4.getText().toString();
                }


                // display it as Toast to the user
                Toast.makeText(MainActivity.this, "Selected Radio Button is:" + yourAnswer , Toast.LENGTH_LONG).show();
                // display it as Toast to the user
                Toast.makeText(MainActivity.this, "Selected Radio Button is:" + yourAnswer2 , Toast.LENGTH_LONG).show();
                // display it as Toast to the user
                Toast.makeText(MainActivity.this, "Selected Radio Button is:" + yourAnswer3 , Toast.LENGTH_LONG).show();


                // display it as Toast to the user
                Toast.makeText(MainActivity.this, "Selected CheckBox is:" + checkBoxChoices , Toast.LENGTH_LONG).show();
            }
        });


    }


    }



