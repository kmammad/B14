package ClassTask_PolyCastEquals;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        inventory.addProduct(
                new Clothing(1, "Summer Dress", 90.56, "Evening Dress")
        );

        inventory.addProduct(
                new Clothing(2, "Tuxedo", 300, "Evening")
        );

        inventory.addProduct(
                new Electronics(3, "Selfie stick", 23, "Huewei")
        );

        inventory.addProduct(
                new Electronics(4, "Microphone", 150, "Shure")
        );

        inventory.printAllProducts();

        inventory.applyDiscountForAllProducts();
        System.out.println("Discount applied");
        inventory.printAllProducts();

        Product productMic = new Electronics(4, "Microphone", 120, "Shure");

        inventory.removeProduct(productMic);

        inventory.printAllProducts();


        System.out.println( inventory.findProduct("Tuxedo") );



    }
}
