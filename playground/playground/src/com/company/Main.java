package com.company;

import lombok.ToString;

public class Main {
public static String nameMain;
private static int age;
public Main() {}
    public static void main(String[] args) {
    OtherClass calzon = new OtherClass();
    calzon.name = "Pizza Calzone";
    System.out.println(calzon.name);

        calzon.setWeight(5);
        System.out.println(calzon.getWeight());

        System.out.println(Main.nameMain);
        System.out.println(Main.age);

    Main main1 = new Main();
    main1.nameMain = "MAINSISIMO";
    main1.age = 21;
    System.out.println(main1.nameMain + " " +main1.age);

        System.out.println(Main.nameMain);
        System.out.println(Main.age);

    Main main2 = new Main();
        main2.nameMain = "MAINS";
        main2.age = 64;
        System.out.println(main2.nameMain + " " +main2.age);

    System.out.println(Main.nameMain);
        System.out.println(Main.age);
    }
}
