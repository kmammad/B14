package Assignmenents;

public class A6_MysteriousPlanetExplorer {
    public static void main(String[] args) {

        System.out.println("""
                      Welcome to the Mysterious Planet Explorer Program!
                      Exploring the far reaches of the universe, we have discovered a new mysterious planet...
                       """);

        // Write the rest of the main method logic using the methods

        String planetName = "Mysterious PLanet Name: " + getPlanetName();

        System.out.println("Mysterious Planet Name: " + planetName);

        System.out.println("Alien Inhabitants and their ID codes:");

        System.out.println("  Alien 1: " + getAlienName());
        System.out.println("  Alien 2: " + getAlienName());

        System.out.println("Distance to Planet " + planetName + " in human years: " + getDistanceHumanYears());

        System.out.println("""
     Thank you for exploring with us! Safe travels to the next mysterious planet!
     """);

    }

    // implement the follwing methods

    public static String getPlanetName(){
        //implement the logic
        char letter1 = (char)(Math.random()*26 + 65);
        char letter2 = (char)(Math.random()*26 + 65);
        char letter3 = (char)(Math.random()*26 + 65);
        char letter4 = (char)(Math.random()*26 + 65);
        char letter5 = (char)(Math.random()*26 + 65);

        String planetName = "" + letter1 + letter2 + letter3 + letter4 + letter5;

        return planetName;
    }

    public static String getAlienName(){
        //implement the logic

        char namLet1 = (char)(Math.random()*26 + 65);
        char namLet2 = (char)(Math.random()*26 + 65);
        char namLet3 = (char)(Math.random()*26 + 65);

        int number = (int)(Math.random()*10 + 90);

        String alienName = "" + namLet1 + namLet2 + namLet3 + "-" + number;

        return alienName;

    }

    public static long getDistanceHumanYears(){
        //implement the logic

        double lightYears = Math.random()*901 + 100;

        double lightYears2 = lightYears * 5878625370000.0;

        int humanYears = (int)(Math.sqrt(lightYears2));

        return humanYears;
    }

}

/** Mysterious Planet Explorer

Objective:
Embark on an interstellar journey with a Java program that lands you on a mysterious planet in a faraway galaxy!

Implement the follwing methods:

        1. getPlanetName() method that generates a Mysterious Planet Name:
Method logic:
Use the Math.random() method to generate random uppercase letters (A-Z) for the planet's name.
Concatenate 5 randomly generated letters to a single String to form a mysterious and unknown planet name and return it.

2. getAlienName() method that generates Alien Inhabitant name:
Method logic:
Generate random characters and numbers to represent the alien inhabitant id of the mysterious planet and return it.
The format should be XXX-##. Examples: GSD-71, VRX-09



        4. getDistanceHumanYears() method that calculates the Distance to Planet:
Method logic:
Generates a random number using Math.random() to represent the distance (in light-years) from Earth to the mysterious planet.Its range should be between 100 to 1000 inclusive. Then it converts the light years to human years by obtaining a square root of (light years * 5878625370000) and converts it to a whole number and returns it.

        5. Main method logic:

Using the implemented methods displays name of the mysterious planet, the alien inhabitants, and the distance from Earth in  human years.

EXAMPLE OUTPUT:

Welcome to the Mysterious Planet Explorer Program!
Exploring the far reaches of the universe, we have discovered a new mysterious planet...

Mysterious Planet Name: QXTRV
Alien Inhabitants and their ID codes:
Alien 1: ZXQ-09
Alien 2: RTY-55

Distance to Planet QXTRV in human years: 37326052 human years

Thank you for exploring with us! Safe travels to the next mysterious planet!
*/




