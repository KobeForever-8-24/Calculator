package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultPageActivity extends AppCompatActivity {
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_page);

        resultText = (TextView) findViewById(R.id.resultTextView);
        Intent intent = getIntent();
        int res = intent.getIntExtra("result", 0);
        String result = Integer.toString(res);
        resultText.setText(result);
    }
}