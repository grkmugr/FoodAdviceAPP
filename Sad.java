package com.example.mobilproje;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SadbtnActivity extends AppCompatActivity {

    Button btngeri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sadbtn);

        btngeri =(Button) findViewById(R.id.btngeri);

        btngeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent butongeri =new Intent(SadbtnActivity.this,DuygularActivity.class);
                startActivity(butongeri);
            }
        });
    }
}