package com.example.esquizofrenico.models;

import java.util.ArrayList;

public class QuestionsImages {

    private final int image;
    private final String text;
    private final boolean checkButton; // esto es true si es una pregunta con respuestas tipo check, y false si es una pregunta con respuestas tipo radio button.
    private final ArrayList<AnswersText> answersTexts;

    public QuestionsImages(int image, String text, boolean checkButton, ArrayList<AnswersText> answersTexts) {
        this.image = image;
        this.text = text;
        this.checkButton = checkButton;
        this.answersTexts = answersTexts;
    }

    public String getText() {
        return text;
    }

    public int getImage() {
        return image;
    }

    public boolean isCheckButton() {
        return checkButton;
    }

    public ArrayList<AnswersText> getAnswersTexts() {
        return answersTexts;
    }

}
