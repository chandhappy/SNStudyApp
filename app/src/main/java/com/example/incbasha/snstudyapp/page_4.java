package com.example.incbasha.snstudyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class page_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_4);
        Button button8 = (Button) findViewById(R.id.NextP4);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                EditText DiabetesTypeA = (EditText) findViewById(R.id.TxtDiabetestypeA);
                String Diabetesduration = DiabetesTypeA.getText().toString();

               ///Diabetes Melitus status
                RadioButton DiabetesMellitusB1 = (RadioButton) findViewById(R.id.DiabetesMellitusB1);
                RadioButton  DiabetesMellitusB2 = (RadioButton) findViewById(R.id.DiabetesMellitusB2);
                RadioButton  DiabetesMellitusB3 = (RadioButton) findViewById(R.id.DiabetesMellitusB3);
                RadioButton  DiabetesMellitusB4 = (RadioButton) findViewById(R.id.DiabetesMellitusB4);
                String DiabetesMellitusTreatment = "";
                if(DiabetesMellitusB1.isChecked()){
                    DiabetesMellitusTreatment = DiabetesMellitusB1.getText().toString();
                }else if(DiabetesMellitusB2.isChecked()){
                    DiabetesMellitusTreatment = DiabetesMellitusB2.getText().toString();
                }else if(DiabetesMellitusB3.isChecked()){
                    DiabetesMellitusTreatment = DiabetesMellitusB3.getText().toString();
                }else if(DiabetesMellitusB4.isChecked()){
                    DiabetesMellitusTreatment = DiabetesMellitusB4.getText().toString();
                }

                ////Diabetes Complications

                RadioButton ComplicationsDiabetesMellitusB1 = (RadioButton) findViewById(R.id.ComplicationsDiabetesMellitusB1);
                RadioButton  ComplicationsDiabetesMellitusB2 = (RadioButton) findViewById(R.id.ComplicationsDiabetesMellitusB2);
                RadioButton  ComplicationsDiabetesMellitusB3 = (RadioButton) findViewById(R.id.ComplicationsDiabetesMellitusB3);
                RadioButton  ComplicationsDiabetesMellitusB4 = (RadioButton) findViewById(R.id.ComplicationsDiabetesMellitusB4);
                String ComplicationsDiabetesMellitus = "";
                if(ComplicationsDiabetesMellitusB1.isChecked()){
                    ComplicationsDiabetesMellitus = ComplicationsDiabetesMellitusB1.getText().toString();
                }else if(ComplicationsDiabetesMellitusB2.isChecked()){
                    ComplicationsDiabetesMellitus = ComplicationsDiabetesMellitusB2.getText().toString();
                }else if(ComplicationsDiabetesMellitusB3.isChecked()){
                    ComplicationsDiabetesMellitus = ComplicationsDiabetesMellitusB3.getText().toString();
                }else if(ComplicationsDiabetesMellitusB4.isChecked()){
                    ComplicationsDiabetesMellitus = ComplicationsDiabetesMellitusB4.getText().toString();
                }
                //// DiabeticRetinopathy

                RadioButton  PreviousDiabetestypeNo = (RadioButton) findViewById(R.id.PreviousDiabetestypeNo);
                RadioButton  PreviousDiabetestypeYes = (RadioButton) findViewById(R.id.PreviousDiabetestypeYes);
                String PreviousDiabetestype = "";
                if(PreviousDiabetestypeNo.isChecked()){
                    PreviousDiabetestype = PreviousDiabetestypeNo.getText().toString();
                }else if(PreviousDiabetestypeYes.isChecked()){
                    PreviousDiabetestype = PreviousDiabetestypeYes.getText().toString();
                }

                if(!DiabetesMellitusTreatment.equals("")&&!ComplicationsDiabetesMellitus.equals("") && !Diabetesduration.equals("")&& !PreviousDiabetestype.equals("") ) {
                    Intent i = new Intent(page_4.this,page_5.class);
                    startActivity(i);

                }else{
                    Toast.makeText(getApplicationContext(),"Answer All Questions" , Toast.LENGTH_LONG).show();
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
