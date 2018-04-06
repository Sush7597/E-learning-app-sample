package com.example.sush.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity extends AppCompatActivity {

ScrollView Sview;

Button b1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Sview = (ScrollView)findViewById(R.id.ScrollView01);

        b1= (Button)findViewById(R.id.b1);
        Sview.smoothScrollBy(0, 50);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
                overridePendingTransition(R.anim.slideinright,R.anim.slideoutleft);
            }

        });







    }

}
