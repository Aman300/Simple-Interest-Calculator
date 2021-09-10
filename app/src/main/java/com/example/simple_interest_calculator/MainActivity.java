package com.example.simple_interest_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText amount_1;
    EditText rate_1;
    EditText month_1;
    TextView result;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        amount_1 = findViewById(R.id.amount);
        rate_1 = findViewById(R.id.rate);
        month_1 = findViewById(R.id.month);
        result = findViewById(R.id.output);
        button = findViewById(R.id.button);

        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(amount_1.length()==0){
                    amount_1.setError("Enter amount");
                }
                else if(rate_1.length()==0){
                    rate_1.setError("Enter rate");
                }
                else if(month_1.length()==0){
                    month_1.setError("Enter month");
                }
                else{
                    double value_1 = Double.parseDouble(amount_1.getText().toString());
                    double value_2 = Double.parseDouble(rate_1.getText().toString());
                    double value_3 = Double.parseDouble(month_1.getText().toString());
                    double lastvalue = (value_1 * value_2 * value_3) / 100;
                    result.setText("Total Interest = "+lastvalue);
                }
            }
        } );
    }
}