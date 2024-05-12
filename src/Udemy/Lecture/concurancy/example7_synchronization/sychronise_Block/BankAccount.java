package Udemy.Lecture.concurancy.example7_synchronization.sychronise_Block;

public class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }


    public void depositeNew(double amount) {
        try {
            System.out.println("Deposit is happening");
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
        synchronized (this) {
            balance = balance + amount;
            System.out.printf("Balance after deposite: " + balance);
        }
       /* You can use object of any type of object here, I am using Double which is object type, so newBalance will not able to aquried by other thread
        Double newBalance = this.balance;
        synchronized (newBalance) {
            balance = balance + amount;
            System.out.printf("Balance after deposite: " + balance);
        }*/

    }


    public void withdrawNew(double amount) {
        try {
            System.out.println("Withdraw is happening");
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
        synchronized (this) {
            if (amount <= balance) {
                balance = balance - amount;
                System.out.printf("Balance after withDraw: " + balance);
            } else {
                System.out.println(" Less Balance ");
            }
        }
    }
}
