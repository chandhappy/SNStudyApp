package com.example.incbasha.snstudyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class page_7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_7);
        Button button14 = (Button) findViewById(R.id.NextP7);
        button14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub

                ///UrineACR
                EditText TxtUrineACR = (EditText) findViewById(R.id.TxtUrineACR);
                String UrineACR = TxtUrineACR.getText().toString();

                ///LipidsHDL
                EditText TxtLipidsHDL = (EditText) findViewById(R.id.TxtLipidsHDL);
                String LipidsHDL = TxtLipidsHDL.getText().toString();

                ///LipidsLDL
                EditText TxtLipidsLDL = (EditText) findViewById(R.id.TxtLipidsLDL);
                String LipidsLDL = TxtLipidsLDL.getText().toString();


                ///LipidTriglyceride
                EditText TxtLipidTriglyceride = (EditText) findViewById(R.id.TxtLipidTriglyceride);
                String LipidTriglyceride = TxtLipidTriglyceride.getText().toString();

                ///Cholesterol
                EditText TxtCholesterol = (EditText) findViewById(R.id.TxtCholesterol);
                String Cholesterol = TxtCholesterol.getText().toString();

                ///TCHDL
                EditText TxtTCHDL = (EditText) findViewById(R.id.TxtTCHDL);
                String TCHDL = TxtTCHDL.getText().toString();

                ///NonHDL
                EditText TxtNonHDL = (EditText) findViewById(R.id.TxtNonHDL);
                String NonHDL = TxtNonHDL.getText().toString();

                if(!LipidTriglyceride.equals("")&&!Cholesterol.equals("")&&!TCHDL.equals("")&&!NonHDL.equals("") && !LipidsHDL.equals("")&& !LipidsLDL.equals("")&&!UrineACR.equals("")) {
                    Intent i = new Intent(page_7.this,MainActivity.class);
                    startActivity(i);

                }else{
                    Toast.makeText(getApplicationContext(),"Answer All Questions" , Toast.LENGTH_LONG).show();
                }

            }
        });

        Button button15 = (Button) findViewById(R.id.PreviousP7);
        button15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(page_7.this,page_6.class);
                startActivity(i);
            }
        });
    }
}
