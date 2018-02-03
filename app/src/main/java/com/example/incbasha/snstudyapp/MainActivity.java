package com.example.incbasha.snstudyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.incbasha.snstudyapp.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Addcase = (Button) findViewById(R.id.AddCase);
        Addcase.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                PreferanceManager.putString(Config.KEY_DD,"",MainActivity.this);
                PreferanceManager.putString(Config.KEY_CCHH,"",MainActivity.this);
                PreferanceManager.putString(Config.KEY_PP,"",MainActivity.this);
                PreferanceManager.putString(Config.KEY_Age,"",MainActivity.this);
                PreferanceManager.putString(Config.KEY_Gender,"M",MainActivity.this);
                PreferanceManager.putString(Config.KEY_Education,"0. No Education",MainActivity.this);
                PreferanceManager.putString(Config.KEY_Salary,"",MainActivity.this);
                PreferanceManager.putString(Config.KEY_Occupation,"0. Not working: Health reason – DR",MainActivity.this);
                PreferanceManager.putString(Config.KEY_Smoking,"0. Non-smoker",MainActivity.this);
                PreferanceManager.putString(Config.KEY_SmokingCount," ",MainActivity.this);
                PreferanceManager.putString(Config.KEY_SecondHandSmoke,"0. No",MainActivity.this);
                PreferanceManager.putString(Config.KEY_PhysicalActivity,"0. Sedentary",MainActivity.this);
                PreferanceManager.putString(Config.KEY_Stress,"0. No",MainActivity.this);
                PreferanceManager.putString(Config.KEY_Depressed,"0. No",MainActivity.this);
                PreferanceManager.putString(Config.KEY_Diet,"",MainActivity.this);
                PreferanceManager.putString(Config.KEY_Diabetestype2,"0. No",MainActivity.this);
                PreferanceManager.putString(Config.KEY_DurationDiabetes,"",MainActivity.this);
                PreferanceManager.putString(Config.KEY_DiabetiesMellitus,"0. None / Diet controlled",MainActivity.this);
                PreferanceManager.putString(Config.KEY_ComplicationsDiabetiesMellitus,"1. None",MainActivity.this);
                PreferanceManager.putString(Config.KEY_TreatmentDiabeticRetinopathy,"0. No",MainActivity.this);
                PreferanceManager.putString(Config.KEY_CardiovascularDisease,"",MainActivity.this);
                PreferanceManager.putString(Config.KEY_BloodPressure," ",MainActivity.this);
                PreferanceManager.putString(Config.KEY_Statin,"0. No",MainActivity.this);
                PreferanceManager.putString(Config.KEY_StatinTxt,"",MainActivity.this);
                PreferanceManager.putString(Config.KEY_OcularHistory,"",MainActivity.this);
                PreferanceManager.putString(Config.KEY_ParentalDiabeticHistory,"1. Both parents non-diabetic",MainActivity.this);
                PreferanceManager.putString(Config.KEY_ParentalHistoryHeartattack,"0. No",MainActivity.this);
                PreferanceManager.putString(Config.KEY_Height,"",MainActivity.this);
                PreferanceManager.putString(Config.KEY_Weight,"",MainActivity.this);
                PreferanceManager.putString(Config.KEY_Waist,"",MainActivity.this);
                PreferanceManager.putString(Config.KEY_Hip,"",MainActivity.this);
                PreferanceManager.putString(Config.KEY_BloodpressureSystolic,"",MainActivity.this);
                PreferanceManager.putString(Config.KEY_BloodpressureDiastolic,"",MainActivity.this);
                PreferanceManager.putString(Config.KEY_HbA1c,"",MainActivity.this);
                PreferanceManager.putString(Config.KEY_UrineACR,"",MainActivity.this);
                PreferanceManager.putString(Config.KEY_LipidHDL,"",MainActivity.this);
                PreferanceManager.putString(Config.KEY_LipidLDL,"",MainActivity.this);
                PreferanceManager.putString(Config.KEY_LipidTriglyceride,"",MainActivity.this);
                PreferanceManager.putString(Config.KEY_TotalCholesterol,"",MainActivity.this);
                PreferanceManager.putString(Config.KEY_TCHDL,"",MainActivity.this);
                PreferanceManager.putString(Config.KEY_NonHDL,"",MainActivity.this);





                Intent i = new Intent(MainActivity.this,homepage.class);
                startActivity(i);
                finish();
            }
        });
    }
}
