package CT_InheritOvoadOvRide;

public class Main {

    public static void main(String[] args) {

        Residential[] residentials = {
                new Residential("123 Main St", 2500,450000,3,4),
                new Residential("2432 Fairfax Boulevard", 5000,750000,7,6)
        };

        System.out.println("-----------RESIDENTIAL---------------------");

        for (Residential residential : residentials) {

            residential.describe();
            System.out.println("The tax: " + residential.calculateTax());
            System.out.println(residential.toString());
            System.out.println("---------------------------");
        }

        Commercial[] commercials = {
                new Commercial("1600 Pennsylvania Ave", 20000,50000000,"office"),
                new Commercial("2121 Wisconsin Ave", 25000,450000,"indsutrial")
        };

        System.out.println("-----------COMMERCIAL---------------------");
        for (Commercial commercial : commercials) {
            commercial.describe();
            System.out.println("The tax: " + commercial.calculateTax());
            System.out.println(commercial.toString());
            System.out.println("---------------------------");
        }

    }
}
