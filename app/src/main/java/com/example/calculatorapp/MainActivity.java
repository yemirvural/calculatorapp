package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtResult, txtNumber1, txtNumber2, txtNumberNo;
    private String number1, number2, numberNo;
    private int num1, num2, result;

    private Calculate calculate;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtResult = (TextView)findViewById(R.id.txtResult);
        txtNumber1 = (TextView)findViewById(R.id.txtNumber1);
        txtNumber2 = (TextView)findViewById(R.id.txtNumber2);

        txtNumber1.setText(String.valueOf(result));
        txtNumber2.setText(String.valueOf(num2));


        this.numberNo = number1;
        this.txtNumberNo = txtNumber1;
    }
    public void typeNumber(View view) {
        String buttonValue = ((TextView) view).getText().toString();
        if (TextUtils.isDigitsOnly(buttonValue)) {
            if (TextUtils.isEmpty(numberNo)) {
                numberNo = buttonValue;
            } else {
                numberNo += buttonValue;
            }
            txtNumberNo.setText(numberNo);
        }
        if (view.getId() == R.id.assignBtn) {
            txtResult.setText(String.valueOf(result));
        }
    }
    public void btnCalculate(View view){
        if(txtNumber1.getText().toString() != null){
            this.numberNo = number2;
            this.txtNumberNo = txtNumber2;
        }

        num1 = Integer.parseInt(txtNumber1.getText().toString());
        num2 = Integer.parseInt(txtNumber2.getText().toString());
        calculate = new Calculate(num1, num2);

        if (view.getId() == R.id.addBtn) {
            result = calculate.add();
        }
        if (view.getId() == R.id.subtractBtn) {
            result = calculate.subtract();
        }
        if (view.getId() == R.id.multiplyBtn) {
            result = calculate.multiply();
        }
        if (view.getId() == R.id.divideBtn) {
            result = calculate.divide();
        }
        if (view.getId() == R.id.resetBtn) {
            num1 = 0;
            num2 = 0;
            txtNumber1.setText("0");
            txtNumber2.setText("0");
            result = 0;
            this.numberNo = number1;
            this.txtNumberNo = txtNumber1;
        }
    }
}