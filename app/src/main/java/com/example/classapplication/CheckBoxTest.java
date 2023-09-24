package com.example.classapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxTest extends AppCompatActivity {

    CheckBox checkBox1, checkBox2, checkBox3;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_test);

        checkBox1 = findViewById(R.id.ch1);
        checkBox2 = findViewById(R.id.ch2);
        checkBox3 = findViewById(R.id.ch3);
        btn = findViewById(R.id.btn1);

        String ch1Name = checkBox1.getText().toString();
        String ch2Name = checkBox2.getText().toString();
        String ch3Name = checkBox3.getText().toString();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder result = new StringBuilder();
                if(checkBox1.isChecked()){
                    result.append(ch1Name + "\n");
                }
                if(checkBox2.isChecked()){
                    result.append(ch2Name + "\n");
                }
                if(checkBox3.isChecked()){
                    result.append(ch3Name + "\n");
                }
                Toast.makeText(CheckBoxTest.this, result, Toast.LENGTH_SHORT).show();
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
            }
        });
    }
}