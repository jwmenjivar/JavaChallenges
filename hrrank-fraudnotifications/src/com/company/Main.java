package com.company;

import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
@ToString
public class Main {
    Scanner sc = new Scanner(System.in);
    //Returns the number of notices sent
    static public int activityNotifications(List<Integer> expenditure, int d){
        int counterNotification =0;
        int initialTrailIndex = 0;
        int endTrailIndex = d-1;
        double median = 0;
        for(int k =0 ; k < expenditure.size(); k++ ) {
                    if(endTrailIndex < expenditure.size()){
                        //we first make an array containing the elements of trailing
                        List<Integer> tempArr = new ArrayList<>();

                        for(int j = initialTrailIndex ; j<=endTrailIndex ; j++){
                        tempArr.add(expenditure.get(j));
                        }
                        //we sort the array in ascending order.
                        Collections.sort(tempArr);
                            //then we determine the median
                            if(d%2 == 0 ){
                                int firstMiddleValueIndex = (tempArr.size()-1 + 1)/2 - 1;
                                //int secondMiddleValueIndex = firstMiddleValueIndex + 1;
                                median =(double) (tempArr.get(firstMiddleValueIndex) + tempArr.get(firstMiddleValueIndex+1))/2;

                            }
                            else{
                                int middleNumberIndex =
                                        (tempArr.size()-1)/2;
                                median = (double) tempArr.get(middleNumberIndex);
                            }
                            if(endTrailIndex+1 < expenditure.size()) {
                                int currentExpenditure = expenditure.get(endTrailIndex + 1);
                                if (currentExpenditure >= 2 * median) {
                                    counterNotification++;
                                }
                            }

                        }
            initialTrailIndex++;
            endTrailIndex++;
        }
        return counterNotification;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter d as the number of \"trailing days\"");

        int d = sc.nextInt();

        System.out.println("Enter n as the period to be covered, this has to be more than d Eg. 7 days");

        int n = sc.nextInt();
        System.out.println("Okay so the amount of days entered is " + n);
        System.out.println("Now for each day please enter the daily expenditure");


        List<Integer> expenditure = new ArrayList<>();

        for(int i = 0 ; i<n; i++){
            int dayToDisplay = i+1;
            System.out.println("Day " + dayToDisplay);
            expenditure.add(sc.nextInt());
            System.out.println("Size of array: "+expenditure.size());
        }


        //Now we proceed to use the function as stated in the exercise
        int numberOfNotifications= activityNotifications(expenditure, d);
        System.out.println("Notifications sent: "+numberOfNotifications);
    }
}
