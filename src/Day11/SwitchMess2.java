package Day11;

public class SwitchMess2 {

    public static void main(String[] args) {

        int year = 1601;


        if ( (year % 4 == 0 ) || (year % 100 == 0 && year % 400 != 0)) {
            int leapYear = year;
            System.out.println(leapYear + " is leap year");
        } else {
            int oddYear = year;
            System.out.println(oddYear + " is odd year");
        }



    }
}
