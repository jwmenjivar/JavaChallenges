package com.company;


import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
String path[] = {"D","D","U","U","U","U","D","D","D","U","D","U"};

        int seaLevel = 0;
        int valleys = 0;
        int inValley = 0;

        for(int i=0; i<path.length;i++){

            if(path[i] == "U"){
                seaLevel++;
            }
            else {
                seaLevel--;
            }

            if(seaLevel < 0){
                inValley++;
            }

            if(seaLevel==0 && inValley>0){
                valleys++;
                inValley = 0;
            }

        }
        System.out.println(valleys);
}
}
