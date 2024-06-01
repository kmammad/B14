package Ass25_EmailManagementSuperTypeArray;

import java.util.*;

public class StudentEmail extends Email {

    private int batchNo;

    public StudentEmail (String firstName, String lastName, int batchNo) {
        super(firstName, lastName);
        this.batchNo = batchNo;
        this.setEmailAddress(generateEmail());
        this.setPassword (generatePassword());
        this.setCapacity (25);
        this.setMaxAttachmentSize(50);
    }

    @Override
    public String generateEmail(){
        return "" + getFirstName().toLowerCase() + "." + getLastName().toLowerCase() + "_b" + batchNo + "@student." + DOMAIN_NAME;
    }

    @Override
    public String generatePassword () {

        String alpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 9; i++ ){
            int randomIndex = new Random().nextInt(alpha.length());
            sb.append(alpha.charAt(randomIndex));
        }
        return sb.toString();
    }

    public String toString(){
        return "TYPE: Student\n" +
                "STUDENT BATCH NO: " + batchNo + "\n" +
                super.toString();

    }


}
