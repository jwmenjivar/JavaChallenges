package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static int hackerlandRadioTransmitters(List<Integer> x, int k){
        //We first insert the missing elements
        //Sort ascending, bubble

        for(int i =0; i<x.size(); i++){
            for(int j=i+1 ; j<x.size(); j++){
                if(x.get(i) > x.get(j)){
                    int temp = x.get(i);
                    x.set(i,x.get(j));
                    x.set(j, temp);
                }
            }
        }
        System.out.println(x);

        //find min or smallest number of arr, that's gonna be the first element.[0]
        //find the largest of array, that's going to be the [1]

        //Generate the mapArray
        List<Integer> mapArray = new ArrayList<>();
        for(int i=x.get(0) ; i<= x.get(x.size()-1) ;i++){
            mapArray.add(i);
        }
        System.out.println(mapArray);

        //Is there a house?, generate emptyLots and compare to determine
        //generate emptyLots
        List<Integer> emptyLots = new ArrayList<>();
        //we compare originalArray with mapArray, and those who are missing in one, will be pushed.
        //los que estan en arrayMap que no estan en arr
        //a es el mapARray b es arr
        int n = mapArray.size();
        int m = x.size();
        for (int i = 0; i < n; i++)
        {
            int j;
            for (j = 0; j < m; j++)
                if (mapArray.get(i) == x.get(j))
                    break;
            if (j == m)
                emptyLots.add(mapArray.get(i));
        }
         System.out.println(emptyLots);

        // now that we have generated the necessary arrays, we can proceed and validate.
        //we pass the mapArray

        int counter=0;
        while(mapArray.size()>0){
            Boolean counterFlag = canInstallAntenna(mapArray, k, emptyLots);
            if(counterFlag){
                counter++;
            }
            System.out.println(counter);
        }

        return counter;
    }

    public static Boolean canInstallAntenna(List<Integer> mapArray, int k, List<Integer> emptyLots){
        System.out.println(" #");
        Boolean flag =false;
        int fullRange = 2*k; //assuming k =2 -> [12 3 45] 2*2 4 [0 1 2 3 4] 4/2 = 2(antennaHouse)

        //generate subarray from 0 to fullrange
        List<Integer> subArray = new ArrayList<>();
        if(fullRange >= mapArray.size()){
            for(int i = 0; i< mapArray.size() ; i++){
                subArray.add(mapArray.get(i));
            }
        }
        else{
            for(int i = 0; i<=fullRange ; i++){
                subArray.add(mapArray.get(i));
            }
        }
        System.out.println("Subarray "+subArray);
        int antennaHouseIndex=0;
        int antennaHouse=0;
        if(mapArray.size()<fullRange){
            antennaHouseIndex = 0;
            antennaHouse = mapArray.get(antennaHouseIndex);
        }
        else{
            antennaHouseIndex = fullRange/2;
            antennaHouse = subArray.get(antennaHouseIndex);
        }

        //is there a house in selected for antenna?

        if(emptyLots.size()==0){
            System.out.println("Antenna installed at: "+ subArray.get(antennaHouseIndex));
            flag = true;
        }

        if(emptyLots.size() > 0 ){
            for (int i = 0; i<emptyLots.size() ; i++){
                if(antennaHouse == emptyLots.get(i)){
                    flag =false;
                    System.out.println("Antenna can't be installed here as there is no house in the lot " + antennaHouse);
                    antennaHouseIndex =0;

                    while(flag==false || antennaHouseIndex<subArray.size()){
                        for (int j = 0 ; j<emptyLots.size() ; j++){

                            if (subArray.get(antennaHouseIndex) == emptyLots.get(j)){
                                flag = false;
                            }
                            else{
                                flag =true;
                            }
                        }
                        antennaHouseIndex++;
                    }
                }
                else{
                    flag =true;

                }

            }
        }

        if(flag){
            System.out.println("Antenna was installed at a lot with house");
        }

        mapArray.removeAll(subArray);
        return flag;
    }

    public static void main(String[] args) {

        List<Integer> originalArray = new ArrayList<>(
                List.of(9,5,4,2,6,15,12));
                int k=2;
        hackerlandRadioTransmitters(originalArray,k);

}
}