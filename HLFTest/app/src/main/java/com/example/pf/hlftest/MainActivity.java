package com.example.pf.hlftest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView testTv = (TextView) findViewById(R.id.test_tv);
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
