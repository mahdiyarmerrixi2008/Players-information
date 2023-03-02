package com.example.soccerplayers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.soccerplayers.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatImageView messi=(AppCompatImageView) findViewById(R.id.messiImage);
        AppCompatImageView neimar=(AppCompatImageView) findViewById(R.id.neimarImgae);
        AppCompatImageView mbappe=(AppCompatImageView) findViewById(R.id.mbappeImage);
        AppCompatImageView ali=(AppCompatImageView)findViewById(R.id.alidaiiImage);
        AppCompatImageView torabi=(AppCompatImageView)findViewById(R.id.din);

        ali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ali.class);
                startActivity(intent);
            }
        });

        messi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this,Messi.class);
                startActivity(intent1);
            }
        });
        neimar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(MainActivity.this,Neimar.class);
                startActivity(intent2);
            }
        });
        mbappe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(MainActivity.this,Mbape.class);
                startActivity(intent3);
            }
        });

        torabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent7=new Intent(MainActivity.this,Torabi.class);
                startActivity(intent7);
            }
        });





    }
}