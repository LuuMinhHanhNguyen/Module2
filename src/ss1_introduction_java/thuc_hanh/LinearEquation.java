package ss1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {
        float a;
        float b;
        float x;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first coefficient:");
        a = Float.parseFloat(sc.nextLine());
        System.out.println("Enter the second coefficient:");
        b = Float.parseFloat(sc.nextLine());
        if(a == 0){
            if(b == 0) System.out.println("Phuong trinh co vo so nghiem!");
            else System.out.println("Phuong trinh vo nghiem!");
        } else System.out.println("Phuong trinh co ngiem la: " + (x = -b/a));
    }
}
