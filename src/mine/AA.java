package mine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AA {
    public static void main(String[] args) {
        int[] array = {4, 6, 2, 7, 8, 9};
        int[] array2 = {4, 6, 2, 7};
        int[] array3 = new int[]{Arrays.compare(array, array2)};

        // System.out.println(Arrays.toString(array3));

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(777);


        System.out.println(arrayList.size());

        Map map = new HashMap();

        String string  = "nguyen luu minh hanh";

        for (char character: string.toCharArray()){
            if(map.containsKey(character)){
                int count = (int) map.get(character);
                map.put(character, count+1);
            } else map.put(character, 1);
        }

        System.out.println(map);

    }
}
