package com.bridgelabz.functionalprogram;

public class VowelConsonant {
    public static void main(String[] args) {
        String c ="e";

        switch(c) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case"A":
            case "E":
            case "I":
            case "O":
            case "U":

                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");
        }
    }
}
