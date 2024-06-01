package Day14MapsExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionsMess {

    public static void main(String[] args) throws SQLException { //throws FileNotFoundException

        try {
            FileInputStream fis = new FileInputStream("/Users/kmammadli/Desktop/Duotech/SDLC/Jira Project/Test Plan ManualProject.docx");
        } catch (FileNotFoundException e){

        }

        //createConnection();

    }

    public static void createConnection() throws SQLException {

        DriverManager.getConnection("https://duotech.talentlms.com/dashboard", "kenan.mamedli@gmail.com", "Banu2008!");

    }
}
