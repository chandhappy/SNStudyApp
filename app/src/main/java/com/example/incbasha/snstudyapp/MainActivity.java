package com.example.incbasha.snstudyapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /*private Calendar startTime = ()Calendar.getInstance();*/
 // static   EditText dd, cchh, pp, years;
  // static String CaseID,Age,Gender,Education;
   // static   RadioButton Education1,Education2,Education3,Education4,Education5,Education6,Education7,  Education8,Education9,Education10,rbMale,rbFemale;
   // static  Button button;
    public static final String PREFS_NAME = "AOP_PREFS";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      /*  Log.v(TAG, "Inside of onCreate");*/
        setContentView(R.layout.activity_main);
        SharedPreferences  settings = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        // ID for the Case

        Button  button = (Button) findViewById(R.id.NextP);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText   dd = (EditText) findViewById(R.id.DD);
                EditText cchh = (EditText) findViewById(R.id.CCHH);
                EditText pp = (EditText) findViewById(R.id.PP);

                String CaseID = dd.getText().toString()+cchh.getText().toString()+pp.getText().toString();
                //Age
                EditText  years = (EditText) findViewById(R.id.TxtAge);
                String  Age = years.getText().toString();
                // Gender

                RadioButton rbMale = (RadioButton) findViewById(R.id.GenderMale);
                RadioButton rbFemale = (RadioButton) findViewById(R.id.GenderFemale);
                String Gender = " ";
                if(rbMale.isChecked()){
                    Gender = rbMale.getText().toString();
                }else if(rbFemale.isChecked()){
                    Gender = rbFemale.getText().toString();
                }
                //Education
                RadioButton  Education1 = (RadioButton) findViewById(R.id.Education1);
                RadioButton Education2 = (RadioButton) findViewById(R.id.Education2);
                RadioButton Education3 = (RadioButton) findViewById(R.id.Education3);
                RadioButton  Education4 = (RadioButton) findViewById(R.id.Education4);
                RadioButton  Education5 = (RadioButton) findViewById(R.id.Education5);
                RadioButton  Education6 = (RadioButton) findViewById(R.id.Education6);
                RadioButton  Education7 = (RadioButton) findViewById(R.id.Education7);
                RadioButton  Education8 = (RadioButton) findViewById(R.id.Education8);
                RadioButton  Education9 = (RadioButton) findViewById(R.id.Education9);
                RadioButton  Education10 = (RadioButton) findViewById(R.id.Education10);
                String  Education =" ";
                if(Education1.isChecked()){
                    Education = Education1.getText().toString();
                }else if(Education2.isChecked()){
                    Education = Education2.getText().toString();
                }else if(Education3.isChecked()){
                    Education = Education3.getText().toString();
                }else if(Education4.isChecked()){
                    Education = Education4.getText().toString();
                }else if(Education5.isChecked()){
                    Education = Education5.getText().toString();
                }else if(Education6.isChecked()){
                    Education = Education6.getText().toString();
                }else if(Education7.isChecked()){
                    Education = Education7.getText().toString();
                }else if(Education8.isChecked()){
                    Education = Education8.getText().toString();
                }else if(Education9.isChecked()){
                    Education = Education9.getText().toString();
                }else if(Education10.isChecked()){
                    Education = Education10.getText().toString();
                }
                // TODO Auto-generated method stub
                if(!CaseID.equals("") && !Age.equals("")&& !Education.equals("") ){
                    Toast.makeText(getApplicationContext(), CaseID +" "+Age+","+Gender+" "+Education , Toast.LENGTH_LONG).show();
                    Intent i = new Intent(MainActivity.this, page_1.class);
                    startActivity(i);
                }else{
                    Toast.makeText(getApplicationContext(),"Answer All Questions" , Toast.LENGTH_LONG).show();
                }

            }
        });
    }


   /** Called when the activity is first created. */
 /*  @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putString("DD",dd.toString());
       savedInstanceState.putString("CCHH",cchh.toString());
       savedInstanceState.putString("PP",pp.toString());
       savedInstanceState.putString("years",years.toString());
       savedInstanceState.putString("rbMale",rbMale.toString());
       savedInstanceState.putString("rbFemale",rbFemale.toString());
       savedInstanceState.putString("Education1",Education1.toString());
       savedInstanceState.putString("Education2",Education2.toString());
       savedInstanceState.putString("Education3",Education3.toString());
       savedInstanceState.putString("Education4",Education4.toString());
       savedInstanceState.putString("Education5",Education5.toString());
       savedInstanceState.putString("Education6",Education6.toString());
       savedInstanceState.putString("Education7",Education7.toString());
       savedInstanceState.putString("Education8",Education8.toString());
       savedInstanceState.putString("Education9",Education9.toString());
       savedInstanceState.putString("Education10",Education10.toString());

       super.onSaveInstanceState(savedInstanceState);

   }*/

   /* @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null) {
            dd.setText(savedInstanceState.getString("DD"));
            cchh.setText(savedInstanceState.getString("CCHH"));
            pp.setText(savedInstanceState.getString("PP"));
            years.setText(savedInstanceState.getString("years"));
            rbMale.setText(savedInstanceState.getString("rbMale"));
            rbFemale.setText(savedInstanceState.getString("rbFemale"));
        }

    }*/
}
