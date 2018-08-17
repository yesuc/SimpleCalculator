package com.example.carteryesu.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addtoggleButton = findViewById(R.id.addtoggleButton);
        Button subtoggleButton = findViewById(R.id.subtoggleButton);

        addtoggleButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText input1editText = findViewById(R.id.input1editText);
                EditText input2editText = findViewById(R.id.input2editText);
                TextView result = findViewById(R.id.resultstextView);

                int sum = Integer.parseInt(input1editText.getText().toString()) + Integer.parseInt(input2editText.getText().toString());
                result.setText(Integer.toString(sum));
            }
        });
    }
}
