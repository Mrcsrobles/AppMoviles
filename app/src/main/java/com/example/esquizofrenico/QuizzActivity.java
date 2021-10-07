package com.example.esquizofrenico;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
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
    private final int[] checkBoxes = {R.id.checkBox1, R.id.checkBox2, R.id.checkBox3, R.id.checkBox4};
    private ArrayList<QuestionsText> questions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        questions = initAnswersAndQuestions();

        ArrayList<QuestionsImages> questionsImages = initQuestionsImages();

        super.onCreate(savedInstanceState);
        if (MainActivity.checked) {
            setTheme(R.style.DarkTheme);
        } else {
            setTheme(R.style.LightTheme);
        }
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

        //respuestas para pregunta 6
        AnswersText at61 = new AnswersText(getString(R.string.Answer61), false);
        AnswersText at62 = new AnswersText(getString(R.string.Answer62), false);
        AnswersText at63 = new AnswersText(getString(R.string.Answer63), true);
        AnswersText at64 = new AnswersText(getString(R.string.Answer64), true);

        ArrayList<AnswersText> att6 = new ArrayList<>();
        att6.add(at61);
        att6.add(at62);
        att6.add(at63);
        att6.add(at64);

        //respuestas para pregunta 7
        AnswersText at71 = new AnswersText(getString(R.string.Answer71), false);
        AnswersText at72 = new AnswersText(getString(R.string.Answer72), true);
        AnswersText at73 = new AnswersText(getString(R.string.Answer73), false);
        AnswersText at74 = new AnswersText(getString(R.string.Answer74), false);

        ArrayList<AnswersText> att7 = new ArrayList<>();
        att7.add(at71);
        att7.add(at72);
        att7.add(at73);
        att7.add(at74);

        // Preguntas
        QuestionsText qu1 = new QuestionsText(getString(R.string.Question1), false, att1);
        QuestionsText qu2 = new QuestionsText(getString(R.string.Question2), false, att2);
        QuestionsText qu3 = new QuestionsText(getString(R.string.Question3), false, att3);
        QuestionsText qu4 = new QuestionsText(getString(R.string.Question4), false, att4);
        QuestionsText qu5 = new QuestionsText(getString(R.string.Question5), false, att5);
        QuestionsText qu6 = new QuestionsText(getString(R.string.Question6), true, att6);
        QuestionsText qu7 = new QuestionsText(getString(R.string.Question7), true, att7);


        ArrayList<QuestionsText> questions = new ArrayList<>();
        questions.add(qu1);
        questions.add(qu2);
        questions.add(qu3);
        questions.add(qu4);
        questions.add(qu5);
        questions.add(qu6);
        questions.add(qu7);


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
        QuestionsImages que1 = new QuestionsImages(resourceId1, getString(R.string.Question8), false, att1);
        int resourceId2 = this.getResources().getIdentifier("monalisa", "drawable", this.getPackageName());
        QuestionsImages que2 = new QuestionsImages(resourceId2, getString(R.string.Question9), false, att2);

        ArrayList<QuestionsImages> questionsImages = new ArrayList<>();
        questionsImages.add(que1);
        questionsImages.add(que2);

        return questionsImages;
    }

    private void initComponents(ArrayList<QuestionsText> questions, ArrayList<QuestionsImages> questionsImages) {
        RadioGroup rg = findViewById(R.id.GroupId);
        LinearLayout linearLayout = findViewById(R.id.GroupId2);
        TextView question = findViewById(R.id.id_pregunta);
        if (questionNumber < 7) {
            question.setText(questions.get(questionNumber).getText());
            if (!questions.get(questionNumber).isCheckButton()) {
                rg.setVisibility(View.VISIBLE);
                linearLayout.setVisibility(View.INVISIBLE);
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
                        Button next = findViewById(R.id.next_question);
                        next.setEnabled(radioGroup.getCheckedRadioButtonId() != -1);
                    }
                });
            } else {
                linearLayout.setVisibility(View.VISIBLE);
                rg.setVisibility(View.INVISIBLE);
                final Button next = findViewById(R.id.next_question);
                for (int i = 0; i < checkBoxes.length; i++) {
                    CheckBox checkBox = findViewById(checkBoxes[i]);
                    checkBox.setText(questions.get(questionNumber).getAnswersTexts().get(i).getText());
                    if (questions.get(questionNumber).getAnswersTexts().get(i).isCorrect()) {
                        checkBox.setTag(true); // añado como etiqueta del radiobutton el verdadero
                    } else {
                        checkBox.setTag(false);
                    }
                    checkBox.setOnCheckedChangeListener(new OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                            next.setEnabled(isChecked);
                        }
                    });
                }
            }
        } else {
            ImageView imageView = findViewById(R.id.imageView);
            imageView.setVisibility(View.VISIBLE);
            imageView.setBackgroundResource(questionsImages.get(questionNumber - 7).getImage());
            question.setText(questionsImages.get(questionNumber - 7).getText());
            if (!questionsImages.get(questionNumber - 7).isCheckButton()) {
                rg.setVisibility(View.VISIBLE);
                linearLayout.setVisibility(View.INVISIBLE);
                for (int i = 0; i < radioButtons.length; i++) {
                    RadioButton rb = findViewById(radioButtons[i]);
                    rb.setText(questionsImages.get(questionNumber - 7).getAnswersTexts().get(i).getText());
                    if (questionsImages.get(questionNumber - 7).getAnswersTexts().get(i).isCorrect()) {
                        rb.setTag(true);
                    } else {
                        rb.setTag(false);
                    }
                }
                rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int i) {
                        Button next = findViewById(R.id.next_question);
                        next.setEnabled(radioGroup.getCheckedRadioButtonId() != -1);
                    }
                });
            } else {
                linearLayout.setVisibility(View.VISIBLE);
                rg.setVisibility(View.INVISIBLE);
                final Button next = findViewById(R.id.next_question);
                for (int i = 0; i < checkBoxes.length; i++) {
                    CheckBox checkBox = findViewById(checkBoxes[i]);
                    checkBox.setText(questionsImages.get(questionNumber - 7).getAnswersTexts().get(i).getText());
                    if (questionsImages.get(questionNumber - 7).getAnswersTexts().get(i).isCorrect()) {
                        checkBox.setTag(true);
                    } else {
                        checkBox.setTag(false);
                    }
                    checkBox.setOnCheckedChangeListener(new OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                            next.setEnabled(isChecked);
                        }
                    });
                }
            }
        }
    }

    public void nextQuestion(View view) {
        boolean check;
        try {
            check = questions.get(questionNumber).isCheckButton();
        } catch (Exception e) {
            check = questions.get(questionNumber - 7).isCheckButton();
        }
        if (!check) {
            RadioGroup radioGroup = findViewById(R.id.GroupId);
            int id = radioGroup.getCheckedRadioButtonId();
            RadioButton selected = findViewById(id);
            MainActivity.Answers.add(selected.getText().toString());
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
            }
            selected.setChecked(false);
        } else {
            for (int box : checkBoxes) {
                CheckBox checkBox = findViewById(box);
                if (checkBox.isChecked()) {
                    MainActivity.Answers.add(checkBox.getText().toString());
                    if ((boolean) checkBox.getTag()) {
                        System.out.println("Seleccionaste la correcta");
                        MainActivity.score += 3;
                    } else {
                        System.out.println("Seleccionaste la falsa");
                        MainActivity.score -= 2;
                    }
                    checkBox.setChecked(false);
                }
            }
        }
        System.out.println("Pregunta: " + questionNumber);
        if (questionNumber < 8) {
            questionNumber++;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    recreate(); // en lugar de estar creando tantas activities por cada pregunta que haya, es mejor reutilizar la misma activity con este metodo, por lo que solo nos interesa actualizar el numero de pregunta correspondiente
                }
            }, 1000); //Time in milisecond
        } else {

            TextView respuestas = findViewById(R.id.tusRespuestas);
            respuestas.setVisibility(View.VISIBLE);
            ListView listView = findViewById(R.id.listview);
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, MainActivity.Answers);
            listView.setAdapter(adapter);
            listView.setVisibility(View.VISIBLE);
            final Intent intent = new Intent(this, ScoreActivity.class);

            Button next = findViewById(R.id.next_question);
            next.setVisibility(View.INVISIBLE);

            Button complete = findViewById(R.id.last_question);
            complete.setVisibility(View.VISIBLE);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    TextView acierto = findViewById(R.id.acierto);
                    acierto.setVisibility(View.INVISIBLE);
                    TextView fallo = findViewById(R.id.fallo);
                    fallo.setVisibility(View.INVISIBLE);
                }
            }, 1000); //Time in milisecond

            TextView ask = findViewById(R.id.id_pregunta);
            ask.setVisibility(View.INVISIBLE);
            ImageView imageView = findViewById(R.id.imageView);
            imageView.setVisibility(View.INVISIBLE);
            LinearLayout ly = findViewById(R.id.GroupId2);
            ly.setVisibility(View.INVISIBLE);
            RadioGroup rg = findViewById(R.id.GroupId);
            rg.setVisibility(View.INVISIBLE);

            complete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(intent);
                }
            });
        }
    }
}
