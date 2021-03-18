package com.example.a7a;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MyReceiver extends AppCompatActivity {
    TextView tv;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        tv = (TextView)findViewById(R.id.textView);
        Intent intent = getIntent();
        String str1 = intent.getStringExtra("message1");
        tv.setText("Welcome" + str1);

    }
}
