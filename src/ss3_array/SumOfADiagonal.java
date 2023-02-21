package ss3_array;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfADiagonal {
    public static void main(String[] args) {
        int num;
        int input;

        System.out.println("Enter a number to set height and width for the matrix:");
        Scanner sc = new Scanner(System.in);

        num = Integer.parseInt(sc.nextLine());

        int[][] array = new int[num][num];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter elements for " + (i + 1) + "th array:");
            for (int j = 0; j < array[i].length; j++) {
                input = Integer.parseInt(sc.nextLine());
                array[i][j] = input;
            }
        }
        System.out.println(Arrays.deepToString(array));

        System.out.println(sumOfDiagonal(array));
    }

    public static int sumOfDiagonal(int[][] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
            // diagonal from right to left
//            sum += array[i][array.length - 1 - i];
        }

        return sum;
    }
}
