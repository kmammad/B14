package ClassTask65_Polymorphism;

public class Main {

    public static void main(String[] args) {

        //Create Vehicle array and add 3 subclass objects
        // Use for each loop and iterate through an array and call drive() method on each vehicle

        Vehicle [] vehicles = {
                new Car("Tesla", "Model S", 2021, 155, 4),
                new Truck("Ford", "F-150",  2021, 120, 2000),
                new Motorcycle("Harley-Davidson", "Sportster", 2021, 100, true)
        };

        for (Vehicle vehicle : vehicles){
            vehicle.drive();
        }

    }

}
