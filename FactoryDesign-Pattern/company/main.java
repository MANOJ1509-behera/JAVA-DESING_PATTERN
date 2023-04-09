package com.company;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        PlanFactory factory = new PlanFactory();

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE PLAN OF FOR WHICH BILL WILL BE GENERATED");
        String planName = sc.nextLine();

        System.out.println("Enter the number of the bills will be calculated");
        int units = sc.nextInt();

        plan plan = factory.getPlan(planName);

        System.out.println("PlanName is : " );
        System.out.println(planName);

        System.out.println("Rate is : " );
        plan.getRate();
        System.out.println(plan.rate);


        System.out.println("Total Bill is: ");
        plan.calculateBill(units);


    }
}
