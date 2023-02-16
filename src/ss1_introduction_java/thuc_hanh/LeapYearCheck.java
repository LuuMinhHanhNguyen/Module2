package ss1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        int year;
        boolean isLeap = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to check whether it's a leap year:");
        year = Integer.parseInt(sc.nextLine());
        if(year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    isLeap = true;
                }
            } else isLeap = true;
        }

        if(isLeap) System.out.println(year + " is a leap year!");
        else System.out.println(year + " is NOT " + "a leap year!");
    }
}
