package ss14_sorting_algorithm;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 1, -2, 14, -10, 8 ,77};
        insertionSort(arr);
    }
    public static void insertionSort(int[] arr){
        int key;
        for (int i = 1; i < arr.length; i++){
            key = arr[i];
            for (int j = i - 1; j >= 0 && key < arr[j]; j--) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j+1] = temp;
            }
            System.out.println("The " + i + " sort: " + Arrays.toString(arr));
        }
        System.out.println("After sorting:" + Arrays.toString(arr));
    }
}
