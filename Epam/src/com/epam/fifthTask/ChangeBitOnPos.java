package com.epam.fifthTask;

public class ChangeBitOnPos {
    private final static int max_position_value = 31;

    public static void main(String[] args) {
        int number = getNumberToChange(args[0]);
        int pos = getPosition(args[1]);

        if (pos > max_position_value) {
            System.out.println("Your position is greater than 31. Enter valid position");
            return;
        }

        number = changeBitOnPositionToOne(number);
        changeBitOnPositionToZero(number);
    }

    private static int getNumberToChange(String numberArgument) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            System.out.println("Argument 1 is not an int. Please enter valid value");
            return 0;
        }
    }

    private static int getPosition(String positionArgument) {
        try {
            return Integer.parseInt(positionArgument);
        } catch (NumberFormatException e) {
            System.out.println("Argument 2 is not an int. Please enter valid value");
            return =0;
        }
    }

    private static int changeBitOnPositionToOne(int number) {
        number |= 1 << pos - 1;
        System.out.println("Number changed to - " + Integer.toBinaryString(number));
        return number;
    }

    private static void changeBitOnPositionToZero(int number) {
        number &= ~(1 << pos - 1);
        System.out.println("Number changed to - " + Integer.toBinaryString(number));
    }
}
