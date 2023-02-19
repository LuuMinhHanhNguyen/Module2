package ss2_loop;

public class First20PrimeNumbers {
    public static void main(String[] args) {

        int count = 0;
        int number = 0;

        while (count < 20) {
            if (isPrime(number)) {
                count++;
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
