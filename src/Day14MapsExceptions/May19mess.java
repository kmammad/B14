package Day14MapsExceptions;

import java.util.*;

public class May19mess {

        public static void main(String[] args) {
            String input = "1 5 9 2 1 5 8 1";  // Example input
            printIntegerOccurrences(input);
        }

        public static void printIntegerOccurrences(String input) {
            // Step 1: Split the input string into an array of substrings based on spaces
            String[] stringArray = input.split(" ");

            // Step 2: Create a map to store the counts of each integer
            Map<Integer, Integer> countMap = new HashMap<>();

            // Step 3: Parse each substring into an integer and update the count in the map
            for (String s : stringArray) {
                int num = Integer.parseInt(s.trim());
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }

            // Step 4: Build the output string
            StringBuilder output = new StringBuilder();
            for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
                if (output.length() > 0) {
                    output.append(" ");
                }
                output.append(entry.getKey()).append("(").append(entry.getValue()).append(")");
            }

            // Step 5: Print the result
            System.out.println(output.toString());
        }
    }


