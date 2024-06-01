package ClassTask_PolyCastEquals;

import java.util.ArrayList;
import java.util.List;
public class Inventory {

    private List<Product> products =  new ArrayList<>();


    public void addProduct(Product product){
        products.add(product);
        System.out.println("Product is added to the inventory.");
    }

    public void removeProduct(Product product){
        if(products.remove(product)){
            System.out.println("Product is removed from the inventory.");
        }else{
            System.out.println("Product does not exist");
        }

    }

    public Product findProduct(String name){
        Product productToBeReturned = null;

        for(Product product: products){
            if(product.getName().equals(name)){
                productToBeReturned= product;
                break;
            }
        }

        return productToBeReturned;

    }


    public void printAllProducts(){
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void applyDiscountForAllProducts(){
        for (Product product : products) {
            product.applyDiscount();
        }
    }




}
