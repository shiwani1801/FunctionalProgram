package com.bridgelabz.functionalprogram;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.:");
        n=sc.nextInt();
        if(n%2==0){
            System.out.println("the no. "+n+" is even");
        }else {
            System.out.println("the no. "+n+" is odd");
        }

    }
}
