package com.example.incbasha.snstudyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class page_4 extends AppCompatActivity {

    EditText DiabetesTypeA;
    RadioButton DiabetesMellitusB1,DiabetesMellitusB2,DiabetesMellitusB3,DiabetesMellitusB4,ComplicationsDiabetesMellitusB1,ComplicationsDiabetesMellitusB2,ComplicationsDiabetesMellitusB3,ComplicationsDiabetesMellitusB4,PreviousDiabetestypeNo,PreviousDiabetestypeYes;
    RadioGroup DiabetesMellitusRdBtnGrp,ComplicationsDiabetestypeRdBtnGrp,PreviousDiabetestypeRdBtnGrp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_4);

        DiabetesTypeA = (EditText) findViewById(R.id.TxtDiabetestypeA);
        DiabetesTypeA.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if ((DiabetesTypeA.getText().toString().trim() == "") || DiabetesTypeA.getText().toString().trim().isEmpty()) {
                    DiabetesTypeA.setError("Enter valid input ");
                } else if (((DiabetesTypeA.getText().toString().trim())!= " " ) && (Integer.parseInt(DiabetesTypeA.getText().toString().trim()) < 0) || (Integer.parseInt(DiabetesTypeA.getText().toString().trim()) > 150)) {
                    DiabetesTypeA.setError("Values Between 1 & 150 Only ");
                }
            }
        });

        if(PreferanceManager.getString(Config.KEY_DurationDiabetes,page_4.this)!=""){
            DiabetesTypeA.setText(PreferanceManager.getString(Config.KEY_DD,page_4.this));
        }

        ///Diabetes Melitus status
         DiabetesMellitusB1 = (RadioButton) findViewById(R.id.DiabetesMellitusB1);
          DiabetesMellitusB2 = (RadioButton) findViewById(R.id.DiabetesMellitusB2);
          DiabetesMellitusB3 = (RadioButton) findViewById(R.id.DiabetesMellitusB3);
          DiabetesMellitusB4 = (RadioButton) findViewById(R.id.DiabetesMellitusB4);

        if(PreferanceManager.getString(Config.KEY_DiabetiesMellitus,page_4.this).equals("0. None / Diet controlled")){
            DiabetesMellitusB1.setChecked(true);
            DiabetesMellitusB2.setChecked(false);
            DiabetesMellitusB3.setChecked(false);
            DiabetesMellitusB4.setChecked(false);

        }
        if(PreferanceManager.getString(Config.KEY_DiabetiesMellitus,page_4.this).equals("1. Oral hypoglycaemic agents only")){
            DiabetesMellitusB1.setChecked(false);
            DiabetesMellitusB2.setChecked(true);
            DiabetesMellitusB3.setChecked(false);
            DiabetesMellitusB4.setChecked(false);

        }
        if(PreferanceManager.getString(Config.KEY_DiabetiesMellitus,page_4.this).equals("2. Insulin only")){
            DiabetesMellitusB1.setChecked(false);
            DiabetesMellitusB2.setChecked(false);
            DiabetesMellitusB3.setChecked(true);
            DiabetesMellitusB4.setChecked(false);

        }
        if(PreferanceManager.getString(Config.KEY_DiabetiesMellitus,page_4.this).equals("3. Both insulin and oral hypoglycaemic agent")){
            DiabetesMellitusB1.setChecked(false);
            DiabetesMellitusB2.setChecked(false);
            DiabetesMellitusB3.setChecked(false);
            DiabetesMellitusB4.setChecked(true);

        }

        ////Diabetes Complications

          ComplicationsDiabetesMellitusB1 = (RadioButton) findViewById(R.id.ComplicationsDiabetesMellitusB1);
          ComplicationsDiabetesMellitusB2 = (RadioButton) findViewById(R.id.ComplicationsDiabetesMellitusB2);
          ComplicationsDiabetesMellitusB3 = (RadioButton) findViewById(R.id.ComplicationsDiabetesMellitusB3);
          ComplicationsDiabetesMellitusB4 = (RadioButton) findViewById(R.id.ComplicationsDiabetesMellitusB4);

        if(PreferanceManager.getString(Config.KEY_ComplicationsDiabetiesMellitus,page_4.this).equals("1. None")){
            ComplicationsDiabetesMellitusB1.setChecked(true);
            ComplicationsDiabetesMellitusB2.setChecked(false);
            ComplicationsDiabetesMellitusB3.setChecked(false);
            ComplicationsDiabetesMellitusB4.setChecked(false);

        }
        if(PreferanceManager.getString(Config.KEY_ComplicationsDiabetiesMellitus,page_4.this).equals("2. Chronic kidney disease")){
            ComplicationsDiabetesMellitusB1.setChecked(false);
            ComplicationsDiabetesMellitusB2.setChecked(true);
            ComplicationsDiabetesMellitusB3.setChecked(false);
            ComplicationsDiabetesMellitusB4.setChecked(false);

        }
        if(PreferanceManager.getString(Config.KEY_ComplicationsDiabetiesMellitus,page_4.this).equals("3. Peripheral neuropathy(diabetic foot)")){
            ComplicationsDiabetesMellitusB1.setChecked(false);
            ComplicationsDiabetesMellitusB2.setChecked(false);
            ComplicationsDiabetesMellitusB3.setChecked(true);
            ComplicationsDiabetesMellitusB4.setChecked(false);

        }
        if(PreferanceManager.getString(Config.KEY_ComplicationsDiabetiesMellitus,page_4.this).equals("4. Diabetic retinopathy")){
            ComplicationsDiabetesMellitusB1.setChecked(false);
            ComplicationsDiabetesMellitusB2.setChecked(false);
            ComplicationsDiabetesMellitusB3.setChecked(false);
            ComplicationsDiabetesMellitusB4.setChecked(true);

        }

        //// DiabeticRetinopathy

          PreviousDiabetestypeNo = (RadioButton) findViewById(R.id.PreviousDiabetestypeNo);
          PreviousDiabetestypeYes = (RadioButton) findViewById(R.id.PreviousDiabetestypeYes);
        if(PreferanceManager.getString(Config.KEY_TreatmentDiabeticRetinopathy,page_4.this).equals("0. No")){
            PreviousDiabetestypeNo.setChecked(true);
            PreviousDiabetestypeYes.setChecked(false);
        }
        if(PreferanceManager.getString(Config.KEY_TreatmentDiabeticRetinopathy,page_4.this).equals("1. Yes")){
            PreviousDiabetestypeNo.setChecked(false);
            PreviousDiabetestypeYes.setChecked(true);

        }





        DiabetesMellitusRdBtnGrp = (RadioGroup) findViewById(R.id.DiabetesMellitusRdBtnGrp);
        DiabetesMellitusRdBtnGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i) {
                    case R.id.DiabetesMellitusB1:
                        PreferanceManager.putString(Config.KEY_DiabetiesMellitus,"0. None / Diet controlled",page_4.this);
                        break;
                    case R.id.DiabetesMellitusB2:
                        PreferanceManager.putString(Config.KEY_DiabetiesMellitus,"1. Oral hypoglycaemic agents only",page_4.this);
                        break;
                    case R.id.DiabetesMellitusB3:
                        PreferanceManager.putString(Config.KEY_DiabetiesMellitus,"2. Insulin only",page_4.this);
                        break;
                    case R.id.DiabetesMellitusB4:
                        PreferanceManager.putString(Config.KEY_DiabetiesMellitus,"3. Both insulin and oral hypoglycaemic agent",page_4.this);
                        break;
                    default:
                        PreferanceManager.putString(Config.KEY_DiabetiesMellitus,"0. None / Diet controlled",page_4.this);
                        break;
                }
            }
        });

        ComplicationsDiabetestypeRdBtnGrp = (RadioGroup) findViewById(R.id.ComplicationsDiabetestypeRdBtnGrp);
        ComplicationsDiabetestypeRdBtnGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i) {
                    case R.id.ComplicationsDiabetesMellitusB1:
                        PreferanceManager.putString(Config.KEY_ComplicationsDiabetiesMellitus,"1. None",page_4.this);
                        break;
                    case R.id.ComplicationsDiabetesMellitusB2:
                        PreferanceManager.putString(Config.KEY_ComplicationsDiabetiesMellitus,"2. Chronic kidney disease",page_4.this);
                        break;
                    case R.id.ComplicationsDiabetesMellitusB3:
                        PreferanceManager.putString(Config.KEY_ComplicationsDiabetiesMellitus,"3. Peripheral neuropathy(diabetic foot)",page_4.this);
                        break;
                    case R.id.ComplicationsDiabetesMellitusB4:
                        PreferanceManager.putString(Config.KEY_ComplicationsDiabetiesMellitus,"4. Diabetic retinopathy",page_4.this);
                        break;
                    default:
                        PreferanceManager.putString(Config.KEY_ComplicationsDiabetiesMellitus,"1. None",page_4.this);
                        break;
                }
            }
        });


        PreviousDiabetestypeRdBtnGrp = (RadioGroup) findViewById(R.id.PreviousDiabetestypeRdBtnGrp);
        PreviousDiabetestypeRdBtnGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i) {
                    case R.id.PreviousDiabetestypeNo:
                        PreferanceManager.putString(Config.KEY_TreatmentDiabeticRetinopathy,"0. No",page_4.this);
                        break;
                    case R.id.PreviousDiabetestypeYes:
                        PreferanceManager.putString(Config.KEY_TreatmentDiabeticRetinopathy,"1. Yes",page_4.this);
                        break;
                    default:
                        PreferanceManager.putString(Config.KEY_TreatmentDiabeticRetinopathy,"0. No",page_4.this);
                        break;
                }
            }
        });



        Button button8 = (Button) findViewById(R.id.NextP4);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub

                if (DiabetesTypeA.getError() != null) {
                    DiabetesTypeA.setFocusable(true);
                }else{
                    PreferanceManager.putString(Config.KEY_DurationDiabetes, DiabetesTypeA.toString(), page_4.this);
                    Intent i = new Intent(page_4.this,page_5.class);
                    startActivity(i);
                }
            }
        });

        Button button9 = (Button) findViewById(R.id.PreviousP4);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(page_4.this,page_3.class);
                startActivity(i);
            }
        });
    }
}
