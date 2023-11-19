package com.example.addtwonos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addnum(View view) {

        EditText num1=findViewById(R.id.num1);
        EditText num2=findViewById(R.id.num2);

        int a=Integer.parseInt(num1.getText().toString());
        int b=Integer.parseInt(num2.getText().toString());

        int c=a+b;

        Intent abc =new Intent(MainActivity.this,MainActivity2.class);
        //Intent aaa = new Intent(Intent.ACTION_DIAL,uri);
        Bundle bu=new Bundle();
        bu.putString("sum",Integer.toString(c));
        abc.putExtras(bu);
        startActivity(abc);
    }
}