package com.fadhlan.dzikirapp;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    CardView pagi,sore,tahmid,about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pagi = findViewById(R.id.pagi);
        sore = findViewById(R.id.sore);
        tahmid = findViewById(R.id.tahmid);
        about = findViewById(R.id.about);

        pagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagi = new Intent(MainActivity.this,DzikirPagi.class);
                startActivity(pagi);
            }
        });
        sore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sore = new Intent(MainActivity.this,DzikirPetang.class);
                startActivity(sore);
            }
        });
        tahmid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tahmid = new Intent(MainActivity.this,SetelahSholat.class);
                startActivity(tahmid);
            }

    });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this,About.class);
                startActivity(a);
            }
        });



}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_bar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.changeLanguage:
                startActivity(new Intent(Settings.ACTION_LOCALE_SETTINGS));
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
