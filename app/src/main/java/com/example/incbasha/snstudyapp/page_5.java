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
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class page_5 extends AppCompatActivity {

    boolean back2Page =  false;
    CheckBox TxtCardiovascular1,TxtCardiovascular2,TxtCardiovascular3,TxtCardiovascular4,TxtCardiovascular5,TxtOcularHistory1,TxtOcularHistory2,TxtOcularHistory3,TxtOcularHistory4;
    StringBuilder Cardiovascular = new StringBuilder();
    StringBuilder TxtOcularHistory = new StringBuilder();
    EditText BP,StatinText;
    RadioButton StatinNo,StatinYes,TxtParentalDiabeticHistory1,TxtParentalDiabeticHistory2,TxtParentalDiabeticHistory3;
    RadioGroup StatinRdBtnGrp,ParentalDiabeticHistoryRdBtnGrp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_5);
        Bundle bun = getIntent().getExtras();
                if(bun!= null)
                {
                    back2Page = bun.getBoolean("back2Page");
                }

        // cardiovascular

         TxtCardiovascular1 = (CheckBox)findViewById(R.id.TxtCardiovascular1);
         TxtCardiovascular2 = (CheckBox)findViewById(R.id.TxtCardiovascular2);
         TxtCardiovascular3 = (CheckBox)findViewById(R.id.TxtCardiovascular3);
         TxtCardiovascular4 = (CheckBox)findViewById(R.id.TxtCardiovascular4);
         TxtCardiovascular5 = (CheckBox)findViewById(R.id.TxtCardiovascular5);

        if(!PreferanceManager.getString(Config.KEY_CardiovascularDisease,page_5.this).equals("")) {
            String[] dummy = PreferanceManager.getString(Config.KEY_CardiovascularDisease, page_5.this).split(",");
            for (int i = 0; i < (dummy.length); i++) {
                switch (dummy[i]) {
                    case "1. None":
                        TxtCardiovascular1.setChecked(true);
                        break;
                    case "2. Hypertension":
                        TxtCardiovascular2.setChecked(true);
                        break;
                    case "3. Myocardial infarction":
                        TxtCardiovascular3.setChecked(true);
                        break;
                    case "4. Heart failure":
                        TxtCardiovascular4.setChecked(true);
                        break;
                    case "5. Stroke":
                        TxtCardiovascular5.setChecked(true);
                        break;
                }
            }
        }


        ///Blood Pressure Medications
         BP = (EditText) findViewById(R.id.TxtBloodpressureA);
        BP.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if ((BP.getText().toString().trim() == "") || BP.getText().toString().trim().isEmpty()) {
                    BP.setError("Enter valid input ");
                }
            }
        });

        if(PreferanceManager.getString(Config.KEY_BloodPressure,page_5.this)!=""){
            BP.setText(PreferanceManager.getString(Config.KEY_BloodPressure,page_5.this));
        }



        /// Statin
         StatinNo = (RadioButton) findViewById(R.id.StatinNo);
         StatinYes = (RadioButton) findViewById(R.id.StatinYes);
         StatinText = (EditText) findViewById(R.id.TxtstatinA);

        if(PreferanceManager.getString(Config.KEY_Statin,page_5.this).equals("0. No")){
            StatinNo.setChecked(true);
            StatinYes.setChecked(false);
            StatinText.setVisibility(View.INVISIBLE);
        }
        if(PreferanceManager.getString(Config.KEY_Statin,page_5.this).equals("1. Yes")){
            StatinNo.setChecked(false);
            StatinYes.setChecked(true);
            StatinText.setVisibility(View.VISIBLE);
            StatinText.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                public void afterTextChanged(Editable editable) {
                    if ((StatinText.getText().toString().trim() == "") || StatinText.getText().toString().trim().isEmpty()) {
                        StatinText.setError("Enter valid input ");
                    }
                }
            });
            if(PreferanceManager.getString(Config.KEY_StatinTxt,page_5.this)!=""){
                StatinText.setText(PreferanceManager.getString(Config.KEY_StatinTxt,page_5.this));
            }
        }

        ////Ocular History

         TxtOcularHistory1 = (CheckBox)findViewById(R.id.TxtOcularHistory1);
         TxtOcularHistory2 = (CheckBox)findViewById(R.id.TxtOcularHistory2);
         TxtOcularHistory3 = (CheckBox)findViewById(R.id.TxtOcularHistory3);
         TxtOcularHistory4 = (CheckBox)findViewById(R.id.TxtOcularHistory4);
        if(!PreferanceManager.getString(Config.KEY_OcularHistory,page_5.this).equals("")) {
            String[] dummy = PreferanceManager.getString(Config.KEY_OcularHistory, page_5.this).split(",");
            for (int i = 0; i < (dummy.length); i++) {
                switch (dummy[i]) {
                    case "1. None":
                        TxtOcularHistory1.setChecked(true);
                        break;
                    case "2. Cataract Present":
                        TxtOcularHistory2.setChecked(true);
                        break;
                    case "3. Cataract Surgery done":
                        TxtOcularHistory3.setChecked(true);
                        break;
                    case "4. Glaucoma":
                        TxtOcularHistory4.setChecked(true);
                        break;
                }
            }
        }


        ///Parental History Of Diabetes

         TxtParentalDiabeticHistory1 = (RadioButton) findViewById(R.id.TxtParentalDiabeticHistory1);
          TxtParentalDiabeticHistory2 = (RadioButton) findViewById(R.id.TxtParentalDiabeticHistory2);
          TxtParentalDiabeticHistory3 = (RadioButton) findViewById(R.id.TxtParentalDiabeticHistory3);
        if(PreferanceManager.getString(Config.KEY_ParentalDiabeticHistory,page_5.this).equals("1. Both parents non-diabetic")){
            TxtParentalDiabeticHistory1.setChecked(true);
            TxtParentalDiabeticHistory2.setChecked(false);
            TxtParentalDiabeticHistory3.setChecked(false);
        }
        if(PreferanceManager.getString(Config.KEY_ParentalDiabeticHistory,page_5.this).equals("2. One of the parents is diabetic")){
            TxtParentalDiabeticHistory1.setChecked(false);
            TxtParentalDiabeticHistory2.setChecked(true);
            TxtParentalDiabeticHistory3.setChecked(false);
        }
        if(PreferanceManager.getString(Config.KEY_ParentalDiabeticHistory,page_5.this).equals("3. Both parents diabetic yes")){
            TxtParentalDiabeticHistory1.setChecked(false);
            TxtParentalDiabeticHistory2.setChecked(false);
            TxtParentalDiabeticHistory3.setChecked(true);
        }

        ParentalDiabeticHistoryRdBtnGrp = (RadioGroup) findViewById(R.id.ParentalDiabeticHistoryRdBtnGrp);
        ParentalDiabeticHistoryRdBtnGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i) {
                    case R.id.TxtParentalDiabeticHistory1:
                        PreferanceManager.putString(Config.KEY_ParentalDiabeticHistory,"1. Both parents non-diabetic",page_5.this);
                        break;
                    case R.id.TxtParentalDiabeticHistory2:
                        PreferanceManager.putString(Config.KEY_ParentalDiabeticHistory,"2. One of the parents is diabetic",page_5.this);
                        break;
                    case R.id.TxtParentalDiabeticHistory3:
                        PreferanceManager.putString(Config.KEY_ParentalDiabeticHistory,"3. Both parents diabetic yes",page_5.this);
                        break;
                    default:
                        PreferanceManager.putString(Config.KEY_ParentalDiabeticHistory,"1. Both parents non-diabetic",page_5.this);
                        break;
                }
            }
        });


        StatinRdBtnGrp = (RadioGroup) findViewById(R.id.StatinRdBtnGrp);
        StatinRdBtnGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i) {
                    case R.id.StatinNo:
                        PreferanceManager.putString(Config.KEY_Statin,"0. No",page_5.this);
                        break;
                    case R.id.StatinYes:
                        PreferanceManager.putString(Config.KEY_Statin,"1. Yes",page_5.this);
                        break;
                    default:
                        PreferanceManager.putString(Config.KEY_Statin,"0. No",page_5.this);
                        break;
                }
            }
        });


        Button button10 = (Button) findViewById(R.id.NextP5);
        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (BP.getError() != null) {
                    BP.setFocusable(true);
                }else {
                    if (TxtCardiovascular1.isChecked()) {
                        TxtOcularHistory.append("1. None,");
                    }
                    if (TxtCardiovascular2.isChecked()) {
                        TxtOcularHistory.append("2. Cataract Present,");
                    }
                    if (TxtCardiovascular3.isChecked()) {
                        TxtOcularHistory.append("3. Cataract Surgery done,");
                    }
                    if (TxtCardiovascular4.isChecked()) {
                        TxtOcularHistory.append("4. Glaucoma,");
                    }
                    if (TxtCardiovascular1.isChecked()) {
                        Cardiovascular.append("1. None,");
                    }
                    if (TxtCardiovascular2.isChecked()) {
                        Cardiovascular.append("2. Hypertension,");
                    }
                    if (TxtCardiovascular3.isChecked()) {
                        Cardiovascular.append("3. Myocardial infarction,");
                    }
                    if (TxtCardiovascular4.isChecked()) {
                        Cardiovascular.append("4. Heart failure,");
                    }
                    if (TxtCardiovascular5.isChecked()) {
                        Cardiovascular.append("5. Stroke,");
                    }
                    if (Cardiovascular.length() > 0 && TxtOcularHistory.length()> 0) {
                        PreferanceManager.putString(Config.KEY_CardiovascularDisease, Cardiovascular.toString(), page_5.this);
                        PreferanceManager.putString(Config.KEY_OcularHistory, TxtOcularHistory.toString(), page_5.this);
                        PreferanceManager.putString(Config.KEY_BloodPressure, BP.getText().toString(), page_5.this);
                        PreferanceManager.putString(Config.KEY_StatinTxt, StatinText.getText().toString(), page_5.this);
                        Intent i = new Intent(page_5.this, page_6.class);
                        startActivity(i);
                    } else {
                        Toast.makeText(getApplicationContext(), "Answer All Questions", Toast.LENGTH_LONG).show();
                    }
                }

                // TODO Auto-generated method stub

            }
        });

        Button button11 = (Button) findViewById(R.id.PreviousP5);
        button11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub

                if(back2Page){
                    Intent i = new Intent(page_5.this,page_3.class);
                    startActivity(i);
                }else {
                    Intent i = new Intent(page_5.this, page_4.class);
                    startActivity(i);
                }
            }
        });
    }


    public void onRadioButtonClicked(View v){
        RadioButton StatinNo = (RadioButton) findViewById(R.id.StatinNo);
        RadioButton  StatinYes = (RadioButton) findViewById(R.id.StatinYes);
        EditText StatinText = (EditText) findViewById(R.id.TxtstatinA);

        boolean  checked = ((RadioButton) v).isChecked();

        //now check which radio button is selected
        //android switch statement
        switch(v.getId()){

            case R.id.StatinNo:
                if(checked)
                    StatinText.setVisibility(View.INVISIBLE);
                StatinText.setInputType(InputType.TYPE_NULL);
                break;

            case R.id.StatinYes:
                if(checked)
                    //if android programming book is selected
                    //set the checked radio button's text style bold italic ;
                    StatinText.setVisibility(View.VISIBLE);
                StatinText.setInputType(InputType.TYPE_CLASS_TEXT);
                break;
        }
    }
}
