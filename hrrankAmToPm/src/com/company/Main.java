package com.company;

public class Main {

    public static String timeConversion(String s) {
        // Write your code here
        int stringLength =s.length();

        String m =  String.valueOf(s.charAt(stringLength-1));
        String p =  String.valueOf(s.charAt(stringLength-2));
        String amPm = p + m;
        System.out.println(amPm);

        String h1 = String.valueOf(s.charAt(0));
        String h2 = String.valueOf(s.charAt(1));
        int hour = Integer.parseInt(h1 + h2);

        //System.out.println(hour);
        int militaryHour =12+hour;
        String toInsert = String.valueOf(militaryHour);

        char toInsertChar0 = toInsert.charAt(0);


        System.out.println("To insert: "+toInsert);
        int toInsertLength = toInsert.length();

        String required ="";

        if(toInsert.equals("24") && amPm.equals("PM")){
            StringBuilder s2 = new StringBuilder(s);
            s2.setCharAt(0, '1');
            s2.setCharAt(1, '2');
            s2.delete(8,10);
            required = s2.toString();
        }
        else if(toInsert.equals("24") && amPm.equals("AM")){
            StringBuilder s2 = new StringBuilder(s);
            s2.setCharAt(0, '0');
            s2.setCharAt(1, '0');
            s2.delete(8,10);
            required = s2.toString();
        }
        else if(amPm.equals("AM")){
            StringBuilder s2 = new StringBuilder(s);
            s2.delete(8,10);
            required = s2.toString();
        }
        else if(amPm.equals("PM")){
            if(toInsertLength == 1){
                StringBuilder s2 = new StringBuilder(s);
                s2.setCharAt(0, '0');
                s2.setCharAt(1, toInsertChar0);
                required = s2.toString();
            }
            else{
                char toInsertChar1 = toInsert.charAt(1);
                StringBuilder s2 = new StringBuilder(s);
                s2.setCharAt(0, toInsertChar0);
                s2.setCharAt(1, toInsertChar1);
                s2.delete(8,10);
                required = s2.toString();

            }

        }

        return required;
    }


    public static void main(String[] args) {
	// write your code here

        String theActualTime= timeConversion("04:05:59AM");
        System.out.println("This is the actualtime "+theActualTime);
    }
}
