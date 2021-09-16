package com.example.services_musciplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button mBtnStart,mBtnStop;
private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    initview();
    }

    private void initview() {
    mBtnStart = findViewById(R.id.btnStart);
    mBtnStop = findViewById(R.id.btnStop);
    intent = new Intent(this,MusicService.class);
    mBtnStart.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startService(intent);
        }
    });
    mBtnStop.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            stopService(intent);
        }
    });
    }
}