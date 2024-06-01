package Ass26_TollAdminApplication;

public abstract class Vehicle {

    private double toll;
    private double distanceTraveled;

    protected Vehicle (double distanceTraveled){

        this.distanceTraveled = distanceTraveled;
    }

    public abstract void calculateToll();


    public void setToll(double toll){
        this.toll = toll;
    }

    public double getToll(){
        return toll;
    }

    public void setDistanceTraveled (double distanceTraveled){
        this.distanceTraveled = distanceTraveled;
    }

    public double getDistanceTraveled(){
        return distanceTraveled;
    }

    @Override
    public String toString() {
        return "";
    }


}
