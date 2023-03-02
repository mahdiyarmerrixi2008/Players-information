package com.example.soccerplayers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ali extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ali);

        AliClass aliClass=new AliClass();

        TextView textView=findViewById(R.id.playername);
        textView.setText(aliClass.getName());

        TextView textView1=findViewById(R.id.playerheight);
        textView1.setText(aliClass.getHeight());

        TextView textView3=findViewById(R.id.goalplayer);
        textView3.setText(aliClass.getGoal());

        TextView textView4=findViewById(R.id.countryplayer);
        textView4.setText(aliClass.getNationality());

        TextView textView5=findViewById(R.id.playerShoesgold);
        textView5.setText(aliClass.getShoesgold());

        TextView textView6=findViewById(R.id.playerBallgold);
        textView6.setText(aliClass.getBallgold());

        TextView textView7=findViewById(R.id.playerAge);
        textView7.setText(aliClass.getAge());
        ImageView imageView=findViewById(R.id.bacl);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ali.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}