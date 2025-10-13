package se.lexicon;

import java.util.Scanner;

public class Workshop_Calculator {
    public static void main(String[] args) {

        boolean calc = true;
        while(calc) {

            Scanner scanner = new Scanner(System.in);
            double num1, num2, result = 0;

            System.out.print("Enter first number:");
            num1 = scanner.nextDouble();
            System.out.print("Enter the operator (+, -, *, / :)");
            char operator = scanner.next().charAt(0);
            System.out.print("Enter second number:");
            num2 = scanner.nextDouble();


            result = switch (operator) {
                case '+' -> num1 + num2;
                case '-' -> num1 - num2;
                case '*' -> num1 * num2;
                case '/' -> num1 / num2;
                default -> result;
            };


            System.out.println("The result is: " + result);

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String choice = scanner.next();

            if (choice.equalsIgnoreCase("no") || choice.equalsIgnoreCase("exit")) {
                System.out.println("Exiting calculator. Goodbye!");
                calc=false;
            }


        }
    }


}


