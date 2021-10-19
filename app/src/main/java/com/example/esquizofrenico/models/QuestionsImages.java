package com.example.esquizofrenico.models;

import java.util.ArrayList;

public class QuestionsImages {

    private final int image;
    private final String text;
    private final ArrayList<AnswersText> answersTexts;

    public QuestionsImages(int image, String text, ArrayList<AnswersText> answersTexts) {
        this.image = image;
        this.text = text;
        this.answersTexts = answersTexts;
    }

    public String getText() {
        return text;
    }

    public int getImage() {
        return image;
    }

    public ArrayList<AnswersText> getAnswersTexts() {
        return answersTexts;
    }

}
