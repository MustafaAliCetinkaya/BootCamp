import java.util.Random;
import java.util.Scanner;

public class Student {
    Scanner scan = new Scanner(System.in);
     String name,batchNumber;
     Lessons lessons ;









//constructor- getter-setter
    public Student(String name) {
        this.name = name;

        this.batchNumber = batchNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }
}
