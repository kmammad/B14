package ClassTask_PolyCastEquals;

import java.util.Objects;
public class Electronics extends Product {

    private String brand;

    public Electronics(long id, String name, double price, String brand) {
        super(id, name, price);
        this.brand = brand;
    }

    public void applyDiscount(){
        setPrice( getPrice() - getPrice() * 0.2); // 20% discount
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "brand='" + brand + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Electronics that = (Electronics) o;
        return Objects.equals(brand, that.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), brand);
    }

}
