package ss14_sorting_algorithm;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        insertionSort(arr);
    }
    public static void insertionSort(int[] arr){
        int key;
        for (int i = 1; i < arr.length; i++){
            key = arr[i];
            for (int j = i - 1; j >= 0 && key < arr[j]; j--) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j + 1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
