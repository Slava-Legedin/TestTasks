package com.company;

public class DailyTask {

    String name;
    String prio;
    Integer comp;


    //!!!enum Complaxity {Hard, Middle, Easy}


    public DailyTask(String nm, String pr, String cmp) {
        this.name = nm;
        this.comp = CompHours(cmp);
        this.prio = Priority();

    }

    public static String Priority() {
        Priority[] priorities = Priority.values();
        for (Priority p : priorities) {
            return String.valueOf(p);

        }
        return null;
    }

    public static Integer CompHours(String s) {
        Integer hours = 0;
        if (s.equals("HIGH")) {
             hours =4;}
            else if (s.equals("MIDDLE")) {
                hours = 2;}
                if (s.equals("LOW")) {
                    hours = 1;}


        return hours;
    }
        
    }