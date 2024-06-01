package ClassTask56_Car;

public class Main {
    public static void main(String[] args) {


        //Test the Car class here

        Car car1 = new Car();

        car1.color = "red";
        car1.make = "Toyota";
        car1.model = "Corolla";
        car1.fuelLevel = 50.0;
        car1.lightsOn = false;

        car1.displayStatus();

        car1.drive(50.5);
        car1.refuel(20.0);
        car1.turnOnLights();

        car1.displayStatus();



    }



}
/**
 * Car Simulator
 *
 * Background:
 * Cars are complex machines, but for a new programmer, a simplified simulation can introduce basic OOP principles effectively. In our Car Simulator, each Car object will have properties like color, make, and model, as well as a fuel level. Users can interact with the car through actions like driving and refueling.
 *
 * Objective:
 * Create a Java program that simulates basic car functions. Users can create a Car object, drive for a certain distance, refuel the car, and use the car's lights.
 *
 *  Implement the Car class:
 *
 * 1. Instance variables:
 *
 *     color: A String that stores the color of the car.
 *    make: A String that stores the make (brand) of the car.
 *    model: A String that stores the model of the car.
 *    fuelLevel: A double that stores the current fuel level in liters.
 *    lightsOn: A boolean that indicates whether the car's lights are on or off.
 *
 * 2. Instance Methods:
 *
 *   drive(double distance):
 *     Decreases fuelLevel based on distance driven. Subtract distance from the fuel level.
 *
 *   refuel(double amount):
 *     Increases fuelLevel by amount.
 *
 *   turnOnLights():
 *     Toggles the lightsOn state.
 *
 *   displayStatus():
 *     Prints the current status of the car, including all instance variables (color, make, model, fuel level, and whether the lights are on).
 *
 *
 *     In the main method:
 *
 *     Instantiate a Car object with some values. ("Red", "Toyota", "Corolla", 50, false)
 *     Simulate a short trip by calling the drive method and passing a distance.
 *     Refuel the car by calling the refuel method.
 *     Turn on the car's lights by calling the turnOnLights method.
 *     Print the car's status after these actions.
 */
