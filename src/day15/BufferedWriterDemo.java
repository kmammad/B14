package day15;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("src/day15/pass.txt"));

      for (int i = 0; i < 100; i++) {

          bw.write("Hello World");
          bw.newLine();
      }
        bw.close();
    }
}
