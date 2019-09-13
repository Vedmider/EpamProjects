package com.epam.thirdTask;

public class BitCount {
    public static void main (String[] args){

        byte byteNumber = Byte.MIN_VALUE;
        short shortNumber = Short.MIN_VALUE;
        int intNumber = Integer.MIN_VALUE;
        long longNumber = Long.MIN_VALUE;

        int count = 0;
        System.out.println("Byte number MIN value is " + shortNumber);
        do {
            count++;
            byteNumber >>>= 1;
        } while (byteNumber != -1);
        count ++; //  1 bit for +/- sign
        System.out.println("byte consists of " + count + "bits");

        count = 0;
        System.out.println("Short number MIN value is " + shortNumber);
        do{
            count ++;
            shortNumber >>= 1;
        } while (shortNumber != -1);
        count++;
        System.out.println("short consists of " + count + " bit");

        count = 0;
        System.out.println("Int number MIN value is " + intNumber);
        do{
            count ++;
            intNumber >>= 1;
        } while (intNumber != -1);
        count++;
        System.out.println("Int number consists of " + count + " bit");

        count = 0;
        System.out.println("Long number MIN value is " + longNumber);
        do{
            count ++;
            longNumber >>= 1;
        } while (longNumber != -1);
        count++;
        System.out.println("Long number consists of " + count + " bit");
    }
}
