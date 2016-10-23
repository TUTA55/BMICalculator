package com.example.ta.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent x = getIntent();
        String y = x.getStringExtra("e");
        TextView w = (TextView)findViewById(R.id.textView);
        w.setText(y);

    }
}
