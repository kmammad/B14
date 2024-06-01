package ClassTask65_Polymorphism;

public class Motorcycle extends Vehicle {

    private boolean hasSideCar;

    public Motorcycle (String make, String model, int year, int topSpeed, boolean hasSideCar) {
        super (make, model, year, topSpeed);
        this.hasSideCar = hasSideCar;
    }

    public boolean isHasSideCar() {
        return hasSideCar;
    }

    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }

    public void drive(){

        super.drive();
        System.out.println("This motorcycle has " + (hasSideCar ? "a" : "no" )+ " sidecar ");

    }


}
