package com.example.mobilproje;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GirisActivity2 extends AppCompatActivity {
    TextView txtloginbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_giris2);

        GirisActivity2 activity2 = this;
        txtloginbtn = (TextView) findViewById(R.id.txtloginbtn);
        txtloginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent singin = new Intent(getApplicationContext(),GirisActivity.class);
                startActivity(singin);
                activity2.finish();
            }
        });
    }
}