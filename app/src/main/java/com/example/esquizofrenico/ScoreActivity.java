package com.example.esquizofrenico;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

import java.util.Objects;

public class ScoreActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (MainActivity.checked) {
            setTheme(R.style.DarkTheme);
        } else {
            setTheme(R.style.LightTheme);
        }
        setContentView(R.layout.score_quizz);
        Objects.requireNonNull(getSupportActionBar()).hide();
        fillData();
    }

    private void fillData() {

        TextView npoints = findViewById(R.id.finalPoints);
        npoints.setText(String.valueOf(MainActivity.score));
        npoints.setVisibility(View.VISIBLE);
        TextView points = findViewById(R.id.textPoints);
        points.setVisibility(View.VISIBLE);
        if (MainActivity.score>0){
            LottieAnimationView animationView =findViewById(R.id.animation_view);
            animationView.setVisibility(View.VISIBLE);
        }
    }


    public void restartGame(View view) {
        QuizzActivity.questionNumber = 0;
        MainActivity.score = 0;
        Intent intent = new Intent(this, QuizzActivity.class);
        startActivity(intent);
    }

    public void back(View view) {
        this.finish();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
