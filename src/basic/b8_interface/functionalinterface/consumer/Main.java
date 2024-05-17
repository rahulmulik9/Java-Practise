package basic.b8_interface.functionalinterface.consumer;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
interface GodPrinter{
    public void print(String name);
}


class Printer {
    public static void print(String name) {
        System.out.println("Hello" + name);
    }
}

public class Main {
    public static void main(String[] args) {
        //example 1
        Consumer<String> consumer = Printer::print;
        consumer.accept("Rahul");


        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Hello"+s);
            }
        };

        consumer1.accept("Rahul2");

        Consumer<String> consumer2 = name -> System.out.println("Hello"+name);
        consumer2.accept("Rahul3");



        //example2
        // Consumer to multiply 2 to every integer of a list
        Consumer<List<Integer>> consumer3 = list ->
        {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, 2 * list.get(i));
                System.out.println( list.get(i));
            }
        };

        // Consumer to display a list of numbers
        Consumer<List<Integer> >
                consumer4 = list -> list.stream().forEach(a -> System.out.print(a + " "));

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        // Implement modify using accept()
        consumer3.accept(list);

        // Implement dispList using accept()
        consumer4.accept(list);
    }

}
