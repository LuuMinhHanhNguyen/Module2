package ss2_loop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PrimeNumbers {
    public static void main(String[] args) {
        int num = 0;
        int count = 0;

        while (count < 20) {
            boolean check = true;
            if (num < 2) {
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    count++;
                    System.out.println(num);
                }
            }

            num++;

        }
    }

}
