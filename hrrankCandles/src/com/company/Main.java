package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        ArrayList<Integer> other = new ArrayList<Integer>(candles);
        System.out.println(other);
        Collections.sort(other);
        System.out.println(other);
        int largestNumber = other.get(other.size()-1);
        System.out.println(largestNumber);
        System.out.println("This is candles: "+candles);
        int count= 0;
        for( int i = 0 ; i<candles.size() ; i++){
            if (candles.get(i) == largestNumber){
                //    System.out.println(i);
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
	// write your code here
        List<Integer> candelas = new ArrayList<>(
                List.of(
                        18, 90, 90, 13, 90, 75, 90, 8, 90, 43
                )
        );
        int number =birthdayCakeCandles(candelas);
        System.out.println(number);
    }
}
