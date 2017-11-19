package com.hillel;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdasExample {

    public static void main(String[] args) {

//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hello: " + i);
//        }
//
//        Stream.of(1, 3, 5, 6, 7, 8, 11)
//                .forEach(element -> System.out.println("Hello: " + element));
//
////        for (int i = 0; i < 5; i++) {
////            if (i % 2 == 0) {
////                System.out.println(i);
////            }
////        }
//
//        IntStream.rangeClosed(1, 5)
//                .filter(element -> element % 2 == 0)
//                .forEach(element -> System.out.println(element));
//
//        int [] numbers = {1, 2, 3, 6, 7};
//        IntStream stream = Arrays.stream(numbers);
//
//
//        IntStream.range(0, 5)
//                .map(e -> e * 2)
//                .forEach(e -> System.out.println(e));


        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + i;

        }

        int result = IntStream.range(0, 5)
                .reduce(0, (a, b) -> a + b);

        int res1 = IntStream.range(0, 5)
                .sum();

        boolean res2 = Stream.of(1, 3, 5, 6, 7, 8, 11)
                .anyMatch(e -> e == 5);

    }

}