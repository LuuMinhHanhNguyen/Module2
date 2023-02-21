package ss3_array;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] array2 = new int[array.length];

        int addedElement;
        int index;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input your added element:");
        addedElement = Integer.parseInt(sc.nextLine());
        System.out.println("Input index for added element:");
        index = Integer.parseInt(sc.nextLine());

        if (index <= array.length - 1) {

            array2[array2.length - 1] = array[array.length - 1 - 1];

            for (int i = 0; i < array2.length - 1; i++) {
                if (i < index) {
                    array2[i] = array[i];
                }
                if (i == index) {
                    array2[i] = addedElement;
                }
                if (i > index) {
                    array2[i] = array[i - 1];
                }
            }

            System.out.println(Arrays.toString(array2));
        } else System.out.println("You cannot add your element into this index!!");


    }
}


