package ClassTask60_Fan;

import java.util.*;
public class Fan {

    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    static int noOfFans = 0;
    int speed = SLOW;
    boolean isOn = false;
    double radius = 5.0;
    String color = "blue";
    static String manufacturer = "WhirlWind";
    static String productId = "xxx";

    Fan(){
        speed = SLOW;
        isOn = false;
        radius = 5.0;
        color = "blue";
        manufacturer = "WhirlWind";
        productId = generateProductId();
        noOfFans++;

    }

    Fan(int speed, double radius, String color, boolean isOn){
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.isOn = isOn;
        productId = generateProductId();
        noOfFans++;
    }

    public String toString() {

        if (isOn){
            return "Fan is On {" +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    ", productId='" + productId + '\'' +
                    '}';
        } else {
            return "Fan is Off {" +
                    ", radius = " + radius +
                    ", color = ' " + color + '\'' +
                    ", productId = ' " + productId + '\'' +
                    '}';

        }


    }

    public static int getNoOfFansCreated() {

        return noOfFans;

    }

    public static String generateProductId() {

        String alpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        String str = "";

        for (int index = 0; index < 10; index++){
            int randomIndex = new Random().nextInt(alpha.length());
            str += alpha.charAt(randomIndex);
        }
        return str;

    }


}
