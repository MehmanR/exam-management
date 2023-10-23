package util;

import model.Answer;
import model.Question;

import java.io.*;
import java.util.Map;

public class FileUtil {

    public static void addQuestionToFile(Map<Question, Answer> map, String fileName) {

        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName, true);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            objectOutputStream.writeObject(map);
            objectOutputStream.flush();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }


    public static Map<Question, Answer> readQuestionFromFile(String fileName) {
        Map<Question, Answer> map = null;
        try (FileInputStream fileInputStream = new FileInputStream(fileName);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            map = (Map<Question, Answer>) objectInputStream.readObject();

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return map;
    }


}
