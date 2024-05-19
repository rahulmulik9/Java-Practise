package basic.b8_interface.functionalinterface.supplier;

import java.util.List;
import java.util.function.Supplier;

/*It does not take any arguments but produces a result of a certain type. Suppliers are useful in scenarios where objects need to be generated dynamically.*/


public class Main {
    public static void main(String[] args) {
        Supplier<Double> randomValue = () -> Math.random();
        // Supplier<Double> randomValu1e = Math::random; same example with different implementation

        System.out.println(randomValue.get());

        System.out.println(produceRandomList().get());
    }


    public static Supplier<List<String>> produceRandomList() {

        /* Supplier<List<String>> supplier = () -> {
            List<String> listofProduct = List.of("House", "Car", "Pen", "Book", "Pencil");
            return listofProduct;
        };
        return supplier;*/


        /* return () -> {
            List<String> listofProduct = List.of("House", "Car", "Pen", "Book", "Pencil");
            return listofProduct;
        };*/

        //using supplier as lambda function
        return () -> {
            return List.of("House", "Car", "Pen", "Book", "Pencil");
        };
    }

    public static List<String> produceRandomListOnly() {
        return List.of("House", "Car", "Pen", "Book", "Pencil");
        };

}


