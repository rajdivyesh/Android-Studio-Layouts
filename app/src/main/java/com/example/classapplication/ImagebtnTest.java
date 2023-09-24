package com.example.classapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class ImagebtnTest extends AppCompatActivity {

    ImageButton imgbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagebtn_test);

        imgbtn = findViewById(R.id.imgbtn1);
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //String result = ImageButton.
                //Toast.makeText(ToggleTest.this, togList, Toast.LENGTH_SHORT).show();
            }
        });

    }
}