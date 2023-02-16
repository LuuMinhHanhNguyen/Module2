package ss1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        float weight;
        float height;
        float bmi;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight:");
        weight = Float.parseFloat(sc.nextLine());
        System.out.println("Enter your height:");
        height = Float.parseFloat(sc.nextLine());
        bmi  = weight /  (height * height);
        if(bmi >= 30.0) System.out.println("Obese");
        else if(bmi >= 25.0) System.out.println("Overweight");
        else if (bmi >= 18.5) System.out.println("Normal");
        else System.out.println("Underweight");
        }
    }

