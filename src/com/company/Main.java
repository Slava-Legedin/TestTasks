package com.company;

import java.lang.Math;
import java.util.Scanner;

public class Main {

    private static double radius;
    private static double side;
    private static final double pi = 3.14;

    public static void main(String[] args) {

    //    System.out.println(Calc.Test());

       Word.Word();

//        getArea();


  //      System.out.println("Is my Sqaure is the Circle? Answer: " + isSqInCircle());
  //      System.out.println("Is my Circle is the Sqaure? Answer: " + isCircleinSq());

    }

    public static void getArea() {
        Scanner read = new Scanner(System.in);
        double sqArea;
        double crclArea;
        System.out.println("Please enter length of the side: ");

        try {
            side = read.nextDouble();
        } catch (Exception e) {
            System.out.println("Only digits are acceptable!");
        }
        sqArea = side * side;

        System.out.println(sqArea);
        System.out.println("Please enter circle radius: ");
        try {
            radius = read.nextDouble();
        } catch (Exception e) {
            System.out.println("Only digits are acceptable!");
        }
        crclArea = pi * radius * radius;
        System.out.println(crclArea);
    }

    public static boolean isSqInCircle() {
        return Math.sqrt(2) * side < radius * 2;
    }

    public static boolean isCircleinSq() {
        return radius * 2 < side;

    }
}
