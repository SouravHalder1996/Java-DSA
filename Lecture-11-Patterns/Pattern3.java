import java.util.Scanner;

public class Pattern3 {
    /*
    Solid Right Angle Triangle Pattern of size n

    *
    * *
    * * *
    * * * *
    * * * * *

     */

    static void main() {
        System.out.print("Please enter the size (n): ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
