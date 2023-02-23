package ss6_inheritance.exercise.triangle;

import java.util.Scanner;

public class TriangleController {
    public static void main(String[] args) {
        double side1;
        double side2;
        double side3;
        String color;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first side for your triangle: ");
        side1 = Integer.parseInt(sc.nextLine());
        System.out.println("Please enter the second side for your triangle: ");
        side2 = Integer.parseInt(sc.nextLine());
        System.out.println("Please enter the third side for your triangle: ");
        side3 = Integer.parseInt(sc.nextLine());

        if((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)){
            Triangle triangle = new Triangle(side1,side2,side3);
            System.out.println("What color do you want your triangle to be?");
            color = sc.nextLine();
            triangle.setColor(color);
            System.out.println(triangle);
        } else {
            System.out.println("Please enter valid sides!");
        }

    }
}
