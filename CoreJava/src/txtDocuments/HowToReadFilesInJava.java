package txtDocuments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HowToReadFilesInJava {
    public static void main(String[] args) throws IOException {
        FileReader file1=new FileReader("src/txtDocuments/day29_ArrayList3/LectureNotes.txt");
        BufferedReader reader=new BufferedReader(file1);

        System.out.println(reader.readLine());
        System.out.println(reader.readLine());
        System.out.println(reader.readLine());
        System.out.println(reader.readLine());

        reader.close();
    }
}
