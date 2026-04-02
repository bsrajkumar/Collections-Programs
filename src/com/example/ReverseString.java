package com.example;

import java.util.stream.IntStream;

public class ReverseString {
    public static void main(String[] args){
        String s = new String("rajkumar");

        System.out.println(new StringBuilder(s).reverse());

        String reversedString = IntStream.range(0, s.length())
                .mapToObj(i -> s.charAt(s.length()-1-i))
                .collect(StringBuilder::new,
                        StringBuilder::append,
                        StringBuilder::append)
                .toString();


        System.out.println(reversedString);

    }
}
