package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long result = 0;

        for (Long num: ar)

            {
                result += num;
        }
        System.out.println("Result from inside method: " + result);
        return result;
    }

    public static void main(String[] args) {
	// write your code here

        List<Long> longArrayList = new ArrayList<Long>(
                Arrays.asList(1L,2L,3L,20L
                ));

        aVeryBigSum(longArrayList);
    }
}
