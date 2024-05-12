package Udemy.Lecture.concurancy.example7_synchronization;

public class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }
    public synchronized void deposite(double amount){
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){
            throw  new RuntimeException();
        }
        balance = balance+amount;
        System.out.printf("Balance after deposite: "+balance);
    }


    public synchronized void withdraw(double amount){
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){
            throw  new RuntimeException();
        }
        if(amount<=balance){
            balance = balance - amount;
            System.out.printf("Balance after withDraw: "+balance);
        }else {
            System.out.println(" Less Balance ");
        }

    }
}
