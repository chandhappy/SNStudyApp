package com.example.incbasha.snstudyapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class page_2 extends AppCompatActivity {
    EditText CigarCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_2);
        Button button4 = (Button) findViewById(R.id.NextP2);
        button4.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                //// Smoking
                RadioButton Smokingtxt1 = (RadioButton) findViewById(R.id.Smokingtxt1);
                RadioButton Smokingtxt2 = (RadioButton) findViewById(R.id.Smokingtxt2);
                RadioButton Smokingtxt3 = (RadioButton) findViewById(R.id.Smokingtxt3);
                EditText CigarCount = (EditText) findViewById(R.id.TxtSmoking1);

                String Smoking = "";
              /*  CigarCount.setFocusable(false);
                CigarCount.setEnabled(false);
                CigarCount.setCursorVisible(false);
                CigarCount.setKeyListener(null);
                if (Smokingtxt1.isChecked()) {
                    Smoking = Smokingtxt1.getText().toString();
                    CigarCount.setFocusable(false);
                    CigarCount.setEnabled(false);
                    CigarCount.setCursorVisible(false);
                    CigarCount.setKeyListener(null);
                } else if (Smokingtxt2.isChecked()) {
                    Smoking = Smokingtxt2.getText().toString();
                    CigarCount.setFocusable(false);
                    CigarCount.setEnabled(false);
                    CigarCount.setCursorVisible(false);
                    CigarCount.setKeyListener(null);
                } else if (Smokingtxt3.isChecked()) {
                    Smoking = Smokingtxt3.getText().toString();
                    CigarCount.setFocusable(true);
                    CigarCount.setEnabled(true);
                    CigarCount.setCursorVisible(true);
                }
*/
                ////Secondhandsmoke
                RadioButton SecondSmokingNo = (RadioButton) findViewById(R.id.SecondSmokingNo);
                RadioButton SecondSmokingYes = (RadioButton) findViewById(R.id.SecondSmokingYes);
                String SecondHandSmoking = "";
                if (SecondSmokingNo.isChecked()) {
                    SecondHandSmoking = SecondSmokingNo.getText().toString();
                } else if (SecondSmokingYes.isChecked()) {
                    SecondHandSmoking = SecondSmokingYes.getText().toString();
                }


                ////Physical Activity
                RadioButton PhysicalActivitytxt1 = (RadioButton) findViewById(R.id.PhysicalActivitytxt1);
                RadioButton PhysicalActivitytxt2 = (RadioButton) findViewById(R.id.PhysicalActivitytxt2);
                RadioButton PhysicalActivitytxt3 = (RadioButton) findViewById(R.id.PhysicalActivitytxt3);
                RadioButton PhysicalActivitytxt4 = (RadioButton) findViewById(R.id.PhysicalActivitytxt4);
                String PhysicalActivity = "";
                if (PhysicalActivitytxt1.isChecked()) {
                    PhysicalActivity = PhysicalActivitytxt1.getText().toString();
                } else if (PhysicalActivitytxt2.isChecked()) {
                    PhysicalActivity = PhysicalActivitytxt2.getText().toString();
                } else if (PhysicalActivitytxt3.isChecked()) {
                    PhysicalActivity = PhysicalActivitytxt3.getText().toString();
                } else if (PhysicalActivitytxt4.isChecked()) {
                    PhysicalActivity = PhysicalActivitytxt4.getText().toString();
                }

                ////Stress
                RadioButton StressNo = (RadioButton) findViewById(R.id.StressNo);
                RadioButton StressYes = (RadioButton) findViewById(R.id.StressYes);
                String Stress = "";
                if (StressNo.isChecked()) {
                    Stress = StressNo.getText().toString();
                } else if (StressYes.isChecked()) {
                    Stress = StressYes.getText().toString();
                }


                if (!Smoking.equals("") && !SecondHandSmoking.equals("") && !PhysicalActivity.equals("") && !Stress.equals("")) {
                    Intent i = new Intent(page_2.this, page_3.class);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(), "Answer All Questions", Toast.LENGTH_LONG).show();
                }

                // TODO Auto-generated method stub

            }
        });

        Button button5 = (Button) findViewById(R.id.PreviousP2);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(page_2.this, page_1.class);
                startActivity(i);
            }
        });

    }

    public void onRadioButtonClicked(View v)
    {
        //require to import the RadioButton class
        RadioButton rb1 = (RadioButton) findViewById(R.id.Smokingtxt1);
        RadioButton rb2 = (RadioButton) findViewById(R.id.Smokingtxt2);
        RadioButton rb3 = (RadioButton) findViewById(R.id.Smokingtxt3);

        //is the current radio button now checked?
        boolean  checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch(v.getId()){

            case R.id.Smokingtxt1:
                if(checked)
                    //if windows phone programming book is selected
                    //set the checked radio button's text style bold italic
                    rb1.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb2.setTypeface(null, Typeface.NORMAL);
                // reqire to import Typeface class
                rb3.setTypeface(null, Typeface.NORMAL);
                break;

            case R.id.Smokingtxt2:
                if(checked)
                   //if ios programming book is selected
                    //set the checked radio button's text style bold italic
                    rb2.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb1.setTypeface(null, Typeface.NORMAL);
                rb3.setTypeface(null, Typeface.NORMAL);
                break;

            case R.id.Smokingtxt3:
                if(checked)
                    //if android programming book is selected
                    //set the checked radio button's text style bold italic
                    rb3.setTypeface(null, Typeface.BOLD_ITALIC);
                //set the other two radio buttons text style to default
                rb1.setTypeface(null, Typeface.NORMAL);
                rb2.setTypeface(null, Typeface.NORMAL);
                CigarCount.setFocusable(true);
                CigarCount.setEnabled(true);
                CigarCount.setCursorVisible(true);
                break;
        }
    }
}
