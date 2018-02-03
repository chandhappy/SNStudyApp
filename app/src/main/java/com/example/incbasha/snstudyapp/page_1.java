package com.example.incbasha.snstudyapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class page_1 extends AppCompatActivity {

    EditText TxtIncome;
    RadioGroup OccupationRadioGroup;
    RadioButton Occupation1, Occupation2, Occupation3, Occupation4, Occupation5, Occupation6, Occupation7, Occupation8, Occupation9, Occupation10, Occupation11, Occupation12, Occupation13, Occupation14;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_1);
        // Salary
        TxtIncome = (EditText) findViewById(R.id.TxtIncome);

        if(PreferanceManager.getString(Config.KEY_Salary,page_1.this)!=""){
            TxtIncome.setText(PreferanceManager.getString(Config.KEY_Salary,page_1.this));
        }
        TxtIncome.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if ((TxtIncome.getText().toString().trim() == "") || TxtIncome.getText().toString().trim().isEmpty()) {
                    TxtIncome.setError("Enter valid input ");
                }
            }
        });

        TxtIncome.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            public void afterTextChanged(Editable editable) {
                if ((TxtIncome.getText().toString().trim() == "") || TxtIncome.getText().toString().trim().isEmpty()) {
                    TxtIncome.setError("Enter valid input ");
                }
            }
        });

        ////Occupation
        Occupation1 = (RadioButton) findViewById(R.id.Occupation1);
        Occupation2 = (RadioButton) findViewById(R.id.Occupation2);
        Occupation3 = (RadioButton) findViewById(R.id.Occupation3);
        Occupation4 = (RadioButton) findViewById(R.id.Occupation4);
        Occupation5 = (RadioButton) findViewById(R.id.Occupation5);
        Occupation6 = (RadioButton) findViewById(R.id.Occupation6);
        Occupation7 = (RadioButton) findViewById(R.id.Occupation7);
        Occupation8 = (RadioButton) findViewById(R.id.Occupation8);
        Occupation9 = (RadioButton) findViewById(R.id.Occupation9);
        Occupation10 = (RadioButton) findViewById(R.id.Occupation10);
        Occupation11 = (RadioButton) findViewById(R.id.Occupation11);
        Occupation12 = (RadioButton) findViewById(R.id.Occupation12);
        Occupation13 = (RadioButton) findViewById(R.id.Occupation13);
        Occupation14 = (RadioButton) findViewById(R.id.Occupation14);

        if(PreferanceManager.getString(Config.KEY_Occupation,page_1.this).equals("0. Not working: Health reason – DR")){
            Occupation1.setChecked(true);
            Occupation2.setChecked(false);
            Occupation3.setChecked(false);
            Occupation4.setChecked(false);
            Occupation5.setChecked(false);
            Occupation6.setChecked(false);
            Occupation7.setChecked(false);
            Occupation8.setChecked(false);
            Occupation9.setChecked(false);
            Occupation10.setChecked(false);
            Occupation11.setChecked(false);
            Occupation12.setChecked(false);
            Occupation13.setChecked(false);
            Occupation14.setChecked(false);
        }

        if(PreferanceManager.getString(Config.KEY_Occupation,page_1.this).equals("1. Not working:  Health reasons, other")){
            Occupation1.setChecked(false);
            Occupation2.setChecked(true);
            Occupation3.setChecked(false);
            Occupation4.setChecked(false);
            Occupation5.setChecked(false);
            Occupation6.setChecked(false);
            Occupation7.setChecked(false);
            Occupation8.setChecked(false);
            Occupation9.setChecked(false);
            Occupation10.setChecked(false);
            Occupation11.setChecked(false);
            Occupation12.setChecked(false);
            Occupation13.setChecked(false);
            Occupation14.setChecked(false);
        }

        if(PreferanceManager.getString(Config.KEY_Occupation,page_1.this).equals("2. Not working: Domestic duties")){
            Occupation1.setChecked(false);
            Occupation2.setChecked(false);
            Occupation3.setChecked(true);
            Occupation4.setChecked(false);
            Occupation5.setChecked(false);
            Occupation6.setChecked(false);
            Occupation7.setChecked(false);
            Occupation8.setChecked(false);
            Occupation9.setChecked(false);
            Occupation10.setChecked(false);
            Occupation11.setChecked(false);
            Occupation12.setChecked(false);
            Occupation13.setChecked(false);
            Occupation14.setChecked(false);
        }

        if(PreferanceManager.getString(Config.KEY_Occupation,page_1.this).equals("3. Not working: retired")){
            Occupation1.setChecked(false);
            Occupation2.setChecked(false);
            Occupation3.setChecked(false);
            Occupation4.setChecked(true);
            Occupation5.setChecked(false);
            Occupation6.setChecked(false);
            Occupation7.setChecked(false);
            Occupation8.setChecked(false);
            Occupation9.setChecked(false);
            Occupation10.setChecked(false);
            Occupation11.setChecked(false);
            Occupation12.setChecked(false);
            Occupation13.setChecked(false);
            Occupation14.setChecked(false);
        }

        if(PreferanceManager.getString(Config.KEY_Occupation,page_1.this).equals("4. Not working: Looking for job")){
            Occupation1.setChecked(false);
            Occupation2.setChecked(false);
            Occupation3.setChecked(false);
            Occupation4.setChecked(false);
            Occupation5.setChecked(true);
            Occupation6.setChecked(false);
            Occupation7.setChecked(false);
            Occupation8.setChecked(false);
            Occupation9.setChecked(false);
            Occupation10.setChecked(false);
            Occupation11.setChecked(false);
            Occupation12.setChecked(false);
            Occupation13.setChecked(false);
            Occupation14.setChecked(false);
        }

        if(PreferanceManager.getString(Config.KEY_Occupation,page_1.this).equals("5. Working: Managerial, Professional")){
            Occupation1.setChecked(false);
            Occupation2.setChecked(false);
            Occupation3.setChecked(false);
            Occupation4.setChecked(false);
            Occupation5.setChecked(false);
            Occupation6.setChecked(true);
            Occupation7.setChecked(false);
            Occupation8.setChecked(false);
            Occupation9.setChecked(false);
            Occupation10.setChecked(false);
            Occupation11.setChecked(false);
            Occupation12.setChecked(false);
            Occupation13.setChecked(false);
            Occupation14.setChecked(false);
        }

        if(PreferanceManager.getString(Config.KEY_Occupation,page_1.this).equals("6. Working: Supervisor, middle level management")){
            Occupation1.setChecked(false);
            Occupation2.setChecked(false);
            Occupation3.setChecked(false);
            Occupation4.setChecked(false);
            Occupation5.setChecked(false);
            Occupation6.setChecked(false);
            Occupation7.setChecked(true);
            Occupation8.setChecked(false);
            Occupation9.setChecked(false);
            Occupation10.setChecked(false);
            Occupation11.setChecked(false);
            Occupation12.setChecked(false);
            Occupation13.setChecked(false);
            Occupation14.setChecked(false);
        }

        if(PreferanceManager.getString(Config.KEY_Occupation,page_1.this).equals("7. Working: Skilled non-manual")){
            Occupation1.setChecked(false);
            Occupation2.setChecked(false);
            Occupation3.setChecked(false);
            Occupation4.setChecked(false);
            Occupation5.setChecked(false);
            Occupation6.setChecked(false);
            Occupation7.setChecked(false);
            Occupation8.setChecked(true);
            Occupation9.setChecked(false);
            Occupation10.setChecked(false);
            Occupation11.setChecked(false);
            Occupation12.setChecked(false);
            Occupation13.setChecked(false);
            Occupation14.setChecked(false);
        }

        if(PreferanceManager.getString(Config.KEY_Occupation,page_1.this).equals("8. Working: Skilled Manual")){
            Occupation1.setChecked(false);
            Occupation2.setChecked(false);
            Occupation3.setChecked(false);
            Occupation4.setChecked(false);
            Occupation5.setChecked(false);
            Occupation6.setChecked(false);
            Occupation7.setChecked(false);
            Occupation8.setChecked(false);
            Occupation9.setChecked(true);
            Occupation10.setChecked(false);
            Occupation11.setChecked(false);
            Occupation12.setChecked(false);
            Occupation13.setChecked(false);
            Occupation14.setChecked(false);
        }

        if(PreferanceManager.getString(Config.KEY_Occupation,page_1.this).equals("9.Working: Un-skilled Manual")){
            Occupation1.setChecked(false);
            Occupation2.setChecked(false);
            Occupation3.setChecked(false);
            Occupation4.setChecked(false);
            Occupation5.setChecked(false);
            Occupation6.setChecked(false);
            Occupation7.setChecked(false);
            Occupation8.setChecked(false);
            Occupation9.setChecked(false);
            Occupation10.setChecked(true);
            Occupation11.setChecked(false);
            Occupation12.setChecked(false);
            Occupation13.setChecked(false);
            Occupation14.setChecked(false);
        }

        if(PreferanceManager.getString(Config.KEY_Occupation,page_1.this).equals("10. Working: Self-employed Employees 0")){
            Occupation1.setChecked(false);
            Occupation2.setChecked(false);
            Occupation3.setChecked(false);
            Occupation4.setChecked(false);
            Occupation5.setChecked(false);
            Occupation6.setChecked(false);
            Occupation7.setChecked(false);
            Occupation8.setChecked(false);
            Occupation9.setChecked(false);
            Occupation10.setChecked(false);
            Occupation11.setChecked(true);
            Occupation12.setChecked(false);
            Occupation13.setChecked(false);
            Occupation14.setChecked(false);
        }

        if(PreferanceManager.getString(Config.KEY_Occupation,page_1.this).equals("11. Working: Self-employed Employees 1-9")){
            Occupation1.setChecked(false);
            Occupation2.setChecked(false);
            Occupation3.setChecked(false);
            Occupation4.setChecked(false);
            Occupation5.setChecked(false);
            Occupation6.setChecked(false);
            Occupation7.setChecked(false);
            Occupation8.setChecked(false);
            Occupation9.setChecked(false);
            Occupation10.setChecked(false);
            Occupation11.setChecked(false);
            Occupation12.setChecked(true);
            Occupation13.setChecked(false);
            Occupation14.setChecked(false);
        }

        if(PreferanceManager.getString(Config.KEY_Occupation,page_1.this).equals("12. Working: Self-employed Employees 10-24")){
            Occupation1.setChecked(false);
            Occupation2.setChecked(false);
            Occupation3.setChecked(false);
            Occupation4.setChecked(false);
            Occupation5.setChecked(false);
            Occupation6.setChecked(false);
            Occupation7.setChecked(false);
            Occupation8.setChecked(false);
            Occupation9.setChecked(false);
            Occupation10.setChecked(false);
            Occupation11.setChecked(false);
            Occupation12.setChecked(false);
            Occupation13.setChecked(true);
            Occupation14.setChecked(false);
        }

        if(PreferanceManager.getString(Config.KEY_Occupation,page_1.this).equals("13. Working: Self-employed Employees 25+")){
            Occupation1.setChecked(false);
            Occupation2.setChecked(false);
            Occupation3.setChecked(false);
            Occupation4.setChecked(false);
            Occupation5.setChecked(false);
            Occupation6.setChecked(false);
            Occupation7.setChecked(false);
            Occupation8.setChecked(false);
            Occupation9.setChecked(false);
            Occupation10.setChecked(false);
            Occupation11.setChecked(false);
            Occupation12.setChecked(false);
            Occupation13.setChecked(false);
            Occupation14.setChecked(true);
        }



        OccupationRadioGroup = (RadioGroup) findViewById(R.id.OccupationRadioGroup);
        OccupationRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.Occupation1:
                        PreferanceManager.putString(Config.KEY_Occupation,"0. Not working: Health reason – DR",page_1.this);
                        break;
                    case R.id.Occupation2:
                        PreferanceManager.putString(Config.KEY_Occupation,"1. Not working:  Health reasons, other",page_1.this);
                        break;
                    case R.id.Occupation3:
                        PreferanceManager.putString(Config.KEY_Occupation,"2. Not working: Domestic duties",page_1.this);
                        break;
                    case R.id.Occupation4:
                        PreferanceManager.putString(Config.KEY_Occupation,"3. Not working: retired",page_1.this);
                        break;
                    case R.id.Occupation5:
                        PreferanceManager.putString(Config.KEY_Occupation,"4. Not working: Looking for job",page_1.this);
                        break;
                    case R.id.Occupation6:
                        PreferanceManager.putString(Config.KEY_Occupation,"5. Working: Managerial, Professional",page_1.this);
                        break;
                    case R.id.Occupation7:
                        PreferanceManager.putString(Config.KEY_Occupation,"6. Working: Supervisor, middle level management",page_1.this);
                        break;
                    case R.id.Occupation8:
                        PreferanceManager.putString(Config.KEY_Occupation,"7. Working: Skilled non-manual",page_1.this);
                        break;
                    case R.id.Occupation9:
                        PreferanceManager.putString(Config.KEY_Occupation,"8. Working: Skilled Manual",page_1.this);
                        break;
                    case R.id.Occupation10:
                        PreferanceManager.putString(Config.KEY_Occupation,"9.Working: Un-skilled Manual",page_1.this);
                        break;
                    case R.id.Occupation11:
                        PreferanceManager.putString(Config.KEY_Occupation,"10. Working: Self-employed Employees 0",page_1.this);
                        break;
                    case R.id.Occupation12:
                        PreferanceManager.putString(Config.KEY_Occupation,"11. Working: Self-employed Employees 1-9",page_1.this);
                        break;
                    case R.id.Occupation13:
                        PreferanceManager.putString(Config.KEY_Occupation,"12. Working: Self-employed Employees 10-24",page_1.this);
                        break;
                    case R.id.Occupation14:
                        PreferanceManager.putString(Config.KEY_Occupation,"13. Working: Self-employed Employees 25+",page_1.this);
                        break;
                    default:
                        PreferanceManager.putString(Config.KEY_Occupation,"0. No Education",page_1.this);
                        break;

                }
            }
        });



        Button button2 = (Button) findViewById(R.id.NextP1);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub\
                if (TxtIncome.getError() != null) {
                    TxtIncome.setFocusable(true);
                }
                PreferanceManager.putString(Config.KEY_Salary, TxtIncome.getText().toString(), page_1.this);
                Intent i = new Intent(page_1.this, page_2.class);
                    startActivity(i);
            }
        });

        Button button3 = (Button) findViewById(R.id.PreviousP1);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(page_1.this, homepage.class);
                startActivity(i);
            }
        });
    }

}
