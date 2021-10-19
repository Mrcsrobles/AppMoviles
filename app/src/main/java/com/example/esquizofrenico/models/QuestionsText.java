package com.example.esquizofrenico.models;

import java.util.ArrayList;

public class QuestionsText {
    private final String text;
    private final ArrayList<AnswersText>
            answersTexts;

    public QuestionsText(String text, ArrayList<AnswersText> answersTexts) {
        this.text = text;
        this.answersTexts = answersTexts;
    }

    public ArrayList<AnswersText> getAnswersTexts() {
        return answersTexts;
    }

    public String getText() {
        return text;
    }

}
