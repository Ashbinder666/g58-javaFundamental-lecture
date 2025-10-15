package se.lexicon;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.Year;

public class JavaExercises {
    public static void main(String[] args) {

        System.out.println("Hello!");
        System.out.println("Alex");

        LocalDate currentDate = LocalDate.now();
        // System.out.println("currentDate = " + currentDate);

        while (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter year to see if it's leap year or not");
            int year = scanner.nextInt();

            if (Year.isLeap(year)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }



        }
    }
}