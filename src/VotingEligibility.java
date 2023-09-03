import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Hi "+name+ " enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Hi "+name+", you are eligible to vote.");
        } else {
            System.out.println("Hi "+name+", you are not eligible to vote.");
        }
    }
}
