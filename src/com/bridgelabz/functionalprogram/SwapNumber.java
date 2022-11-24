package com.bridgelabz.functionalprogram;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        int x,y,temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter no.of x and y:");
        x=scan.nextInt();
        y=scan.nextInt();
        System.out.println("before swap no:"+x+" "+y);
        temp=x;
        x=y;
        y=temp;
        System.out.println("after swap no:"+x+" "+y);

    }
}
