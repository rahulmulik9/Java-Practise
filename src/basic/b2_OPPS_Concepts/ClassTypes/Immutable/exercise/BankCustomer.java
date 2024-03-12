package basic.b2_OPPS_Concepts.ClassTypes.Immutable.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankCustomer {
    public static int lastCustomerID = 10_000;
    private final String name ;
    private final int customerId;
    private final List<BankAccount> accounts= new ArrayList<>();

    public BankCustomer(String name,double checkingAmount, double savingAmount) {
        this.name = name;
        this.customerId = lastCustomerID+1;
        accounts.add(new BankAccount(BankAccount.AccountType.SAVING,checkingAmount));
        accounts.add(new BankAccount(BankAccount.AccountType.SAVING,savingAmount));
    }

    public String getName() {
        return name;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    @Override
    public String toString() {
       String[] accountString = new String[accounts.size()];
        Arrays.setAll(accountString,i-> accounts.get(i).toString());
        return "Customer : %s (id : %015d %n \t %s%n)".formatted(name,customerId,String.join("\n\t",accountString));
    }
}
