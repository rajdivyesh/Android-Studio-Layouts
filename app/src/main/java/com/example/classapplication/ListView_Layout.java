package com.example.classapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListView_Layout extends AppCompatActivity {

    String[] teacher= {"Divyesh", "Raj", "Pargol", "Salar", "Divyesh", "Raj", "Pargol", "Salar", "Divyesh", "Raj", "Pargol", "Salar", "Divyesh", "Raj", "Pargol", "Salar"};
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_layout);

        listview = findViewById(R.id.myList);
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, teacher);
        listview.setAdapter(adapter);
    }
}