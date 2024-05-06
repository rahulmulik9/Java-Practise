package Udemy.Lecture.lambda.example3.Consumer;

import java.util.function.Consumer;

public class Main {
    //in simple ways
    public static void main(String[] args) {
        greetCustomer(new Customer("Rahul"));
        greetingsustomer.accept(new Customer("ABHI"));

    }
    static void greetCustomer(Customer customer){
        System.out.println("Hello "+ customer.name);
    }

    static class Customer {
        private final String name;

        public Customer(String name) {
            this.name = name;
        }
    }


    //using consumer
    static Consumer<Customer> greetingsustomer = customer -> System.out.println("Hello "+ customer.name+", Welocme");
}
