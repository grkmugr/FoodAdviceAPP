package com.example.mobilproje;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class GirisActivity extends AppCompatActivity {

    TextView txtsign;
    Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris);

        btnlogin=(Button)findViewById(R.id.btnlogin);
        txtsign = (TextView) findViewById(R.id.txtsign);

        GirisActivity activity = this;
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Start =new Intent(GirisActivity.this,DuygularActivity.class);
                startActivity(Start);
            }
        });
        txtsign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(getApplicationContext(),GirisActivity2.class);
                startActivity(login);
                activity.finish();
            }
        });
    };
}

