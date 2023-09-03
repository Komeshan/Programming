import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("     "+num);
        System.out.println("    "+num+num+num);
        System.out.println("   "+num+num+num+num+num);
        System.out.println("  "+num+num+num+num+num+num+num);
        System.out.println(" "+num+num+num+num+num+num+num+num+num);
        System.out.println(""+num+num+num+num+num+num+num+num+num+num+num);
    }
}
