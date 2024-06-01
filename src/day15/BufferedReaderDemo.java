package day15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("src/Day15_Buffered/users.csv"));

        //String s1 = br.readLine();
        //System.out.println(s1);

      //  String line;

       // while( ( (line = br.readLine() ) != null) ){
       //     System.out.println(line);
       // }


        //br.lines().forEach((s -> System.out.println(s)));

//        List<String> collect = br.lines().collect((Collectors.toList()));

  //      System.out.println(collect);

 /**
   List<String[]> collect =  br.lines()
            .map(s -> s.split(","))
            .collect(Collectors.toList());

        for (String[] strings : collect) {
            System.out.println(Arrays.toString(strings));

        }

*/

        List<List<String>> collect =  br.lines()
                .map(s -> List.of(s.split(",")))
                .collect(Collectors.toList());

        collect.forEach(System.out::println);

        System.out.println(collect.get(3).get(1));

        br.close();
    }
}
