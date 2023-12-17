package basic.classoopsconcepts.Inheritance;

public class Dog extends Animal {
    String name="Dog";

//    @Override
//    public void makeSound() {
//        super.makeSound();
//        System.out.println("Parent class sound method accessed");
//    }


    @Override
    public void makeSound() {
        System.out.println("Dog bark");
    }

    public void legs(){
        System.out.println("Have four legs");
    }



}
