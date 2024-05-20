package basic.b8_interface.functionalinterface.Example.Consumer;

import java.util.function.Consumer;

/*Consumer class implementation
* Creates own consumer class which accept parameters and return nothing */

interface OwnConsumer<T> {
    public void accept(T t);
}

public class MainConsumer {
    public static void main(String[] args) {

        OwnConsumer<String> ownConsumer = new OwnConsumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        ownConsumer.accept("Rahul");

       new OwnConsumer<String>(){
           @Override
           public void accept(String s) {
               System.out.println(s);
           }
       }.accept("Rahul");




        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        consumer.accept("Rahul");

        new Consumer<String>(){
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        }.accept("Rahul");


    }
}
