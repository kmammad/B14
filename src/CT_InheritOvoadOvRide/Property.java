package CT_InheritOvoadOvRide;

import java.util.Objects;

public class Property {

    private String address; //: String to store the property's address.
    private double squareFeet; //: int to store the property's size in square feet.
    private double 	price; //: double to store the asking price of the property.

    private static final double BASE_TAX_RATE = 2.0;

    public Property(String address, double squareFeet, double price) {
        this.address = address;
        this.squareFeet = squareFeet;
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(double squareFeet) {
        this.squareFeet = squareFeet;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public double calculateTax(){
        return squareFeet * BASE_TAX_RATE;
    }

    public void describe(){
        System.out.print("This property located at " + address+ " covers an area of "
                + squareFeet + " square feet and is priced at " + price + ".");
    }

    @Override
    public String toString() {
        return "Property{" +
                "address='" + address + '\'' +
                ", squareFeet=" + squareFeet +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Property property = (Property) o;

        if (Double.compare(squareFeet, property.squareFeet) != 0) return false;
        if (Double.compare(price, property.price) != 0) return false;
        return Objects.equals(address, property.address);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = address != null ? address.hashCode() : 0;
        temp = Double.doubleToLongBits(squareFeet);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
