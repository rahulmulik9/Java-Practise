package basic.b8_interface.functionalinterface.Example.Predicate;

import java.util.function.Predicate;

/*
* Predicate is nothing but interface which contain only one method (Functional interface)
* It can be used as lambda function
* In below example we created check interface which take <T> type parameters
* By using this interface we created two methods isPresent, isPresent1 and isSmall , both have different implementation
* isPresent and check is same method. you can implement in both ways
* This is how predicate works, It returns value in boolean.

* */

/*
interface Check{
    public boolean isPresent(String t);
}
* */
interface Check<T>{
    public boolean test(T t);
}


public class MainPredicate {
    public static void main(String[] args) {
        //own predicate by using normal java lambda function
        //create interface Check

        //operation for string
        //check String contain letter a or not
        //here object is created then method is called
        Check<String> isPresent = new Check<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("a");
            }
        };
        boolean isContain = isPresent.test("Rahul");

        //check String contain letter a or not
        // here directly using object method is called
        boolean isPresent1 = new Check<String>(){
            @Override
            public boolean test(String s) {
                return s.contains("a");
            }
        }.test("Rahul");


        //operation for integer
        boolean isSmall = new Check<Integer>(){
            @Override
            public boolean test(Integer t) {
                return t<10;
            }
        }.test(5);


        System.out.println(isContain);
        System.out.println(isPresent1);
        System.out.println(isSmall);


        //all above are implemented using Predicate

        //predicate example . As this is predefined predicate like class check which contain methods
        //creating object of predicate and calling method
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("A");
            }
        };
        System.out.println(predicate.test("Rahul"));


        //here directly method is called
        boolean isContain1 = new Predicate<String>(){
            @Override
            public boolean test(String s) {
                return s.contains("a");
            }
        }.test("Rahul");

        System.out.println(isContain);


    }
}
