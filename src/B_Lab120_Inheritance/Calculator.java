package B_Lab120_Inheritance;

public class Calculator {
    protected double accumulator; // contains current value of the calculator

    public Calculator(){
        this.accumulator = 0.0;
    }

    public void setAccumulator(double accumulator){
        this.accumulator = accumulator;
    }

    public double getAccumulator(){
        return accumulator;
    }

}
