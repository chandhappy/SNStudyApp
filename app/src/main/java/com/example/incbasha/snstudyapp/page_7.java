package com.example.incbasha.snstudyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class page_7 extends AppCompatActivity {
    EditText TxtUrineACR, TxtLipidsHDL, TxtLipidsLDL, TxtLipidTriglyceride, TxtCholesterol, TxtTCHDL, TxtNonHDL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_7);


        ///UrineACR
        TxtUrineACR = (EditText) findViewById(R.id.TxtUrineACR);
        TxtUrineACR.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if ((TxtUrineACR.getText().toString() == "") || TxtUrineACR.getText().toString().isEmpty()) {
                    TxtUrineACR.setError("Enter valid input ");
                } else if (((TxtUrineACR.getText().toString()) != " ") && (Integer.parseInt(TxtUrineACR.getText().toString()) < 0) || (Integer.parseInt(TxtUrineACR.getText().toString()) > 1225)) {
                    TxtUrineACR.setError("Values Between 0 & 1225 Only ");
                }
            }
        });
        TxtUrineACR.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            public void afterTextChanged(Editable editable) {
                if ((TxtUrineACR.getText().toString() == "") || TxtUrineACR.getText().toString().isEmpty()) {
                    TxtUrineACR.setError("Enter valid input ");
                } else if (((TxtUrineACR.getText().toString()) != " ") && (Integer.parseInt(TxtUrineACR.getText().toString()) < 0) || (Integer.parseInt(TxtUrineACR.getText().toString()) > 1225)) {
                    TxtUrineACR.setError("Values Between 0 & 1225 Only ");
                }
            }
        });

        if (PreferanceManager.getString(Config.KEY_UrineACR, page_7.this) != "") {
            TxtUrineACR.setText(PreferanceManager.getString(Config.KEY_UrineACR, page_7.this));
        }
        ///LipidsHDL
        TxtLipidsHDL = (EditText) findViewById(R.id.TxtLipidsHDL);
        TxtLipidsHDL.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if ((TxtLipidsHDL.getText().toString() == "") || TxtLipidsHDL.getText().toString().isEmpty()) {
                    TxtLipidsHDL.setError("Enter valid input ");
                } else if (((TxtLipidsHDL.getText().toString()) != " ") && (Integer.parseInt(TxtLipidsHDL.getText().toString()) < 15) || (Integer.parseInt(TxtLipidsHDL.getText().toString()) > 100)) {
                    TxtLipidsHDL.setError("Values Between 15 & 100 Only ");
                }
            }
        });
        TxtLipidsHDL.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            public void afterTextChanged(Editable editable) {
                if ((TxtLipidsHDL.getText().toString() == "") || TxtLipidsHDL.getText().toString().isEmpty()) {
                    TxtLipidsHDL.setError("Enter valid input ");
                } else if (((TxtLipidsHDL.getText().toString()) != " ") && (Integer.parseInt(TxtLipidsHDL.getText().toString()) < 15) || (Integer.parseInt(TxtLipidsHDL.getText().toString()) > 100)) {
                    TxtLipidsHDL.setError("Values Between 15 & 100 Only ");
                }
            }
        });

        if (PreferanceManager.getString(Config.KEY_LipidHDL, page_7.this) != "") {
            TxtUrineACR.setText(PreferanceManager.getString(Config.KEY_LipidHDL, page_7.this));
        }

        ///LipidsLDL
        TxtLipidsLDL = (EditText) findViewById(R.id.TxtLipidsLDL);
        TxtLipidsLDL.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if ((TxtLipidsLDL.getText().toString() == "") || TxtLipidsLDL.getText().toString().isEmpty()) {
                    TxtLipidsLDL.setError("Enter valid input ");
                } else if (((TxtLipidsLDL.getText().toString()) != " ") && (Integer.parseInt(TxtLipidsLDL.getText().toString()) < 0) || (Integer.parseInt(TxtLipidsLDL.getText().toString()) > 476)) {
                    TxtLipidsLDL.setError("Values Between 0 & 476 Only ");
                }
            }
        });
        TxtLipidsLDL.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            public void afterTextChanged(Editable editable) {
                if ((TxtLipidsLDL.getText().toString() == "") || TxtLipidsLDL.getText().toString().isEmpty()) {
                    TxtLipidsLDL.setError("Enter valid input ");
                } else if (((TxtLipidsLDL.getText().toString()) != " ") && (Integer.parseInt(TxtLipidsLDL.getText().toString()) < 0) || (Integer.parseInt(TxtLipidsLDL.getText().toString()) > 476)) {
                    TxtLipidsLDL.setError("Values Between 0 & 476 Only ");
                }
            }
        });

        if (PreferanceManager.getString(Config.KEY_LipidLDL, page_7.this) != "") {
            TxtLipidsLDL.setText(PreferanceManager.getString(Config.KEY_LipidLDL, page_7.this));
        }

        ///LipidTriglyceride
        TxtLipidTriglyceride = (EditText) findViewById(R.id.TxtLipidTriglyceride);
        TxtLipidTriglyceride.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if ((TxtLipidTriglyceride.getText().toString() == "") || TxtLipidTriglyceride.getText().toString().isEmpty()) {
                    TxtLipidTriglyceride.setError("Enter valid input ");
                } else if (((TxtLipidTriglyceride.getText().toString()) != " ") && (Integer.parseInt(TxtLipidTriglyceride.getText().toString()) < 45) || (Integer.parseInt(TxtLipidTriglyceride.getText().toString()) > 650)) {
                    TxtLipidTriglyceride.setError("Values Between 45 & 650 Only ");
                }
            }
        });
        TxtLipidTriglyceride.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            public void afterTextChanged(Editable editable) {
                if ((TxtLipidTriglyceride.getText().toString() == "") || TxtLipidTriglyceride.getText().toString().isEmpty()) {
                    TxtLipidTriglyceride.setError("Enter valid input ");
                } else if (((TxtLipidTriglyceride.getText().toString()) != " ") && (Integer.parseInt(TxtLipidTriglyceride.getText().toString()) < 45) || (Integer.parseInt(TxtLipidTriglyceride.getText().toString()) > 650)) {
                    TxtLipidTriglyceride.setError("Values Between 45 & 650 Only ");
                }
            }
        });

        if (PreferanceManager.getString(Config.KEY_LipidTriglyceride, page_7.this) != "") {
            TxtLipidTriglyceride.setText(PreferanceManager.getString(Config.KEY_LipidTriglyceride, page_7.this));
        }

        ///Cholesterol
        TxtCholesterol = (EditText) findViewById(R.id.TxtCholesterol);
        TxtCholesterol.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if ((TxtCholesterol.getText().toString() == "") || TxtCholesterol.getText().toString().isEmpty()) {
                    TxtCholesterol.setError("Enter valid input ");
                } else if (((TxtCholesterol.getText().toString()) != " ") && (Integer.parseInt(TxtCholesterol.getText().toString()) < 100) || (Integer.parseInt(TxtCholesterol.getText().toString()) > 500)) {
                    TxtCholesterol.setError("Values Between 100 & 500 Only ");
                }
            }
        });
        TxtCholesterol.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            public void afterTextChanged(Editable editable) {
                if ((TxtCholesterol.getText().toString() == "") || TxtCholesterol.getText().toString().isEmpty()) {
                    TxtCholesterol.setError("Enter valid input ");
                } else if (((TxtCholesterol.getText().toString()) != " ") && (Integer.parseInt(TxtCholesterol.getText().toString()) < 100) || (Integer.parseInt(TxtCholesterol.getText().toString()) > 500)) {
                    TxtCholesterol.setError("Values Between 100 & 500 Only ");
                }
            }
        });

        if (PreferanceManager.getString(Config.KEY_TotalCholesterol, page_7.this) != "") {
            TxtCholesterol.setText(PreferanceManager.getString(Config.KEY_TotalCholesterol, page_7.this));
        }


        ///TCHDL
        TxtTCHDL = (EditText) findViewById(R.id.TxtTCHDL);
        TxtTCHDL.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if ((TxtTCHDL.getText().toString() == "") || TxtTCHDL.getText().toString().isEmpty()) {
                    TxtTCHDL.setError("Enter valid input ");
                } else if (((TxtTCHDL.getText().toString()) != " ") && (Integer.parseInt(TxtTCHDL.getText().toString()) < 1) || (Integer.parseInt(TxtTCHDL.getText().toString()) > 33.3)) {
                    TxtTCHDL.setError("Values Between 1 & 33.3 Only ");
                }
            }
        });
        TxtTCHDL.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            public void afterTextChanged(Editable editable) {
                if ((TxtTCHDL.getText().toString() == "") || TxtTCHDL.getText().toString().isEmpty()) {
                    TxtTCHDL.setError("Enter valid input ");
                } else if (((TxtTCHDL.getText().toString()) != " ") && (Integer.parseInt(TxtTCHDL.getText().toString()) < 1) || (Integer.parseInt(TxtTCHDL.getText().toString()) > 33.3)) {
                    TxtTCHDL.setError("Values Between 1 & 33.3 Only ");
                }
            }
        });

        if (PreferanceManager.getString(Config.KEY_TCHDL, page_7.this) != "") {
            TxtTCHDL.setText(PreferanceManager.getString(Config.KEY_TCHDL, page_7.this));
        }

        ///NonHDL
        TxtNonHDL = (EditText) findViewById(R.id.TxtNonHDL);
        TxtNonHDL.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if ((TxtNonHDL.getText().toString() == "") || TxtNonHDL.getText().toString().isEmpty()) {
                    TxtNonHDL.setError("Enter valid input ");
                } else if (((TxtNonHDL.getText().toString()) != " ") && (Integer.parseInt(TxtNonHDL.getText().toString()) < 0) || (Integer.parseInt(TxtNonHDL.getText().toString()) > 200)) {
                    TxtNonHDL.setError("Values Between 0 & 200 Only ");
                }
            }
        });
        TxtNonHDL.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            public void afterTextChanged(Editable editable) {
                if ((TxtNonHDL.getText().toString() == "") || TxtNonHDL.getText().toString().isEmpty()) {
                    TxtNonHDL.setError("Enter valid input ");
                } else if (((TxtNonHDL.getText().toString()) != " ") && (Integer.parseInt(TxtNonHDL.getText().toString()) < 0) || (Integer.parseInt(TxtNonHDL.getText().toString()) > 200)) {
                    TxtNonHDL.setError("Values Between 0 & 200 Only ");
                }
            }
        });

        if (PreferanceManager.getString(Config.KEY_NonHDL, page_7.this) != "") {
            TxtNonHDL.setText(PreferanceManager.getString(Config.KEY_NonHDL, page_7.this));
        }


        Button button14 = (Button) findViewById(R.id.NextP7);
        button14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (TxtUrineACR.getError() != null) {
                    TxtUrineACR.setFocusable(true);
                } else if (TxtLipidsHDL.getError() != null) {
                    TxtLipidsHDL.setFocusable(true);
                } else if (TxtLipidsLDL.getError() != null) {
                    TxtLipidsLDL.setFocusable(true);
                } else if (TxtLipidTriglyceride.getError() != null) {
                    TxtLipidTriglyceride.setFocusable(true);
                } else if (TxtCholesterol.getError() != null) {
                    TxtCholesterol.setFocusable(true);
                } else if (TxtTCHDL.getError() != null) {
                    TxtTCHDL.setFocusable(true);
                } else if (TxtNonHDL.getError() != null) {
                    TxtNonHDL.setFocusable(true);
                } else {
                    PreferanceManager.putString(Config.KEY_UrineACR, TxtUrineACR.getText().toString(), page_7.this);
                    PreferanceManager.putString(Config.KEY_LipidHDL, TxtLipidsHDL.getText().toString(), page_7.this);
                    PreferanceManager.putString(Config.KEY_LipidLDL, TxtLipidsLDL.getText().toString(), page_7.this);
                    PreferanceManager.putString(Config.KEY_LipidTriglyceride, TxtLipidTriglyceride.getText().toString(), page_7.this);
                    PreferanceManager.putString(Config.KEY_TotalCholesterol, TxtCholesterol.getText().toString(), page_7.this);
                    PreferanceManager.putString(Config.KEY_TCHDL, TxtTCHDL.getText().toString(), page_7.this);
                    PreferanceManager.putString(Config.KEY_NonHDL, TxtNonHDL.getText().toString(), page_7.this);
                    Intent i = new Intent(page_7.this, MainActivity.class);
                    startActivity(i);
                }

            }
        });

        Button button15 = (Button) findViewById(R.id.PreviousP7);
        button15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(page_7.this, page_6.class);
                startActivity(i);
            }
        });
    }
}
