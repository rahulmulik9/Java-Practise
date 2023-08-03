package Solid_Principle.SingleResponsibilty;

public class InvoicePersistence {
    MainTpoicInvoice mainTpoicInvoice;

    public InvoicePersistence(MainTpoicInvoice mainTpoicInvoice) {
        this.mainTpoicInvoice = mainTpoicInvoice;
    }

    public void saveToFile(String filename) {
        // Creates a file with given name and writes the invoice
    }
}
