package basic.b2_OPPS_Concepts.inheritance;

public class MyDog extends Dog{
    private int year;

    public MyDog(String name, int weight, int size, String breed, int legs, int year) {
        super(name, weight, size, breed, legs);
        this.year = year;
    }

    public void callingAllParentMethod(){
        super.overloadMethod("Dog");
        super.testMethod("Animal call from MyDog");
        System.out.println("Calling dog class method and animal class method");
    }
}
