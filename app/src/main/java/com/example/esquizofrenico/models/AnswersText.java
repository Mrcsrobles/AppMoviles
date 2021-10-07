package com.example.esquizofrenico.models;

public class AnswersText {
    private int number;
    private String text;
    private boolean correct; // esto es true si la respuesta es correcta y false si no lo es

    public AnswersText(int number, String text, boolean correct) {
        this.number = number;
        this.text = text;
        this.correct = correct;
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

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }
}
