package com.example.esquizofrenico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import com.example.esquizofrenico.models.QuestionsText;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static boolean checked = false;
    public static int score;
    public static ArrayList<String> Answers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.LightTheme);
        setContentView(R.layout.activity_main);
        score = 0;
        Answers = new ArrayList<String>();
        getSupportActionBar().hide();
        QuizzActivity.questionNumber = 0;
    }

    public void startGame(View view) {
        Intent intent = new Intent(this, QuizzActivity.class);
        startActivity(intent);
    }

    public void exitGame(View view) {
        this.finishAffinity();
        this.onDestroy();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}