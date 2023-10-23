package service.impl;

import model.Answer;
import model.Question;
import service.Managment;
import util.AnswerUtil;
import util.FileUtil;
import util.Util;

import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class ManagmentImpl implements Managment {
    @Override
    public String startExam(String data, String fileName, int minutes, int questionCount) {

        int point = 0;
        Map<Question, Answer> map = FileUtil.readQuestionFromFile(fileName);
        Set<Question> questionSet = map.keySet();
        ArrayList<Question> questionArrayList = new ArrayList<>();
        Iterator iterator = questionSet.iterator();

        while (iterator.hasNext()) {
            questionArrayList.add((Question) iterator.next());
        }
        Instant start = Instant.now();
        for (int i = 0; i < questionCount; i++) {
            Question randomQuestion = questionArrayList.get(new Random().nextInt(questionArrayList.size()));
            System.out.println(randomQuestion.getQuestion());

            Answer answer = map.get(randomQuestion);
            AnswerUtil.printAnswers(answer);

            String enteredVariant = Util.requireString("Enter correct variant: ").toUpperCase();
            if (enteredVariant.equalsIgnoreCase(randomQuestion.getCorrectVariant())) {
                point++;
            }
        }
        Instant end = Instant.now();
        long excamTime = Duration.between(start, end).toMinutes();

        return "Student : " + data + "\n" + "Total exam time : " + excamTime + "\n" + "Your point : " + point;
    }

    @Override
    public void addQuestion(Map<Question, Answer> map, String fileName) {

        int quesionCount = Util.requireInt("How many question you want to add ? ");

        for (int i = 0; i < quesionCount; i++) {

            Question question = new Question();
            question.setQuestion(Util.requireString("Please enter question : "));
            Answer answer = new Answer();
            answer.setVariantA(Util.requireString("Enter Variant A: "));
            answer.setVariantB(Util.requireString("Enter Variant B: "));
            answer.setVariantC(Util.requireString("Enter Variant C: "));
            answer.setVariantD(Util.requireString("Enter Variant D: "));

            AnswerUtil.printAnswers(answer);
            question.setCorrectVariant(Util.requireString("Enter Correct Variant:"));

            map.put(question, answer);
        }
        FileUtil.addQuestionToFile(map, fileName);

    }

    @Override
    public Map<Question, Answer> getMap() {
        return new HashMap<>();
    }
}
