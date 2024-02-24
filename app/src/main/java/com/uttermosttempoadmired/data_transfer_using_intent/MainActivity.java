package com.uttermosttempoadmired.data_transfer_using_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name, number;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Hooks
        name = findViewById(R.id.nameET);
        number = findViewById(R.id.numberET);
        btn = findViewById(R.id.btn);
        //Pass Data on Button Click
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Get data from input field
                String getName = name.getText().toString();
                String getNumber = number.getText().toString();
                //Pass data to 2nd activity
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("name", getName);
                intent.putExtra("number", getNumber);
                startActivity(intent);
            }
        });
    }
}