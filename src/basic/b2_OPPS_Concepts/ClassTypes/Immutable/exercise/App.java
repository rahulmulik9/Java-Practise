package basic.b2_OPPS_Concepts.ClassTypes.Immutable.exercise;

public class App {
    public static void main(String[] args) {
//        BankAccount bankAccount = new BankAccount(BankAccount.AccountType.CURRENT,1000);
//        System.out.println(bankAccount);
        BankCustomer newAc = new BankCustomer("Rahul",5000,10_000);
        System.out.println(newAc);

    }
}
