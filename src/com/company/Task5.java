package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5 {

    public static void Tasks() {
        Scanner read = new Scanner(System.in);
        String string;

        System.out.println("Please enter something: ");
        List<String> list;
        list = new ArrayList<>();
        while (true){

            if (read.equals("run")) {
                break;
            }
            else
            {
            System.out.println("Please enter something: ");
                read.toString();
                list.add(read.nextLine());
                System.out.println(list);


        }
    }
}}
