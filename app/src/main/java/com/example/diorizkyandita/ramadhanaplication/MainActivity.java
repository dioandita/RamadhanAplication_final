package com.example.diorizkyandita.ramadhanaplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout introMessage;
    RelativeLayout appContent;
    ImageButton imgBtn1;
    ImageButton imgBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        introMessage = (RelativeLayout)findViewById(R.id.welcome_pesan);
        appContent = (RelativeLayout) findViewById(R.id.content_layout);
        imgBtn1 = (ImageButton)findViewById(R.id.imageButton);
        imgBtn2 = (ImageButton)findViewById(R.id.imageButton2);

        imgBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, JadwalShalat.class);
                startActivity(intent);
            }

        }
        );
        imgBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, BacaAlquran.class);
                startActivity(intent1);
            }
        });

    }

    public void dismisWelcomeMessageBox(View view){
        introMessage.setVisibility(View.INVISIBLE);
        appContent.setVisibility(View.VISIBLE);
    }
}
