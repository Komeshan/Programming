public class PowerRanger {

        //Attributes
        String name;
        String colour;
        String weapon;
        String helmet;

        //Constructor
        public PowerRanger(String name,String colour,String weapon,String helmet) {
            this.name = name;
            this.colour = colour;
            this.weapon = weapon;
            this.helmet = helmet;
        }

        //Method
        public void punch() {
            System.out.println(colour+" power ranger can punch fast");
        }

        public void runFast(){
            System.out.println(colour+" power ranger can run really fast");
        }

        public void fly(){
            System.out.println(colour+" power ranger can fly really high");
        }

    public static void main(String[] args) {
        PowerRanger BluePowerRanger = new PowerRanger("Peter", "Blue", "Knuckle","Blue");
        PowerRanger RedPowerRanger = new PowerRanger("Barry Allen", "Red", "Kinetic Suit","Red");
        PowerRanger BlackPowerRanger = new PowerRanger("Bruce Wayne", "Black", "Suit with cape","Black");

        System.out.println(BluePowerRanger.name + " is " + BluePowerRanger.colour + " Power Ranger and wears a " + BluePowerRanger.helmet + " helmet and uses a " + BluePowerRanger.weapon + ".");
        BluePowerRanger.punch();

        System.out.println(RedPowerRanger.name + " is " + RedPowerRanger.colour + " Power Ranger and wears a " + RedPowerRanger.helmet + " helmet and uses a " + RedPowerRanger.weapon + ".");
        RedPowerRanger.runFast();

        System.out.println(BlackPowerRanger.name + " is " + BlackPowerRanger.colour + " Power Ranger and wears a " + BlackPowerRanger.helmet + " helmet and uses a " + BlackPowerRanger.weapon + ".");
        BlackPowerRanger.fly();
    }
}
