package model;

import java.io.Serializable;

public class Question implements Serializable {

    private String question;
    private String correctVariant;


    public Question() {

    }

    public String getCorrectVariant() {
        return correctVariant;
    }

    public void setCorrectVariant(String correctVariant) {
        this.correctVariant = correctVariant;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                '}';
    }
}
