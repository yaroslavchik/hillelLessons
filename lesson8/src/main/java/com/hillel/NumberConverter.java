package com.hillel;

public class NumberConverter {


    public static String decimalToBinary(int i) {
        String result = "";
        if (i == 0) {
            return "0";
        }

        do {
            int rem = i % 2;
            result =  rem + result;
            i = i / 2;
        } while (i > 0);

        return result;
    }
}
