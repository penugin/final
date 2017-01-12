package com.example.test.finalwork;

import android.app.AlarmManager;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


import static com.example.test.finalwork.R.drawable.f01;
import static com.example.test.finalwork.R.drawable.flag;

public class MainActivity extends AppCompatActivity {
    Bundle bundle = new Bundle();
    TextView test;
    private Long startTime;
    private Handler handler = new Handler();


    //Timer timer = new Timer(true);

    /*public class MyTimerTask extends TimerTask
    {
        public void run()
        {
        }
    };*/


    private Runnable updateTimer = new Runnable() {
        public void run() {
            Long spentTime = System.currentTimeMillis() - startTime;
            final Long seconds = (spentTime/1000);
            handler.postDelayed(this, 1000);
            final ImageView splashImageView = (ImageView) findViewById(R.id.SplashImageView);
            splashImageView.setBackgroundResource(R.drawable.flag);
            final AnimationDrawable frameAnimation = (AnimationDrawable)splashImageView.getBackground();
            splashImageView.post(new Runnable(){
                @Override
                public void run() {
                    frameAnimation.start();
                }
            });
            splashImageView.setOnClickListener(new View.OnClickListener(){
            //button.setOnClickListener(new Button.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, Main2Activity.class);
                    if (seconds%5 == 0){
                        bundle.putDouble("a0",1);
                        bundle.putDouble("b0",1);
                        bundle.putDouble("c0",1);
                        intent.putExtras(bundle);
                        startActivityForResult(intent,88);
                    }
                    else if (seconds%5 == 1){
                        bundle.putDouble("a0",1);
                        bundle.putDouble("b0",1);
                        bundle.putDouble("c0",2);
                        intent.putExtras(bundle);
                        startActivityForResult(intent,88);
                    }
                    else if (seconds%5 == 2){
                        bundle.putDouble("a0",1);
                        bundle.putDouble("b0",2);
                        bundle.putDouble("c0",1);
                        intent.putExtras(bundle);
                        startActivityForResult(intent,88);
                    }
                    else if (seconds%5 == 3){
                        bundle.putDouble("a0",2);
                        bundle.putDouble("b0",1);
                        bundle.putDouble("c0",1);
                        intent.putExtras(bundle);
                        startActivityForResult(intent,88);
                    }
                    else {
                        bundle.putDouble("a0",1);
                        bundle.putDouble("b0",2);
                        bundle.putDouble("c0",2);
                        intent.putExtras(bundle);
                        startActivityForResult(intent,88);
                    }



                        startActivity(intent);
                    MainActivity.this.finish();
                }
            });

        }
        };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        startTime = System.currentTimeMillis();
        //設定定時要執行的方法
        handler.removeCallbacks(updateTimer);
        //設定Delay的時間
        handler.postDelayed(updateTimer, 1000);



        //timer.schedule(new  MyTimerTask(), 1000, 1000);
        //test.setText(timer);

        /*final ImageView splashImageView = (ImageView) findViewById(R.id.SplashImageView);
        splashImageView.setBackgroundResource(R.drawable.flag);
        final AnimationDrawable frameAnimation = (AnimationDrawable)splashImageView.getBackground();
        splashImageView.post(new Runnable(){
            @Override
            public void run() {
                frameAnimation.start();
            }
        });
        splashImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Main3Activity.class);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });*/
        /*button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Main3Activity.class);


                startActivity(intent);
                MainActivity.this.finish();
            }
        });*/

    }
    public void open(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, Main3Activity.class);
        startActivity(intent);
        MainActivity.this.finish();
    }
}
