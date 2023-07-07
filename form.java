import java.util.Scanner;

public class ApplicationForm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Application Form");
        System.out.println("----------------");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.println("\nForm Summary");
        System.out.println("------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);

        scanner.close();
    }
}
