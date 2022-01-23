package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static String findDay(int month, int day, int year) {
        String weekDay = null;
        try {
            String date = day + "/" + month + "/" + year;
            System.out.println(date);
            Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(date);
            System.out.println(date1);

            SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");
            System.out.println(simpleDateformat);

            weekDay=simpleDateformat.format(date1).toUpperCase( );
            System.out.println(weekDay);



        } catch (Exception e) {
            System.out.println(e);
        }
        return weekDay;
    }



    public static void main(String[] args) {
        findDay(2,25,1989);
    }
}
