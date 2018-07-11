public class Car extends Vehicle implements OilChange {
    public void drive() {
        System.out.println("VROOM");
    }

    public boolean canOilChange() {
        return true;
    }

    public boolean canOilChange(String str) {
        return false;
    }

    public int defaultWheels() {
        return 4;
    }

    public Car (String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public String toString() {
        return make + model + year;
    }
}