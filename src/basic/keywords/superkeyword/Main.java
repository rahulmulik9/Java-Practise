package basic.keywords.superkeyword;

import java.util.List;

class Child{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Child(String name) {
        this.name = name;
    }
}
class Parent{
    String name;
   Child child;

    public Parent(String name, Child child) {
        super(); // Calls the constructor of the immediate superclass, which is Object in this case.
        this.name = name;
        this.child = child;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child("Child");
        Parent parent = new Parent("Parent",child);
        Parent parent1 = new Parent("Parent",new Child("Child1"));

        System.out.println(parent.getName()+parent.child.getName());
        System.out.println(parent1.getName()+parent1.child.getName());
    }
}
