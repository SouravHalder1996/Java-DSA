import java.util.Scanner;

public class MethodQ3 {
    // Create a method isEven(int number) that returns true if the number is even.

    static boolean isEven(int number){
        return number % 2 == 0;
    }
    static void main() {
        System.out.print("Please enter a number you want to check even/odd: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println("Number is Even? " + isEven(number));
    }
}
