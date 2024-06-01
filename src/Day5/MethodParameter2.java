package Day5;

public class MethodParameter2 {

    public static void main(String[] args) {

        add5to10();
        add(34,56);
        calculateAreaOfACircle(3);

    }

    // Math.max (3,4); requires parameters
    // Math.random(); does not require parameter

// Method signature -> method name + parameters

    public static void add5to10(){

        System.out.println(5+10);

    }

    public static void add(int a, int b){

        System.out.println(a+b);

    }

    // A = PR2
    public static void calculateAreaOfACircle(double radius){
        System.out.println("The area is: " + Math.PI * Math.pow(radius, 2));


    }


}
