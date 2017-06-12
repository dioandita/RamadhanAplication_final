package com.example.diorizkyandita.ramadhanaplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alfatiha extends AppCompatActivity {
    Button btnPlay;
    MediaPlayer playsurat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alfatiha);
        btnPlay = (Button)findViewById(R.id.btnPlay);
        playsurat = MediaPlayer.create(this, R.raw.alfatiha);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playsurat.start();
            }
        });
    }
}
