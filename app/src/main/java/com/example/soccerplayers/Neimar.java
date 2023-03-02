package com.example.soccerplayers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Neimar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neimar);
        NeimarClass neimarClass = new NeimarClass();
        TextView textView = (TextView) findViewById(R.id.playername);
        textView.setText(neimarClass.getName());

        TextView goalplayer = (TextView) findViewById(R.id.goalplayer);
        goalplayer.setText(neimarClass.getGoal());

        TextView height = (TextView) findViewById(R.id.playerheight);
        height.setText(neimarClass.getName());


        TextView countryplayer = (TextView) findViewById(R.id.countryplayer);
        countryplayer.setText(neimarClass.getNationality());

        TextView playerShoesgold = (TextView) findViewById(R.id.playerShoesgold);
        playerShoesgold.setText(neimarClass.getShoesgold());


        TextView playerBallgold = (TextView) findViewById(R.id.playerBallgold);
        playerBallgold.setText(neimarClass.getShoesgold());


        TextView playerAge = (TextView) findViewById(R.id.playerAge);
        playerAge.setText(neimarClass.getAge());
        ImageView imageView=findViewById(R.id.bacl);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Neimar.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}