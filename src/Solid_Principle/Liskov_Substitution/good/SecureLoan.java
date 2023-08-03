package Solid_Principle.Liskov_Substitution.good;


public interface SecureLoan extends LoanPayment {
    public void foreCloseLoan();
}
