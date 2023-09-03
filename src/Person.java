public class Person {

    private String name;
    private int age;



    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }



    public void walk(){
        System.out.println(", he walks 5400 steps per day.");
    }

    public void eat(){
        System.out.println(", she eats 2000 calories per day.");
    }

    public void works(){
        System.out.println(", she works 9 hours per day.");
    }



    public static void main(String[] args) {
        Person Deontay = new Person("Deontay", 38);
        Person Ronda = new Person("Ronda", 35);
        Person Holy = new Person("Holy", 33);

        System.out.print(Deontay.name + " is " + Deontay.age);
        Deontay.walk();

        System.out.println(" ");

        System.out.print(Ronda.name + " is " + Ronda.age);
        Ronda.eat();

        System.out.println(" ");

        System.out.print(Holy.name + " is " + Holy.age);
        Holy.works();
    }
}
