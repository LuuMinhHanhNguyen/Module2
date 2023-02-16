package ss1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        float height;
        float width;
        float area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a height to calculate the area of a rectangle:");
        height = Float.parseFloat(sc.nextLine());
        System.out.println("Enter a width to calculate the area of a rectangle:");
        width = Float.parseFloat(sc.nextLine());
        area = (height + width) * 2;
        System.out.println(area);
    }
}
