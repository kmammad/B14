package ClassTask65_Polymorphism;

public class Truck extends Vehicle {

    private int cargoCapacity;

    public Truck (String make, String model, int year, int topSpeed, int cargoCapacity) {
        super (make, model, year, topSpeed);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public void drive(){

        super.drive();
        System.out.println("This truck has cargo capacity of " + cargoCapacity + " lbs");

    }


}
