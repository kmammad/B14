package CT_InheritOvoadOvRide;

public class Commercial extends Property{

    private static final double COMMERCIAL_RATE = 2.50;
    private String propertyType;

    public Commercial(String address, double squareFeet, double price, String propertyType) {
        super(address, squareFeet, price);
        this.propertyType = propertyType;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public double calculateTax(){
        return getSquareFeet() * COMMERCIAL_RATE;
    }

    public void describe(){
        super.describe();
        System.out.println("It is designed for " + propertyType  + " use");
    }

    @Override
    public String toString() {
        return "Commercial{" +
                "propertyType='" + propertyType + '\'' +
                "} " + super.toString();
    }


}
