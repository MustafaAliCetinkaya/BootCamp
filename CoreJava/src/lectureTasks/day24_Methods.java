package lectureTasks;

public class day24_Methods {
    public static void main(String[] args) {
        domain("roka@cloudmail.com");
        System.out.println("---------------------------");
        String[]emails={"ali@gmail.com", "can@cydeo.com","mali@yahoo.com","hay@hotmail.com"};
        for (String email:emails){
            domain(email);
    }


    }
    public static void domain(String email){
        String domain=email.substring(email.indexOf('@')+1,email.lastIndexOf('.') );
        System.out.println("domain = " + domain);
    }
}
