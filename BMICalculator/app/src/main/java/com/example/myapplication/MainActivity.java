package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButtonListenerMethod();
    }

    public void myButtonListenerMethod() {
        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final EditText heightText = (EditText) findViewById(R.id.heightInput);
                final EditText weightText = (EditText) findViewById(R.id.weightInput);
                final TextView BMIResult = (TextView) findViewById(R.id.BMIResult);
                final TextView BMICatagory = (TextView) findViewById(R.id.BMICatagory);

                String heightStr = heightText.getText().toString();
                String weightStr = weightText.getText().toString();
                String BMI_Cat;

                double height = Double.parseDouble(heightStr);
                double weight = Double.parseDouble(weightStr);
                double BMI = (weight) / (height * height);


                BMIResult.setText(Double.toString(BMI));


                if (BMI < 15) {
                    BMI_Cat = "Very Severely Underweight";
                }
                else if (BMI < 16) {
                    BMI_Cat = "Severely Underweight";
                }
                else if (BMI < 18.5) {
                    BMI_Cat = "Underweight";
                }
                else if (BMI < 25) {
                    BMI_Cat = "Normal";
                }
                else if (BMI < 30) {
                    BMI_Cat = "Overweight";
                }
                else if (BMI < 35) {
                    BMI_Cat = "Moderately Overweight";
                }
                else if (BMI < 40) {
                    BMI_Cat = "Severely Overweight";
                }
                else {
                    BMI_Cat = "Very severely Overweight";
                }

                BMICatagory.setText(BMI_Cat);
            }
        });
    }
}