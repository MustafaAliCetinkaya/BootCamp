package other.standalone_executable;

import java.io.*;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        String file_path = "interview_tasks/other/standalone_executable/Input Data.txt";


        readLines(file_path).stream()
                .map(Person::new)
                .collect(Collectors.groupingBy(Person::getAddress))
                .entrySet().stream().forEach(household -> {
                    System.out.println("\nHOUSHOLD with " + household.getValue().size() + " occupants:");
                    household.getValue().stream()
                            .filter(Person::isAdult)
                            .sorted()
                            .forEach(System.out::println);
                });

    }

    private static List<String> readLines(String file) throws IOException {
        try (InputStream inputStream = new FileInputStream(new File(file));
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

            return reader.lines().collect(Collectors.toList());
        } catch (IOException e) {
            throw e;
        }
    }

}


class Person implements Comparable<Person> {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String address;

    public Person(String line) {
        String[] fields = line.split("\",\"");

        this.firstName = clearAndClean(fields[0]);
        this.lastName = clearAndClean(fields[1]);
        this.age = Integer.parseInt(clearAndClean(fields[5]));
        this.address = clearAndClean(fields[2]) + ", " + clearAndClean(fields[3]) + ", " + clearAndClean(fields[4]);
    }

    private String clearAndClean(String str) {
        return str
                .replaceAll("\"", "")
                .replaceAll(",", "")
                .replaceAll("\\.", "")
                .trim()
                .toUpperCase();
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public String toString() {
        return lastName + " " + firstName + ", " + address + ", " + age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public int compareTo(Person person) {
        return Comparator.comparing(Person::getLastName).thenComparing(Person::getFirstName).compare(this, person);
    }
}
