package ru.luxoft.courses.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static int plus(int first, int second) {
        return first + second;
    }

    public static int minus(int first, int second) {
        return first - second;
    }

    public static int multiply(int first, int second) {
        return first * second;
    }

    public static double divide(int first, int second) {
        return ((double) first) / second;
    }

    public static int factorial(int numberOne) {
        int res = 1;

        for (int i = 1; i <= numberOne; i++) {
            res *= i;
        }
        return res;
    }

    public static double result(int firstNumber, int secondNumber, String userInput) throws InputMismatchException, ArithmeticException{

        double result;
        switch (userInput) {
            case "+": {
                result = plus(firstNumber, secondNumber);
            }
                break;
            case "-":
                result =  minus(firstNumber, secondNumber);
            break;
            case "*":
                result = multiply(firstNumber, secondNumber);
            break;
            case "/": {
//                if (secondNumber == 0){
//                    throw new ArithmeticException();
//                }
                result = divide(firstNumber, secondNumber);
            }
            break;
            case "!": {
                if (firstNumber > 15 || firstNumber < 0){
                    System.out.println("Please enter number low 16");
                    throw new InputMismatchException();
                }
                result =  factorial(firstNumber);
            }
            break;
            default: {
                throw new InputMismatchException();
            }

        }
        return result;
    }

    public static void main(String[] args) {
        String userInput = "";
        int firstNumber;
        int secondNumber;

        Scanner scanner = new Scanner(System.in);

        while (!"q".equals(userInput)) {
            try {
                System.out.println("Enter first number: ");
                firstNumber = scanner.nextInt();
                System.out.println("Enter second number: ");
                secondNumber = scanner.nextInt();
                System.out.println("Enter operation ('+', '-', '*', '/' or '!'(factorial))");
                userInput = scanner.next();
;
                System.out.println("You result = " +  String.format("%.2f", result(firstNumber, secondNumber, userInput)));
            } catch (InputMismatchException ex) {
                System.out.println("Wrong input data!");
                scanner.nextLine();
                continue;
            }
            catch (ArithmeticException ex) {
                System.out.println("Wrong arithmetic operation! Divide by zero!");
                scanner.nextLine();
                continue;
            }
            System.out.println("Enter 'q' for exit or another key for continue");
            userInput = scanner.next();
        }
        System.out.println("Goodbye");

    }
}



