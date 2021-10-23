package com.example.esquizofrenico;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class QuizImageAnswers extends AppCompatActivity {
    private final int[] radioButtons = {R.id.radioButton1, R.id.radioButton2, R.id.radioButton3, R.id.radioButton4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.LightTheme);
        setContentView(R.layout.activity_quiz_image_answers);
        Objects.requireNonNull(getSupportActionBar()).hide();
    }


    public void nextQuestion(View view) {
        final Intent intent = new Intent(this, Answers.class);
        startActivity(intent);
    }

    public void checkCorrectAnswer(View view) {
        RadioGroup radioGroup = findViewById(R.id.GroupId);
        int id = radioGroup.getCheckedRadioButtonId();
        RadioButton selected = findViewById(id);
        for ( int radio:radioButtons){
            findViewById(radio).setEnabled(false);
        }
        Button seguir = findViewById(R.id.next_question);
        seguir.bringToFront();
        seguir.setVisibility(View.VISIBLE);

        Button comprobar = findViewById(R.id.comprobar);
        comprobar.setVisibility(View.INVISIBLE);

        if (selected.getId()==radioButtons[0]) {
            MainActivity.score += 3;
            TextView acierto = findViewById(R.id.acierto);
            acierto.bringToFront();
            acierto.setVisibility(View.VISIBLE);
            MainActivity.Answers.add("Brasil");
        } else {
            MainActivity.score -= 2;

            TextView fallo = findViewById(R.id.fallo);
            fallo.bringToFront();
            fallo.setVisibility(View.VISIBLE);
            fallo.setEnabled(true);

            Button repetir = findViewById(R.id.repeat);
            repetir.bringToFront();
            repetir.setVisibility(View.VISIBLE);
            MainActivity.Answers.add("Fallaste");
        }
        selected.setChecked(false);
    }

    public void restart(View view) {
        QuizzActivity.questionNumber = 0;
        MainActivity.score = 0;
        MainActivity.Answers.clear();
        Intent intent = new Intent(this, QuizzActivity.class);
        startActivity(intent);
    }
}