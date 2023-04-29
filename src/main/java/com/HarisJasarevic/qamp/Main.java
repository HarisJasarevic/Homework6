package com.HarisJasarevic.qamp;

import com.google.common.base.Joiner;

public class Main {
    public static void main(String[] args) {

        int result = Calculator.addNumbers(3,5);
        int result1 = Calculator.subtractNumbers(8,2);
        int result2 = Calculator.multiplyNumbers(4,3);

        String [] strings = {"Calculator", "works", "just", "fine", "!" };
        String joined = Joiner.on(" ").join(strings);
        System.out.println(joined);


        System.out.println("Result of numbers addition is: " + result);
        System.out.println("Result of numbers subtraction is: " + result1);
        System.out.println("Result of numbers multiplication is: " + result2);

    }
}