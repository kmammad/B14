package Ass26_TollAdminApplication;

public class Car extends Vehicle {

    private boolean hasTrailer;
    private boolean isHov;

    protected Car (double distanceTraveled, boolean hasTrailer, boolean isHov){
        super(distanceTraveled);
        this.hasTrailer = hasTrailer;
        this.isHov = isHov;

    }

    @Override
    public void calculateToll() {
        if (isHov) {
            setToll(0);
        } else if (hasTrailer) {
            setToll((getDistanceTraveled() * 0.020) + 1.0);
        } else {
            setToll(getDistanceTraveled() * 0.020);
        }

    }
        public void setHasTrailer (boolean hasTrailer){
            this.hasTrailer = hasTrailer;
        }

        public boolean getHasTrailer(){
            return hasTrailer;
        }

        public void setIsHov(boolean isHov){
            this.isHov = isHov;
        }

        public boolean getIsHov(){
            return isHov;
        }

        @Override
        public String toString() {
            return super.toString() + "Car              " + super.getDistanceTraveled() + "         $" + super.getToll();
        }

    }
