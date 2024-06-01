package Ass25_EmailManagementSuperTypeArray;

import java.util.*;
public class StaffEmail extends Email {

    private int departmentId;

    public static final String [] DEPARTMENTS = {"Invalid", "Accounting", "Sales", "Marketing", "Instructors"};

    public StaffEmail (String firstName, String lastName, int departmentId) {
        super(firstName, lastName);
        this.departmentId = departmentId;
        this.setEmailAddress(generateEmail());
        this.setPassword (generatePassword());
        this.setCapacity (50);
        this.setMaxAttachmentSize(100);
    }

    @Override
    public String generateEmail(){

          return "" + getFirstName().toLowerCase() + "." + getLastName().toLowerCase() + "_d" + departmentId + "@" + DEPARTMENTS[departmentId].toLowerCase() + "." + DOMAIN_NAME;
     }

    @Override
    public String generatePassword() {

        String beta = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()";

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 9; i++ ){
            int randomIndex = new Random().nextInt(beta.length());
            sb.append(beta.charAt(randomIndex));
        }
        return sb.toString();
    }

    public String toString(){
        return "TYPE: Staff\n" +
                "DEPARTMENT: " + DEPARTMENTS[departmentId] + "\n" +
                super.toString();

    }


}
