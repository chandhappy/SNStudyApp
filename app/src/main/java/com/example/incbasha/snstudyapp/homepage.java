package com.example.incbasha.snstudyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
public class homepage extends AppCompatActivity {

    EditText DD,CCHH,PP,TxtAge;
    RadioGroup GenderRdBtnGrp,EducationRdBtnGrp;
    RadioButton GenderMale,GenderFemale,Education10,Education1,Education2,Education3,Education4,Education5,Education6,Education7, Education8,Education9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        DD = (EditText)findViewById(R.id.DD);
        DD.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if ((DD.getText().toString().trim() == "") || DD.getText().toString().trim().isEmpty()) {
                    DD.setError("Enter valid input ");
                }
            }
        });
        CCHH = (EditText)findViewById(R.id.CCHH);
        CCHH.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if ((CCHH.getText().toString().trim() == "") || CCHH.getText().toString().trim().isEmpty()) {
                    CCHH.setError("Enter valid input ");
                }
            }
        });
        PP = (EditText)findViewById(R.id.PP);
        PP.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if ((PP.getText().toString().trim() == "") || PP.getText().toString().trim().isEmpty()) {
                    PP.setError("Enter valid input ");
                }
            }
        });
        TxtAge = (EditText)findViewById(R.id.TxtAge);
        TxtAge.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if ((TxtAge.getText().toString().trim() == "") || TxtAge.getText().toString().trim().isEmpty()) {
                    TxtAge.setError("Enter valid input ");
                } else if (((TxtAge.getText().toString().trim())!= " " ) && (Integer.parseInt(TxtAge.getText().toString().trim()) < 0) || (Integer.parseInt(TxtAge.getText().toString().trim()) > 150)) {
                    TxtAge.setError("Values Between 1 & 150 Only ");
                }
            }
        });
        TxtAge.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            public void afterTextChanged(Editable editable) {
                if ((TxtAge.getText().toString().trim() == "") || TxtAge.getText().toString().trim().isEmpty()) {
                    TxtAge.setError("Enter valid input ");
                } else if (((TxtAge.getText().toString().trim())!= " " ) && (Integer.parseInt(TxtAge.getText().toString().trim()) < 0) || (Integer.parseInt(TxtAge.getText().toString().trim()) > 150)) {
                    TxtAge.setError("Values Between 1 & 150 Only ");
                }
            }
        });

        GenderMale = (RadioButton) findViewById(R.id.GenderMale);
        GenderFemale = (RadioButton) findViewById(R.id.GenderFemale);

        Education1= (RadioButton) findViewById(R.id.Education1);
        Education2= (RadioButton) findViewById(R.id.Education2);
        Education3= (RadioButton) findViewById(R.id.Education3);
        Education4= (RadioButton) findViewById(R.id.Education4);
        Education5= (RadioButton) findViewById(R.id.Education5);
        Education6= (RadioButton) findViewById(R.id.Education6);
        Education7= (RadioButton) findViewById(R.id.Education7);
        Education8= (RadioButton) findViewById(R.id.Education8);
        Education9= (RadioButton) findViewById(R.id.Education9);
        Education10= (RadioButton) findViewById(R.id.Education10);



       if(PreferanceManager.getString(Config.KEY_DD,homepage.this)!=""){
           DD.setText(PreferanceManager.getString(Config.KEY_DD,homepage.this));
       }
        if(PreferanceManager.getString(Config.KEY_CCHH,homepage.this)!=""){
           CCHH.setText(PreferanceManager.getString(Config.KEY_CCHH,homepage.this));
        }
        if(PreferanceManager.getString(Config.KEY_PP,homepage.this)!=""){
            PP.setText(PreferanceManager.getString(Config.KEY_PP,homepage.this));
        }

        if(PreferanceManager.getString(Config.KEY_Age,homepage.this)!=""){
            TxtAge.setText(PreferanceManager.getString(Config.KEY_Age,homepage.this));
        }

        if(PreferanceManager.getString(Config.KEY_Gender,homepage.this).equals("F")){
         GenderFemale.setChecked(true);
            GenderMale.setChecked(false);
        }
        if(PreferanceManager.getString(Config.KEY_Gender,homepage.this).equals("M")){
            GenderFemale.setChecked(false);
            GenderMale.setChecked(true);
        }

        if(PreferanceManager.getString(Config.KEY_Education,homepage.this).equals("0. No Education")){
            Education1.setChecked(true);
            Education2.setChecked(false);
            Education3.setChecked(false);
            Education4.setChecked(false);
            Education5.setChecked(false);
            Education6.setChecked(false);
            Education7.setChecked(false);
            Education8.setChecked(false);
            Education9.setChecked(false);
            Education10.setChecked(false);
        }
        if(PreferanceManager.getString(Config.KEY_Education,homepage.this).equals("1. Pre-primary")){
            Education1.setChecked(false);
            Education2.setChecked(true);
            Education3.setChecked(false);
            Education4.setChecked(false);
            Education5.setChecked(false);
            Education6.setChecked(false);
            Education7.setChecked(false);
            Education8.setChecked(false);
            Education9.setChecked(false);
            Education10.setChecked(false);
        }
        if(PreferanceManager.getString(Config.KEY_Education,homepage.this).equals("2. Primary")){
            Education1.setChecked(false);
            Education2.setChecked(false);
            Education3.setChecked(true);
            Education4.setChecked(false);
            Education5.setChecked(false);
            Education6.setChecked(false);
            Education7.setChecked(false);
            Education8.setChecked(false);
            Education9.setChecked(false);
            Education10.setChecked(false);
        }
        if(PreferanceManager.getString(Config.KEY_Education,homepage.this).equals("3. Lower Secondary")){
            Education1.setChecked(false);
            Education2.setChecked(false);
            Education3.setChecked(false);
            Education4.setChecked(true);
            Education5.setChecked(false);
            Education6.setChecked(false);
            Education7.setChecked(false);
            Education8.setChecked(false);
            Education9.setChecked(false);
            Education10.setChecked(false);
        }
        if(PreferanceManager.getString(Config.KEY_Education,homepage.this).equals("4. Upper Secondary")){
            Education1.setChecked(false);
            Education2.setChecked(false);
            Education3.setChecked(false);
            Education4.setChecked(false);
            Education5.setChecked(true);
            Education6.setChecked(false);
            Education7.setChecked(false);
            Education8.setChecked(false);
            Education9.setChecked(false);
            Education10.setChecked(false);
        }
        if(PreferanceManager.getString(Config.KEY_Education,homepage.this).equals("5. Higher Secondary")){
            Education1.setChecked(false);
            Education2.setChecked(false);
            Education3.setChecked(false);
            Education4.setChecked(false);
            Education5.setChecked(false);
            Education6.setChecked(true);
            Education7.setChecked(false);
            Education8.setChecked(false);
            Education9.setChecked(false);
            Education10.setChecked(false);
        }
        if(PreferanceManager.getString(Config.KEY_Education,homepage.this).equals("6. Bachelor’s degree")){
            Education1.setChecked(false);
            Education2.setChecked(false);
            Education3.setChecked(false);
            Education4.setChecked(false);
            Education5.setChecked(false);
            Education6.setChecked(false);
            Education7.setChecked(true);
            Education8.setChecked(false);
            Education9.setChecked(false);
            Education10.setChecked(false);
        }
        if(PreferanceManager.getString(Config.KEY_Education,homepage.this).equals("7. Master’s degree")){
            Education1.setChecked(false);
            Education2.setChecked(false);
            Education3.setChecked(false);
            Education4.setChecked(false);
            Education5.setChecked(false);
            Education6.setChecked(false);
            Education7.setChecked(false);
            Education8.setChecked(true);
            Education9.setChecked(false);
            Education10.setChecked(false);
        }
        if(PreferanceManager.getString(Config.KEY_Education,homepage.this).equals("8. Doctoral")){
            Education1.setChecked(false);
            Education2.setChecked(false);
            Education3.setChecked(false);
            Education4.setChecked(false);
            Education5.setChecked(false);
            Education6.setChecked(false);
            Education7.setChecked(false);
            Education8.setChecked(false);
            Education9.setChecked(true);
            Education10.setChecked(false);
        }
        if(PreferanceManager.getString(Config.KEY_Education,homepage.this).equals("9. Not Classified")){
            Education1.setChecked(false);
            Education2.setChecked(false);
            Education3.setChecked(false);
            Education4.setChecked(false);
            Education5.setChecked(false);
            Education6.setChecked(false);
            Education7.setChecked(false);
            Education8.setChecked(false);
            Education9.setChecked(false);
            Education10.setChecked(true);
        }



        DD.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.length() == 2) {
                    CCHH.requestFocus();
                }
            }
        });
        CCHH.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.length() == 4) {
                    PP.requestFocus();
                }
            }
        });



        GenderRdBtnGrp = (RadioGroup) findViewById(R.id.GenderRdBtnGrp);
        GenderRdBtnGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i) {
                    case R.id.GenderMale:
                            PreferanceManager.putString(Config.KEY_Gender,"M",homepage.this);
                            break;
                    case R.id.GenderFemale:
                            PreferanceManager.putString(Config.KEY_Gender,"F",homepage.this);
                            break;
                        default:
                            PreferanceManager.putString(Config.KEY_Gender,"M",homepage.this);
                            break;
                }
            }
        });

        EducationRdBtnGrp = (RadioGroup) findViewById(R.id.EducationRdBtnGrp);
        EducationRdBtnGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.Education1:
                        PreferanceManager.putString(Config.KEY_Education,"0. No Education",homepage.this);
                        break;
                    case R.id.Education2:
                        PreferanceManager.putString(Config.KEY_Education,"1. Pre-primary",homepage.this);
                        break;
                    case R.id.Education3:
                        PreferanceManager.putString(Config.KEY_Education,"2. Primary",homepage.this);
                        break;
                    case R.id.Education4:
                        PreferanceManager.putString(Config.KEY_Education,"3. Lower Secondary",homepage.this);
                        break;
                    case R.id.Education5:
                        PreferanceManager.putString(Config.KEY_Education,"4. Upper Secondary",homepage.this);
                        break;
                    case R.id.Education6:
                        PreferanceManager.putString(Config.KEY_Education,"5. Higher Secondary",homepage.this);
                        break;
                    case R.id.Education7:
                        PreferanceManager.putString(Config.KEY_Education,"6. Bachelor’s degree",homepage.this);
                        break;
                    case R.id.Education8:
                        PreferanceManager.putString(Config.KEY_Education,"7. Master’s degree",homepage.this);
                    case R.id.Education9:
                        PreferanceManager.putString(Config.KEY_Education,"8. Doctoral",homepage.this);
                        break;
                    case R.id.Education10:
                        PreferanceManager.putString(Config.KEY_Education,"9. Not Classified",homepage.this);
                        break;
                        default:
                        PreferanceManager.putString(Config.KEY_Education,"0. No Education",homepage.this);
                        break;

                }
            }
        });


        Button button = (Button) findViewById(R.id.NextP);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (DD.getError() != null) {
                    DD.setFocusable(true);
                } else if (CCHH.getError() != null) {
                    CCHH.setFocusable(true);
                } else if (PP.getError() != null) {
                    PP.setFocusable(true);
                }else if (TxtAge.getError() != null) {
                    TxtAge.setFocusable(true);
                }else if ((TxtAge.getText().toString().trim() == "") || TxtAge.getText().toString().trim().isEmpty()) {
                    TxtAge.setError("Enter valid input ");
                    TxtAge.setFocusable(true);
                } else if (((TxtAge.getText().toString().trim())!= " " ) && (Integer.parseInt(TxtAge.getText().toString().trim()) < 0) || (Integer.parseInt(TxtAge.getText().toString().trim()) > 150)) {
                    TxtAge.setError("Values Between 1 & 150 Only ");
                    TxtAge.setFocusable(true);
                }
                else {
                    // TODO Auto-generated method stub
                    PreferanceManager.putString(Config.KEY_DD, DD.getText().toString(), homepage.this);
                    PreferanceManager.putString(Config.KEY_CCHH, CCHH.getText().toString(), homepage.this);
                    PreferanceManager.putString(Config.KEY_PP, PP.getText().toString(), homepage.this);
                    PreferanceManager.putString(Config.KEY_Age, TxtAge.getText().toString(), homepage.this);
                    Intent i = new Intent(homepage.this, page_1.class);
                    startActivity(i);
                }
            }
            });

        Button btn = (Button) findViewById(R.id.PreviousP);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(homepage.this,MainActivity.class) ;
                startActivity(i);
                finish();
            }
        });
    }


}
