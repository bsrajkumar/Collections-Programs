package com.example;

public class Fibonacci {
    public static void main(String[] args){
        int limit = 50;
        int a = 0;
        int b = 1;
        for(int i = 0; i < limit; i++){
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            if(a > limit) // If Logic to print Series until the limit
                break;    // Remove If to print the number of series until limit eg: 50 numbers
        }
    }
}
