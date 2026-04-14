package com.example;

public class Swap {
    public static void main(String[] args){
        int a = 29;
        int b = 478;

        b = b + a; //b = 9
        a = b - a; // a = 4
        b = b - a; // b = 5

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        String s1 = "think always ";
        String s2 = "good";

        s1 = s1 + s2; // "think always good"
        s2 = s1.substring(0, s1.length() - s2.length());
        s1 = s1.substring(s2.length());

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);


    }
}
