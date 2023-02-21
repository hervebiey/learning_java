package com.imanuwel.conditionals;

import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number1: ");
        int number1 = scanner.nextInt();
        System.out.println();

        System.out.print("Enter Number2: ");
        int number2 = scanner.nextInt();
        System.out.println();

        System.out.println("Choices available are: \n" +
                "1 - Add \n" +
                "2 - Subtract \n" +
                "3 - Divide \n" +
                "4 - Multiply \n"
        );

        System.out.print("Choose operation: ");
        int choice = scanner.nextInt();
        System.out.println();

        System.out.println("Your choices are: \n" +
                "Number1 " + number1 + "\n" +
                "Number2 " + number2 + "\n" +
                "Choice " + choice + "\n"
        );

        //performOperationUsingNestedIfElse(number1, number2, choice);
        performOperationUsingSwitch(number1, number2, choice);
    }

    private static void performOperationUsingNestedIfElse(int number1, int number2, int choice) {
        if (choice == 1) {
            System.out.println("Result " + (number1 + number2));
        } else if (choice == 2) {
            System.out.println("Result " + (number1 - number2));
        } else if (choice == 3) {
            System.out.println("Result " + (number1 / number2));
        } else if (choice == 4) {
            System.out.println("Result " + (number1 * number2));
        } else {
            System.out.println("Invalid operation");
        }
    }

    private static void performOperationUsingSwitch(int number1, int number2, int choice) {
        switch (choice) {
            case 1:
                System.out.println("Result " + (number1 + number2));
                break;
            case 2:
                System.out.println("Result " + (number1 - number2));
                break;
            case 3:
                System.out.println("Result " + (number1 / number2));
                break;
            case 4:
                System.out.println("Result " + (number1 * number2));
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
    }
}
