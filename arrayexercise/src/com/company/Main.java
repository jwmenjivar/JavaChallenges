package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static public List mergeTwo(int[] arr1, int n1, int[] arr2, int n2, List result){
        int i =0;

        if(arr1[0] < arr2[0]){
            for(int j=0; j < n1 ; j++){

                result.add(i, arr1[j]);
                i++;
            }
        }

        for(int j=0; j<n2 ; j++){
            result.add(i, arr2[j]);
            i++;

        }
    return result;
    }

    public static void main(String[] args) {
	// write your code here
   int arr[] = {6,5,1};
   int arr2[] ={4,3,2};
   List<Integer> result = new ArrayList<>();

        System.out.println(mergeTwo(arr,arr.length, arr2,arr2.length, result));




    }
}
