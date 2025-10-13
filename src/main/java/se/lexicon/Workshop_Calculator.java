package se.lexicon;

import java.util.Scanner;

public class Workshop_Calculator {
    public static void main(String[] args) {

        while(true) {

            Scanner scanner = new Scanner(System.in);
            double num1, num2, result = 0;

            System.out.print("Enter first number:");
            num1 = scanner.nextDouble();
            System.out.print("Enter the operator (+, -, *, / :)");
            char operator = scanner.next().charAt(0);
            System.out.print("Enter second number:");
            num2 = scanner.nextDouble();


            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }


            System.out.println("The result is: " + result);

        }
    }


}


