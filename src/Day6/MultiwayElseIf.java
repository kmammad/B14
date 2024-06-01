package Day6;

import java.util.Scanner;

public class MultiwayElseIf {

    public static void main(String[] args) {

        System.out.println("Enter the browser type: ");
        String browser = new Scanner(System.in).next();

if(browser.equals("chrome")){
    System.out.println("Launch Chrome ....");

}else if(browser.equals("edge")) {
        System.out.println("Launch Edge");

}else if(browser.equals("firefox")) {
            System.out.println("Launch Firefox");

        }else if(browser.equals("safari")) {
                System.out.println("Launch Safari");
            }else{
                  System.out.println("This browser is not supported");
                  }

        }


    }
