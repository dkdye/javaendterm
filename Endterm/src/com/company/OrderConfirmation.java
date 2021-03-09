package com.company;

public class OrderConfirmation{
    public static void confirmOrder(String[] orders, boolean discount){
        final int DISCOUNT_AMOUNT = 10;

        System.out.println("#############################################");
        Preview.previewOrder(orders);

        int cost = Preview.getTotalCost(orders);

        if (discount=true){
            cost = cost *90/100;
            System.out.println("-----------------------------");
            System.out.println("Total with DISCOUNT (on presenting ID only!):");
            System.out.println(cost);
        }

        System.out.println("-----------------------------");
        System.out.println("Your order will be ready for pickup in 20 minutes.");

        System.out.print("Date: ");
        Time.printCurrentDate();

        System.out.print("\tTime: ");
        Time.printCurrentTime();
        System.out.println();

        System.out.println("Order ID: " + generateCode());
    }


    public static String generateCode(){
        int a =(int)(Math.random()*10000);
        if (a<1000){
            a=a+1000;
        }
        String g = Integer.toString(a);
        return g;
    }

}
