package com.company;

import java.util.*;

public class Task5 {


    public static List<DailyTask> tasks = new ArrayList<>();
    public static void Tasks(){
        Scanner scanner = new Scanner(System.in);
        //System.out::println(String.valueOf(ArrayList[]));
         String s ="";


        while (!s.equals("s")) {
        System.out.println("Enter Task name");
        String name= scanner.next();
        System.out.println("Enter priority:\n 1-HIGH \n 2-MIDDLE \n 3-LOW");
        String priority = scanner.next();
        System.out.println("Enter complexity:\n 1-HARD \n 2-MEDIUM \n 3-EASY");
        String complaxity = scanner.next();
        //String v = "";
        name.toUpperCase();
        priority.toUpperCase();
        complaxity.toUpperCase();
            System.out.println("upper?: " + name.toUpperCase());

DailyTask dt = new DailyTask(name.toUpperCase(), priority.toUpperCase(), complaxity.toUpperCase());
tasks.add(dt);

            System.out.println("enter stop");
            s = scanner.next();

        }
        //System.out.println();
for (DailyTask dt: tasks){
    System.out.println(dt.comp);
}
        //tasks.forEach(System.out::println);
    }


}
