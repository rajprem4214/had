package com.example.addtwonos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }

    public void toPhone(View view) {

        EditText abc = findViewById(R.id.num);

        Uri ur = Uri.parse("tel:"+abc.getText().toString());

        Intent intt = new Intent(Intent.ACTION_DIAL,ur);
        startActivity(intt);



    }
}