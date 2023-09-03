//Own class example
public class Dog {

    //Attributes
    String name;
    int age;

    //Constructor
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Method
    public void bark(){
        System.out.println(name+"says: Woof Woof!");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("puppy", 5);

        System.out.println("My dog's name is "+dog.name);
        System.out.println("My dog is "+dog.age+" years old");
    }
}
