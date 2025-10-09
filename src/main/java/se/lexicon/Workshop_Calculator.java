package se.lexicon;

import java.util.Scanner;

public class Workshop_Calculator {
    public static void main(String[]args){

Scanner scanner = new Scanner(System.in);
double num1, num2, result;

System.out.println("Enter first number:");
        num2=scanner.nextDouble();

        System.out.println("Enter the operator (+, -, *, / :");
        char operator = scanner.next() .charAt(0);
        switch(operator) {
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

System.out.println("Enter second number:");
            num1=scanner.nextDouble();

System.out.println(result);



    }



    }

}
