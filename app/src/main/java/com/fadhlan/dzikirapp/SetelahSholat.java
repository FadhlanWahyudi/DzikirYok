package com.fadhlan.dzikirapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageClickListener;
import com.synnapps.carouselview.ImageListener;

public class SetelahSholat extends AppCompatActivity implements View.OnClickListener {

        CardView takbir, tahmid, tasbih;

        private int[] mImages = new int[]{
                R.drawable.takbir, R.drawable.tasbih, R.drawable.tahmid
        };

        private String[] mImageTitle = new String[]{
                ".", ".", "."
        };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_setelah_sholat);

            takbir = findViewById(R.id.Takbir);
            takbir.setOnClickListener(this);
            tahmid = findViewById(R.id.Tahmid);
            tahmid.setOnClickListener(this);
            tasbih = findViewById(R.id.Tasbih);
            tasbih.setOnClickListener(this);


            CarouselView carouselView = findViewById(R.id.carousel);
            carouselView.setPageCount(mImages.length);
            carouselView.setImageListener(new ImageListener() {
                @Override
                public void setImageForPosition(int position, ImageView imageView) {
                    imageView.setImageResource(mImages[position]);

                }
            });
            carouselView.setImageClickListener(new ImageClickListener() {
                @Override
                public void onClick(int position) {
                    Toast.makeText(SetelahSholat.this, mImageTitle[position], Toast.LENGTH_SHORT).show();
                }
            });


        }

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.Takbir:
                    startActivity(new Intent(SetelahSholat.this, Takbir.class));
                    break;
                case R.id.Tahmid:
                    startActivity(new Intent(SetelahSholat.this, Tahmid.class));
                    break;
                case R.id.Tasbih:
                    startActivity(new Intent(SetelahSholat.this, Tasbih.class));
                    break;
            }

        }
    }



