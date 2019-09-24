package com.epam.secondTask;

public class PositiveToNegativeNumber {

    public static void main (String[] args){
        int a = Integer.parseInt(args[0]);
        System.out.println("Input int is " + a);
        a = ~a;
        a += 0b1;
        System.out.println("Converted int is " + a);
    }
}
