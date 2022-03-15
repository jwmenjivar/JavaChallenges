package com.company;


import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int a1 = 1; int a2 = 4;
        int b1 = 2; int b2 = 5;

        int d1 = a1 - b2;

        int d2 = b1 - a2;

        Boolean intersect = false;
        if( d1 >= 0 && d2 <= 0){
            intersect = true;
        }

//        if(intersect || (d1 >= 0 && d2<=0)){
//            intersect = true;
//        }
        else{
            intersect = false;
        }

        System.out.println("d1: "+d1);
        System.out.println("d2: "+d2);
        System.out.println("Do they intersect? " + intersect);

    }
}