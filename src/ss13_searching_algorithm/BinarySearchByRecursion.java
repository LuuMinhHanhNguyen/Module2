package ss13_searching_algorithm;

public class BinarySearchByRecursion {

    public static void main(String[] args) {
        int[] array = {1,3,5,7,9,11};
        System.out.println(binarySearchByRecursion(array, 0, array.length -1, 9));
    }
     public static int binarySearchByRecursion(int[] arr, int start, int end, int key){
         int mid = (start + end) / 2;

             if(arr[mid] > key) return binarySearchByRecursion(arr, start, mid -1, key);
             else if(arr[mid] < key) return binarySearchByRecursion(arr, mid + 1, end, key);
             else if(arr[mid] == key) return mid;

         return -1;
     }
}
