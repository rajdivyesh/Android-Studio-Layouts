package com.example.classapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleTest extends AppCompatActivity {

    ToggleButton tgbtn;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_test);

        tgbtn = findViewById(R.id.tgbtn);
        btn = findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String togList = tgbtn.getText().toString();
                Toast.makeText(ToggleTest.this, togList, Toast.LENGTH_SHORT).show();
            }
        });
    }
}