package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void plusMinus(List<Integer> arr) {
        //This is the number I'll divide by
        int size = arr.size();

       //Need also to start 3 counters, one for each.
       int counterPositive = 0;
       int counterNegative = 0;
       int counterZeros = 0;

        for (Integer number: arr) {
            //Now need to find which are pos, neg and zero.
            if(number > 0) {
                counterPositive++;
            }
            else if (number < 0) {
                counterNegative++;
            }
            else {
                counterZeros++;
            }
        }
        double ratioPos = counterPositive/size;
        double ratioNeg = counterNegative/size;
        double ratioZer = counterZeros/size;

        System.out.println(ratioPos);
        System.out.println(ratioNeg);
        System.out.println(ratioZer);
    }

    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<>(
                List.of(1, 1, 0, -1, -1));

        Main.plusMinus(ints);

    }
}
