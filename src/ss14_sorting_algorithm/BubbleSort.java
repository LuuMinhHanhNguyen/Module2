package ss14_sorting_algorithm;

import java.util.Arrays;
public class BubbleSort {


    public static void main(String[] args) {
        int[] list = {4, 2, 6, 10, 8, 14, 12};
        int[] arr = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        bubbleSort(arr);
        bubbleSort(list);
    }

    public static void bubbleSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(list));
        int check = list[1] - list[0];
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i + 1] - list[i] != check) {
                System.out.println("Not an equal ascending arr!");
                return;
            }
        }
        System.out.println("Congrats!");
    }

}

