//import java.util.Scanner;
//class Account{
//    int amount;
//    void Saving(){
//        System.out.println("Enter your amount");
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        System.out.println(t);
//        System.out.println("This is a savings account");
//    }
//    void  Current(){
//        System.out.println(amount);
//
//    }
//}
//class Customer1 extends Account{
////     void Saving(){
////        System.out.println("Customer1 has credited");
////    }
////     void Current(){
////        System.out.println("Customer1 has debited");
////    }
//
//}
//public class Bank {
//    public static void main(String[] args) {
//        Customer1 c1 = new Customer1();
//        c1.Saving();
//
//    }
//}


class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

//    public void applyInterest() {
//        double interest = getBalance() * interestRate / 100;
//        deposit(interest);
//        System.out.println("Interest applied: $" + interest);
//    }

    public void display() {
        super.display();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public void display() {
        super.display();
        System.out.println("Overdraft Limit: $" + overdraftLimit);
    }
}

public class Bank {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA001", 5000.0, 5.0);
        CurrentAccount currentAccount = new CurrentAccount("CA001", 10000.0, 5000.0);

        savingsAccount.deposit(1000.0);
      //  savingsAccount.applyInterest();
        savingsAccount.display();

        currentAccount.withdraw(15000.0);
        currentAccount.display();
    }
}
