import java.util.Scanner;

public class MethodQ7 {
    // Write a method updateValue(int x) and verify that the original variable in main() does not change.

    static void updateValue(int x){
        System.out.println("From updateValue Method --> Original Value: " + x);
        x = 13;
        System.out.println("From updateValue Method --> Updated Value: " + x);
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = sc.nextInt();

        System.out.println("From main Method --> Original Value: " + number);
        updateValue(number);
        System.out.println("From main Method --> Updated Value: " + number);
    }
}
