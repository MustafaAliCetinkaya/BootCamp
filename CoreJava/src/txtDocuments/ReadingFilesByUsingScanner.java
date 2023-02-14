package txtDocuments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFilesByUsingScanner {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner=new Scanner(new File("src/txtDocuments/day29_ArrayList3/LectureNotes.txt"));
        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    }
}
