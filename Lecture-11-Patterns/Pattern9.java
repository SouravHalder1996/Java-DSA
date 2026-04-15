import java.util.Scanner;

public class Pattern9 {
    /*
    Hollow Right Angle Triangle Pattern of size n

    *
    * *
    *   *
    *     *
    * * * * *

     */
    static void main() {
        System.out.print("Please enter the size(n): ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if(i == 1){
                    System.out.print("* ");
                }
                else if(i == n){
                    System.out.print("* ");
                }
                else{
                    if(j == 1){
                        System.out.print("* ");
                    }
                    else if(j == i){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
