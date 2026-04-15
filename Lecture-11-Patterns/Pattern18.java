import java.util.Scanner;
import static java.lang.Math.abs;

public class Pattern18 {
     /*
    Print this Pattern of size n

         *   *   *   *   *   *   *   *   *
             *   *   *   *   *   *   *
                 *   *   *   *   *
                     *   *   *
                         *
                     *   *   *
                 *   *   *   *   *
             *   *   *   *   *   *   *
         *   *   *   *   *   *   *   *   *

     */

    static void main() {
        System.out.print("Please enter the size (n): ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= (2*n-1); i++) {
            for (int j = 1; j <= abs(abs(n-i)-(n-1)); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*abs(n-i)+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
