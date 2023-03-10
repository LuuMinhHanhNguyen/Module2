package ss2_loop;

public class PrimeNumbersLessThan100 {

    public static void main(String[] args) {
        int number = 0;
        int check = 100;

        while (number < check) {
            if (isPrime(number)) {
                System.out.println(number);
            }
            number++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}


