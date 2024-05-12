package Udemy.Lecture.concurancy.example7_synchronization;


public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(10000);
        Thread threadO1 = new Thread(() -> bankAccount.withdraw(500));
        Thread threadO2 = new Thread(() -> bankAccount.deposite(200));
        Thread threadO3 = new Thread(() -> bankAccount.withdraw(300));



     /* Scenario 1 ,
          Run the example with removing synchronization keyword from method
          here we don't know which method will execute first
          So here threads are interfering each other i.e at same time deposit or withdraw is happening  */
     /* Scenario 1 ,
          Run the example with synchronization keyword from method.
          Method will work properly without interfacing each other but the sequence of thread in not proper  */


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


