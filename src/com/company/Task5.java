package com.company;

import java.util.*;

public class Task5 {


    public static List<DailyTask> tasks = new ArrayList<>();
    public static void Tasks(){
        Scanner scanner = new Scanner(System.in);
        //System.out::println(String.valueOf(ArrayList[]));
         String s ="";


        while (!s.equals("stop")) {
        System.out.println("enter name");
        String name = scanner.next();
        System.out.println("enter priority");
        String priority = scanner.next();
        System.out.println("enter complexity");
        String complaxity = scanner.next();

DailyTask dt = new DailyTask(name, priority, complaxity);
tasks.add(dt);

            System.out.println("enter stop");
            s = scanner.next();


        }

for (DailyTask dt: tasks){
    System.out.println(dt.name);
}
    //    tasks.forEach(System.out::println);
    }


}
