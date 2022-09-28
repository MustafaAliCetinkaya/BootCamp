package extraTasks;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size="tall";
        Boolean option=(size=="tall")||(size=="grande")||(size=="venti");

        String result = option && size == "tall" ? "price is $3.69\n90 calories" : size == "grande" ?
                "price is $3.99\n120 calories" : size == "venti" ? "price is $4.29\n150 calories" : "Invalid";
        System.out.println(result);
    }
}
