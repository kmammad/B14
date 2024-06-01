package Day13SuperClasses;

import java.util.Arrays;

public class Mess {

    static int a;
    int b;

    public Mess(){
        int c;
        c = a;
        a++;
        b += c;
    }

    public static void main(String[] args) {

        new Mess();

          }

}