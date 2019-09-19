package com.fadhlan.dzikirapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Tasbih extends AppCompatActivity implements View.OnClickListener {

    TextView tvmain2;
    Button btndzikir2;

    int nilai = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbih);
        tvmain2 = findViewById(R.id.tvmain2);
        btndzikir2 = findViewById(R.id.btndzikir2);
        tvmain2.setOnClickListener(this);
        btndzikir2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btndzikir2:
                nilai = nilai + 1;
                tvmain2.setText(String.valueOf(nilai));
                if (nilai == 33) {
                    Toast.makeText(this, "pindah ke berikutnya", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Tasbih.this, SetelahSholat.class));
                }
        }

    }
}


