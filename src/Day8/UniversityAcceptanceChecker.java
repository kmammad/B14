package Day8;

public class UniversityAcceptanceChecker {

    public static void main(String[] args) {

        // The applicant should have at least 3.5 GPA and either GRE score 750 and above or TOEFL score 100 and above

        double gpa = 3.8;
        int gre = 500;
        int toefl = 120;

        boolean isGPAValid = gpa >= 3.5 && (gre >=750 || toefl >=100);

        if(isGPAValid) {
            System.out.println("Eligible");
        }else{
            System.out.println("Come back later");
        }

    }
}
