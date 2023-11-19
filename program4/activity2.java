package com.example.addtwonos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        String ans=getIntent().getStringExtra("sum");
        TextView v=findViewById(R.id.dis);
        v.setText(ans);

    }
}