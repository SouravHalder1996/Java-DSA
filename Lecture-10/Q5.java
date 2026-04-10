import static java.lang.Math.sqrt;

public class Q5 {
    // Question -- Print all the prime numbers between 1 to 100
    static void main() {
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= sqrt(i); j++) {
                if (i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(i);
            }

        }
    }
}
