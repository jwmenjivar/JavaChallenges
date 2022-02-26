package com.company;

import java.util.*;

public class Main {
    public static int lilysHomework(List<Integer> arr) {

        int counter = 0;
        //Debugging
        //System.out.println("Given array: " + arr);

        for( int j=0 ; j <arr.size() ;j++){

                int smallest = arr.get(j);
                for (int i = j; i < arr.size(); i++) {
                        if (smallest > arr.get(i)) {
                            smallest = arr.get(i);
                        }
                    }

                int smallestNumberIndex = arr.indexOf(smallest);
                int smallestNumber = arr.get(smallestNumberIndex);
                if(smallestNumberIndex != j){
                    int tempNumber = arr.get(j);
                    arr.set(j, smallestNumber);
                    arr.set(smallestNumberIndex, tempNumber);
                    counter++;

                }
        }
        //Debugging
        //System.out.println("Includes changes/swaps: " + arr);
        //System.out.println("Number of swaps: " + counter);
        return counter;
    }
    public static void main (String[] args) {
	// write your code here
            List<Integer> arr1 = new ArrayList<>(
                    //     [0  1 2 3 4 5  6]
                    List.of(7,15,12,3)
            );
            System.out.println("From main "+arr1);

            System.out.println("This is the number of swaps: "+lilysHomework(arr1));
    }
}

