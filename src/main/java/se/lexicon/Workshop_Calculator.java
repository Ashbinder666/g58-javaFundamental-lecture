package se.lexicon;

import java.util.Scanner;

public class Workshop_Calculator {
    public static void main(String[]args){

Scanner scanner = new Scanner(System.in);
double fnum, snum, answer;

System.out.println("Enter first number:");
fnum=scanner.nextDouble();

System.out.println("Enter second number:");
snum=scanner.nextDouble();

answer = fnum + snum;
System.out.println(answer);

    }





}
