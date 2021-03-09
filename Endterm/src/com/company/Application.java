package com.company;
import java.util.Scanner;

public class Application {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        boolean discount = false;
        char choice;
        String input;
        String[] orders = new String[10];
        int numOfOrders = 0;

        System.out.println("====================================");
        System.out.println("Welcome to \"Eat&Chat\" Pizza Order!");
        System.out.println("====================================");

        System.out.print("Today is: ");
        Time.printCurrentDate();
        System.out.println();
        System.out.print("> Is it your BIRTHDAY (10% discount available on presenting ID) (Y/N)?: ");
        input = scanner.nextLine();

        if (input.equals("Y")||input.equals("y")){
            discount = true;
        }

        orders[numOfOrders++] = Order.orderPizza();
        Preview.previewOrder(orders);

        while (true){
            Menu.printMenu();
            input = scanner.nextLine();
            choice = input.charAt(0);

            switch (choice) {
                case '1' -> {
                    OrderConfirmation.confirmOrder(orders, discount);
                    System.exit(0);
                }
                case '2' -> {
                    orders[numOfOrders++] = Order.orderPizza();
                    Preview.previewOrder(orders);
                }
                case '3' -> {
                    System.out.println("Good bye!");
                    System.exit(0);
                }
                default -> System.exit(0);
            }

        }
    }


}