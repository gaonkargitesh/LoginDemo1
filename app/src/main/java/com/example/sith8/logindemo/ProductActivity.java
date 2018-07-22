package com.example.sith8.logindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.sith8.logindemo.Constants.EMAIL;
import static com.example.sith8.logindemo.Constants.FULL_NAME;

public class ProductActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        Intent intent= getIntent();
        tv = findViewById(R.id.helloWorld_TV);
        tv.setText(intent.getStringExtra(Constants.FULL_NAME));
        //intent.getStringExtra(FULL_NAME);
        //intent.getStringExtra(EMAIL);

    }
}
