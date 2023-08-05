package Design_Patterns.Solid_Principle.Liskov_Substitution.good;

/**
 * This is good we are bothered to provide secure loan type
 * so this will behave perfectly fine even if we substitute between parent
 * and child.
 */


/*
So we first create LoanPayment in this payLoad method is there
then we create Seccure lone implnetatin and extend with the LoanPayment and forced close loadn method is there
then when we create class and implment SecureLoan interface we should have to implenent both payLoan and forcedClose method
create CreditCaedLoan and implent LoanPayment , so only doPayment method need to implent
 */
public class LoanClosureService {
    private SecureLoan secureLoan;

    public LoanClosureService(SecureLoan secureLoan) {
        this.secureLoan = secureLoan;
    }
    public void foreCloseLoan() {
        secureLoan.foreCloseLoan();;
    }
}