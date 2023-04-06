package com.example.weather;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class SplashScreen extends Activity {
    private final int SPLASH_DISPLAY_LEHGHT = 1000;
    ImageView myImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);


        myImageView = (ImageView) findViewById(R.id.imageView);
        myImageView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(SplashScreen.this, MainActivity.class);
                SplashScreen.this.startActivity(mainIntent);
                SplashScreen.this.finish();
            }
        },SPLASH_DISPLAY_LEHGHT);
    }

    @Override
    public void  onBackPressed(){
        super.onBackPressed();
    }
}