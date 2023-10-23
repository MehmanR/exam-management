package service;

import model.Answer;
import model.Question;

import java.util.Map;
import java.util.Queue;

public interface Managment {

    String startExam(String data, String fileName, int minutes, int questionCount);

    void addQuestion(Map<Question,Answer> map,String fileName);

    Map<Question, Answer> getMap();

}
