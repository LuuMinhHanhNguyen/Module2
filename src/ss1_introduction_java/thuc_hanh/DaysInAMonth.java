package ss1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class DaysInAMonth {
    public static void main(String[] args) {
        int month;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month to get the number of days:");
        month = Integer.parseInt(sc.nextLine());
        switch (month) {
            case 2 -> System.out.println("This month " + month + " has 28 or 29 days.");
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("This month " + month + " has 31 days.");
            case 4, 6, 9, 11 -> System.out.println("This month " + month + " has 30 days.");
            default -> System.out.println("Please enter a valid month!");
        }
    }
}
