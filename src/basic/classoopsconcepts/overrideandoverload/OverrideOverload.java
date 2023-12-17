package basic.classoopsconcepts.overrideandoverload;
//Polymorphism: ability of class to perform differently for methods
//two types =>
// 1] Compile time polymorphism/earlybinding =>overloading(differernt class)
//                                           => method name same , parameters same or diff
//                                           => Return type different
//2]Run time polymorphism/latebinding => overriding(same class)
//                                    => method naem same ,parameters are differernt
//                                    =>return type same or diff




public class OverrideOverload {
    public static void main(String[] args) {
        Parent p= new Parent();
        System.out.println("overloading =>");

        System.out.println("calling method name with single parameters");
        p.name("Rahul");

        System.out.println("calling same method name with double parameters");
        p.name("Rahul","Mulik");

        System.out.println(" ");

        System.out.println("overriding =>");

        Child ch=new Child();
        ch.name("Ram");


    }
}
