package com.example.radiobutton_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txt1;
    private EditText txt2;
    private TextView tw;
    private RadioButton rd1, rd2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (EditText) findViewById(R.id.txt_1);
        txt2 = (EditText) findViewById(R.id.txt_2);
        tw = (TextView)findViewById(R.id.text_view);
        rd1 = (RadioButton) findViewById(R.id.radio_1);
        rd2 = (RadioButton) findViewById(R.id.radio_2);
    }

    public void CalculateMethod (View view){
        String v1_stg = txt1.getText().toString();
        String v2_stg = txt2.getText().toString();
        int result = 0;
        int v1 = Integer.parseInt(v1_stg);
        int v2 = Integer.parseInt(v2_stg);

        if (rd1.isChecked()){
           result = v1 + v2;
        }
        else{
           result = v1 - v2;
        }

        String result_stg = String.valueOf(result);
        tw.setText(result_stg);

    }
}
