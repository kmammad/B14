package CT_InheritOvoadOvRide;

public class Residential extends Property {

    private int bedrooms;
    private int bathrooms;

    private static final double RESIDENTIAL_RATE = 1.50;

    public Residential(String address, double squareFeet, double price, int bedrooms, int bathrooms) {
        super(address, squareFeet, price);
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    @Override
    public double calculateTax(){
        return getSquareFeet() * RESIDENTIAL_RATE;
    }

    @Override
    public void describe(){
        super.describe();
        System.out.println("This home features " + bedrooms + " bedrooms and " + bathrooms + " bathrooms.");
    }

    @Override
    public String toString() {
        return "Residential{" +
                "bedrooms=" + bedrooms +
                ", bathrooms=" + bathrooms +
                "} " + super.toString();
    }
}
