package Ass21_FuelEfficiencyTracker;

public class Car {
    double totalDistance; // in miles.
    double totalFuel; // in gallons.
    double fuelEfficiency; // miles per gallon.


    public Car(){
        this.totalDistance = 0.0;
        this.totalFuel= 0.0;
        this.fuelEfficiency = 0.0;

    }

    public Car(double initialDistance, double initialFuel){

        totalDistance = initialDistance;
        totalFuel = initialFuel;
        fuelEfficiency = calculateEfficiency();
    }

    public double calculateEfficiency(){

        return totalDistance / totalFuel;
    }


    public void logFuelPurchase(double amount){
        totalFuel += amount;
        System.out.println("Fuel purchase logged");
        calculateEfficiency();
    }


    public void recordDistance (double distance) {
        totalDistance += distance;
        System.out.println("Distance updated");
        calculateEfficiency();
    }

    public void getEfficiencyDetails() {

        System.out.println("Current Fuel Efficiency: " + calculateEfficiency() + " miles/gallon");

    }
}
