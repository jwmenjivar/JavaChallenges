package com.company;

import java.util.*;

public class Main {
    public static int lilysHomework(List<Integer> arr) {

        int counter = 0;
        List<Integer> savedList = new ArrayList<>(arr);
        System.out.println("Saved List: " + savedList);
        Collections.sort(arr);
        System.out.println("Sorted array" + arr);
        for( int j=0 ; j <arr.size() ;j++){

            if (counter == 0) {
                int smallestNumber = arr.get(0);
                //to find out if it has the lowest index. We get its index
                int smallestNumberIndex = savedList.indexOf(smallestNumber);
                //if not then look for the item containing the lowest
                if (smallestNumberIndex != 0) {
                    //then using temporary variables, perform the swap.
                    int tempNumber = savedList.get(0);
                    savedList.set(0, smallestNumber);
                    savedList.set(smallestNumberIndex, tempNumber);
                    counter++;
                }
            }
            else if(counter >0 ) {
                //gotta find the smallest of an array list
                int smallest = savedList.get(j);
                for (int i = j; i < savedList.size(); i++) {
                    int nextItem = savedList.get(i);
                        if (smallest > savedList.get(i)) {
                            smallest = savedList.get(i);
                            System.out.println("This is the smallest: " + smallest);
                        }
                    }
                //now that we have found the smallest
                //we get it's index
                int smallestNumberIndex = savedList.indexOf(smallest);
                int smallestNumber = savedList.get(smallestNumberIndex);
                if(smallestNumberIndex != j){
                    int tempNumber = savedList.get(j);
                    savedList.set(j, smallestNumber);
                    savedList.set(smallestNumberIndex, tempNumber);
                    counter++;

                }
        }
        System.out.println("Includes changes/swaps: " + savedList);
    }
        return counter;
    }
    public static void main (String[] args) {
	// write your code here
            List<Integer> arr1 = new ArrayList<>(
                    //     [0  1 2 3 4 5  6]
                    List.of(4,3,2,1)
            );
            System.out.println("From main "+arr1);

            System.out.println("This is the number of swaps: "+lilysHomework(arr1));
    }
}

