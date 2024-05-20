package basic.b8_interface.functionalinterface.supplier;

import java.util.function.Supplier;
interface OwnSupplier<T>{
    public T get();
}


public class MainSupplier {
    public static void main(String[] args) {
        //own supplier class
        OwnSupplier<String> ownSupplier = new OwnSupplier<String>() {
            @Override
            public String get() {
                return "Rahul";
            }
        };

        String name = ownSupplier.get();
        System.out.println(name);


        String name1 = new OwnSupplier<String>(){
            @Override
            public String get() {
                return "Rahul";
            }
        }.get();
        System.out.println(name1);


        //using deafult supplier class
        Supplier<String> defaultsupplier = new Supplier<String>() {
            @Override
            public String get() {
                return "Rahul";
            }
        };
        String name2 =defaultsupplier.get();
        System.out.println(name2);



        String name4 = new Supplier<String>(){
            @Override
            public String get() {
                return "Rahul";
            }
        }.get();

        System.out.println(name4);




        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "Rahul";
            }
        };
    }
}
