public class F1 {

    //Attributes
    String team;
    String principal;
    String drivers;
    int points;


    //Constructor
    public F1(String team, String principal, String drivers, int points) {
        this.team = team;
        this.principal = principal;
        this.drivers = drivers;
        this.points = points;
    }


    //Method
    public void Creating() {
        System.out.println("Every team creates a car that can win the Constructors title");
    }
    public void Creating(int x) {
        System.out.println("Every team creates a car that can win the 5th place");
    }

    public static void main(String[] args) {
        F1 Mercedes = new F1("Mercedes AMG F1", "Toto Wolff", "Lewis Hamilton & George Russell", 358);
        F1 Redbull = new F1("Oracle Redbull Racing", "Christian Horner", "Max Verstappen & Sergio Perez", 299);
        F1 Ferrari = new F1("Scuderia Ferrari", "Fredric Vaseur", "Charles Leclerc & Carlos Sainz", 256);
        F1 Common = new F1("fake", "fake", "fake", 0);

        System.out.println(Mercedes.team+" is managed by "+Mercedes.principal+" which is driven by "+Mercedes.drivers+" and they have scored "+Mercedes.points+" in the constructors title");
        System.out.println(Redbull.team+" is managed by "+Redbull.principal+" which is driven by "+Redbull.drivers+" and they have scored "+Redbull.points+" in the constructors title");
        System.out.println(Ferrari.team+" is managed by "+Ferrari.principal+" which is driven by "+Ferrari.drivers+" and they have scored "+Ferrari.points+" in the constructors title");
        System.out.println(" ");
        Common.Creating();
    }
}