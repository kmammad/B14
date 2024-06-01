package B_Lab121b_Inheritance;

public class Main {

    public static void main(String[] args) {
        // Test your class

        Student student = new Student("John Doe", "New York City", "MBA", 2024, 50000);

        System.out.println(student.toString());

        Staff staff = new Staff("Alice Cooper", "Fairfax, VA", "Chantilly High", 45.0);

        System.out.println(staff.toString());

    }

}
