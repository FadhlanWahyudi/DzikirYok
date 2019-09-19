package com.fadhlan.dzikirapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Takbir extends AppCompatActivity  implements View.OnClickListener{
    TextView tvmain;
    Button btndzikir;

    int nilai = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takbir);
        tvmain = findViewById(R.id.tvmain);
        btndzikir = findViewById(R.id.btndzikir);
        tvmain.setOnClickListener(this);
        btndzikir.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btndzikir:
                nilai = nilai + 1;
                tvmain.setText(String.valueOf(nilai));
                if (nilai == 33) {
                    Toast.makeText(this, "pindah ke berikutnya", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Takbir.this, SetelahSholat.class));
                }
        }

    }
}
