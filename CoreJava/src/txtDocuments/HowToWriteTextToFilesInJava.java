package txtDocuments;

import java.io.*;

public class HowToWriteTextToFilesInJava {
    public static void main(String[] args) throws IOException {
        FileWriter file=new FileWriter("src/txtDocuments/day29_ArrayList3/LectureNotes.txt");
        BufferedWriter writer=new BufferedWriter(file);

        writer.write("Heyamola");
        writer.write("How are you?");

        writer.close();
    }
}
