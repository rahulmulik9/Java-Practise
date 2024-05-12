package Udemy.Lecture.concurancy.example7_synchronization.sychronise_Block;


public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(10000);
        Thread threadO1 = new Thread(() -> bankAccount.withdrawNew(500));
        Thread threadO2 = new Thread(() -> bankAccount.depositeNew(200));
        Thread threadO3 = new Thread(() -> bankAccount.withdrawNew(300));


        threadO1.start();
        threadO2.start();
        threadO3.start();
        try {
            threadO1.join();
            threadO2.join();
            threadO3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Balance is " + bankAccount.getBalance());

    }
}


