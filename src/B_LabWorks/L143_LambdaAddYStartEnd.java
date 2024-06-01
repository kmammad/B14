package B_LabWorks;

import java.util.*;

public class L143_LambdaAddYStartEnd {

    public static void main(String[] args) {

        //TESTS

        System.out.println(moreY(new ArrayList<>(Arrays.asList("a", "b", "c")))); //["yay", "yby", "ycy"]
        System.out.println(moreY(new ArrayList<>(Arrays.asList("hello", "there")))); //["yhelloy", "ytherey"]
        System.out.println(moreY(new ArrayList<>(Arrays.asList("yay")))); //["yyayy"]
    }


    public static List<String> moreY(List<String> list){

        StringBuilder sb = new StringBuilder();

        list.replaceAll( n -> "y" + n.concat("y"));

        return list;

    }
}
