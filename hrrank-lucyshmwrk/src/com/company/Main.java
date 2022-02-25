package com.company;

import java.util.*;

public class Main {
    public static int lilysHomework(List<Integer> arr) {
        int counter = 0;
//So the core thing is a swap. This is a loop that will contain a counter++ at the end that will be returned as the response to the whole exercise

        //the swap is to find the smallest value
        //we do this sorting the array
        List<Integer> savedList = arr;
        System.out.println("Saved List: "+savedList);
        Collections.sort(arr);
        System.out.println("Saved List: "+savedList);
        int smallestNumber =arr.get(0);

        //to find out if it has the lowest index. We get its index
        int smallestNumberIndex = savedList.indexOf(45);
        //if not then look for the item containing the lowest
        if(smallestNumberIndex != 0){
            int tempNumber = savedList.get(0);
            savedList.set(0,smallestNumber);
            savedList.set(smallestNumberIndex,tempNumber);
        counter++;
        }
        System.out.println(savedList);
        //then using temporary variables, perform the swap.
        // swap is completed now count++
        return counter;
    }
    public static void main (String[] args) {
	// write your code here
            List<Integer> arr1 = new ArrayList<>(
                    List.of(5,45,2,3,4,1)
            );
            System.out.println(arr1);

            System.out.println("This is the number of swaps: "+lilysHomework(arr1));
    }
}

