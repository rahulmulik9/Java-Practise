package basic.b2_OPPS_Concepts.ClassTypes.Immutable.exercise;

public class BankAccount {
    public enum AccountType {SAVING, CURRENT};
    private final AccountType accountType;
    private final double balance;

    public BankAccount(AccountType accountType, double balance) {
        this.accountType = accountType;
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "%S $%.2f".formatted(accountType,balance);
    }
}



