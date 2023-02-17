package ss2_loop;

public class PrimeNumbersLessThan100 {
    public static void main(String[] args) {
        int check = 100;
        int num = 0;

        while (num < check){
            boolean isPrime = true;
            if(num < 2){
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++){
                    if(num % i == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime) {
                    System.out.println(num);
                }
            }
            num++;
        }
    }
}


