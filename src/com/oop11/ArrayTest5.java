package com.oop11;

import java.util.Random;

public class ArrayTest5 {

    public static int[] makeNumber(){
        // 1, 10, 11, 12, 45, 23
        Random random = new Random();
        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
           numbers[i] = random.nextInt(45) + 1;
        }
        return numbers;
    } // end fo makeNumber method

    public static void main(String[] args) {

        int[] lotto = makeNumber();
        for (int i = 0; i < 6; i++){
            System.out.print(lotto[i] + " ");
        }
        System.out.println();
    } // end of main
} // end of class
