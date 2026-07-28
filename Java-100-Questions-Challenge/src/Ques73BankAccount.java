 class BankAccount {


    String name;
    int accountNo;
    double balance;

    BankAccount(String name, int accountNo, double balance) {

        this.name = name;
        this.accountNo = accountNo;
        this.balance = balance;

    }

    void deposit(double amount) {

        balance = balance + amount;

    }

    void withdraw(double amount) {

        if (amount <= balance) {

            balance = balance - amount;

        } else {

            System.out.println("Insufficient Balance");

        }

    }

    void display() {

        System.out.println("Name = " + name);
        System.out.println("Account Number = " + accountNo);
        System.out.println("Balance = " + balance);

    }

}

public class Ques73BankAccount {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount("Sejal",101,5000);

        acc.display();

        acc.deposit(1000);

        acc.withdraw(2000);

        acc.display();

    }

}