package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtResult, txtNumber1, txtNumber2, txtNumberNo;
    private String number1, number2, numberNo;
    private int num1, num2, result = 10;

    private Calculate calculate;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtResult = (TextView)findViewById(R.id.txtResult);
        txtNumber1 = (TextView)findViewById(R.id.txtNumber1);
        txtNumber2 = (TextView)findViewById(R.id.txtNumber2);

        txtNumber1.setText(String.valueOf(num1));
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
    }
    public void btnCalculate(View view){
        this.numberNo = number2;
        this.txtNumberNo = txtNumber2;
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
        txtResult.setText(String.valueOf(this.result));
    }
}