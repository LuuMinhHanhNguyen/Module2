package ss3_array;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfAColumn {
    public static void main(String[] args) {
        int length1;
        int length2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length for arr2D:");
        length1 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter length for inside arr:");
        length2 = Integer.parseInt(sc.nextLine());

        int[][] array2D = new int[length1][length2];
        int input;

        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.println("Enter element for inside arr: " + (i + 1));
                input = Integer.parseInt(sc.nextLine());
                array2D[i][j] = input;
            }
        }

        System.out.println(Arrays.deepToString(array2D));

        System.out.println("Enter row number to get its sum:");
        int rowNumber = Integer.parseInt(sc.nextLine());

        int index = rowNumber - 1;
        int sum = 0;

        for (int i = 0; i < array2D.length; i++) {
            sum += array2D[i][index];
        }
        System.out.println(sum);
    }

}
