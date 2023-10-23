package util;

import model.Answer;

public class AnswerUtil {

    public static void printAnswers (Answer answer){
        System.out.println("================================================");
        System.out.println("A) " + answer.getVariantA());
        System.out.println("B) " + answer.getVariantB());
        System.out.println("C) " + answer.getVariantC());
        System.out.println("D) " + answer.getVariantD());
        System.out.println("================================================");

    }
}
