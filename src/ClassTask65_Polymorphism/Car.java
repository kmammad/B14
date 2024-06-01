package ClassTask65_Polymorphism;

public class Car extends Vehicle {

    private int numDoors;

    public Car (String make, String model, int year, int topSpeed, int numDoors) {
        super (make, model, year, topSpeed);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }


    public void drive(){

        super.drive();
        System.out.println("This car has " + numDoors + " doors.");

    }

}
