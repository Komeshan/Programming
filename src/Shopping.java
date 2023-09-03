import java.util.Scanner;

public class Shopping {
            public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);


            System.out.print("What is the name of the first item? ");
            String item1 = scanner.nextLine();
            System.out.print("Enter the price of the "+item1+": ");
            int price1 = scanner.nextInt();

            System.out.print("What is the name of the second item? ");
            scanner.nextLine();
            String item2 = scanner.nextLine();
            System.out.print("Enter the price of the  "+item2+": ");
            int price2 = scanner.nextInt();

            System.out.print("What is the name of the third item? ");
            scanner.nextLine();
            String item3 = scanner.nextLine();
            System.out.print("Enter the price of the "+item3+": ");
            int price3 = scanner.nextInt();

            System.out.print("What is the name of the fourth item? ");
            scanner.nextLine();
            String item4 = scanner.nextLine();
            System.out.print("Enter the price of the "+item4+": ");
            int price4 = scanner.nextInt();

        int  totalCost = price1+price2+price3+price4;
        System.out.println("Total cost: "+totalCost);

        scanner.close();

    }
}