package lectureTasks.OOP.day35_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class BankAccountObject {
    public static void main(String[] args) {
        BankAccount account1=new BankAccount("Muhtar",12324345,1230);
        BankAccount account2=new BankAccount("Anna",9887665,9870);
        BankAccount account3=new BankAccount("Hulya",987545,15670);

        ArrayList<BankAccount>accounts=new ArrayList<>();
        accounts.addAll(Arrays.asList(account1,account2,account3));

        for (BankAccount each : accounts) {
            each.deposit(730.98);
            each.withdraw(10600.98);
            each.checkBalance(each.getAccountHolder());
            System.out.println("-------------------------------------");
        }

        System.out.println(accounts);

    }
}
