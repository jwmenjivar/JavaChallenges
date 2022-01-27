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


            /*
            In the line below, we create an instance of SimpleFormat, we set a pattern for this instance, in order to
            use one of the methods that class contains.
            The method we aim to is format(Date oject). Format requires a date object argument (our date1)
            And will output the weekday (JAVA knows it because of the EEEE pattern specified by us.)
            See next comment for implementation.
             */
            SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");
            System.out.println(simpleDateformat);

            /*
            As per Object Oriented implementation. We first use the syntas object.objectMethod(arg).
             */
            weekDay = simpleDateformat.format(date1).toUpperCase( );
            System.out.println(weekDay);



        } catch (Exception e) {
            System.out.println(e);
        }
        return weekDay;
    }



    public static void main(String[] args) {
        findDay(8,5,2015);
    }
}
