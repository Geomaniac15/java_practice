import java.util.Scanner;

public class Methods {
    public static void square(int num) {
        System.out.println("The square of " + num + " is " + num*num + ".");
    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find the square of it: ");
        int num = scanner.nextInt();

        square(num);
    }
}