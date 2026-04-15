import java.util.Scanner;

public class Pattern4 {
    /*
    Solid Rhombus Pattern of size n

            * * * * *
          * * * * *
        * * * * *
      * * * * *
    * * * * *

     */

    static void main() {
        System.out.print("Please enter the size (n): ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Loop for Rows
        for (int i = 1; i <= n; i++) {

            // Loop for Space Print
            for (int j = 1; j <= (n-i); j++) {
                System.out.print("  ");
            }

            // Loop for Star Print
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
