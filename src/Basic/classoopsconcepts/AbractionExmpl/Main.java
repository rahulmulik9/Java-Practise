package Basic.classoopsconcepts.AbractionExmpl;
//
//Abstraction: hiding method implementation and only showing esseintial data to users called abstraction
//not possible to create object of abstract classes
//method by using abstract class(extends) or by using interface(implements)
//abstract method are those which are singiture(method name)(declaration) but dont have implimentation
//one abstract method present in class then class is abstract
//if all methods are abstract then called interface
//implmentation for all abstract method is done in child class if child class fail to do so then
//that childs child class must be implements that all remaining methods so on


public class Main {
    public static void main(String[] args) {

        //Abstrct ab=new Abstrct();
        System.out.println("object creation is not poassible of abstract class Abstrct ab=new Abstrct()");
        Child ch=new Child();
        ch.display();
        ch.name();


        Childif ch1=new Childif();
        ch1.display();


    }

}
