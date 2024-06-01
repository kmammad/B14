package Ass24_SuperClassEmplManag;

public class Manager extends Employee {

    private double bonus;

    public Manager (String name, double salary, int yearsOfService, double bonus) {
        super(name, salary, yearsOfService);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + " bonus " + bonus;
    }

    @Override
    public double getPaid() {
        return super.getPaid() + bonus;
    }
}
