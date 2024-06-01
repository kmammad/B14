package day3;

public class TypePromotion {

    public static void main(String[] args) {


        byte b1 = 34;
        byte b2 = 44;

        // Tupe promotion Rule 1: anything less than int is promoted to int when operation is performed
        // byte b3 = b1 + b2; //(int + int)
        byte b3 = (byte) (b1 + b2);

        // Type promotion Rule 2: anything that is long, float, double the entire expression is promoted to long, float or double

        // int i = (34 + 45L;
           // long i = 34 + 45L;
            int i = (int) (34 + 45L);

        float f = 33L + 3.14F + 3.5F; //3.14 is double without F at the end

    }
}
