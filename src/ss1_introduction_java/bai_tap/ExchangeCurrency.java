package ss1_introduction_java.bai_tap;

import java.util.Scanner;

public class ExchangeCurrency {
    public static void main(String[] args) {
        int dollar;
        int rate = 23000;
        int vnd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total amount of your money here (USD):");
        dollar = Integer.parseInt(sc.nextLine());
        System.out.println(dollar + " dollar(s) is " + (vnd = dollar * rate) + " VND.");
    }
}
