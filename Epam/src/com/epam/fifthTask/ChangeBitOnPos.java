package com.epam.fifthTask;

public class ChangeBitOnPos {

    public static void main (String[] args){
        int number;
        try {
            number = Integer.parseInt(args[0]);
        } catch (NumberFormatException e){
            System.out.println("Argument 1 is not an int. Please enter valid value");
            return;
        }

        int pos;
        try{
            pos = Integer.parseInt(args[1]);
        } catch (NumberFormatException e ){
            System.out.println("Argument 1 is not an int. Please enter valid value");
            return;
        }

        if (pos > 31 ){
            System.out.println("Your position is greater than 31. Enter valid position");
            return;
        }
        System.out.println("Number 2 in bits - " + Integer.toBinaryString(2));
        number |= 1 << pos - 1;
        System.out.println("Number changed to - " + Integer.toBinaryString(number));
        number &= ~(1 << pos - 1);
        System.out.println("Number changed to - " + Integer.toBinaryString(number));
    }
}
