package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     TextView tvSplash,tvSubSplash;
     Button btnget;
     Animation atg,btgone,btgtwo;
     ImageView ivsplash;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSplash = (TextView)findViewById(R.id.tvSplash);
        tvSubSplash = (TextView)findViewById(R.id.tvSubSplash);
        btnget = (Button)findViewById(R.id.btnget);
        ivsplash = (ImageView)findViewById(R.id.ivSplash);

        atg = AnimationUtils.loadAnimation(this,R.anim.afg);
        btgone = AnimationUtils.loadAnimation(this,R.anim.btgone);
        btgtwo = AnimationUtils.loadAnimation(this,R.anim.btgtwo);


        ivsplash.startAnimation(atg);
        tvSplash.startAnimation(btgone);
        tvSubSplash.startAnimation(btgone);
        btnget.startAnimation(btgtwo);

        btnget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent stopwatchintent = new Intent(MainActivity.this,StopWatchActivity.class);
                stopwatchintent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(stopwatchintent);
            }
        });

        Typeface MLight = Typeface.createFromAsset(getAssets(),"fonts/MLight.ttf");
        Typeface MMedium = Typeface.createFromAsset(getAssets(),"fonts/MMedium.ttf");
        Typeface MRegular = Typeface.createFromAsset(getAssets(),"fonts/MRegular.ttf");

        tvSplash.setTypeface(MRegular);
        tvSubSplash.setTypeface(MLight);
        btnget.setTypeface(MMedium);

    }
}
