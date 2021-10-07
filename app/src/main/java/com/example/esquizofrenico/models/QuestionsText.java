package com.example.esquizofrenico.models;

import java.util.ArrayList;

public class QuestionsText {
    private final String text;
    private final boolean checkButton; // esto es true si es una pregunta con respuestas tipo check, y false si es una pregunta con respuestas tipo radio button.
    private final ArrayList<AnswersText>
            answersTexts;

    public QuestionsText(String text, boolean checkButton, ArrayList<AnswersText> answersTexts) {
        this.text = text;
        this.checkButton = checkButton;
        this.answersTexts = answersTexts;
    }

    public ArrayList<AnswersText> getAnswersTexts() {
        return answersTexts;
    }

    public String getText() {
        return text;
    }

    public boolean isCheckButton() {
        return checkButton;
    }

}
