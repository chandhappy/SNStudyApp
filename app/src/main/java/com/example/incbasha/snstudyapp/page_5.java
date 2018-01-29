package com.example.incbasha.snstudyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class page_5 extends AppCompatActivity {

    boolean back2Page =  false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_5);
        Bundle bun = getIntent().getExtras();
                if(bun!= null)
                {
                    back2Page = bun.getBoolean("back2Page");
                }
        Button button10 = (Button) findViewById(R.id.NextP5);
        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // cardiovascular

                CheckBox TxtCardiovascular1 = (CheckBox)findViewById(R.id.TxtCardiovascular1);
                CheckBox TxtCardiovascular2 = (CheckBox)findViewById(R.id.TxtCardiovascular2);
                CheckBox TxtCardiovascular3 = (CheckBox)findViewById(R.id.TxtCardiovascular3);
                CheckBox TxtCardiovascular4 = (CheckBox)findViewById(R.id.TxtCardiovascular4);
                CheckBox TxtCardiovascular5 = (CheckBox)findViewById(R.id.TxtCardiovascular5);
                StringBuilder Cardiovascular = new StringBuilder();
                if(TxtCardiovascular1.isChecked()){
                    Cardiovascular.append (TxtCardiovascular1.getText().toString());
                }else if(TxtCardiovascular2.isChecked()){
                    Cardiovascular.append (TxtCardiovascular2.getText().toString());
                }else if(TxtCardiovascular3.isChecked()){
                    Cardiovascular.append (TxtCardiovascular3.getText().toString());
                }else if(TxtCardiovascular4.isChecked()){
                    Cardiovascular.append (TxtCardiovascular4.getText().toString());
                }else if(TxtCardiovascular5.isChecked()){
                    Cardiovascular.append (TxtCardiovascular5.getText().toString());
                }
                ///Blood Pressure Medications
                EditText BP = (EditText) findViewById(R.id.TxtBloodpressureA);
                String BloodpressureMedications = BP.getText().toString();

                /// Statin
                RadioButton StatinNo = (RadioButton) findViewById(R.id.StatinNo);
                RadioButton  StatinYes = (RadioButton) findViewById(R.id.StatinYes);
                EditText StatinText = (EditText) findViewById(R.id.TxtstatinA);
                String Statin="" ;
                if(StatinNo.isChecked()){
                    Statin = StatinNo.getText().toString();
                }else if(StatinYes.isChecked()){
                    Statin = StatinYes.getText().toString();
                }

                ////Ocular History

                CheckBox TxtOcularHistory1 = (CheckBox)findViewById(R.id.TxtOcularHistory1);
                CheckBox TxtOcularHistory2 = (CheckBox)findViewById(R.id.TxtOcularHistory2);
                CheckBox TxtOcularHistory3 = (CheckBox)findViewById(R.id.TxtOcularHistory3);
                CheckBox TxtOcularHistory4 = (CheckBox)findViewById(R.id.TxtOcularHistory4);
                StringBuilder TxtOcularHistory = new StringBuilder();
                if(TxtOcularHistory1.isChecked()){
                    TxtOcularHistory.append (TxtOcularHistory1.getText().toString());
                }else if(TxtOcularHistory2.isChecked()){
                    TxtOcularHistory.append (TxtOcularHistory2.getText().toString());
                }else if(TxtOcularHistory3.isChecked()){
                    TxtOcularHistory.append (TxtOcularHistory3.getText().toString());
                }else if(TxtOcularHistory4.isChecked()){
                    TxtOcularHistory.append (TxtOcularHistory4.getText().toString());
                }

                ///Parental History Of Diabetes

                RadioButton TxtParentalDiabeticHistory1 = (RadioButton) findViewById(R.id.TxtParentalDiabeticHistory1);
                RadioButton  TxtParentalDiabeticHistory2 = (RadioButton) findViewById(R.id.TxtParentalDiabeticHistory2);
                RadioButton  TxtParentalDiabeticHistory3 = (RadioButton) findViewById(R.id.TxtParentalDiabeticHistory3);
                String TxtParentalDiabeticHistory="" ;
                if(TxtParentalDiabeticHistory1.isChecked()){
                    TxtParentalDiabeticHistory = TxtParentalDiabeticHistory1.getText().toString();
                }else if(TxtParentalDiabeticHistory2.isChecked()){
                    TxtParentalDiabeticHistory = TxtParentalDiabeticHistory2.getText().toString();
                }else if(TxtParentalDiabeticHistory3.isChecked()){
                    TxtParentalDiabeticHistory = TxtParentalDiabeticHistory3.getText().toString();
                }

                if(!BloodpressureMedications.equals("")&&!Statin.equals("") && !TxtOcularHistory.toString().equals("")&& !TxtParentalDiabeticHistory.equals("") ) {
                    Intent i = new Intent(page_5.this,page_6.class);
                    startActivity(i);

                }else{
                    Toast.makeText(getApplicationContext(),"Answer All Questions" , Toast.LENGTH_LONG).show();
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
}
