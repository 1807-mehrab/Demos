public abstract class Vehicle {
    protected String make;
    protected String model;
    protected int year;

    public Vehicle() {}

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    protected abstract void drive();
}