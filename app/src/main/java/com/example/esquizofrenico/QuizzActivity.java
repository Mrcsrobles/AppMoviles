package com.example.esquizofrenico;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.esquizofrenico.models.AnswersText;
import com.example.esquizofrenico.models.QuestionsImages;
import com.example.esquizofrenico.models.QuestionsText;

import java.util.ArrayList;
import java.util.Objects;

public class QuizzActivity extends AppCompatActivity {

    public static int questionNumber = 0;
    private final int[] radioButtons = {R.id.radioButton1, R.id.radioButton2, R.id.radioButton3, R.id.radioButton4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ArrayList<QuestionsText> questions = initAnswersAndQuestions();

        ArrayList<QuestionsImages> questionsImages = initQuestionsImages();

        super.onCreate(savedInstanceState);
        setTheme(R.style.LightTheme);
        setContentView(R.layout.activity_quizz);
        Objects.requireNonNull(getSupportActionBar()).hide();
        initComponents(questions, questionsImages);
    }

    private ArrayList<QuestionsText> initAnswersAndQuestions() {
        //respuestas para pregunta 1
        AnswersText at11 = new AnswersText(getString(R.string.Answer11), false);
        AnswersText at12 = new AnswersText(getString(R.string.Answer12), true);
        AnswersText at13 = new AnswersText(getString(R.string.Answer13), false);
        AnswersText at14 = new AnswersText(getString(R.string.Answer14), false);

        ArrayList<AnswersText> att1 = new ArrayList<>();
        att1.add(at11);
        att1.add(at12);
        att1.add(at13);
        att1.add(at14);

        //respuestas para pregunta 2
        AnswersText at21 = new AnswersText(getString(R.string.Answer21), true);
        AnswersText at22 = new AnswersText(getString(R.string.Answer22), false);
        AnswersText at23 = new AnswersText(getString(R.string.Answer23), false);
        AnswersText at24 = new AnswersText(getString(R.string.Answer24), false);

        ArrayList<AnswersText> att2 = new ArrayList<>();
        att2.add(at21);
        att2.add(at22);
        att2.add(at23);
        att2.add(at24);

        //respuestas para pregunta 3
        AnswersText at31 = new AnswersText(getString(R.string.Answer31), false);
        AnswersText at32 = new AnswersText(getString(R.string.Answer32), false);
        AnswersText at33 = new AnswersText(getString(R.string.Answer33), true);
        AnswersText at34 = new AnswersText(getString(R.string.Answer34), false);

        ArrayList<AnswersText> att3 = new ArrayList<>();
        att3.add(at31);
        att3.add(at32);
        att3.add(at33);
        att3.add(at34);

        //respuestas para pregunta 4
        AnswersText at41 = new AnswersText(getString(R.string.Answer41), false);
        AnswersText at42 = new AnswersText(getString(R.string.Answer42), false);
        AnswersText at43 = new AnswersText(getString(R.string.Answer43), true);
        AnswersText at44 = new AnswersText(getString(R.string.Answer44), false);

        ArrayList<AnswersText> att4 = new ArrayList<>();
        att4.add(at41);
        att4.add(at42);
        att4.add(at43);
        att4.add(at44);

        //respuestas para pregunta 5
        AnswersText at51 = new AnswersText(getString(R.string.Answer51), true);
        AnswersText at52 = new AnswersText(getString(R.string.Answer52), false);
        AnswersText at53 = new AnswersText(getString(R.string.Answer53), false);
        AnswersText at54 = new AnswersText(getString(R.string.Answer54), false);

        ArrayList<AnswersText> att5 = new ArrayList<>();
        att5.add(at51);
        att5.add(at52);
        att5.add(at53);
        att5.add(at54);



        // Preguntas
        QuestionsText qu1 = new QuestionsText(getString(R.string.Question1), att1);
        QuestionsText qu2 = new QuestionsText(getString(R.string.Question2), att2);
        QuestionsText qu3 = new QuestionsText(getString(R.string.Question3), att3);
        QuestionsText qu4 = new QuestionsText(getString(R.string.Question4), att4);
        QuestionsText qu5 = new QuestionsText(getString(R.string.Question5), att5);


        ArrayList<QuestionsText> questions = new ArrayList<>();
        questions.add(qu1);
        questions.add(qu2);
        questions.add(qu3);
        questions.add(qu4);
        questions.add(qu5);


        return questions;
    }

