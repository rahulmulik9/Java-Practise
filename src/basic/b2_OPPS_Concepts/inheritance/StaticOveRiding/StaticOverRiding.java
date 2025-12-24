package basic.b2_OPPS_Concepts.inheritance.StaticOveRiding;

public class StaticOverRiding {
    public static void main(String[] args) {
    Parent obj= new Child();
    obj.print();
    }
}

class Parent{
    public Parent() {
    }

    public void print(){
        System.out.println("Parent class");
    }
}

class Child extends Parent{
    public Child(){}

    //Static method 'print()' in 'basic.b2_OPPS_Concepts.inheritance.StaticOveRiding.Child' cannot override instance method 'print()' in 'basic.b2_OPPS_Concepts.inheritance.StaticOveRiding.Parent'
    //public static void print() {System.out.println("Child class");}
    public void print() {System.out.println("Child class");}
}
