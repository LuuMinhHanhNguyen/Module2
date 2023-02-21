package ss3_array;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatenateArray {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[4];
        int[] array3 = new int[array1.length + array2.length];
        int input;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Input element for arr1:");
            input = Integer.parseInt(sc.nextLine());
            array1[i] = input;
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.println("Input element for arr2:");
            input = Integer.parseInt(sc.nextLine());
            array2[i] = input;
        }

        for (int i = 0; i < array3.length; i++) {
            if (i < array1.length) {
                array3[i] = array1[i];
            } else {
                array3[i] = array2[i - array1.length];
            }
        }
        System.out.println(Arrays.toString(array3));


    }
}
