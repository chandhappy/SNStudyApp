package com.example.incbasha.snstudyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class page_6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_6);
        Button button12 = (Button) findViewById(R.id.NextP6);
        button12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub

                /// ParentalHistoryofHeartattack
                RadioButton ParentalHistoryofHeartattackNo = (RadioButton) findViewById(R.id.ParentalHistoryofHeartattackNo);
                RadioButton  ParentalHistoryofHeartattackYes = (RadioButton) findViewById(R.id.ParentalHistoryofHeartattackYes);

                String ParentalHistoryofHeartattack="" ;
                if(ParentalHistoryofHeartattackNo.isChecked()){
                    ParentalHistoryofHeartattack = ParentalHistoryofHeartattackNo.getText().toString();
                }else if(ParentalHistoryofHeartattackYes.isChecked()){
                    ParentalHistoryofHeartattack = ParentalHistoryofHeartattackYes.getText().toString();
                }
                ///Height
                EditText TxtHeight = (EditText) findViewById(R.id.TxtHeight);
                String Height = TxtHeight.getText().toString();

                ///weight
                EditText Txtweight = (EditText) findViewById(R.id.Txtweight);
                String Weight = Txtweight.getText().toString();

                ///waist
                EditText TxtWaist = (EditText) findViewById(R.id.TxtWaist);
                String Waist = Txtweight.getText().toString();

                ///Hip
                EditText TxtHip = (EditText) findViewById(R.id.TxtHip);
                String hip = TxtHip.getText().toString();

                ///Bloodpressuresystolic
                EditText TxtBloodpressureSystolic = (EditText) findViewById(R.id.TxtBloodpressureSystolic);
                String Bloodpressuresystolic = Txtweight.getText().toString();

                ///Bloodpressurediastolic
                EditText TxtBloodpressureDiastolic = (EditText) findViewById(R.id.TxtBloodpressureDiastolic);
                String Bloodpressurediastolic = TxtBloodpressureDiastolic.getText().toString();

                ///Hba1c
                EditText TxtHbA1c = (EditText) findViewById(R.id.TxtHbA1c);
                String Hba1c = TxtHbA1c.getText().toString();


                if(!ParentalHistoryofHeartattack.equals("")&&!Hba1c.equals("")&&!Bloodpressuresystolic.equals("")&&!hip.equals("")
                        &&!Bloodpressurediastolic.equals("") &&!Height.equals("")&&!Weight.equals("")&&!Waist.equals("")
                        ) {
                    Intent i = new Intent(page_6.this,page_7.class);
                    startActivity(i);

                }else{
                    Toast.makeText(getApplicationContext(),"Answer All Questions" , Toast.LENGTH_LONG).show();
                }


            }
        });

        Button button13 = (Button) findViewById(R.id.PreviousP6);
        button13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(page_6.this,page_5.class);
                startActivity(i);
            }
        });
    }
}
