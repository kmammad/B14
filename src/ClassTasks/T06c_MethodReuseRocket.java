package ClassTasks;

public class T06c_MethodReuseRocket {

    public static void main(String[] args) {

        // call your methods here

        drawPyramid();
        drawBox();
        drawLabelBox();
        drawBox();
        drawPyramid();

    }

    // Create your methods here

    public static void drawPyramid(){

        System.out.print("""  
                     /\\    
                    /  \\     
                   /    \\      
    """);
    }

    public static void drawBox(){

        System.out.print("""  
              +------+ 
              |      | 
              |      | 
              +------+  
""");

    }

    public static void drawLabelBox() {

        System.out.print("""
              |United| 
              |States| 
""");


    }





}
/**
 *  Write a complete Java program in the Main class that generates the following figure of output.
 *  Use static methods to show structure and eliminate redundancy in your solution.
 *
 *      /\
 *     /  \
 *    /    \
 *   +------+
 *   |      |
 *   |      |
 *   +------+
 *   |United|
 *   |States|
 *   +------+
 *   |      |
 *   |      |
 *   +------+
 *      /\
 *     /  \
 *    /    \
 *
 *
 *
 *
 * To achieve this:
 *
 * 1. Design Static Methods:
 *
 *   drawPyramid(): This method will draw the pyramid structure.
 *   drawBox(): This method will draw the box structure without any text.
 *   drawLabelBox(): This method will draw the box structure with "United" and "States" as labels.
 *
 * 2. Construct the Monument in main():
 *
 *    Using the static methods, construct the entire monument structure in the main() method.
 *
 */
