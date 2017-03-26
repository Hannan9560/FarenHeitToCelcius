package com.example.hannantalukder.farenheittocelcius;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private  double value;
    private EditText valueET;
    private TextView answerTV;
    private Button calC, calF;

    private Calculation calculation;
    private Celcious celcious;
    private Farenheit farenheit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valueET = (EditText) findViewById(R.id.value);
        answerTV = (TextView) findViewById(R.id.answer);


        calculation = new Calculation();
        celcious = new Celcious();
        farenheit = new Farenheit();
    }

    public void calculation(View view) {

        value = Double.parseDouble(valueET.getText().toString());

        switch (view.getId())
        {
            case R.id.celciousbtn:
                value = (value - 32)/1.8;
                answerTV.setText(String.valueOf(value));
                break;
            case R.id.farenheitbtn:
                value = (value*1.8 + 32);
                answerTV.setText(String.valueOf(value));
                break;
        }
    }
}
