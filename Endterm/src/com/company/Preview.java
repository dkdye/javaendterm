package com.company;

public class Preview {
    public static void previewOrder(String[] orders){
        System.out.println("------------------------");
        System.out.println("Your order: ");
        for (int k =0;k<orders.length;k++){
            if (orders[k]!=null){
                System.out.println((k+1) +")"+ orders[k]);
            }

        }

        System.out.println("Total: KZT" + getTotalCost(orders));
    }

    public static int getTotalCost(String[] orders){
        int n=0 ;
        for (String order : orders) {
            if (order != null) {
                n = n + Integer.parseInt(order.substring(order.length() - 4));
            }
        }

        return n;
    }
}
