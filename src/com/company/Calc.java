package com.company;

import java.util.Scanner;
public class Calc {

    public static boolean Test(){

        int res=0;
        System.out.println("Please enter the first on 20 digits: ");
        Scanner read = new Scanner(System.in);
        int frst = read.nextInt();
        //int frst = 10;
        int[] mass = new int[20];

        System.out.println("Thanks! Your list of digits is: ");
        for (int i = 0 ; i < mass.length; i++) {
            mass[i] = i+frst;

            System.out.println(mass[i]);
        }

        int sum=0;
        for (Integer integer : mass) {
            if (integer % 3 == 0 && integer % 5 != 0) {
                res = sum += integer;
            }
        }
        System.out.println("The sum of digits which can be divided by 3 and no by 5 is: " + res);

        return true;
    }
}
