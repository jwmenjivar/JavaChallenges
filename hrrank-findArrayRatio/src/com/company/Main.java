package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void plusMinus(List<Integer> arr) {
        double counterPositive = 0;
        double counterNegative = 0;
        double counterZeros = 0;
        double arrSize = 0;

        //This is the number I'll divide by
        arrSize = arr.size();
       //Need also to start 3 counters, one for each.
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
        double ratioPos = counterPositive/arrSize;
        String formattedPos = String.format("%.6f",ratioPos);

        double ratioNeg = counterNegative/arrSize;
        String formattedNeg = String.format("%.6f",ratioNeg);

        double ratioZer = counterZeros/arrSize;
        String formattedZer = String.format("%.6f",ratioZer);

        System.out.println(formattedPos);

        System.out.println(formattedNeg);

        System.out.println(formattedZer);
    }

    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<>(
                List.of(1, 1, 0, -1, -1));

        Main.plusMinus(ints);

    }
}
