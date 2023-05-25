package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnWind;

    private Button btnGameOver;

    private Button btnMonkey;

    private Button btnFart;

    private Button btnClown;

    private Button btnGroan;

    private Button btnCricket;

    private Button btnHorn;

    private Button btnError;

    private Button btnGoose;

    private Button btnSad;

    private Button btnSneez;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnWind = findViewById(R.id.btn_wind);

        btnGameOver = findViewById(R.id.btn_gameover);

        btnMonkey = findViewById(R.id.btn_monkey);

        btnFart = findViewById(R.id.btn_fart);

        btnClown = findViewById(R.id.btn_clown);

        btnGroan = findViewById(R.id.btn_groan);

        btnCricket = findViewById(R.id.btn_cricket);

        btnHorn = findViewById(R.id.btn_horn);

        btnError = findViewById(R.id.btn_error);

        btnGoose = findViewById(R.id.btn_goose);

        btnSad = findViewById(R.id.btn_sad);

        btnSneez = findViewById(R.id.btn_sneez);

        btnWind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playWind();
            }
        });




    }
}