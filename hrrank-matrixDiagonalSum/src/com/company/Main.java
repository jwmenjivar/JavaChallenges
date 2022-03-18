package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int diagonalDifference(List<List<Integer>> arr) {
        //
        System.out.println("From inside the diagonal method" + arr);

        //So we want to first addition we want to get 0 0 of the first list
        //the get 1 1 of the second list
        // and the 2 2 of the third
        int sum1 =0;
        for(int i = 0 ; i<arr.size() ; i++){
            sum1 += arr.get(i).get(i);
        }
        System.out.println("This is sum1 = "+ sum1);
        //for the second addition, 0 2//1 1// 2 0
        int sum2 =0;
        int decrement = 0;
        for(int i = 0 ; i<arr.size() ; i++){

            //row puede ir en aumento
            int n = arr.get(i).size()-1;

            for (int j = n  ; j>=0 ; j--){
                //column primero es the length of row
                //la segunda es length of row -1
                //la segunda es length of row -1 -1
                sum2 += arr.get(i).get(j-decrement);
                decrement++;
                break;
            }
        }
        System.out.println("This is sum2 = "+sum2);
        int diff = sum1 - sum2;
        System.out.println(diff);
        int abs = Math.abs(diff);
        System.out.println("This is absolute value of the difference of sum1 and sum2 " + abs);
        return abs;

    }

    public static void main(String[] args) {
	// write your code here

        List<List<Integer>> numbers = new ArrayList<>();

        List<Integer> firstRow = new ArrayList<Integer>();
        firstRow.add(3); firstRow.add(2); firstRow.add(53);
        System.out.println(firstRow);

        List<Integer> secondRow = new ArrayList<Integer>();
        secondRow.add(3); secondRow.add(6); secondRow.add(5);
        System.out.println(secondRow);

        List<Integer> thirdRow = new ArrayList<Integer>();
        thirdRow.add(5); thirdRow.add(7); thirdRow.add(1);
        System.out.println(thirdRow);

        numbers.add(firstRow);
        numbers.add(secondRow);
        numbers.add(thirdRow);

        System.out.println(numbers);

        diagonalDifference(numbers);
    }
}
