package Day5;

public class RocketMethod {

            public static void main(String[] args) {

            drawPyramid();
            drawBox();
            drawLabelBox();
            drawBox();
            drawBox();
            drawBox();
            drawPyramid();


            // call your methods here
        }


        // Create your methods here

        public static void drawPyramid(){

            System.out.println("""
                     /\\      
                    /  \\     
                   /    \\
                  /      \\""");
        }

        public static void drawBox(){

            System.out.print(""" 
                +------+ 
                |      |
                |      | 
                +------+ 
                    """);

        }

        public static void drawLabelBox(){

            System.out.print("""
                 |United|
                 |States|
                 """);

        }




}
