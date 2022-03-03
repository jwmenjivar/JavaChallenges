package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static int hackerlandRadioTransmitters(List<Integer> x, int k) {
        int antennaCount = 0;
        Collections.sort(x);
        int minValue = x.get(0);
        int maxValue = x.get(x.size()-1);
        List<Integer> arrayMap = new ArrayList<>();
        for( int i=minValue ; i<=maxValue ;i++){
            arrayMap.add(i);
            }
        //we now have the complete array of houses and lots
        int midRange= k + 1;
        int fullRange = 2 * k + 1;
        //now we have the range and below we have where the first antenna will be installed.
        int antennaHouseIndex = k+1;
        //is it lot or a house, if it's a house then it is present in the initial array (x).

            if (x.contains(x.get(antennaHouseIndex))){
                 antennaCount++;
            }
            else if (){

            }


    }
    public static void main(String[] args) {
//9 5 4 2 6 15 12
        //7 2 4 6 5 9 12 11
        List<Integer> exampleList = new ArrayList<Integer>(List.of(7,2,4,6,5,9,12,11));
        System.out.println("k is equal to: "+2);
        int numberOfAntennae = hackerlandRadioTransmitters(exampleList, 2);
        System.out.println("This is the number of antennae required: "+ numberOfAntennae);
    }
}
// System.out.println(x);
//         Collections.sort(x);
//         System.out.println(x);
//
//         int minValue = x.get(0);
//         System.out.println("Minvalue is: "+minValue);
//         int maxValue = x.get(x.size()-1);
//         System.out.println("Maxvalue is: "+maxValue);
//
//         List<Integer> arrayMap = new ArrayList<>();
//
//        for( int i=minValue ; i<=maxValue ;i++){
//        arrayMap.add(i);
//        }
//        System.out.println("This is the arraymap" + arrayMap);
//        int range=2*k+1;
//        System.out.println("range "+range);
//        double numberToCeil= (double) arrayMap.size()/range;
//        double ceiledNumber = Math.ceil(numberToCeil);
//        System.out.println("Ceiled number" + ceiledNumber);
//        return (int) ceiledNumber;