package com.company;

import java.lang.Math;
import java.util.Scanner;

public class Main {

    private static double radius;
    private static double side;
    private static final double pi = 3.14;

    public static void main(String[] args) throws Exception {

Task5.Tasks();
//                Task4.Word();
        //System.out.println(Calc.Test());

//       getArea();

//            System.out.println("Is my Sqaure is the Circle? Answer: " +isSqInCircle());
//            System.out.println("Is my Circle is the Sqaure? Answer: " +isCircleinSq());

    }

    private static void getArea(){
        System.out.println("Please enter length of the side: ");
        Scanner read = new Scanner(System.in);
        double sqArea;
        try {
            side = read.nextDouble();
        } catch (Exception e) {
            System.out.println("Only digits are acceptable!");
        }
        sqArea=side*side;
        System.out.println(sqArea);

        System.out.println("Please enter circle radius: ");
        double crclArea;
        try { radius = read.nextDouble();}
        catch (Exception e) {
            System.out.println("Only digits are acceptable!");
        }
        crclArea=pi*radius*radius;
        System.out.println(crclArea);
        //return sqArea;
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
