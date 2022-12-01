package lectureTasks.day35_OOP_Encapsulation.seperateTasks;

public class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        this.balance=balance;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder) {
        if (accountHolder.isEmpty() || accountHolder.isBlank()) {
            System.err.println("Invalid AccountHolder : " + accountHolder);
            return;
        }
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        if (accountNumber <= 0) {
            System.err.println("Invalid AccountNumber: " + accountNumber);
            return;
        }
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "BankAccount{" +'\'' +"\n"+
                "accountHolder='" + accountHolder + "\n"+
                ", accountNumber=" + accountNumber +"\n"+
                ", balance=" + ((balance==0)? "Honey, you have no money!" : ""+balance) +'\'' +"\n"+
                '}';
    }

    public void deposit(double amount){
        if (balance < 0) {
            System.err.println("Invalid Balance: " + balance);
            return;
        }
        System.out.println("Depositing $"+amount+" to the account: "+ accountNumber);
        balance += amount;
        }

    public void withdraw(double amount){
        System.out.println("Withdrawing $"+amount+" from the account: "+ accountNumber);
        if(balance>=amount){
            balance -= amount;
        }
        else {
            System.err.println("Withdrawing amount can not be greater than the current amount.");
            System.err.println("Insufficient balance!");
        }
    }

    public void checkBalance(String accountHolder){
        System.out.println(accountHolder+"! Your current balance is: $"+balance);
    }
}
/*5. create a class named BankAccount
Private variables:
accountHolder, accountNumber, balance
encapsulate all the fields
Add a constructor that allows user to set all the fields when the
object is created.
(If the arguments not valid it should not be set
to the instances)
Extra methods:
deposit()
withdraw()
checkBalance()
toString()*/