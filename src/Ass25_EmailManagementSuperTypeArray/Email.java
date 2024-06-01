package Ass25_EmailManagementSuperTypeArray;

public class Email {

    private String firstName;
    private String lastName;
    private String emailAddress;
    private String password;
    private int capacity;
    private double maxAttachmentSize;
    protected static final String DOMAIN_NAME = "duotech.io";

    public Email (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String generateEmail(){
        return "";
    }

    public String generatePassword(){
        return "";
    }

    public String toString(){
        return "NAME: " + firstName + " " + lastName + "\n" +
                "GENERATED EMAIL ADDRESS: " + emailAddress + "\n" +
                "GENERATED PASSWORD: " + password + "\n" +
                "CAPACITY: " + capacity + "\n" +
                "MAX ATTACHMENT SIZE: " + maxAttachmentSize + " MB";

    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName (){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getEmailAddress(){
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public double getMaxAttachmentSize(){
        return maxAttachmentSize;
    }

    public void setMaxAttachmentSize(double maxAttachmentSize){
        this.maxAttachmentSize = maxAttachmentSize;
    }



}
