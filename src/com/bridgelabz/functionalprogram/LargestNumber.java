package com.bridgelabz.functionalprogram;

public class LargestNumber {
    public static void main(String[] args) {

        int x1 = 6, x2 = 8,x3 = 7;
        if(x1>=x2 && x1>=x3)
            System.out.println(x1 + "is largest no.");
        else if(x2>=x1 && x2>=x3)
            System.out.println(x2 + "is largest no.");
        else
            System.out.println(x3 + "is largest no.");
    }
}
