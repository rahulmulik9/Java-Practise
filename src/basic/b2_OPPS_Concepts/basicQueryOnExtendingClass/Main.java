package basic.b2_OPPS_Concepts.basicQueryOnExtendingClass;
//Child class extend Parent. If child class object is made then first Parent class constructor will initialize

class Parent{
Parent(){
    System.out.println("Parent class constructor");
}
}
class Child extends Parent{
    Child(){
        System.out.println("Child class constructor");
    }

}
public class Main {
    public static void main(String[] args) {
        Child theChild=new Child();
    }
}

// output
// Parent class constructor
// Child class constructor