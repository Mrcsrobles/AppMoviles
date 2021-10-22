package com.example.esquizofrenico.models;

public class AnswersText {
    private final String text;
    private final boolean correct; // esto es true si la respuesta es correcta y false si no lo es

    public AnswersText(String text, boolean correct) {
        this.text = text;
        this.correct = correct;
    }

    public AnswersText(int i, String string, boolean b) {
        correct = false;
        text = null;
    }

    public String getText() {
        return text;
    }

    public boolean isCorrect() {
        return correct;
    }

}
