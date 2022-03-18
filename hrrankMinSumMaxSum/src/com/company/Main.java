package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        long minSum = 0;
        long maxSum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            minSum += arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            maxSum += arr.get(i);
        }
        System.out.println(minSum + " " + maxSum);
    }


    public static void main(String[] args) {
	// write your code here
        List<Integer> numbers = new ArrayList<>(
                List.of(
                        256741038, 623958417, 467905213, 714532089, 938071625
                ));
//2063136757 2744467344
        miniMaxSum(numbers);
    }
}
