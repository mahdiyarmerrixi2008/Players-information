package com.example.soccerplayers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Torabi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_torabi);

        TorabiClass torabiClass =new TorabiClass();
        TextView textView=findViewById(R.id.dindin);
        textView.setText(torabiClass.getName());


    }
}