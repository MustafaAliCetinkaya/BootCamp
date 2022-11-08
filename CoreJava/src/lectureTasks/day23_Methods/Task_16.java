package lectureTasks.day23_Methods;
/*16.  write a method that can print out the full name of a person in
        regular format
        ex:
        fullName("cYdEo", "SCHOOL");
        output:
        "Cydeo School"*/
public class Task_16 {
    public static void main(String[] args) {
        regularFormat("wOoDen", "sPOoN");
    }
    public static void regularFormat (String name, String surname){
        String regularName=name.toUpperCase().charAt(0)+name.toLowerCase().substring(1);
        String regularSurname=surname.toUpperCase().charAt(0)+surname.toLowerCase().substring(1);
        System.out.println(regularName+" "+regularSurname);
    }
}
