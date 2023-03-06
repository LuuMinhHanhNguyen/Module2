package ss14_sorting_algorithm;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        selectionSort(arr);
    }
    public static void selectionSort(int[] arr){
        int min;
        for(int i = 0; i < arr.length - 1; i++){
            min = i;
            for (int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            if(min != i){
                int temp =  arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
