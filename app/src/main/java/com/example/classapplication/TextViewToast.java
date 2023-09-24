package com.example.classapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TextViewToast extends AppCompatActivity {

    TextView txv;
    Button bt;
    EditText edtxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view_toast);

        txv = findViewById(R.id.text);
        bt = findViewById(R.id.btntext);
        edtxt = findViewById(R.id.edtext);
        
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myText = txv.getText().toString();
                Toast.makeText(TextViewToast.this, "from    ", Toast.LENGTH_SHORT).show();
            }
        });
    }
}