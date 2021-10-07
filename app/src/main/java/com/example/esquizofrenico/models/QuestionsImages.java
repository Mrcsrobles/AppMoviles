package com.example.esquizofrenico.models;

import java.util.ArrayList;

public class QuestionsImages {
    private int number;
    private int image;
    private String text;
    private boolean checkButton; // esto es true si es una pregunta con respuestas tipo check, y false si es una pregunta con respuestas tipo radio button.
    private ArrayList<AnswersText> answersTexts;

    public QuestionsImages(int number, int image, String text, boolean checkButton, ArrayList<AnswersText> answersTexts) {
        this.number = number;
        this.image = image;
        this.text = text;
        this.checkButton = checkButton;
        this.answersTexts = answersTexts;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isCheckButton() {
        return checkButton;
    }

    public void setCheckButton(boolean checkButton) {
        this.checkButton = checkButton;
    }

    public ArrayList<AnswersText> getAnswersTexts() { return answersTexts; }

    public void setAnswersTexts(ArrayList<AnswersText> answersTexts) { this.answersTexts = answersTexts; }
}
