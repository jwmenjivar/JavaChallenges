package com.company;


import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {

    public static int[] sortArray(int[] arr){

        for(int i=0 ; i<arr.length ;i++ ){

            for( int j=i+1 ; j<arr.length; j++){

                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int array[] = {1,7,3,9,5};

        System.out.println(Arrays.toString(sortArray(array)));

    }
}