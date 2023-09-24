package com.example.classapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoCompleteActivity extends AppCompatActivity {

    AutoCompleteTextView actxt;
    String[] arr = {"Paris","Panama","Purto","Alabama","Ala","Banana","Papa","Popa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete);

        actxt = findViewById(R.id.autComplete);

        ArrayAdapter<String> myadapter = new ArrayAdapter<String>(AutoCompleteActivity.this, android.R.layout.select_dialog_item,arr);
        actxt.setThreshold(2);
        actxt.setAdapter(myadapter);
    }
}