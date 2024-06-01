package Ass24_SuperClassEmplManag;

import java.util.Objects;

public class Employee {

    private String name; // The employee's name.
    private double salary; // The employee's salary.
    private int yearsOfService; // The number of years the employee has been in service.

    public Employee (String name, double salary, int yearsOfService) {

        this.name = name;
        this.salary = salary;
        this.yearsOfService = yearsOfService;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", yearsOfService=" + yearsOfService +
                '}';
    }

    int x = Integer.MAX_VALUE;

    String str = "hello";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(salary, employee.salary) == 0 && yearsOfService == employee.yearsOfService && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, yearsOfService);
    }

    public double getPaid() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }
}
