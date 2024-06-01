package Ass26_TollAdminApplication;

public class PoliceCruiser extends Vehicle{

    protected PoliceCruiser (double distanceTraveled){
        super(distanceTraveled);
    }

    @Override
    public void calculateToll(){
        setToll(0);
        System.out.println("Police cars get to drive free on the toll road.");
    }

    @Override
    public String toString(){
        return super.toString() + "PoliceCruiser    " + super.getDistanceTraveled() + "         $" + super.getToll();
    }

}
