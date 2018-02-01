package com.example.incbasha.snstudyapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class page_1 extends AppCompatActivity {
    public static final String PREFS_NAME = "AOP_PREFS";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_1);
        Button button2 = (Button) findViewById(R.id.NextP1);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub\
                // Salary
                EditText Sal = (EditText) findViewById(R.id.TxtIncome);
                String Salary = Sal.getText().toString();
                SharedPreferences settings = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = settings.edit();
                // Occupation
                RadioButton  Occupation1 = (RadioButton) findViewById(R.id.Occupation1);
                RadioButton  Occupation2 = (RadioButton) findViewById(R.id.Occupation2);
                RadioButton  Occupation3 = (RadioButton) findViewById(R.id.Occupation3);
                RadioButton  Occupation4 = (RadioButton) findViewById(R.id.Occupation4);
                RadioButton  Occupation5 = (RadioButton) findViewById(R.id.Occupation5);
                RadioButton  Occupation6 = (RadioButton) findViewById(R.id.Occupation6);
                RadioButton  Occupation7 = (RadioButton) findViewById(R.id.Occupation7);
                RadioButton  Occupation8 = (RadioButton) findViewById(R.id.Occupation8);
                RadioButton  Occupation9 = (RadioButton) findViewById(R.id.Occupation9);
                RadioButton  Occupation10 = (RadioButton) findViewById(R.id.Occupation10);
                RadioButton  Occupation11 = (RadioButton) findViewById(R.id.Occupation11);
                RadioButton  Occupation12 = (RadioButton) findViewById(R.id.Occupation12);
                RadioButton  Occupation13 = (RadioButton) findViewById(R.id.Occupation13);
                RadioButton  Occupation14 = (RadioButton) findViewById(R.id.Occupation14);
                String Occupation = "";
                if(Occupation1.isChecked()){
                    Occupation = Occupation1.getText().toString();
                }else if(Occupation2.isChecked()){
                    Occupation = Occupation2.getText().toString();
                }else if(Occupation3.isChecked()){
                    Occupation = Occupation3.getText().toString();
                }else if(Occupation4.isChecked()){
                    Occupation = Occupation4.getText().toString();
                }else if(Occupation5.isChecked()){
                    Occupation = Occupation5.getText().toString();
                }else if(Occupation6.isChecked()){
                    Occupation = Occupation6.getText().toString();
                }else if(Occupation7.isChecked()){
                    Occupation = Occupation7.getText().toString();
                }else if(Occupation8.isChecked()){
                    Occupation = Occupation8.getText().toString();
                }else if(Occupation9.isChecked()){
                    Occupation = Occupation9.getText().toString();
                }else if(Occupation10.isChecked()){
                    Occupation = Occupation10.getText().toString();
                }else if(Occupation11.isChecked()){
                    Occupation = Occupation11.getText().toString();
                }else if(Occupation12.isChecked()){
                    Occupation = Occupation12.getText().toString();
                }else if(Occupation13.isChecked()){
                    Occupation = Occupation13.getText().toString();
                }else if(Occupation14.isChecked()){
                    Occupation = Occupation14.getText().toString();
                }

                if(!Occupation.equals("") && !Salary.equals("") ) {
                    Intent i = new Intent(page_1.this, page_2.class);
                    startActivity(i);
                }else{
                    Toast.makeText(getApplicationContext(),"Answer All Questions" , Toast.LENGTH_LONG).show();
                }
            }
        });

        Button button3 = (Button) findViewById(R.id.PreviousP1);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(page_1.this,homepage.class) ;
                startActivity(i);
            }
        });
    }

}
