package ss3_array;

public class BiggestElementIn2DArray {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 66, 7, 8, 9}, {10, 11, 12}};
        int max = array[0][0];
        int index_i = 0;
        int index_j = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    index_i = i;
                    index_j = j;
                }
            }
        }

        System.out.println(max);
        System.out.println("arr[" + index_i + "][" + index_j + "]");

    }
}
