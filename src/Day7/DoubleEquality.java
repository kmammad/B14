package Day7;

public class DoubleEquality {

    public static void main(String[] args) {

        double a = 1.0 - 0.3 - 0.2;
        double b = 0.5;

        double toleranceLevel = 0.0000001;

        if (Math.abs(a - b) < toleranceLevel) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");

        }

        System.out.println(getSomeNumber(0));
    }

    public static int getSomeNumber (int value){

        int num = 0;

        if(value < 0){
            num = 10;
        }else if (value < 100) {
            num = 100;
        } else if (value < 300) {
            num = 500;
        }else if(value < 500) {
            num = 300;
            }
        return num;

        }


    }

