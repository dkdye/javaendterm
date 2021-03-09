package com.company;

public class Menu {
    public static void printMenu(){
        System.out.println("------------MENU-------------");
        System.out.println("1 - Finish order(s)");
        System.out.println("2 - Add another order");
        System.out.println("3 - Exit");
        System.out.print("> Choose one of the above (1-3): ");
    }
}

/*Separate class for menu is created to satisfy one of S.O.L.I.D. principles - SRP (Single Responsibility Principle).
The menu consists from 3 options.*/