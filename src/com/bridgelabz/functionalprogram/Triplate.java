package com.bridgelabz.functionalprogram;

import java.util.Scanner;

public class Triplate {
    static Scanner scan = new Scanner(System.in);
    static void sumOfCount(int num){

        int arr[] = new int[num];
        int count = 0;
        System.out.println("enter values");
        for (int i = 0; i < num; i++) {
            arr[i] = scan.nextInt();//taking integer input by creating array
        }
        //checking for triplate by loop
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        count++;
                        System.out.println(arr[i] + " + " + arr[j] + "+" + arr[k] + "=" + "0");
                    }
                }

            }

        }
        System.out.println("totai pair are =  " + count);
    }

    public static void main(String[] args) {
        System.out.println("enter the no. of input");
        int num = scan.nextInt();
        sumOfCount(num);
    }
}
