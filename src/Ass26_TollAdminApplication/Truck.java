package Ass26_TollAdminApplication;

public class Truck extends Vehicle {

    private int noOfAxles;

    protected Truck (double distanceTraveled, int noOfAxles){
        super(distanceTraveled);
        this.noOfAxles = noOfAxles;

    }

    @Override
    public void calculateToll(){
        if (noOfAxles <= 4) {
            setToll(getDistanceTraveled() * 0.040);
        }
        else if (noOfAxles == 6)
        {
            setToll(getDistanceTraveled() * 0.045);
        }
        else if (noOfAxles >= 8)
        {
            setToll(getDistanceTraveled() * 0.048);
        }
    }

    @Override
    public String toString(){
        return super.toString() + "Truck            " + super.getDistanceTraveled() + "         $" + super.getToll();
    }

    public void setNoOfAxles(int noOfAxles){
        this.noOfAxles = noOfAxles;
    }

    public int getNoOfAxles(){
        return noOfAxles;
    }



}
