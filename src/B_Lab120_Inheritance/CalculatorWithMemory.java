package B_Lab120_Inheritance;

public class CalculatorWithMemory extends Calculator {

    private double memory;

    public CalculatorWithMemory (){
        super();
        this.memory = 0.0;
    }

    public void save() {
        this.memory = this.accumulator;
    }

    public void recall() {
        this.accumulator = this.memory;
    }

    public void clearMemory() {
        this.memory = 0.0;
    }

    public double getMemory() {
        return this.memory;
    }



}
