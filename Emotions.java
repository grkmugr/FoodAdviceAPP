package com.example.mobilproje;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class DuygularActivity extends AppCompatActivity {


    ImageButton hpybtn, angrybtn, sadbtn, rcklssbtn, thtghflbtn, srprsdbtn ;
    Button nthngbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_duygular);

        hpybtn = (ImageButton) findViewById(R.id.Happybutton);
        angrybtn =  (ImageButton)findViewById(R.id.Angrybutton);
        sadbtn =  (ImageButton)findViewById(R.id.Sadbutton);
        rcklssbtn = (ImageButton) findViewById(R.id.Recklessbutton);
        thtghflbtn = (ImageButton) findViewById(R.id.Thoughtfulbutton);
        srprsdbtn = (ImageButton) findViewById(R.id.Surprisedbutton);
        nthngbtn=(Button) findViewById(R.id.Nothingbutton);

        hpybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Happybutton =new Intent(DuygularActivity.this,HappybtnActivity.class);
                startActivity(Happybutton);
            }
        });
        angrybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Angrybutton =new Intent(DuygularActivity.this,AngrybtnActivity.class);
                startActivity(Angrybutton);
            }
        });
        sadbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Sadbutton =new Intent(DuygularActivity.this,SadbtnActivity.class);
                startActivity(Sadbutton);
            }
        });
        rcklssbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Recklessbutton =new Intent(DuygularActivity.this,RecklessbtnActivity.class);
                startActivity(Recklessbutton);
            }
        });
        thtghflbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Thoughtfulbutton =new Intent(DuygularActivity.this,ThoughtfulbtnActivity.class);
                startActivity(Thoughtfulbutton);
            }
        });
        srprsdbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Surprisedbutton =new Intent(DuygularActivity.this,SurprisedbtnActivity.class);
                startActivity(Surprisedbutton);
            }
        });
        nthngbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Nothingbutton =new Intent(DuygularActivity.this,NothingbtnActivity.class);
                startActivity(Nothingbutton);
            }
        });
    }

}