package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static String findDay(int month, int day, int year) {
        String weekDay = null;
        try {
            String date = day + "/" + month + "/" + year;
            /*
            We define the order of month day year in the line above
            (We could have said year month day or year day month... but...
            we would have to change the pattern in line 18, to match that,
            otherwise it won't work)
            */
            System.out.println(date);
            Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(date);
            /*
            .parse() converts the String date into a Date data type(From String to Date Object).
            SimpleDateFormat matches the pattern in its argument with what was defined inside parse().
            And all that is stored in date1
            */
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
