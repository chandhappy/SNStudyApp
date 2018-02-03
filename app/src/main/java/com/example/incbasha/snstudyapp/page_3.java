package com.example.incbasha.snstudyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class page_3 extends AppCompatActivity {

    RadioButton DepressedNo,DepressedYes,DiabetestypeNo,DiabetestypeYes;
    RadioGroup DepressedRdGrp,DiabetestypesRdGrp;
    CheckBox TxtDiet1,TxtDiet2,TxtDiet3,TxtDiet4,TxtDiet5;
    StringBuilder DietString = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_3);
        ///Depressed

        DepressedNo = (RadioButton) findViewById(R.id.DepressedNo);
        DepressedYes = (RadioButton) findViewById(R.id.DepressedYes);
        if(PreferanceManager.getString(Config.KEY_Depressed,page_3.this).equals("0. No")){
            DepressedNo.setChecked(true);
            DepressedYes.setChecked(false);


        }
        if(PreferanceManager.getString(Config.KEY_Depressed,page_3.this).equals("1. Yes")){
            DepressedNo.setChecked(false);
            DepressedYes.setChecked(true);

        }

        ///Diabetestype2
         DiabetestypeNo = (RadioButton) findViewById(R.id.DiabetestypeNo);
         DiabetestypeYes = (RadioButton) findViewById(R.id.DiabetestypeYes);
        if(PreferanceManager.getString(Config.KEY_Diabetestype2,page_3.this).equals("0. No")){
            DiabetestypeNo.setChecked(true);
            DiabetestypeYes.setChecked(false);
        }
        if(PreferanceManager.getString(Config.KEY_Diabetestype2,page_3.this).equals("1. Yes")){
            DiabetestypeNo.setChecked(false);
            DiabetestypeYes.setChecked(true);

        }


        /// Diet
         TxtDiet1 = (CheckBox)findViewById(R.id.TxtDiet1);
         TxtDiet2 = (CheckBox)findViewById(R.id.TxtDiet2);
         TxtDiet3 = (CheckBox)findViewById(R.id.TxtDiet3);
         TxtDiet4 = (CheckBox)findViewById(R.id.TxtDiet4);
         TxtDiet5 = (CheckBox)findViewById(R.id.TxtDiet5);
        if(!PreferanceManager.getString(Config.KEY_Diet,page_3.this).equals("")) {
            String[] dummy = PreferanceManager.getString(Config.KEY_Diet, page_3.this).split(",");
            for (int i = 0; i < (dummy.length); i++) {
                switch (dummy[i]) {
                    case "0. Salty food or snacks one or more times a day":
                        TxtDiet1.setChecked(true);
                        break;
                    case "1. Deep fried foods or snacks or fast foods 3 or more times per week":
                        TxtDiet2.setChecked(true);
                        break;
                    case "2. Eat fruits less than once per day":
                        TxtDiet3.setChecked(true);
                        break;
                    case "3. Eat vegetables less than once per day":
                        TxtDiet4.setChecked(true);
                        break;
                    case "4. Eat meat and / or poultry 2 or more times daily":
                        TxtDiet5.setChecked(true);
                        break;
                }
            }
        }


        DepressedRdGrp = (RadioGroup) findViewById(R.id.DepressedRdGrp);
        DepressedRdGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i) {
                    case R.id.DepressedNo:
                        PreferanceManager.putString(Config.KEY_Depressed,"0. No",page_3.this);
                        break;
                    case R.id.DepressedYes:
                        PreferanceManager.putString(Config.KEY_Depressed,"1. Yes",page_3.this);
                        break;
                    default:
                        PreferanceManager.putString(Config.KEY_Depressed,"0. No",page_3.this);
                        break;
                }
            }
        });


        DiabetestypesRdGrp = (RadioGroup) findViewById(R.id.DiabetestypesRdGrp);
        DiabetestypesRdGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i) {
                    case R.id.DiabetestypeNo:
                        PreferanceManager.putString(Config.KEY_Diabetestype2,"0. No",page_3.this);
                        break;
                    case R.id.DiabetestypeYes:
                        PreferanceManager.putString(Config.KEY_Diabetestype2,"1. Yes",page_3.this);
                        break;
                    default:
                        PreferanceManager.putString(Config.KEY_Diabetestype2,"0. No",page_3.this);
                        break;
                }
            }
        });

        DiabetestypesRdGrp = (RadioGroup) findViewById(R.id.DiabetestypesRdGrp);
        DiabetestypesRdGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i) {
                    case R.id.DiabetestypeNo:
                        PreferanceManager.putString(Config.KEY_Diabetestype2,"0. No",page_3.this);
                        break;
                    case R.id.DiabetestypeYes:
                        PreferanceManager.putString(Config.KEY_Diabetestype2,"1. Yes",page_3.this);
                        break;
                    default:
                        PreferanceManager.putString(Config.KEY_Diabetestype2,"0. No",page_3.this);
                        break;
                }
            }
        });





        Button button6 = (Button) findViewById(R.id.NextP3);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub

                if (TxtDiet1.isChecked()) {
                    DietString.append("0. Salty food or snacks one or more times a day,");
                }
                if (TxtDiet2.isChecked()) {
                    DietString.append("1. Deep fried foods or snacks or fast foods 3 or more times per week,");
                }
                if (TxtDiet3.isChecked()) {
                    DietString.append("2. Eat fruits less than once per day,");
                }
                if (TxtDiet4.isChecked()) {
                    DietString.append("3. Eat vegetables less than once per day,");
                }
                if (TxtDiet5.isChecked()) {
                    DietString.append("4. Eat meat and / or poultry 2 or more times daily,");
                }
                if (DietString.length() > 0) {
                    PreferanceManager.putString(Config.KEY_Diet, DietString.toString(), page_3.this);
                    if (PreferanceManager.getString(Config.KEY_Diabetestype2, page_3.this).equals("1. Yes")) {
                        Intent i = new Intent(page_3.this, page_4.class);
                        startActivity(i);
                    } else {
                        Intent i = new Intent(page_3.this, page_5.class);
                        i.putExtra("back2Page", true);
                        startActivity(i);
                    }
                }else {
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
