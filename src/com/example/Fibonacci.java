package com.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        List<Integer> fibSeries = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(limit)
                .map(n -> n[0])
                .collect(Collectors.toList());

        System.out.print(fibSeries);
    }
}
