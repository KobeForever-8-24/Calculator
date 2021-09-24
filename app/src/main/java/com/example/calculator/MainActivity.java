package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plusFunction(View view){
        EditText text1 = (EditText) findViewById(R.id.firstNumber);
        EditText text2 = (EditText) findViewById(R.id.secondNumber);
        int first = Integer.parseInt(text1.getText().toString());
        int second = Integer.parseInt(text2.getText().toString());
        int result = first + second;
        goToResultPage(result);
    }

    public void minusFunction(View view){
        EditText text1 = (EditText) findViewById(R.id.firstNumber);
        EditText text2 = (EditText) findViewById(R.id.secondNumber);
        int first = Integer.parseInt(text1.getText().toString());
        int second = Integer.parseInt(text2.getText().toString());
        int result = first - second;
        goToResultPage(result);
    }

    public void multiplyFunction(View view){
        EditText text1 = (EditText) findViewById(R.id.firstNumber);
        EditText text2 = (EditText) findViewById(R.id.secondNumber);
        int first = Integer.parseInt(text1.getText().toString());
        int second = Integer.parseInt(text2.getText().toString());
        int result = first * second;
        goToResultPage(result);
    }

    public void divideFunction(View view){
        EditText text1 = (EditText) findViewById(R.id.firstNumber);
        EditText text2 = (EditText) findViewById(R.id.secondNumber);
        int first = Integer.parseInt(text1.getText().toString());
        int second = Integer.parseInt(text2.getText().toString());
        int result = first / second;
        goToResultPage(result);
    }

    public void goToResultPage(int result){
        Intent intent = new Intent(this, ResultPageActivity.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }



}