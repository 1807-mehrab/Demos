public class Main {
    public static void main(String[] args) {
        //Car c = new Car();
        //c.drive();
        //System.out.println(c.defaultWheels());

        //Vehicle v = new Car();
        //v.drive();
        //System.out.println(v.defaultWheels());

        //v = new Truck();
        //v.drive();

        Vehicle v = new Car("Toyota", "Camry", 19);
        System.out.println(v.toString());
    }
}