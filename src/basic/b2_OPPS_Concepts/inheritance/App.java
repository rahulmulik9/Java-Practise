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

        //create object of animal which will only able to access animal class method
        Animal theAnimal = new Animal("Jonny",14,4);
        theAnimal.overloadMethod("Hi");

        //calling parent and child class method from grandchildren class
        MyDog theMyDog = new MyDog("Robin",25,5,"Shefard",4,2005);
       theMyDog.callingAllParentMethod();
    }
}
