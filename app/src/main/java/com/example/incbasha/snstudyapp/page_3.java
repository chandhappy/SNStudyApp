package com.example.incbasha.snstudyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class page_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_3);
        Button button6 = (Button) findViewById(R.id.NextP3);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ///Depressed

                RadioButton DepressedNo = (RadioButton) findViewById(R.id.DepressedNo);
                RadioButton  DepressedYes = (RadioButton) findViewById(R.id.DepressedYes);
                String Depressed = "";
                if(DepressedNo.isChecked()){
                    Depressed = DepressedNo.getText().toString();
                }else if(DepressedYes.isChecked()){
                    Depressed = DepressedYes.getText().toString();
                }
                /// Diet
                CheckBox SaltyFood = (CheckBox)findViewById(R.id.TxtDiet1);
                CheckBox Deepfried = (CheckBox)findViewById(R.id.TxtDiet2);
                CheckBox Fruits = (CheckBox)findViewById(R.id.TxtDiet3);
                CheckBox Vegetables = (CheckBox)findViewById(R.id.TxtDiet4);
                CheckBox Meat = (CheckBox)findViewById(R.id.TxtDiet5);
                StringBuilder Diet = new StringBuilder();
                if(SaltyFood.isChecked()){
                    Diet.append (SaltyFood.getText().toString());
                }else if(Deepfried.isChecked()){
                    Diet.append (Deepfried.getText().toString());
                }else if(Fruits.isChecked()){
                    Diet.append (Fruits.getText().toString());
                }else if(Vegetables.isChecked()){
                    Diet.append (Vegetables.getText().toString());
                }else if(Meat.isChecked()){
                    Diet.append (Meat.getText().toString());
                }
                ///Diabetestype2
                RadioButton DiabetestypeNo = (RadioButton) findViewById(R.id.DiabetestypeNo);
                RadioButton  DiabetestypeYes = (RadioButton) findViewById(R.id.DiabetestypeYes);
                String Diabetestype = "";
                if(DiabetestypeNo.isChecked()){
                    Diabetestype = DiabetestypeNo.getText().toString();
                }else if(DiabetestypeYes.isChecked()){
                    Diabetestype = DiabetestypeYes.getText().toString();
                }


                if(!Depressed.equals("") && !Diet.toString().equals("")&& !Diabetestype.equals("") ) {
                    if(Diabetestype.equals("1. yes")) {
                        Intent i = new Intent(page_3.this, page_4.class);
                        startActivity(i);
                    }
                    else{
                        Intent i = new Intent(page_3.this, page_5.class);
                        i.putExtra("back2Page",true);
                        startActivity(i);
                    }

                }else{
                    Toast.makeText(getApplicationContext(),"Answer All Questions" , Toast.LENGTH_LONG).show();
                }



            }
        });

        Button button7 = (Button) findViewById(R.id.PreviousP3);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(page_3.this,page_2.class);
                startActivity(i);
            }
        });
    }

}
