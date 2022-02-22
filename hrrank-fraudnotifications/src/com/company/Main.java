package com.company;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
@ToString
public class Main {
    Scanner sc = new Scanner(System.in);
    //Returns the number of notices sent
    static public int activityNotifications(List<Integer> expenditure, int d){
        int counterNotification =0;

        //now we have the array, d and n.
        // in order to get median for the trailings, we must make their indexes dynamic

        //so the values below will do that; they depend on the iteration number of k
        //if k = 0, it means it will be from index 0 to d-1.
        //and... after that we just add ++ to each, after every iteration.
        //until endTrailIndex reaches expenditure.length, (it should stop).
        int initialTrailIndex = 0;
        int endTrailIndex = d-1;
        //we se median from outside just to see how it works
        double median = 0;

        for(int k =0 ; k<expenditure.size(); k++ ) {


                    if(endTrailIndex < expenditure.size()){


                            //we first determine the median
                            if(d%2 == 0 ){
                                int firstMiddleValue =
                                        initialTrailIndex+(((endTrailIndex-initialTrailIndex +1)/2)-1);
                                        System.out.println("First middle value " + firstMiddleValue);
                                 int secondMiddleValue = firstMiddleValue+1;
                                        System.out.println("Second middle value " + secondMiddleValue);
                                median = (expenditure.get(firstMiddleValue) + expenditure.get(secondMiddleValue))/2;
                                        System.out.println("This is median for even " + median);
                            }
                            else if (d%2 != 0){
                                median = expenditure.get(initialTrailIndex + (endTrailIndex - initialTrailIndex) / 2);
                                System.out.println("This is median for odd " + median);
                            }
                            if(expenditure.get(k) >= median){
                                System.out.println("Message sent");
                                               counterNotification++;}

                        }

            System.out.println("Initial trail Index: " + initialTrailIndex);
            System.out.println("End trail index: "+ endTrailIndex);
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


        List expenditure = new ArrayList<Integer>();

        for(int i = 0 ; i<n ;i++){
            int dayToShow = i+1;
            System.out.println("Day " + dayToShow);
            expenditure.add(sc.nextInt());
        }


        //Now we proceed to use the function as stated in the exercise
        int numberOfNotifications= activityNotifications(expenditure, d);
        System.out.println(numberOfNotifications);
    }
}
