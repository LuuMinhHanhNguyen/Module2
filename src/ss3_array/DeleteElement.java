package ss3_array;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int deletedEl;
        int deletedIndex = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an element to remove from array:");
        deletedEl = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < array.length; i++) {
            if (array[i] == deletedEl) {
                deletedIndex = i;
            }
        }
        if (deletedEl != -1) {
            for (int j = deletedIndex; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }

            array[array.length - 1] = 0;

            System.out.println(Arrays.toString(array));
        } else System.out.println("Your input element is NOT in array");

    }
}
