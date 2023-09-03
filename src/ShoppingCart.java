import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.print("What is the first item? ");
        String item1 = scanner.nextLine();
        System.out.print("Enter the price of the "+ item1+": ");
        int price1 = scanner.nextInt();

        System.out.print("What is the second item? ");
        scanner.nextLine();
        String item2 = scanner.nextLine();
        System.out.print("Enter the price of the "+ item2+": ");
        int price2 = scanner.nextInt();

        System.out.print("What is the third item? ");
        scanner.nextLine();
        String item3 = scanner.nextLine();
        System.out.print("What is the price of the "+ item3+": ");
        int price3 = scanner.nextInt();

        int totalCost = price1+price2+price3;
        System.out.println("Total cost: "+ totalCost);
    }
}