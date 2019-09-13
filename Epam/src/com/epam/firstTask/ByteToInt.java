package com.epam.firstTask;

public class ByteToInt {

    public static void main(String[] args) {
        char[] charsArray = args[0].toCharArray();
        int charsArrayLength = charsArray.length;
        int[] intArray = new int[charsArrayLength];
        int decimal = 0;

        for (int i = 0; i < charsArrayLength; i++){
            intArray[i] = Character.getNumericValue(charsArray[i]);
        }

        for (int i = 0; i < charsArrayLength; i++){
            decimal += intArray[charsArrayLength - 1 - i]*power(2, i);
        }
        System.out.println("input variable - " + args[0] + ", output decimal - " +  decimal);
        // next challenge
        int a = 4;
        a = ~a;
        a += 0b1;
        System.out.println(a);
    }

    static int power(int a, int b){
        int result = 1;
        for (int i=1; i<=b; i++){
            result = result*a;
        }
        return result;
    }
}
