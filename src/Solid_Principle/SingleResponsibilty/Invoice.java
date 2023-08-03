package Solid_Principle.SingleResponsibilty;

public class Invoice {
        public Book book;
        public int quantity;
        public double discountRate;
        public double taxRate;
        public double total;

        public Invoice(Book book, int quantity, double discountRate, double taxRate) {
            this.book = book;
            this.quantity = quantity;
            this.discountRate = discountRate;
            this.taxRate = taxRate;
            this.total = this.calculateTotal();
        }

        public double calculateTotal() {
            double price = ((book.price - book.price * discountRate) * this.quantity);

            double priceWithTaxes = price * (1 + taxRate);

            return priceWithTaxes;
        }

        public void printInvoice() {
            System.out.println(quantity + "x " + book.name + " " +          book.price + "$");
            System.out.println("Discount Rate: " + discountRate);
            System.out.println("Tax Rate: " + taxRate);
            System.out.println("Total: " + total);
        }

        public void saveToFile(String filename) {
            // Creates a file with given name and writes the invoice
        }

        //here you can see
        // calculateTotal method, which calculates the total price,
        //printInvoice method, that should print the invoice to console, and
        // saveToFile method, responsible for writing the invoice to a file.
        //this have different funcitonlity so move this to other class

    //create separate class for those functionality
    //so those can be used as single responsibilty

}
