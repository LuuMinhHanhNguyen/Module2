package ss3_array;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        int num;
        int input;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number to define array's length:");
        num = Integer.parseInt(sc.nextLine());

        int[] array = new int[num];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Input elements for array:");
            input = Integer.parseInt(sc.nextLine());
            array[i] = input;
        }
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println(min);


    }
}
