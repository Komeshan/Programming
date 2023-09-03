public class Person1 {

    String name;

    public Person1(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Person1 person1 = new Person1("Jim Miller");

        System.out.println(person1.name);
    }
}
