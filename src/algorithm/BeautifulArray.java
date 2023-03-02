package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeautifulArray {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 7));
        List<Integer> sumLeft = new ArrayList<>();
        List<Integer> sumRight = new ArrayList<>();
        int sumL = 0;
        int sumR = 0;
        System.out.println(solution(new int[]{1, 2, 3, 3,0}));
//        for (int j = 1; j < array.size() - 1; j++) {
//            sumLeft = array.subList(0,j);
//            System.out.println(sumLeft);
//            sumRight = array.subList(j + 1, array.size());
//            System.out.println(sumRight);
//            for (int el: sumLeft) { sumL += el;};
//            for (int el: sumRight) { sumR += el;};
//            if (sumL == sumR) System.out.println("true");
//            sumR = 0;
//            sumL =0;
//
//        }

    }
    public static boolean solution(int[] arr){
        int sumL = 0;
        int sumR = 0;
        if (arr.length < 3) return false;
        else {
            for (int j = 1; j < arr.length - 1; j++) {
                for (int i = 0; i < arr.length; i++) {
                    if(i < j) sumL += arr[i];
                    else if (i > j) sumR += arr[i];
                }
                if(sumR == sumL){
                    System.out.println(sumL);
                    System.out.println(sumR);
                    return true;
                }
                sumR = 0;
                sumL = 0;
            }
            return false;
        }
    }



}

//    public static boolean solution(int[] arr) {
//        List array = Arrays.asList(arr);
//        List<Integer> sumLeft = new ArrayList<>();
//        List<Integer> sumRight = new ArrayList<>();
//        int sumL = 0;
//        int sumR = 0;
//
//        if (arr.length < 3) return false;
//        else {
//            for (int j = 1; j < arr.length - 1; j++) {
//                sumLeft = array.subList(0, j);
//                System.out.println(sumLeft);
//                sumRight = array.subList(j + 1, array.size());
//                System.out.println(sumRight);
//                for (int el : sumLeft) {
//                    sumL += el;
//                }
//
//                for (int el : sumRight) {
//                    sumR += el;
//                }
//
//                if (sumL == sumR) {
//                   return true;
//                }
//                sumL =0;
//                sumR=0;
//            }
//            return false;
//        }
//
//    }  }