    private ArrayList<QuestionsImages> initQuestionsImages() {

        AnswersText at11 = new AnswersText(getString(R.string.Answer81), false);
        AnswersText at12 = new AnswersText(getString(R.string.Answer82), false);
        AnswersText at13 = new AnswersText(getString(R.string.Answer83), false);
        AnswersText at14 = new AnswersText(getString(R.string.Answer84), true);

        ArrayList<AnswersText> att1 = new ArrayList<>();
        att1.add(at11);
        att1.add(at12);
        att1.add(at13);
        att1.add(at14);

        AnswersText at21 = new AnswersText(getString(R.string.Answer91), true);
        AnswersText at22 = new AnswersText(getString(R.string.Answer92), false);
        AnswersText at23 = new AnswersText(getString(R.string.Answer93), false);
        AnswersText at24 = new AnswersText(getString(R.string.Answer94), false);

        ArrayList<AnswersText> att2 = new ArrayList<>();
        att2.add(at21);
        att2.add(at22);
        att2.add(at23);
        att2.add(at24);

        int resourceId1 = this.getResources().getIdentifier("nicaragua", "drawable", this.getPackageName());
        QuestionsImages que1 = new QuestionsImages(resourceId1, getString(R.string.Question8), att1);
        int resourceId2 = this.getResources().getIdentifier("monalisa", "drawable", this.getPackageName());
        QuestionsImages que2 = new QuestionsImages(resourceId2, getString(R.string.Question9), att2);

        ArrayList<QuestionsImages> questionsImages = new ArrayList<>();
        questionsImages.add(que1);
        questionsImages.add(que2);

        return questionsImages;
    }

    private void initComponents(ArrayList<QuestionsText> questions, ArrayList<QuestionsImages> questionsImages) {
        RadioGroup rg = findViewById(R.id.GroupId);
        TextView question = findViewById(R.id.id_pregunta);
        if (questionNumber < 5) {
            initQuestions(questions, rg, question);
        } else {
            initImageQuestions(questionsImages, rg, question);
        }
    }

    private void initImageQuestions(ArrayList<QuestionsImages> questionsImages, RadioGroup rg, TextView question) {
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setBackgroundResource(questionsImages.get(questionNumber - 5).getImage());
        imageView.setVisibility(View.VISIBLE);
        question.setText(questionsImages.get(questionNumber - 5).getText());
        rg.setVisibility(View.VISIBLE);
        for (int i = 0; i < radioButtons.length; i++) {
            RadioButton rb = findViewById(radioButtons[i]);
            rb.setText(questionsImages.get(questionNumber - 5).getAnswersTexts().get(i).getText());
            if (questionsImages.get(questionNumber - 5).getAnswersTexts().get(i).isCorrect()) {
                rb.setTag(true);
            } else {
                rb.setTag(false);
            }
        }
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                Button next = findViewById(R.id.comprobar);
                next.setEnabled(radioGroup.getCheckedRadioButtonId() != -1);
            }
        });
    }


    private void initQuestions(ArrayList<QuestionsText> questions, RadioGroup rg, TextView question) {
        question.setText(questions.get(questionNumber).getText());
        rg.setVisibility(View.VISIBLE);

        findViewById(R.id.comprobar).setEnabled(false);
        for (int i = 0; i < radioButtons.length; i++) {
            RadioButton rb = findViewById(radioButtons[i]);
            rb.setText(questions.get(questionNumber).getAnswersTexts().get(i).getText());
            if (questions.get(questionNumber).getAnswersTexts().get(i).isCorrect()) {
                rb.setTag(true); // añado como etiqueta del radiobutton el verdadero
            } else {
                rb.setTag(false);
            }
        }
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                Button next = findViewById(R.id.comprobar);
                next.setEnabled(radioGroup.getCheckedRadioButtonId() != -1);
            }
        });

    }

    public void nextQuestion(View view) {

        if (questionNumber < 5) {
            questionNumber++;
            recreate();
        } else {
            final Intent intent = new Intent(this, QuizImageAnswers.class);
            startActivity(intent);

        }
    }

    public void checkCorrectAnswer(View view) {
        RadioGroup radioGroup = findViewById(R.id.GroupId);
        int id = radioGroup.getCheckedRadioButtonId();
        RadioButton selected = findViewById(id);
        MainActivity.Answers.add(selected.getText().toString());

        Button seguir = findViewById(R.id.next_question);
        seguir.bringToFront();
        seguir.setVisibility(View.VISIBLE);

        for ( int radio:radioButtons){
            findViewById(radio).setEnabled(false);
        }
        Button comprobar = findViewById(R.id.comprobar);
        comprobar.setVisibility(View.INVISIBLE);

        if ((boolean) selected.getTag()) {
            System.out.println("Seleccionaste la correcta");
            MainActivity.score += 3;
            TextView acierto = findViewById(R.id.acierto);
            acierto.bringToFront();
            acierto.setVisibility(View.VISIBLE);
        } else {
            System.out.println("Seleccionaste la falsa");
            MainActivity.score -= 2;

            TextView fallo = findViewById(R.id.fallo);
            fallo.bringToFront();
            fallo.setVisibility(View.VISIBLE);
            fallo.setEnabled(true);

            Button repetir = findViewById(R.id.repeat);
            repetir.bringToFront();
            repetir.setVisibility(View.VISIBLE);

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
