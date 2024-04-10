package com.yandev.thecounterapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView welcome_text, counter_text;
    Button button;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        button = findViewById(R.id.button);
        counter_text = findViewById(R.id.result);
        welcome_text = findViewById(R.id.title);

        //Add the Functionalities



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                counter_text.setText("" + increaseCounter());
            }
        });

    }


    public int increaseCounter() {
        return ++counter;
    }
}