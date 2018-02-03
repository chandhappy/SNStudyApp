package com.example.incbasha.snstudyapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class page_2 extends AppCompatActivity {
    EditText CigarCount;
    RadioButton Smokingtxt1,Smokingtxt2,Smokingtxt3,SecondSmokingNo,SecondSmokingYes,PhysicalActivitytxt1,PhysicalActivitytxt2,PhysicalActivitytxt3,PhysicalActivitytxt4,StressNo,StressYes;
    RadioGroup SmokingRadioGroup,SecondSmokingRdGrp,PhysicalActivityRdGrp,StressRdGrp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_2);
        //// Smoking
        Smokingtxt1 = (RadioButton) findViewById(R.id.Smokingtxt1);
        Smokingtxt2 = (RadioButton) findViewById(R.id.Smokingtxt2);
        Smokingtxt3 = (RadioButton) findViewById(R.id.Smokingtxt3);
        CigarCount = (EditText) findViewById(R.id.TxtSmoking1);
        if(PreferanceManager.getString(Config.KEY_Smoking,page_2.this).equals("0. Non-smoker")){
            Smokingtxt1.setChecked(true);
            Smokingtxt2.setChecked(false);
            Smokingtxt3.setChecked(false);
            CigarCount.setVisibility(View.INVISIBLE);
        }
        if(PreferanceManager.getString(Config.KEY_Smoking,page_2.this).equals("1. Former smoker")){
            Smokingtxt1.setChecked(false);
            Smokingtxt2.setChecked(true);
            Smokingtxt3.setChecked(false);
            CigarCount.setVisibility(View.INVISIBLE);
        }
        if(PreferanceManager.getString(Config.KEY_Smoking,page_2.this).equals("2. Current smoker")){
            Smokingtxt1.setChecked(false);
            Smokingtxt2.setChecked(false);
            Smokingtxt3.setChecked(true);

            CigarCount.setVisibility(View.VISIBLE);
            CigarCount.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                public void afterTextChanged(Editable editable) {
                    if ((CigarCount.getText().toString().trim() == "") || CigarCount.getText().toString().trim().isEmpty()) {
                        CigarCount.setError("Enter valid input ");
                    }
                }
            });
            if(PreferanceManager.getString(Config.KEY_SmokingCount,page_2.this)!=""){
                CigarCount.setText(PreferanceManager.getString(Config.KEY_SmokingCount,page_2.this));
            }
        }

        ////Secondhandsmoke
        SecondSmokingNo = (RadioButton) findViewById(R.id.SecondSmokingNo);
        SecondSmokingYes = (RadioButton) findViewById(R.id.SecondSmokingYes);

        if(PreferanceManager.getString(Config.KEY_SecondHandSmoke,page_2.this).equals("0. No")){
            SecondSmokingNo.setChecked(true);
            SecondSmokingYes.setChecked(false);
        }
        if(PreferanceManager.getString(Config.KEY_SecondHandSmoke,page_2.this).equals("1. Yes")){
            SecondSmokingNo.setChecked(false);
            SecondSmokingYes.setChecked(true);
        }
        ////Physical Activity
         PhysicalActivitytxt1 = (RadioButton) findViewById(R.id.PhysicalActivitytxt1);
         PhysicalActivitytxt2 = (RadioButton) findViewById(R.id.PhysicalActivitytxt2);
         PhysicalActivitytxt3 = (RadioButton) findViewById(R.id.PhysicalActivitytxt3);
         PhysicalActivitytxt4 = (RadioButton) findViewById(R.id.PhysicalActivitytxt4);
        if(PreferanceManager.getString(Config.KEY_PhysicalActivity,page_2.this).equals("0. Sedentary")){
            PhysicalActivitytxt1.setChecked(true);
            PhysicalActivitytxt2.setChecked(false);
            PhysicalActivitytxt3.setChecked(false);
            PhysicalActivitytxt4.setChecked(false);

        }
        if(PreferanceManager.getString(Config.KEY_PhysicalActivity,page_2.this).equals("1. Mild Exercise")){
            PhysicalActivitytxt1.setChecked(false);
            PhysicalActivitytxt2.setChecked(true);
            PhysicalActivitytxt3.setChecked(false);
            PhysicalActivitytxt4.setChecked(false);

        }
        if(PreferanceManager.getString(Config.KEY_PhysicalActivity,page_2.this).equals("2. Moderate Exercise")){
            PhysicalActivitytxt1.setChecked(false);
            PhysicalActivitytxt2.setChecked(false);
            PhysicalActivitytxt3.setChecked(true);
            PhysicalActivitytxt4.setChecked(false);

        }
        if(PreferanceManager.getString(Config.KEY_PhysicalActivity,page_2.this).equals("3. Vigorous or strenuous exercise")){
            PhysicalActivitytxt1.setChecked(false);
            PhysicalActivitytxt2.setChecked(false);
            PhysicalActivitytxt3.setChecked(false);
            PhysicalActivitytxt4.setChecked(true);
        }
        //Stress
         StressNo = (RadioButton) findViewById(R.id.StressNo);
         StressYes = (RadioButton) findViewById(R.id.StressYes);
        if(PreferanceManager.getString(Config.KEY_Stress,page_2.this).equals("0. No")){
            StressNo.setChecked(true);
            StressYes.setChecked(false);
        }
        if(PreferanceManager.getString(Config.KEY_Stress,page_2.this).equals("1. Yes")){
            StressNo.setChecked(false);
            StressYes.setChecked(true);
        }





        SmokingRadioGroup = (RadioGroup) findViewById(R.id.SmokingRadioGroup);
        SmokingRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i) {
                    case R.id.Smokingtxt1:
                        PreferanceManager.putString(Config.KEY_Smoking,"0. Non-smoker",page_2.this);
                        break;
                    case R.id.Smokingtxt2:
                        PreferanceManager.putString(Config.KEY_Smoking,"1. Former smoker",page_2.this);
                        break;
                    case R.id.Smokingtxt3:
                        PreferanceManager.putString(Config.KEY_Smoking,"2. Current smoker",page_2.this);
                        break;

                        default:
                        PreferanceManager.putString(Config.KEY_Smoking,"0. Non-smoker",page_2.this);
                        break;
                }
            }
        });


        SecondSmokingRdGrp = (RadioGroup) findViewById(R.id.SecondSmokingRdGrp);
        SecondSmokingRdGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i) {
                    case R.id.SecondSmokingNo:
                        PreferanceManager.putString(Config.KEY_SecondHandSmoke,"0. No",page_2.this);
                        break;
                    case R.id.SecondSmokingYes:
                        PreferanceManager.putString(Config.KEY_SecondHandSmoke,"1. Yes",page_2.this);
                        break;
                    default:
                        PreferanceManager.putString(Config.KEY_SecondHandSmoke,"0. No",page_2.this);
                        break;
                }
            }
        });


        PhysicalActivityRdGrp = (RadioGroup) findViewById(R.id.PhysicalActivityRdGrp);
        PhysicalActivityRdGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i) {
                    case R.id.PhysicalActivitytxt1:
                        PreferanceManager.putString(Config.KEY_PhysicalActivity,"0. Sedentary",page_2.this);
                        break;
                    case R.id.PhysicalActivitytxt2:
                        PreferanceManager.putString(Config.KEY_PhysicalActivity,"1. Mild Exercise",page_2.this);
                        break;
                    case R.id.PhysicalActivitytxt3:
                        PreferanceManager.putString(Config.KEY_PhysicalActivity,"2. Moderate Exercise",page_2.this);
                        break;
                    case R.id.PhysicalActivitytxt4:
                        PreferanceManager.putString(Config.KEY_PhysicalActivity,"3. Vigorous or strenuous exercise",page_2.this);
                        break;
                    default:
                        PreferanceManager.putString(Config.KEY_PhysicalActivity,"0. Sedentary",page_2.this);
                        break;
                }
            }
        });

        StressRdGrp = (RadioGroup) findViewById(R.id.StressRdGrp);
        StressRdGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i) {
                    case R.id.StressNo:
                        PreferanceManager.putString(Config.KEY_Stress,"0. No",page_2.this);
                        break;
                    case R.id.StressYes:
                        PreferanceManager.putString(Config.KEY_Stress,"1. Yes",page_2.this);
                        break;
                    default:
                        PreferanceManager.putString(Config.KEY_Stress,"0. No",page_2.this);
                        break;
                }
            }
        });






        Button button4 = (Button) findViewById(R.id.NextP2);
        button4.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                if(CigarCount.getError()!=null) {
                    PreferanceManager.putString(Config.KEY_SmokingCount, CigarCount.getText().toString(), page_2.this);
                    Intent i = new Intent(page_2.this, page_3.class);
                    startActivity(i);
                }
                else {
                    CigarCount.setError("Enter valid input");
                    CigarCount.setFocusable(true);
                }// TODO Auto-generated method stub
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
        CigarCount = (EditText) findViewById(R.id.TxtSmoking1);
        CigarCount.setVisibility(View.INVISIBLE);
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
                CigarCount.setVisibility(View.VISIBLE);
                CigarCount.setInputType(InputType.TYPE_CLASS_NUMBER);
                break;
        }
    }
}
