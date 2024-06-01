package ClassTasks;

public class T09_VAPlate {
    public static void main(String[] args) {

        System.out.println("Welcome to Custom Plate Creations!!!");
        System.out.println("Here's your custom VA plate:");

        System.out.println(getVAPlateNumber());

        // call your method and print out its returned value

    }


    //create your method here

    public static String getVAPlateNumber(){

        int num1 = (int)(Math.random()*9 + 0);
        int num2 = (int)(Math.random()*9 + 0);
        int num3 = (int)(Math.random()*9 + 0);
        int num4 = (int)(Math.random()*9 + 0);

        char ch1 = (char)(Math.random()*26 + 'A');
        char ch2 = (char)(Math.random()*26 + 'A');
        char ch3 = (char)(Math.random()*26 + 'A');

        String plateNumber = " " + ch1 + ch2 + ch3 + "-" + num1 + num2 + num3 + num4;

        return plateNumber;

    }
}

/**
 *VA License Plate Generator - The Custom Shop
 *
 * Scenario: You're the newest employee at the prestigious "Custom Plate Creations" shop. The shop is well-known for crafting specialized license plates for car enthusiasts. Lately, there's been a surge in orders for VA license plates, and it's your job to automate the creation process using your coding skills!
 *
 * Instructions:
 * 1. Develop a method named **getVAPlateNumber()**. When this method is called, it should generate a random license plate in the format XXX-0000 and return it as a String. For example, UWS-3712, TYH-0089, etc
 * 2. Call the method in the main method to display its returned value
 * 3. Bonus: Create another method that generates and returns a plate number in the format of your state. For example, DC -> XX0000 (JD2378)
 *
 */
