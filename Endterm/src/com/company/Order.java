package com.company;

import java.util.Scanner;

public class Order {
    public static String orderPizza(){
        Scanner keyboard = new Scanner(System.in);
        String input;
        char choice;
        int size;
        int cost = 0;
        int numberOfToppings = 0;
        String toppings = "Cheese";
        String result = "";
        final int toppingCost = 200;

        System.out.println("------------------------");
        System.out.println("Pizza Size");
        System.out.println("------------------------");
        System.out.println(" 20 cm - KZT1000");
        System.out.println(" 30 cm - KZT1500");
        System.out.println(" 40 cm - KZT2000");
        System.out.print("Please, choose the size of Your pizza (20/30/40): ");
        size = keyboard.nextInt();

        if (size == 20){
            cost+=1000;
        }
        if (size == 30){
            cost+=1500;
        }
        if (size == 40){
            cost+=2000;
        }

        keyboard.nextLine();

        System.out.println("------------------------");
        System.out.println("You can choose from various toppings (each topping's cost is KZT200):\n" +
                "Meat\n" +
                "Sausages\n" +
                "Vegetables\n" +
                "Mushrooms");

        System.out.print("> Do you want Meat? (Y/N): ");
        input = keyboard.nextLine();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y')
        {
            numberOfToppings += 1;
            toppings = toppings + " + Meat";
        }
        System.out.print("> Do you want Sausages (Y/N)?: ");
        input = keyboard.nextLine();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y')
        {
            numberOfToppings += 1;
            toppings = toppings + " + Sausages";
        }
        System.out.print("> Do you want Vegetables (Y/N)?: ");
        input = keyboard.nextLine();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y')
        {
            numberOfToppings += 1;
            toppings = toppings + " + Vegetables";
        }
        System.out.print("> Do you want Mushrooms (Y/N)?: ");
        input = keyboard.nextLine();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y')
        {
            numberOfToppings += 1;
            toppings = toppings + " + Mushrooms";
        }

        cost = cost + numberOfToppings * 200;

        result += size + "cm pizza, " + toppings;

        result += ":" + cost;

        return result;

    }

}
