package fr.osmansoykurt.geniusapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends AppCompatActivity {

    private final int SPLASH_SCREEN_TIMOUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // rediriger vers la page principale "MainActivity" après 3 secondes
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();

            }
        };

        // handler post delayed
        new Handler().postDelayed(runnable, SPLASH_SCREEN_TIMOUT);

    }
}
