package Day14MapsExceptions;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Rethrowing {

    public static void main(String[] args) throws SQLException {

        try {
            DriverManager.getConnection("dsdsdsd", "dsdsdsd","dsdsd");

        }catch (SQLException e){
            System.out.println("Database connection not established");
            System.out.println("The message of exception: " + e.getMessage());
            throw e;
        }
    }
}
