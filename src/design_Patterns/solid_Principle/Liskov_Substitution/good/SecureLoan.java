package design_Patterns.solid_Principle.Liskov_Substitution.good;


public interface SecureLoan extends LoanPayment {
    public void foreCloseLoan();
}
