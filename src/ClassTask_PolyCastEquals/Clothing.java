package ClassTask_PolyCastEquals;

import java.util.Objects;

public class Clothing extends Product {
    private String type;

    public Clothing(long id, String name, double price, String type) {
        super(id, name, price);
        this.type = type;
    }

    public void applyDiscount(){
        setPrice(getPrice() - getPrice() * 0.1); // 10% discount
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "type='" + type + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Clothing clothing = (Clothing) o;
        return Objects.equals(type, clothing.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }
}
