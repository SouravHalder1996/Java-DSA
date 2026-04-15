import java.util.Scanner;

public class MethodQ6 {
    // Create an overloaded method display() with one int parameter or one String parameter.

    static void display(int number){
        System.out.println("Number entered: " + number);
    }

    static void display(String str){
        System.out.println("String entered: " + str);
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = sc.nextInt();

        System.out.print("Please enter a String: ");
        String str = sc.next();

        display(number);
        display(str);
    }
}
