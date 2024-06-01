package ClassTask56_Car;

public class Car {
    String color;
    String make;
    String model;
    double fuelLevel;
    boolean lightsOn;


    public void drive(double distance){

        fuelLevel -= distance;

        if (fuelLevel <= 0){
            System.out.println("You are out of fuel. Please refil");
            fuelLevel = 0;
            return;
        }
        System.out.println("Remaining fuel level is " + fuelLevel);
    }

    public void refuel(double amount){

        fuelLevel += amount;

        System.out.println("New fuel level is " + fuelLevel);
    }

    public void turnOnLights(){
        lightsOn = true;
        System.out.println("Lights are on");
    }

    public void displayStatus(){
        System.out.println("The " + color + " " + make + " " + model + " with fuel level at " + fuelLevel + " and lightsOn is " + lightsOn);
    }


}
