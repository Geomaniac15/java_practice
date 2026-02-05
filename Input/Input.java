import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        age += 10;

        System.out.println("In 10 years, you will be " + age + " years old.");
    }
}
