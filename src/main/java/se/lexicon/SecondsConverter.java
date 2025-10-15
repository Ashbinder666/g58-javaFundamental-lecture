package se.lexicon;

import java.util.Scanner;
import java.time.LocalTime;

public class SecondsConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input seconds: ");
        int totalSeconds = scanner.nextInt();

        LocalTime time = LocalTime.ofSecondOfDay(totalSeconds);

        System.out.println(time);

        scanner.close();
    }
}
