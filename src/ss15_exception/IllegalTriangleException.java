package ss15_exception;

import java.util.Scanner;

public class IllegalTriangleException extends Exception{
    public IllegalTriangleException(){

    }
   public IllegalTriangleException(String message){
       super(message);
   }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side1:");
        int side1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter side2:");
        int side2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter side3:");
        int side3 = Integer.parseInt(scanner.nextLine());
        IllegalTriangleException illegalTriangleException = new IllegalTriangleException();
        illegalTriangleException.checkValidTriangle(side1, side2, side3);
    }

    private void checkValidTriangle(double side1, double side2, double side3){
        try {
            if(side1 < 0 || side2 < 0 || side3 < 0){
                throw new IllegalTriangleException("Sides cannot be negative numbers!") ;
            }
            else if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1){
                throw new IllegalTriangleException("Sum of 2 sides should not less than the other one!");
            } else {
                System.out.println("It's a valid triangle!");
            }
        } catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }
    }
}
