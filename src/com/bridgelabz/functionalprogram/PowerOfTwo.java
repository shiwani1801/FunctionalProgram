package com.bridgelabz.functionalprogram;

public class PowerOfTwo {
    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);
        if (num > 31) {
            System.out.println("value of number should be less than 31");
            return;
        } else {
            System.out.println("power of 2^" + num + "is:" + (Math.pow(2, num)));

            System.out.println("printing all power value:" + num);
            for (int i = 1; i <= num; i++) {
                System.out.println("power of 2^" + i + " is:" + (Math.pow(2, i)));
            }
        }
    }
}