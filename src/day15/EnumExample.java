package day15;



public class EnumExample {

    public static void main(String[] args) {

        Day today = Day.MONDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Today is Monday");
                break;
            case FRIDAY:
                System.out.println("Today is Friday");
                break;
            default:
                System.out.println("It's neither Monday nor Friday");
                break;
        }

        System.out.println("Days of the week");

        for (Day day : Day.values()) {
            System.out.println(day);
        }

    }
}
