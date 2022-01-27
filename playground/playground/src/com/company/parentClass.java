package com.company;

import lombok.ToString;
@ToString
class ParentClass {
String name = "Paul Senior";

    ParentClass(){
        System.out.println("Parent Constructor");
    }

}
@ToString
class ChildClass extends ParentClass{
    String name = "Paulie Jr.";

    ChildClass(){
        System.out.println("Child Constructor");
    }

    public void displayName(){

        System.out.println(super.name);

    }
}

