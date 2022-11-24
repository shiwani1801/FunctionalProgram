package com.bridgelabz.functionalprogram;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        double result=0;
        int j;
        System.out.println("enter the no.");
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        for (j=1;j<=num;j++){
            result=result+(double) 1/j;
            System.out.println("the value of harmonic no. " + num + "is:"+result);
        }
    }

}
