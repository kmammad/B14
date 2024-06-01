package Ass24_SuperClassEmplManag;

public class Programmer extends Employee {

    private String language;

    public Programmer (String name, double salary, int yearsOfService, String language) {
        super(name, salary, yearsOfService);
        this.language = language;

    }

    @Override
    public String toString(){
        return super.toString() + ", programming language " + language;
    }

    @Override
    public double getPaid() {
        if (language.equals("Java")) {
            return super.getPaid() + 30000;
        }
        else if (language.equals("Python")) {
            return super.getPaid() + 40000;
        }
    else if (language.equals("Scala")) {
            return super.getPaid() + 50000;
        } else {
            return super.getPaid() + 25000;
        }


    }



}
