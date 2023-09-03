public class Car {

    String make;
    String model;
    int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model= model;
        this.year=year;
    }

    public void ZeroToSixty () {
        System.out.println("and it goes 0-60 in 2.3s.");
    }

    public void ZeroToSixty (int x) {
        System.out.println("This car goes 0-60 in 2.5s.");
    }

    public void ZeroToSixty (float y) {
        System.out.println("This car goes 0-60 in 3s.");
    }

    public static void main(String[] args) {
        Car Honda = new Car("Honda", "Type R", 2023);
        Car Nissan = new Car("Nissan", "GTR", 2023);
        Car Toyota = new Car("Toyota", "Supra", 2023);

        System.out.print("1. " + Honda.make + "'s new " + Honda.model + " which came out in " + Honda.year + " has huge upgrades ");
        Honda.ZeroToSixty();

        System.out.println(" ");

        System.out.print("2. " + Nissan.make + "'s new " + Nissan.model + " which came out in " + Nissan.year + " has huge upgrades ");
        Nissan.ZeroToSixty();

        System.out.println(" ");

        System.out.print("3. " + Toyota.make + "'s new " + Toyota.model + " which came out in " + Toyota.year + " has huge upgrades ");
        Toyota.ZeroToSixty();
    }
}
