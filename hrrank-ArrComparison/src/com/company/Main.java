package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        int aliceCount = 0;
        int bobCount = 0;
        int i;
        for (i = 0; i < 3; i++){
            if (a.get(i) > b.get(i)) {
                aliceCount++;
            }
            else if (a.get(i) < b.get(i)) {
                bobCount++;
            }
            }
        result.add(aliceCount);
        result.add(bobCount);
        System.out.println("From inside the method " + result);
        return result;
    }
    public static void main(String[] args) {
        List<Integer> alice = new ArrayList<Integer>(
                Arrays.asList(75, 100, 80));
        List<Integer> bob = new ArrayList<Integer>(
                Arrays.asList(80, 100, 75));
        System.out.println(alice);
        System.out.println(bob);
        System.out.println("From outside the method >>"+compareTriplets(alice, bob));
    }
}
