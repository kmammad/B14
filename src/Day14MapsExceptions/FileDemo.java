package Day14MapsExceptions;

import java.io.File;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) throws IOException {

        File file = new File("/Users/kmammadli/Desktop/IO practice/hello.txt");
        File file2 = new File("/Users/kmammadli/Desktop/IO practice/story.txt");

        System.out.println(file.exists());
        System.out.println(file2.exists());

        boolean isCreated = file2.createNewFile();
        System.out.println(isCreated);

        System.out.println(file2.canRead());
        System.out.println(file2.canWrite());

        System.out.println(file2.renameTo(new File("/Users/kmammadli/Desktop/IO practice/STORY.txt")));

        //file2.delete();

        File file3 = new File("story.txt");

        System.out.println(file2.exists());

      //  System.out.println(System.getProperty("user.dir") + "/src/ArrayOfObjects_LibraryCatalog/Requirements.txt");

        File file4 = new File(System.getProperty("user.dir") + "/src/ArrayOfObjects_LibraryCatalog/Requirements.txt");

        System.out.println(file4.exists());

    }
}
