package com.fadhlan.dzikirapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Tahmid extends AppCompatActivity implements View.OnClickListener {
    TextView tvmain3;
    Button   btndzikir3;

    int nilai = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tahmid);
        tvmain3 = findViewById(R.id.tvmain3);
        btndzikir3 = findViewById(R.id.btndzikir3);
        tvmain3.setOnClickListener(this);
        btndzikir3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btndzikir3:
                nilai = nilai + 1;
                tvmain3.setText(String.valueOf(nilai));
                if (nilai == 33) {
                    Toast.makeText(this, "pindah ke berikutnya", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Tahmid.this, SetelahSholat.class));
                }
        }

    }
}
