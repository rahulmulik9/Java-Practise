package Basic.classoopsconcepts.challenge1_bank;

public class Customer {
    private int accno;
    private int balance;
    private String name;

    public Customer() {
        System.out.println("empty constructor is called");

    }

    public Customer(int accno, int balance, String name) {
        this.accno = accno;
        this.balance = balance;
        this.name = name;
    }

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void withdraw(int amount){
        if(balance-amount<0){
            System.out.println("Less balance");
        }
        else {
            balance=balance-amount;
            System.out.println("Take the cash");
            System.out.println("Raminaing balalnce is "+balance);
        }
    }

    public void deposite(int amount){
        balance=balance+amount;
        System.out.println("New balacnce is "+balance);
    }
}
