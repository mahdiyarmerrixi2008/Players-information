package com.example.soccerplayers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Messi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messi);
        MessiClass messiClass = new MessiClass();

        TextView textView=findViewById(R.id.playername);
        textView.setText(messiClass.getName());

        TextView textView1=findViewById(R.id.playerheight);
        textView1.setText(messiClass.getHeight());

        TextView textView3=findViewById(R.id.goalplayer);
        textView3.setText(messiClass.getGoal());

        TextView textView4=findViewById(R.id.countryplayer);
        textView4.setText(messiClass.getNationality());

        TextView textView5=findViewById(R.id.playerShoesgold);
        textView5.setText(messiClass.getShoesgold());

        TextView textView6=findViewById(R.id.playerBallgold);
        textView6.setText(messiClass.getBallgold());

        TextView textView7=findViewById(R.id.playerAge);
        textView7.setText(messiClass.getAge());
        ImageView imageView=findViewById(R.id.bacl);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Messi.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}