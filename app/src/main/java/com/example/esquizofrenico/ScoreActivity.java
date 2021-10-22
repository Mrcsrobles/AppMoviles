package com.example.esquizofrenico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.example.esquizofrenico.models.QuestionsText;

import java.util.ArrayList;

public class ScoreActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.LightTheme);
        setContentView(R.layout.score_quizz);
        getSupportActionBar().hide();
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
