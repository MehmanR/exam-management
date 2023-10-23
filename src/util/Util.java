package util;

import java.util.Scanner;

public class Util {

    public static int requireInt (String title){
        Scanner sr = new Scanner(System.in);
        System.out.println(title);
        return sr.nextInt();
    }

    public static String requireString (String title){
        Scanner sr =  new Scanner(System.in);
        System.out.println(title);
        return sr.nextLine();
    }
    public static double requireDouble (String title){
        Scanner sr =  new Scanner(System.in);
        System.out.println(title);
        return sr.nextDouble();
    }

}
