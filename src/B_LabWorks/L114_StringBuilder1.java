package B_LabWorks;

public class L114_StringBuilder1 {
    public static void main(String[] args) {

        // Create a StringBuilder object sb with value "Talk is cheap."

        StringBuilder sb = new StringBuilder("Talk is cheap.");

        // Modify sb to display "Talk is cheap. Show me the code."

        System.out.println( sb.append(" Show me the code.") );

        //Modify sb to display "Empty talk is cheap. Show me the code."

        System.out.println( (sb.deleteCharAt(0).insert(0, "Empty t") ) );

        //Modify sb to display "Empty talk is useless. Show me the code."

        System.out.println( sb.replace(0, sb.length(), "Empty talk is useless. Show me the code.") );

        //Modify sb to display "Empty talk is useless and no good. Show me the code."

        System.out.println( sb.insert(21, " and no good") );

        //Modify sb to display "Empty talk is no good. Show the code."

        System.out.println( sb.delete(14, 26).delete(sb.length()-13, sb.length()-10) );

        //Modify sb to display "Talk less. Code more."

        System.out.println( sb.replace(0, sb.length(), "Talk less. Code more.") );

        //Modify sb to display ".erom edoC .ssel klaT"

        System.out.println( sb.reverse() );

    }
}
