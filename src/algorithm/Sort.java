package algorithm;

import java.util.*;

public class Sort {
    public static void main(String[] args) {
        int[] array = {-1, 9, 8, 5, 6, -1, 7, 3, 4, -1};
        System.out.println(Arrays.toString(solution(array)));

    }

    public static int[] solution(int[] array) {

        List<Integer> index = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length ; i++) {
          if(array[i] == -1) index.add(i);
          else result.add(array[i]);
        }

        Collections.sort(result);
        for (int i = 0; i < index.size(); i++) {
            result.add(index.get(i), -1);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = result.get(i);
        }

        return array;
    }
}


//        for (int i = 0; i < array.length ; i++) {
//                for (int j = i + 1; j < array.length; j++) {
//                    if (array[i] != -1 && array[j] != -1 && array[j] < array[i]) {
//                        int temp = array[i];
//                        array[i] = array[j];
//                        array[j] = temp;
//                    }
//            }
//        }
//        return array;
//    }
