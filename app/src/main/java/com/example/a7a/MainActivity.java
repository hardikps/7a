package com.example.a7a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText ed1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.button);
        ed1 = (EditText)findViewById(R.id.editText);
    }
    public void onClick(View v)
    {
        String str1 = ed1.getText().toString();
        Intent intent = new Intent(getApplicationContext(),MyReceiver.class);
        intent.putExtra("message1",str1);
        startActivity(intent);
    }
}