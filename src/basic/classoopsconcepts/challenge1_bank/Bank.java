package basic.classoopsconcepts.challenge1_bank;

// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if there are insufficient funds.

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        System.out.println("Intila balance is 10000");
        Customer cstr = new Customer(1245, 10000, "Rahul");
        Customer cstr2 = new Customer();
        cstr2.setBalance(10000);
        System.out.println("customer 2 balance is "+cstr2.getBalance());


        System.out.println("Enter 1 to withdraw \nEnter 2 to deposit");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch (a) {
            case (1): {
                System.out.println("Enter amount to withdraw");
                int amount = sc.nextInt();
                cstr.withdraw(amount);
                break;
            }
            case (2): {
                System.out.println("Enter amount to deposite");
                int amount = sc.nextInt();
                cstr.deposite(amount);
                break;
            }
        }


        sc.close();

    }
}
