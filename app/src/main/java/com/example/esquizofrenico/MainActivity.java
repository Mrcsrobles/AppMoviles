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
    public static int score ;
    public static ArrayList<String> Answers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (checked) {
            setTheme(R.style.DarkTheme);
        } else {
            setTheme(R.style.LightTheme);
        }
        setContentView(R.layout.activity_main);
        score = 0;
        Answers  = new ArrayList<String>();
        Switch switchTheme = (Switch) findViewById(R.id.switchTheme);
        switchTheme.setChecked(checked);
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

    public void switchTheme(View view) {
        if (checked) {
            checked = false;
        } else {
            checked = true;
        }
        recreate(); // en lugar de estar creando tantas activities por cada pregunta que haya, es mejor reutilizar la misma activity con este metodo, por lo que solo nos interesa actualizar el numero de pregunta correspondiente
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}