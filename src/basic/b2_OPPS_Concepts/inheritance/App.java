package basic.b2_OPPS_Concepts.inheritance;

public class App {
    public static void main(String[] args) {
        Dog theDog= new Dog("Tommy",81,5,"German",4);

        //getting animal class variables
        System.out.println( theDog.getName());

        //getting dog class variable
        System.out.println(theDog.getBreed());

        //calling animal class method
        theDog.testMethod("Animal class method is class from Dog class object");

        //calling animal method using super keywords used in the dog overload method
        theDog.overloadMethod("Hi");
    }
}
