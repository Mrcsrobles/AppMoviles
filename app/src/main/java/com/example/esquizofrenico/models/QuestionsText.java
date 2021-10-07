package com.example.esquizofrenico.models;

import java.util.ArrayList;

public class QuestionsText {
    private int number;
    private String text;
    private boolean checkButton; // esto es true si es una pregunta con respuestas tipo check, y false si es una pregunta con respuestas tipo radio button.
    private ArrayList<AnswersText> answersTexts;

    public QuestionsText(int number, String text, boolean checkButton, ArrayList<AnswersText> answersTexts) {
        this.number = number;
        this.text = text;
        this.checkButton = checkButton;
        this.answersTexts = answersTexts;
    }
    public QuestionsText(){}

    public int getNumber() {
        return number;
    }

    public ArrayList<AnswersText> getAnswersTexts() {
        return answersTexts;
    }

    public void setAnswersTexts(ArrayList<AnswersText> answersTexts) {
        this.answersTexts = answersTexts;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isCheckButton() {
        return checkButton;
    }

    public void setCheckButton(boolean checkButton) {
        this.checkButton = checkButton;
    }
}
