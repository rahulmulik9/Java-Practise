package basic.classoopsconcepts.Inheritance;

//1] Inheritance means class can aquired all properties(variables) and behaviors(methods) of parent class
//2] In this child class aquired parent class method and variables and also add own methods and behavior of our own
//3] Child object can access all properties of paretn class but parent class not access properties of child class
//4]types 1.single  2.multilevel 3.hierarical 4.hybrid
// 5.multiple(not support in java as create ambiguity as if class b extends class a and c ...if both class have same methos display
// then java ont know which one to call ...creates ambiguity)
public class Main {
    public static void main(String[] args) {

        System.out.println("Parent class object 👻");
        Animal ani=new Animal();
        ani.makeSound();
        //ani.legs()   //cant access child class method thro parent class object

        System.out.println("\nchild class object🐕");
        Dog dg=new Dog();
        dg.makeSound();//if you use super keyword in child class method parent class method will call
        dg.legs();

        System.out.println("\nParent class referance 👆");
        Animal ref1=new Dog();
        ref1.makeSound();          //only parent class methods

        System.out.println("\nChild  class referance object cant make child class refernace");
        //Dog ref2=new Animal();



    }
}
