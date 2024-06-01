package day15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
public class CSVReader {

    public static void main(String[] args) throws IOException {



        System.out.println(readCsv("src/day15/students.csv"));
    }

    public static List<List<String>> readCsv (String path) throws IOException {

       List<String> list = Files.readAllLines(Path.of(path));

       List<List<String>> fileContent = new ArrayList<>();

        for (String eachLIne : list) {

            String[] split = eachLIne.split(",");
            List<String> eachRow = Arrays.asList(split);
            fileContent.add(eachRow);

        }



        return fileContent;
    }


}
