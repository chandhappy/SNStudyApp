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
import android.widget.Toast;

public class page_6 extends AppCompatActivity {
    RadioButton ParentalHistoryofHeartattackNo, ParentalHistoryofHeartattackYes;
    RadioGroup ParentalHistoryHeartAttackRdBtnGrp;
    EditText TxtHeight, Txtweight, TxtWaist, TxtHip, TxtBloodpressureSystolic, TxtBloodpressureDiastolic, TxtHbA1c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_6);

        /// ParentalHistoryofHeartattack
        ParentalHistoryofHeartattackNo = (RadioButton) findViewById(R.id.ParentalHistoryofHeartattackNo);
        ParentalHistoryofHeartattackYes = (RadioButton) findViewById(R.id.ParentalHistoryofHeartattackYes);


        if (PreferanceManager.getString(Config.KEY_Stress, page_6.this).equals("0. No")) {
            ParentalHistoryofHeartattackNo.setChecked(true);
            ParentalHistoryofHeartattackYes.setChecked(false);
        }
        if (PreferanceManager.getString(Config.KEY_Stress, page_6.this).equals("1. Yes")) {
            ParentalHistoryofHeartattackNo.setChecked(false);
            ParentalHistoryofHeartattackYes.setChecked(true);
        }


        ParentalHistoryHeartAttackRdBtnGrp = (RadioGroup) findViewById(R.id.ParentalHistoryHeartAttackRdBtnGrp);
        ParentalHistoryHeartAttackRdBtnGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.ParentalHistoryofHeartattackNo:
                        PreferanceManager.putString(Config.KEY_ParentalHistoryHeartattack, "0. No", page_6.this);
                        break;
                    case R.id.ParentalHistoryofHeartattackYes:
                        PreferanceManager.putString(Config.KEY_ParentalHistoryHeartattack, "1. Yes", page_6.this);
                        break;
                    default:
                        PreferanceManager.putString(Config.KEY_ParentalHistoryHeartattack, "0. No", page_6.this);
                        break;
                }
            }
        });


        ///Height
        TxtHeight = (EditText) findViewById(R.id.TxtHeight);
        TxtHeight.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if ((TxtHeight.getText().toString() == "") || TxtHeight.getText().toString().isEmpty()) {
                    TxtHeight.setError("Enter valid input ");
                } else if (((TxtHeight.getText().toString()) != " ") && (Integer.parseInt(TxtHeight.getText().toString()) < 70) || (Integer.parseInt(TxtHeight.getText().toString()) > 200)) {
                    TxtHeight.setError("Values Between 70 & 200 Only ");
                }
            }
        });
        TxtHeight.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            public void afterTextChanged(Editable editable) {
                if ((TxtHeight.getText().toString() == "") || TxtHeight.getText().toString().isEmpty()) {
                    TxtHeight.setError("Enter valid input ");
                } else if (((TxtHeight.getText().toString()) != " ") && (Integer.parseInt(TxtHeight.getText().toString()) < 70) || (Integer.parseInt(TxtHeight.getText().toString()) > 200)) {
                    TxtHeight.setError("Values Between 70 & 200 Only ");
                }
            }
        });

        //weight
        Txtweight = (EditText) findViewById(R.id.Txtweight);
        Txtweight.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if ((Txtweight.getText().toString() == "") || Txtweight.getText().toString().isEmpty()) {
                    Txtweight.setError("Enter valid input ");
                } else if (((Txtweight.getText().toString()) != " ") && (Integer.parseInt(Txtweight.getText().toString()) < 30) || (Integer.parseInt(Txtweight.getText().toString()) > 200)) {
                    Txtweight.setError("Values Between 30 & 200 Only ");
                }
            }
        });
        Txtweight.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            public void afterTextChanged(Editable editable) {
                if ((Txtweight.getText().toString() == "") || Txtweight.getText().toString().isEmpty()) {
                    Txtweight.setError("Enter valid input ");
                } else if (((Txtweight.getText().toString()) != " ") && (Integer.parseInt(Txtweight.getText().toString()) < 30) || (Integer.parseInt(Txtweight.getText().toString()) > 200)) {
                    Txtweight.setError("Values Between 30 & 200 Only ");
                }
            }
        });
        ///waist
        TxtWaist = (EditText) findViewById(R.id.TxtWaist);
        TxtWaist.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if ((TxtWaist.getText().toString() == "") || TxtWaist.getText().toString().isEmpty()) {
                    TxtWaist.setError("Enter valid input ");
                } else if (((TxtWaist.getText().toString()) != " ") && (Integer.parseInt(TxtWaist.getText().toString()) < 30) || (Integer.parseInt(TxtWaist.getText().toString()) > 200)) {
                    TxtWaist.setError("Values Between 30 & 200 Only ");
                }
            }
        });
        TxtWaist.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            public void afterTextChanged(Editable editable) {
                if ((TxtWaist.getText().toString() == "") || TxtWaist.getText().toString().isEmpty()) {
                    TxtWaist.setError("Enter valid input ");
                } else if (((TxtWaist.getText().toString()) != " ") && (Integer.parseInt(TxtWaist.getText().toString()) < 30) || (Integer.parseInt(TxtWaist.getText().toString()) > 200)) {
                    TxtWaist.setError("Values Between 30 & 200 Only ");
                }
            }
        });

        ///Hip
        TxtHip = (EditText) findViewById(R.id.TxtHip);
        TxtHip.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if ((TxtHip.getText().toString() == "") || TxtHip.getText().toString().isEmpty()) {
                    TxtHip.setError("Enter valid input ");
                } else if (((TxtHip.getText().toString()) != " ") && (Integer.parseInt(TxtHip.getText().toString()) < 30) || (Integer.parseInt(TxtHip.getText().toString()) > 200)) {
                    TxtHip.setError("Values Between 30 & 200 Only ");
                }
            }
        });
        TxtHip.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            public void afterTextChanged(Editable editable) {
                if ((TxtHip.getText().toString() == "") || TxtHip.getText().toString().isEmpty()) {
                    TxtHip.setError("Enter valid input ");
                } else if (((TxtHip.getText().toString()) != " ") && (Integer.parseInt(TxtHip.getText().toString()) < 30) || (Integer.parseInt(TxtHip.getText().toString()) > 200)) {
                    TxtHip.setError("Values Between 30 & 200 Only ");
                }
            }
        });

        ///Bloodpressuresystolic
        TxtBloodpressureSystolic = (EditText) findViewById(R.id.TxtBloodpressureSystolic);
        TxtBloodpressureSystolic.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if ((TxtBloodpressureSystolic.getText().toString() == "") || TxtBloodpressureSystolic.getText().toString().isEmpty()) {
                    TxtBloodpressureSystolic.setError("Enter valid input ");
                } else if (((TxtBloodpressureSystolic.getText().toString()) != " ") && (Integer.parseInt(TxtBloodpressureSystolic.getText().toString()) < 30) || (Integer.parseInt(TxtBloodpressureSystolic.getText().toString()) > 200)) {
                    TxtBloodpressureSystolic.setError("Values Between 30 & 200 Only ");
                }
            }
        });
        TxtBloodpressureSystolic.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            public void afterTextChanged(Editable editable) {
                if ((TxtBloodpressureSystolic.getText().toString() == "") || TxtBloodpressureSystolic.getText().toString().isEmpty()) {
                    TxtBloodpressureSystolic.setError("Enter valid input ");
                } else if (((TxtBloodpressureSystolic.getText().toString()) != " ") && (Integer.parseInt(TxtBloodpressureSystolic.getText().toString()) < 30) || (Integer.parseInt(TxtBloodpressureSystolic.getText().toString()) > 200)) {
                    TxtBloodpressureSystolic.setError("Values Between 30 & 200 Only ");
                }
            }
        });

        ///Bloodpressurediastolic
        TxtBloodpressureDiastolic = (EditText) findViewById(R.id.TxtBloodpressureDiastolic);
        TxtBloodpressureDiastolic.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if ((TxtBloodpressureDiastolic.getText().toString() == "") || TxtBloodpressureDiastolic.getText().toString().isEmpty()) {
                    TxtBloodpressureDiastolic.setError("Enter valid input ");
                } else if (((TxtBloodpressureDiastolic.getText().toString()) != " ") && (Integer.parseInt(TxtBloodpressureDiastolic.getText().toString()) < 30) || (Integer.parseInt(TxtBloodpressureDiastolic.getText().toString()) > 200)) {
                    TxtBloodpressureDiastolic.setError("Values Between 30 & 200 Only ");
                }
            }
        });
        TxtBloodpressureDiastolic.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            public void afterTextChanged(Editable editable) {
                if ((TxtBloodpressureDiastolic.getText().toString() == "") || TxtBloodpressureDiastolic.getText().toString().isEmpty()) {
                    TxtBloodpressureDiastolic.setError("Enter valid input ");
                } else if (((TxtBloodpressureDiastolic.getText().toString()) != " ") && (Integer.parseInt(TxtBloodpressureDiastolic.getText().toString()) < 30) || (Integer.parseInt(TxtBloodpressureDiastolic.getText().toString()) > 200)) {
                    TxtBloodpressureDiastolic.setError("Values Between 30 & 200 Only ");
                }
            }
        });

        ///Hba1c
        TxtHbA1c = (EditText) findViewById(R.id.TxtHbA1c);
        TxtHbA1c.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if ((TxtHbA1c.getText().toString() == "") || TxtHbA1c.getText().toString().isEmpty()) {
                    TxtHbA1c.setError("Enter valid input ");
                } else if (((TxtHbA1c.getText().toString()) != " ") && (Integer.parseInt(TxtHbA1c.getText().toString()) < 4) || (Integer.parseInt(TxtHbA1c.getText().toString()) > 15)) {
                    TxtHbA1c.setError("Values Between 4 & 15 Only ");
                }
            }
        });

        TxtHbA1c.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            public void afterTextChanged(Editable editable) {
                if ((TxtHbA1c.getText().toString() == "") || TxtHbA1c.getText().toString().isEmpty()) {
                    TxtHbA1c.setError("Enter valid input ");
                } else if (((TxtHbA1c.getText().toString()) != " ") && (Integer.parseInt(TxtHbA1c.getText().toString()) < 4) || (Integer.parseInt(TxtHbA1c.getText().toString()) > 15)) {
                    TxtHbA1c.setError("Values Between 4 & 15 Only ");
                }
            }
        });

        if (PreferanceManager.getString(Config.KEY_Height, page_6.this) != "") {
            TxtHeight.setText(PreferanceManager.getString(Config.KEY_Height, page_6.this));
        }
        if (PreferanceManager.getString(Config.KEY_Weight, page_6.this) != "") {
            Txtweight.setText(PreferanceManager.getString(Config.KEY_Weight, page_6.this));
        }
        if (PreferanceManager.getString(Config.KEY_Waist, page_6.this) != "") {
            TxtWaist.setText(PreferanceManager.getString(Config.KEY_Waist, page_6.this));
        }

        if (PreferanceManager.getString(Config.KEY_Hip, page_6.this) != "") {
            TxtHip.setText(PreferanceManager.getString(Config.KEY_Hip, page_6.this));
        }
        if (PreferanceManager.getString(Config.KEY_BloodpressureSystolic, page_6.this) != "") {
            TxtBloodpressureSystolic.setText(PreferanceManager.getString(Config.KEY_BloodpressureSystolic, page_6.this));
        }
        if (PreferanceManager.getString(Config.KEY_BloodpressureDiastolic, page_6.this) != "") {
            TxtBloodpressureDiastolic.setText(PreferanceManager.getString(Config.KEY_BloodpressureDiastolic, page_6.this));
        }

        if (PreferanceManager.getString(Config.KEY_HbA1c, page_6.this) != "") {
            TxtHbA1c.setText(PreferanceManager.getString(Config.KEY_HbA1c, page_6.this));
        }

        Button button12 = (Button) findViewById(R.id.NextP6);
        button12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (TxtHeight.getError() != null) {
                    TxtHeight.setFocusable(true);
                } else if (Txtweight.getError() != null) {
                    Txtweight.setFocusable(true);
                } else if (TxtWaist.getError() != null) {
                    TxtWaist.setFocusable(true);
                } else if (TxtHip.getError() != null) {
                    TxtHip.setFocusable(true);
                } else if (TxtBloodpressureSystolic.getError() != null) {
                    TxtBloodpressureSystolic.setFocusable(true);
                } else if (TxtBloodpressureDiastolic.getError() != null) {
                    TxtBloodpressureDiastolic.setFocusable(true);
                } else if (TxtHbA1c.getError() != null) {
                    TxtHbA1c.setFocusable(true);
                } else {
                    PreferanceManager.putString(Config.KEY_Height, TxtHeight.getText().toString(), page_6.this);
                    PreferanceManager.putString(Config.KEY_Weight, Txtweight.getText().toString(), page_6.this);
                    PreferanceManager.putString(Config.KEY_Waist, TxtWaist.getText().toString(), page_6.this);
                    PreferanceManager.putString(Config.KEY_Hip, TxtHip.getText().toString(), page_6.this);
                    PreferanceManager.putString(Config.KEY_BloodpressureSystolic, TxtBloodpressureSystolic.getText().toString(), page_6.this);
                    PreferanceManager.putString(Config.KEY_BloodpressureDiastolic, TxtBloodpressureDiastolic.getText().toString(), page_6.this);
                    PreferanceManager.putString(Config.KEY_HbA1c, TxtHbA1c.getText().toString(), page_6.this);

                    Intent i = new Intent(page_6.this, page_7.class);
                    startActivity(i);
                }


            }
        });

        Button button13 = (Button) findViewById(R.id.PreviousP6);
        button13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(page_6.this, page_5.class);
                startActivity(i);
            }
        });
    }
}
