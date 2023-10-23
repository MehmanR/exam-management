import model.Answer;
import model.Question;
import service.Managment;
import service.impl.ManagmentImpl;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Map<Question, Answer> map = new HashMap<>();
        Managment managment = new ManagmentImpl();
        managment.addQuestion(map, "question.ser");


        String result = managment.startExam("Student", "question.ser", 1, 4);
        System.out.println(result);

    }
}