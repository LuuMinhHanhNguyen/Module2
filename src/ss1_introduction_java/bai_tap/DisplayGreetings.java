package ss1_introduction_java.bai_tap;

import java.util.Scanner;

public class DisplayGreetings {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name here:");
        name = sc.nextLine();
        System.out.println("Hello " + name);
    }
}
