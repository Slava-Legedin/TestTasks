package com.company;

import java.lang.Math;
import java.util.Scanner;

public class Main {

    private static double radius;
    private static double side;
    private static final double pi = 3.14;

    public static void main(String[] args) throws Exception {

        System.out.println(Calc.Test());
            /*
            System.out.println("Please enter length of the side: ");

            System.out.println(sqaureArea());

            System.out.println("Please enter circle radius: ");
            System.out.println(circleArea());

            System.out.println("Is my Sqaure is the Circle? Answer: " +isSqInCircle());
            System.out.println("Is my Circle is the Sqaure? Answer: " +isCircleinSq());
            */
    }

    public static double sqaureArea() {
        Scanner read = new Scanner(System.in);
        double sqArea;
        try {
            side = read.nextDouble();
        } catch (Exception e) {
            System.out.println("Only digits are acceptable!");
        }
        sqArea = side * side;
        return sqArea;
    }

    public static double circleArea() throws Exception {
        Scanner read = new Scanner(System.in);
        double crclArea;
        try {
            radius = read.nextDouble();
        } catch (Exception e) {
            System.out.println("Only digits are acceptable!");
        }
        crclArea = pi * radius * radius;
        return crclArea;
    }

    public static boolean isSqInCircle() {
        if (Math.sqrt(2) * side < radius * 2)
            return true;
        else return false;
    }

    public static boolean isCircleinSq() {
        if (radius * 2 < side)
            return true;
        else return false;

    }
}
