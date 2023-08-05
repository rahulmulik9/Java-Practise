package Design_Patterns.Solid_Principle.SingleResponsibilty;

public class InvoicePrinter {
        private MainTpoicInvoice mainTpoicInvoice;

        public InvoicePrinter(MainTpoicInvoice mainTpoicInvoice) {
            this.mainTpoicInvoice = mainTpoicInvoice;
        }

        public void print() {
            System.out.println(mainTpoicInvoice.quantity + "x " + mainTpoicInvoice.book.name + " " + mainTpoicInvoice.book.price + " $");
            System.out.println("Discount Rate: " + mainTpoicInvoice.discountRate);
            System.out.println("Tax Rate: " + mainTpoicInvoice.taxRate);
            System.out.println("Total: " + mainTpoicInvoice.total + " $");
        }

}
