package com.company;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// we are given a double
        System.out.println("Enter an amount with cents");
        Scanner keyboard = new Scanner(System.in);
        double payment = keyboard.nextDouble();

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        //Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).
        String india = NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
